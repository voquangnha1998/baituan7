package com.example.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter<Country> {

    Context context;
    ArrayList<Country> arrayList;
    int layoutResource;
    //Hàm khởi tạo cho CustomArrayAdapter
    public CustomArrayAdapter(Context context, int resource, ArrayList<Country> objects) {
        super(context, resource, objects);
        this.context = context;
        this.arrayList = objects;
        this.layoutResource = resource;
    }

    @NonNull

//Hàm khởi tạo cho các dòng để hiển thị trên ListView
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(layoutResource,null);
//Hàm khởi thêm dữ lieu vào các View từ arrayList thông qua position
        TextView txt1 = (TextView)convertView.findViewById(R.id.textView);
        txt1.setText(arrayList.get(position).getName());

        TextView txt2 = (TextView)convertView.findViewById(R.id.textView2);
        txt2.setText(arrayList.get(position).getPopulate());

        ImageView img = (ImageView)convertView.findViewById(R.id.img);
        img.setImageResource(arrayList.get(position).getImg());

        return convertView;
    }
}
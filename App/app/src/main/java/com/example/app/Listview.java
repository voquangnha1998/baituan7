package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Listview extends AppCompatActivity {
    ListView listView;
    ArrayList<Country> arrayList;
    CustomArrayAdapter customArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        //map listview xml sang java
        listView = (ListView) findViewById(R.id.listView);
//khởi tạo dữ liệu mẫu
        arrayList = new ArrayList<>();
        arrayList.add(new Country("Tình yêu khủng long", "Fay", R.drawable.casi1));
        arrayList.add(new Country("Hoa hải đường", "Jack", R.drawable.casi2));
        arrayList.add(new Country("Bông hoa đẹp nhất", "Quân A.P", R.drawable.casi3));
        arrayList.add(new Country("Đánh mất em", "Trần Quang Đăng", R.drawable.casi4));
        arrayList.add(new Country("Khác Biệt", "Khắc Việt", R.drawable.casi5));
        arrayList.add(new Country("Chẳng thể giữ lấy, chẳng đành buông đi", "Ngô Kiến Huy", R.drawable.casi7));
        arrayList.add(new Country("Chắc vì mình chưa tốt", "Thanh Hưng", R.drawable.casi6));
        arrayList.add(new Country("Mãi mãi không phải mình", "Thanh Bình", R.drawable.casi4));
        arrayList.add(new Country("Tình yêu khủng long", "Fay", R.drawable.casi1));
        arrayList.add(new Country("Hoa hải đường", "Jack", R.drawable.casi2));
        arrayList.add(new Country("Bông hoa đẹp nhất", "Quân A.P", R.drawable.casi3));
        arrayList.add(new Country("Đánh mất em", "Trần Quang Đăng", R.drawable.casi4));
        arrayList.add(new Country("Khác Biệt", "Khắc Việt", R.drawable.casi5));
        arrayList.add(new Country("Chẳng thể giữ lấy, chẳng đành buông đi", "Ngô Kiến Huy", R.drawable.casi7));
        arrayList.add(new Country("Chắc vì mình chưa tốt", "Thanh Hưng", R.drawable.casi6));
        arrayList.add(new Country("Mãi mãi không phải mình", "Thanh Bình", R.drawable.casi4));
//khởi tạo customArrayAdapter
        customArrayAdapter = new CustomArrayAdapter(this,
                R.layout.view_baihat, arrayList);
        listView.setAdapter(customArrayAdapter);
//Tương tác với ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Listview.this, arrayList.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });



    }

}

package com.example.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoods;
    ArrayList<Goods> list = new ArrayList<Goods>();
    CustomerAdapter adt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtName = findViewById(R.id.edtName);
        lvGoods = findViewById(R.id.lvGoods);
        list = new ArrayList<>();
        list.add(new Goods(R.drawable.donut_yellow_1,"Tasty Donut","Spicy tasty donut family","$10.00"));
        list.add(new Goods(R.drawable.pink_donut1,"a","Test","1500$"));
        adt = new CustomerAdapter(this,R.layout.iteam,list);
        lvGoods.setAdapter(adt);


        edtName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                String ten = edtName.getText().toString();
                ArrayList<Goods> arrayList = new ArrayList<>();
                for(int i = 0; i <list.size();i++){
                    if(list.get(i).getTen().equals(ten)){
                        arrayList.add(list.get(i));
                        adt = new CustomerAdapter(MainActivity.this,R.layout.iteam,arrayList);
                        lvGoods.setAdapter(adt);
                    }
                }
            }
        });
        lvGoods.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


//              setContentView(R.layout.activity_donut);

                Intent intent = new Intent(MainActivity.this,Donut.class);

                String ten = list.get(i).getTen();
                String chuThich = list.get(i).getChuThich();
                String gia = list.get(i).getGia();
                int imgHinh = list.get(i).getImgHinh();

                intent.putExtra("a",ten);
                intent.putExtra("b",chuThich);
                intent.putExtra("c",gia);
                intent.putExtra("d",imgHinh);
//
                startActivity(intent);



            }
        });


    }
    public void xuLyClick( View view){
        int red = R.color.material_dynamic_secondary70;
        view.setBackgroundColor(Color.RED);
    }


}
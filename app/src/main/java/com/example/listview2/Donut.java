package com.example.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Donut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut);
        addControls();
    }

    private void addControls() {
        Intent intent = getIntent();

        TextView txtTen = findViewById(R.id.txtTen2);
        TextView txtChuThich = findViewById(R.id.txtChuThich2);
        TextView txtGia = findViewById(R.id.txtGia2);
        ImageView imgHinh = findViewById(R.id.imgHinh2);

        String a = intent.getStringExtra("a");
        String b = intent.getStringExtra("b");
        String c = intent.getStringExtra("c");
        Integer d = intent.getIntExtra("d",0);

        txtChuThich.setText(b);
        imgHinh.setImageResource(d);
        txtTen.setText(a);
        txtGia.setText(c);


    }


}
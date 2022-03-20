package com.example.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class CustomerAdapter extends BaseAdapter {
    Context ctx;
    int layOutIeam;
    ArrayList<Goods> list;

    public CustomerAdapter(Context ctx, int layOutIeam, ArrayList<Goods> list) {
        this.ctx = ctx;
        this.layOutIeam = layOutIeam;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(layOutIeam,viewGroup,false);

        ImageView imgHinh = view.findViewById(R.id.imgHinh);
        TextView txtTen = view.findViewById(R.id.txtTen);
        TextView txtChuThich = view.findViewById(R.id.txtChuThich);
        TextView txtGia = view.findViewById(R.id.txtGia);
        ConstraintLayout layOut = view.findViewById(R.id.consLayout);

        imgHinh.setImageResource(list.get(i).getImgHinh());
        txtTen.setText(list.get(i).getTen());
        txtChuThich.setText(list.get(i).getChuThich());
        txtGia.setText(list.get(i).getGia());


        return view;
    }
}

package com.example.mycw7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class shopAdapter extends ArrayAdapter {

    List<items> shopList;

    public shopAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        shopList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.shop_layout,parent, false);

        items currntItem = shopList.get(position);

        TextView itemName = view.findViewById(R.id.name);
        TextView Iprice = view.findViewById(R.id.price);
        TextView Inumber = view.findViewById(R.id.number);
        ImageView pic = view.findViewById(R.id.itemimages);

        itemName.setText(currntItem.getItemName());
        Inumber.setText( String.valueOf(currntItem.getItemPrice()));
        pic.setImageResource(currntItem.getItemImage());

        return view;

    }
}

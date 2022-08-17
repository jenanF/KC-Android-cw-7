package com.example.mycw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<items> shop = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        items iceCoffee = new items("iceCoffee", R.drawable.icecoffee,2.00);
        items hotCoffee = new items("Americano", R.drawable.hot1coffee, 1.800);
        items mocha = new items("mocha", R.drawable.creamcoffee, 2.100);
        items pink = new items("pink latte", R.drawable.pink, 2.250);
        items flat = new items("flat white", R.drawable.cofart, 1.750);
        items cupCake = new items("cupCake", R.drawable.cupcake, 2.500);
        items donut = new items("donut", R.drawable.donuts, 1.00);
        items cookies = new items("cookies", R.drawable.cookies, 1.250);
        items cake = new items("cake", R.drawable.cake, 3.500);
        items pie = new items("pie", R.drawable.pie, 4.500);


        shop.add(iceCoffee);
        shop.add(hotCoffee);
        shop.add(mocha);
        shop.add(pink);
        shop.add(flat);
        shop.add(cupCake);
        shop.add(donut);
        shop.add(cookies);
        shop.add(cake);
        shop.add(pie);



        shopAdapter shopAdapter = new shopAdapter(this,0,shop);

        ListView listView= findViewById(R.id.listItems);

        listView.setAdapter(shopAdapter);
    }
}
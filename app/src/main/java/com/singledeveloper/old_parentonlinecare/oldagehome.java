 package com.singledeveloper.old_parentonlinecare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.location.Address;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

 public class oldagehome extends AppCompatActivity {

    private ArrayList<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldagehome);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new Adapter(items, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        // String is called from string xml files which i wrote in already
        items.add(new Item(R.drawable.oldagehome1,getString(R.string.oldagehome1_title),getString(R.string.oldagehome1_desc)));
        items.add(new Item(R.drawable.oldagehome2,getString(R.string.oldagehome2_title),getString(R.string.oldagehome2_desc)));
        items.add(new Item(R.drawable.oldagehome3,getString(R.string.oldagehome3_title),getString(R.string.oldagehome3_desc)));
        items.add(new Item(R.drawable.oldagehome4,getString(R.string.oldagehome4_title),getString(R.string.oldagehome4_desc)));
        items.add(new Item(R.drawable.oldagehome5,getString(R.string.oldagehome5_title),getString(R.string.oldagehome5_desc)));
        items.add(new Item(R.drawable.oldagehome6,getString(R.string.oldagehome6_title),getString(R.string.oldagehome6_desc)));
        items.add(new Item(R.drawable.oldagehome7,getString(R.string.oldagehome7_title),getString(R.string.oldagehome7_desc)));





    }
}
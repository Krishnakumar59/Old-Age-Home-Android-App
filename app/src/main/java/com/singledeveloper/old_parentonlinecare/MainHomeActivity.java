 package com.singledeveloper.old_parentonlinecare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainHomeActivity extends AppCompatActivity {


    CardView addmember;
    CardView ourfamily;
    CardView donate;
    CardView ourgallery;
    CardView contact;
    CardView about;
    CardView oldagehome;
    CardView thingstoknow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);


        addmember = findViewById(R.id.addmember);
        ourfamily = findViewById(R.id.ourfamily);
        donate = findViewById(R.id.donate);
//        ourgallery = findViewById(R.id.ourgallery);
        contact = findViewById(R.id.contact);
        about = findViewById(R.id.about);
        oldagehome = findViewById(R.id.oldagehome);
//        thingstoknow = findViewById(R.id.thingstoknow);


        // onclick listener for addmember to open new activity related to that
        addmember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(new Intent(this,DetailsUpload.class));

                startActivity(new Intent(MainHomeActivity.this,DetailsUpload.class));

            }
        });

     // onclick listener for ourfamily to open new activity related to that
        ourfamily.setOnClickListener(new View.OnClickListener() {               // Fetch Data From Database
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainHomeActivity.this,OurFamily.class));


            }
        });

// onclick listener for oldagehome to open new activity related to that
        oldagehome.setOnClickListener(new View.OnClickListener() {               // Fetch Data From Database
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainHomeActivity.this,oldagehome.class));


            }
        });

        // onclick listener for donate to open new activity related to that

        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainHomeActivity.this,donatescreen.class));

            }
        });


         // onclick listener for ourgallery to open new activity related to that
//
//        ourgallery.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainHomeActivity.this,ourgallery.class));
//            }
//        });


           // onclick listener for contacts to open new activity related to that

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // COde for call us directly to cellphone

                String PhoneNo="+977-9817894373";
                Intent dial = new Intent();
                dial.setAction("android.intent.action.DIAL");
                dial.setData(Uri.parse("tel:"+PhoneNo));
                startActivity(dial);



            }
        });

        // onclick listener for things to know that open new activity related to that



        // onclick listener for about us to open new activity related to that

        about.setOnClickListener(v -> startActivity(new Intent(MainHomeActivity.this,about.class)));


    }
//  about.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            startActivity(new Intent(MainHomeActivity.this,about.class));



}

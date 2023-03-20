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
        oldagehome = findViewById(R.id.oldagehome);
        donate = findViewById(R.id.donate);
        contact = findViewById(R.id.contact);
        about = findViewById(R.id.about);


        // onclick listener for add-member to open new activity related to that
        addmember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainHomeActivity.this, DetailsUpload.class));

            }
        });

        // onclick listener for our family to open new activity related to that
        // Fetch Data From Database
        ourfamily.setOnClickListener(v -> startActivity(new Intent(MainHomeActivity.this, OurFamily.class)));

        // onclick listener for old age home to open new activity related to that
        // Fetch Data From Database
        oldagehome.setOnClickListener(v -> startActivity(new Intent(MainHomeActivity.this, oldagehome.class)));

        // onclick listener for donate to open new activity related to that
        donate.setOnClickListener(v -> startActivity(new Intent(MainHomeActivity.this, donatescreen.class)));


        // onclick listener for contacts to open new activity related to that
        contact.setOnClickListener(v -> {

            // Code for call us directly to cellphone
            String PhoneNo = "+977-9817894373";
            Intent dial = new Intent();
            dial.setAction("android.intent.action.DIAL");
            dial.setData(Uri.parse("tel:" + PhoneNo));
            startActivity(dial);
        });

        // onclick listener for about us to open new activity related to that
        about.setOnClickListener(v -> startActivity(new Intent(MainHomeActivity.this, about.class)));


    }

}

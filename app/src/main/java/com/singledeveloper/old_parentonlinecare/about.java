package com.singledeveloper.old_parentonlinecare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class about extends AppCompatActivity {

    TextView aboutustext;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        aboutustext = findViewById(R.id.aboutustext);
        text = "This App is basically for old grandparents who face family adjustment problems when they live with their young children & Their children were not able to give proper time and respect to their parents.\n" +
                "We will find a proper old age home for such parents or a better family who wants parents for this family with the classical concept of a nuclear family. Grands parents share their experiences and thoughts with everyone which will help them in days to come. ";
        aboutustext.setText(text);

    }
}
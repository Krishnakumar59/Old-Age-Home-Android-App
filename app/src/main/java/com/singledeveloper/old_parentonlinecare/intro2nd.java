package com.singledeveloper.old_parentonlinecare;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class intro2nd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro2nd);

        Toast.makeText(this, "Designed with ❤ By Krishna Kumar \n \tPrasnjit Sharma", Toast.LENGTH_LONG).show();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent_for_home = new Intent(intro2nd.this, MainHomeActivity.class);
                startActivity(intent_for_home);
                finish();
            }
        }, 2000);
    }
}
package com.singledeveloper.old_parentonlinecare;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class donatescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donatescreen);
    }

    public void donatemessage(View view) {
        ;
        Toast.makeText(this, "Thanks for Donating ❤️", Toast.LENGTH_LONG).show();
    }
}
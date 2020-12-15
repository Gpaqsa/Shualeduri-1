package com.example.shualeduri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity2 extends AppCompatActivity {

    public void Back (View view){

        Intent  SingUpIntent = new Intent(this, MainActivity.class);

        startActivity(SingUpIntent);
}

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
package com.example.shualeduri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.jar.Attributes;


public class MainActivity extends AppCompatActivity {


    public class Pet {

        String race;
        String name;
        int Age;

        public Pet (String race, String name, int Age){
            this.race = race;
            this.name = name;
            this.Age = Age;
        }
    }
    public void SingUpbtn(View view) {
          Button singupbtn = (Button) view;

    EditText editTextTextPersonName = (EditText)findViewById(R.id.editTextTextPersonName) ;
    EditText editTextTextName = (EditText)findViewById(R.id.editTextTextName);
    EditText editTextTextPersonAge = (EditText) findViewById(R.id.editTextTextPersonAge);
    int editTextTextPersonAge = Integer.parseInt(editTextTextPersonAge.getText().toString()) String message;
    {
if(editTextTextPersonName.getText().toString().isEmpty()){
    Toast.makeText(this, "your missed your Name",Toast.LENGTH_SHORT).show();
}    else  if (editTextTextName.getText().toString().isEmpty()) {
    Toast.makeText(this, "your missed you Variety", Toast.LENGTH_SHORT).show();
        } else if (editTextTextPersonAge.getText().toString().isEmpty()){
            message = "Enter the Age";
        }
        int editTextPersonAge = 0;
        else if  (editTextTextPersonAge < 10);
        Toast.makeText(this, "you are under Age", Toast.LENGTH_SHORT).show();
        }
        else if (editTextTextPersonAge < 1) {
            Toast.makeText(this, "input real Age", Toast.LENGTH_SHORT).show();
        }
        else {
            message = "Everything is ok";
        }
    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    }
}
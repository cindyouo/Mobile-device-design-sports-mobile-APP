package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button_Click(View view){
        Intent intent=new Intent(this,login.class);
        startActivity(intent);
    }
    public void button2_Click(View view){
        Intent intent=new Intent(this,signup.class);
        startActivity(intent);
    }

}
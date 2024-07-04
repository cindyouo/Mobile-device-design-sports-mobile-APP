package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class gamehome extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamehome);
    }
    public void button_Click(View view){
        Intent intent=new Intent(this,game1.class);
        startActivity(intent);
    }
    public void button2_Click(View view){
        Intent intent=new Intent(this,game2.class);
        startActivity(intent);
    }
    public void button3_Click(View view){
        finish();
    }
}
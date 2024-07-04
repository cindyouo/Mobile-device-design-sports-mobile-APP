package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class person extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
    }
    public void onClick2(View view) {
        TextView output = (TextView) findViewById(R.id.ed1);
        TextView output2 = (TextView) findViewById(R.id.ed2);
        TextView output3 = (TextView) findViewById(R.id.ed3);
        TextView output4 = (TextView) findViewById(R.id.ed4);
        output.setText((" "));
        output2.setText((" "));
        output3.setText((" "));
        output4.setText((" "));
        RadioGroup x=findViewById(R.id.rglmages);
        x.check(R.id.boy);
    }
    public  void onClick1(View view){
        TextView input = (TextView) findViewById(R.id.txt1);
        TextView input2 = (TextView) findViewById(R.id.txt2);
        TextView input3 = (TextView) findViewById(R.id.txt3);
        TextView input4 = (TextView) findViewById(R.id.txt4);
        if (input.getText().toString().matches(" " )) {
            Toast.makeText(this, "提示訊息：不要空白！請輸入 ", Toast.LENGTH_SHORT).show();
        }
        else if(input2.getText().toString().matches(" ")) {
            Toast.makeText(this, "提示訊息：不要空白！請輸入 ", Toast.LENGTH_SHORT).show();
        }
        else if(input3.getText().toString().matches(" ")) {
            Toast.makeText(this, "提示訊息：不要空白！請輸入 ", Toast.LENGTH_SHORT).show();
        }
        else if(input4.getText().toString().matches(" ")) {
            Toast.makeText(this, "提示訊息：不要空白！請輸入 ", Toast.LENGTH_SHORT).show();
        }

    }
    public void button(View view){
        finish();
    }
}
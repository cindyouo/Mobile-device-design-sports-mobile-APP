package com.example.finalapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class bmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
    }
    public void onClick(View view) {
        DecimalFormat nf = new DecimalFormat("0.00");
        EditText h = (EditText) findViewById(R.id.editTextTextPersonName2);
        EditText w = (EditText) findViewById(R.id.editTextTextPersonName3);
        float str = Float.parseFloat(h.getEditableText().toString());
        float str2 = Float.parseFloat(w.getEditableText().toString());
        float bmi = str2 / ((str / 100) * (str / 100));
        TextView output = (TextView) findViewById(R.id.bmians);
        TextView output3 = (TextView) findViewById(R.id.bmii);
        output3.setText("BMI:"+ nf.format(bmi));
        NumberFormat bk=NumberFormat.getInstance(); //設定數字格式，並宣告物件bk
        bk.setMaximumFractionDigits(2);   //小數點設定顯示最多後兩位
        if (bmi < 18.5) {
            output.setText(("體重過輕"));
        } else if (18.5 <= bmi && bmi < 24) {
            output.setText(("體重正常"));

        } else if (24 <= bmi && bmi < 27) {
            output.setText(("過重"));
        } else if (27 <= bmi && bmi < 30) {
            output.setText(("輕度肥胖"));
        } else if (30 <= bmi && bmi < 35) {
            output.setText(("中度肥胖"));
        } else if (bmi >= 35) {
            output.setText(("重度肥胖"));
        }
        Intent rlntent=new Intent();
        Bundle rbundle=new Bundle();

        rbundle.putDouble("RESULT", Double.parseDouble(bk.format(bmi)));
        rlntent.putExtras(rbundle);
        setResult(RESULT_OK,rlntent);
    }
    public void onClick2(View view) {
        TextView output = (TextView) findViewById(R.id.editTextTextPersonName2);
        TextView output2 = (TextView) findViewById(R.id.editTextTextPersonName3);
        TextView output3 = (TextView) findViewById(R.id.bmians);
        TextView output4 = (TextView) findViewById(R.id.bmii);
        output.setText((" "));
        output2.setText((" "));
        output3.setText((" "));
        output4.setText((" "));

    }
    public  void button1(View view){
        finish();
    }
    public void button2(View view){
        AlertDialog.Builder builder =new AlertDialog.Builder(this);
        builder.setTitle("BMI的評斷標準");
        builder.setMessage("體重過輕:bmi<18.5\n體重正常:18.5<=bmi<24\n體重過重:24<=bmi<27\n輕度肥胖:27<=bmi<30\n中度肥胖:30<=bmi<35\n重度肥胖:bmi>=35"
        );
        builder.setCancelable(true);
        builder.setPositiveButton("確定",null);
        builder.show();
    }


}


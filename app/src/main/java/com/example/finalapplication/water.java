package com.example.finalapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import java.util.Calendar;
public class water extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,
         TimePickerDialog.OnTimeSetListener {
    private TextView output,output3,output4;
    private  CheckBox chk1,chk2,chk3,chk4,chk5;
    EditText str;
    int s=0;
    private Calendar dt = Calendar.getInstance();
    private int[] chkIDs={R.id.chk100,R.id.chk200,R.id.chk300,R.id.chk400,R.id.chk500,};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);
        output=(TextView)findViewById(R.id.IbIoutput);
        output3=(TextView)findViewById(R.id.txttime);
        output4=(TextView) findViewById(R.id.fff);
        str=(EditText) findViewById(R.id.txtf);
        chk1 = findViewById(R.id.chk100);
        chk2 = findViewById(R.id.chk200);
        chk3= findViewById(R.id.chk300);
        chk4 = findViewById(R.id.chk400);
        chk5 = findViewById(R.id.chk500);
        for (int id:chkIDs){
            CheckBox chk=(CheckBox) findViewById(id);
            chk.setOnCheckedChangeListener(this);
        }
    }
    //表單
    public void onCheckedChanged(CompoundButton compoundButton,boolean b) {
        if (b) {
            switch (compoundButton.getId()) {
                case R.id.chk100:
                    Toast.makeText(this, "選擇了100ml", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.chk200:
                    Toast.makeText(this, "選擇了200ml", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.chk300:
                    Toast.makeText(this, "選擇了300ml", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.chk400:
                    Toast.makeText(this, "選擇了400ml", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.chk500:
                    Toast.makeText(this, "選擇了500ml", Toast.LENGTH_SHORT).show();
                    break;
            }
        } else {
            switch (compoundButton.getId()) {
                case R.id.chk100:
                    Toast.makeText(this, "取消了100ml", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.chk200:
                    Toast.makeText(this, "取消了200ml", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.chk300:
                    Toast.makeText(this, "取消了300ml", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.chk400:
                    Toast.makeText(this, "取消了400ml", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.chk500:
                    Toast.makeText(this, "取消了500ml", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }//計算按鈕
    public void onClick(View view) {
        int sum=Integer.parseInt(str.getText().toString());
        if (chk1.isChecked() & chk2.isChecked() & chk3.isChecked() & chk4.isChecked() & chk5.isChecked()) {
            output.setText("您喝了1500ml");s = sum - 1500;
            if (sum<=1500){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }
        }//15
        else if (chk2.isChecked() & chk3.isChecked() & chk4.isChecked() & chk5.isChecked()) {
            output.setText("您喝了1400ml");s = sum - 1400;
            if (sum<=1400){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }
        }//14
        else if (chk1.isChecked() & chk3.isChecked() & chk4.isChecked() & chk5.isChecked()) {
            output.setText("您喝了1300ml"); s = sum - 1300;
            if (sum<=1300){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }
        }//13
        else if ((chk1.isChecked() & chk2.isChecked() & chk4.isChecked() & chk5.isChecked()) || (chk3.isChecked() & chk4.isChecked() & chk5.isChecked())) {
            output.setText("您喝了1200ml");s = sum - 1200;
            if (sum<=1200){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }
        }//12 1245 || 345
        else if (((chk1.isChecked() & chk2.isChecked() & chk3.isChecked() & chk5.isChecked())) || (chk2.isChecked() & chk4.isChecked() & chk5.isChecked())) {
            output.setText("您喝了1100ml");s = sum - 1100;
            if (sum<=1100){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }
        }//11 1235 || 245
        else if ((chk1.isChecked() & chk2.isChecked() & chk3.isChecked() & chk4.isChecked()) || (chk2.isChecked() & chk3.isChecked() & chk5.isChecked()) || (chk1.isChecked() & chk4.isChecked() & chk5.isChecked())) {
            output.setText("您喝了1000ml");s = sum - 1000;
            if (sum<=1000){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }
        }//10  1234|| 235 || 145
        else if ((chk2.isChecked() & chk3.isChecked() & chk4.isChecked()) || (chk1.isChecked() & chk3.isChecked() & chk5.isChecked()) || (chk4.isChecked() & chk5.isChecked())) {
            output.setText("您喝了900ml");s = sum - 900;
            if (sum<=900){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }
        }//9 234 || 135 || 45
        else if ((chk1.isChecked() & chk2.isChecked() & chk5.isChecked()) || (chk1.isChecked() & chk3.isChecked() & chk4.isChecked()) || (chk3.isChecked() & chk5.isChecked())) {
            output.setText("您喝了800ml");s = sum - 800;
            if (sum<=800){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }
        }//8 125 || 134 || 35
        else if ((chk1.isChecked() & chk2.isChecked() & chk4.isChecked()) || (chk2.isChecked() & chk5.isChecked()) || (chk3.isChecked() & chk4.isChecked())) {
            output.setText("您喝了700ml");s = sum - 700;
            if (sum<=700){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }

        }//7 124 || 25 || 34
        else if ((chk1.isChecked() & chk2.isChecked() & chk3.isChecked()) || (chk2.isChecked() & chk4.isChecked()) || (chk1.isChecked() & chk5.isChecked())) {
            output.setText( "您喝了600ml");s = sum - 600;
            if (sum<=600){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }

        }//6 123 || 24 || 15
        else if ((chk2.isChecked() & chk3.isChecked()) || (chk1.isChecked() & chk4.isChecked()) || (chk5.isChecked())) {
            output.setText("您喝了500ml");s = sum - 500;
            if (sum<=500){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }

        }//5 23 || 14 || 5
        else if ((chk1.isChecked() & chk3.isChecked()) || (chk4.isChecked())) {
            output.setText("您喝了400ml");s = sum - 400;
            if (sum<=400){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }

        }//4 13 || 4
        else if ((chk1.isChecked() & chk2.isChecked()) || (chk3.isChecked())) {
            output.setText("您喝了300ml");s = sum - 300;
            if (sum<=300){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }
        }//3 12 || 3
        else if (chk2.isChecked()) {
            output.setText("您喝了200ml");
            s = sum - 200;
            if (sum<=200){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }
        }//2
        else if (chk1.isChecked()) {
            output.setText("您喝了100ml");
            s = sum - 100;
            if (sum<=100){
                output4.setText("恭喜已達成目標");
            }
            else{
                output4.setText("距離目標剩餘:" + s + "毫升");
            }
        }//1
        else {
            output.setText( "您喝了0ml");
            s = sum;
            output4.setText("距離目標剩餘:" + s + "毫升");
        }//全無
    }
    public void onClick2(View view) {
        output.setText(" ");
        output3.setText(" ");
        output4.setText(" ");
        str.setText(" ");
        chk1.setChecked((false));
        chk2.setChecked((false));
        chk3.setChecked((false));
        chk4.setChecked((false));
        chk5.setChecked((false));
    }



    //時間
    public void onTimeSet(TimePicker timePicker,int h,int m){
        output3.setText(h+":"+m);
    }
    //時間按鈕
    public void button_Click2(View view){
        TimePickerDialog dlg= new TimePickerDialog(this,this,dt.get(Calendar.HOUR),dt.get(Calendar.MINUTE), true);
        dlg.show();
    }
    public  void button(View view){
        finish();
    }

}
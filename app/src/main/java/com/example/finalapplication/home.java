package com.example.finalapplication;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class home extends AppCompatActivity
    implements DatePickerDialog.OnDateSetListener{
        SensorManager sm;
        Sensor sensor;
        private TextView output,output2,t0;
        private Calendar dt = Calendar.getInstance();
        int i=0;
        long LastTime;
        float x1,y1,z1;
        double s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        output=(TextView) findViewById(R.id.dateout);
        output2=(TextView) findViewById(R.id.txt12);
        t0=(TextView)findViewById(R.id.txt5);
        sm=(SensorManager) this.getSystemService(Context.SENSOR_SERVICE);
        sensor=sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener(S1,sensor,SensorManager.SENSOR_DELAY_GAME);
    }
    private SensorEventListener S1= new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent event) {
            long CurrenTime=System.currentTimeMillis();
            long xTime=CurrenTime-LastTime;
            if(xTime<80)return;
            float x=event.values[0];
            float y=event.values[1];
            float z=event.values[2];
            float DX=x-x1;
            float DY=y-y1;
            float DZ=z-z1;
            s=Math.sqrt(Math.pow(DX,2)+Math.pow(DY,2)+Math.pow(DZ,2))/xTime*1000;
            if(s>=150 && s<=200){
                i++;
                t0.setText(String.valueOf(i));
            }
            LastTime=CurrenTime;
            x1=x;
            y1=y;
            z1=z;
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
    };
    protected void onDestroy(){
        super.onDestroy();
        sm.unregisterListener(S1);
    }


    public void onDateSet(DatePicker datePicker, int y, int m, int d){
        output.setText(y+"/"+(m+1)+"/"+d);
    }
    public void button_Click(View view){
        DatePickerDialog dlg=new DatePickerDialog(this,this,dt.get(Calendar.YEAR),dt.get(Calendar.MONTH),dt.get(Calendar.DAY_OF_MONTH));
        dlg.show();
    }

    class ResultContract extends ActivityResultContract<Boolean,String> {
        @NonNull
        @Override
        public Intent createIntent(@NonNull Context context, Boolean input){
            Intent intent =new Intent(home.this,bmi.class);
            Bundle bundle=new Bundle();
            intent.putExtras(bundle);
            return intent;
        }
        @Override
        public String parseResult(int resultCode, @Nullable Intent intent) {
            Bundle bundle=intent.getExtras();
            Double result=bundle.getDouble("RESULT");
            return result.toString();
        }

    }
    ActivityResultLauncher launcher=registerForActivityResult(new ResultContract(), new ActivityResultCallback<String>() {
        @Override
        public void onActivityResult(String result) {
            output2.setText(result);
        }
    });
    public void button1_Click(View view) {
        launcher.launch(true);
    }
    //---------------------------------------------------
    public void button4(View view){
        Intent intent=new Intent(this,water.class);
        startActivity(intent);
    }
    public void button2(View view){
        Intent intent=new Intent(this,gamehome.class);
        startActivity(intent);
    }
    public void button6(View view){
        Intent intent=new Intent(this,person.class);
        startActivity(intent);
    }
    public void button3(View view){
        Intent intent=new Intent(this,work.class);
        startActivity(intent);
    }
}



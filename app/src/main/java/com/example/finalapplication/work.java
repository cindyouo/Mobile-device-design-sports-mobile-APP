package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class work extends AppCompatActivity implements SensorEventListener{
    SensorManager sm;
    Sensor sensor;
    float x1,y1,z1;
    double s;
    long LastTime;
    TextView t0,tv;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);
        t0=(TextView)findViewById(R.id.textView21);
        tv=(TextView)findViewById(R.id.textView23);
        sm=(SensorManager) this.getSystemService(Context.SENSOR_SERVICE);
        sensor=sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sm.registerListener(S1,sensor,SensorManager.SENSOR_DELAY_GAME);
    }
    protected  void onResume(){
        super.onResume();
        sm.unregisterListener(this);
    }
    protected void  onPause(){
        super.onPause();
        sm.unregisterListener(this);
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
                tv.setText("初始位置\n"+x+","+y+","+z+"\n最終位置\n"+DX+","+DY+","+DZ);
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

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
    public void bt(View view){
        finish();
    }
}
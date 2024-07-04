package com.example.finalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


        import androidx.appcompat.app.AlertDialog;
        import androidx.appcompat.app.AppCompatActivity;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;
        import android.os.SystemClock;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Chronometer;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.Date;
        import java.util.Locale;
        import java.util.concurrent.TimeUnit;
public class game2 extends AppCompatActivity implements DialogInterface.OnClickListener{
    private TextView time;
    private ImageView im1,im2,im3,im4,im5,im6,im7,im8,im9,im10,im11,im12;
    private Button bt1,bt2;
    //cardArray
    private int[] myImage={  R.drawable.pg1,R.drawable.pg2,R.drawable.pg3,R.drawable.pg8,R.drawable.pg5,R.drawable.pg10,
            R.drawable.pg1,R.drawable.pg2,R.drawable.pg3,R.drawable.pg8,R.drawable.pg5,R.drawable.pg10};
    int iv1,iv2,iv3,iv4,iv5,iv6,iv7,iv8,iv9,iv10,iv11,iv12;
    int firstCard,secondCard;
    int clickedFirst,clickSecond;
    int cardNumber=1;
    private Handler handler=null;
    private Runnable runnable=null;
    int countTime=0;
    private Chronometer chronometer;
    private long startTime=0,finishTime=0;
    private TextView totalTimeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
        time=(TextView)findViewById(R.id.textView2) ;
        bt1=(Button) findViewById(R.id.button);
        bt2=(Button) findViewById(R.id.button2);
        im1=(ImageView)findViewById(R.id.imageView);
        im2=(ImageView)findViewById(R.id.imageView2);
        im3=(ImageView)findViewById(R.id.imageView3);
        im4=(ImageView)findViewById(R.id.imageView4);
        im5=(ImageView)findViewById(R.id.imageView5);
        im6=(ImageView)findViewById(R.id.imageView6);
        im7=(ImageView)findViewById(R.id.imageView7);
        im8=(ImageView)findViewById(R.id.imageView8);
        im9=(ImageView)findViewById(R.id.imageView9);
        im10=(ImageView)findViewById(R.id.imageView10);
        im11=(ImageView)findViewById(R.id.imageView11);
        im12=(ImageView)findViewById(R.id.imageView12);
        totalTimeTextView = findViewById(R.id.textView2);
        chronometer = findViewById(R.id.chronometer3);
        chronometer.setFormat("Time: %s");
        chronometer.setCountDown(false);
        startTime = SystemClock.elapsedRealtime();
        chronometer.setBase(startTime);
        chronometer.start();
        im1.setTag("0");
        im2.setTag("1");
        im3.setTag("2");
        im4.setTag("3");
        im5.setTag("4");
        im6.setTag("5");
        im7.setTag("6");
        im8.setTag("7");
        im9.setTag("8");
        im10.setTag("9");
        im11.setTag("10");
        im12.setTag("11");
        frontOfCardsResources();
        Collections.shuffle(Arrays.asList(myImage));
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(im1,theCard);
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(im2,theCard);
            }
        });
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(im3,theCard);
            }
        });
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(im4,theCard);
            }
        });
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(im5,theCard);
            }
        });
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(im6,theCard);
            }
        });
        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(im7,theCard);
            }
        });
        im8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(im8,theCard);
            }
        });
        im9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(im9,theCard);
            }
        });
        im10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(im10,theCard);
            }
        });
        im11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(im11,theCard);
            }
        });
        im12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard=Integer.parseInt((String) view.getTag());
                doStuff(im12,theCard);
            }
        });
    }
    public void Onclick2(View view){
        finishTime=0;
        startTime=0;
        startTime  = SystemClock.elapsedRealtime();
        chronometer.setBase(startTime);
        chronometer.start();
        totalTimeTextView.setText(" ");
        im1.setImageResource(R.drawable.pg0);
        im2.setImageResource(R.drawable.pg0);
        im3.setImageResource(R.drawable.pg0);
        im4.setImageResource(R.drawable.pg0);
        im5.setImageResource(R.drawable.pg0);
        im6.setImageResource(R.drawable.pg0);
        im7.setImageResource(R.drawable.pg0);
        im8.setImageResource(R.drawable.pg0);
        im9.setImageResource(R.drawable.pg0);
        im10.setImageResource(R.drawable.pg0);
        im11.setImageResource(R.drawable.pg0);
        im12.setImageResource(R.drawable.pg0);
        im1.setVisibility(View.VISIBLE);
        im2.setVisibility(View.VISIBLE);
        im3.setVisibility(View.VISIBLE);
        im4.setVisibility(View.VISIBLE);
        im5.setVisibility(View.VISIBLE);
        im6.setVisibility(View.VISIBLE);
        im7.setVisibility(View.VISIBLE);
        im8.setVisibility(View.VISIBLE);
        im9.setVisibility(View.VISIBLE);
        im10.setVisibility(View.VISIBLE);
        im11.setVisibility(View.VISIBLE);
        im12.setVisibility(View.VISIBLE);
        startTime = System.currentTimeMillis();
        handler=new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                handler.postDelayed(runnable,1000);
                countTime++;
            }
        };
        random2();
    }
    private void random2(){
        for (int i = 0; i <myImage.length ; i++) {
            int temp=myImage[i];
            int s=(int)(Math.random()*11);
            myImage[i]=myImage[s];
            myImage[s]=temp;
        }
    }
    private  void  doStuff(ImageView iv,int card){
        if (myImage[card]==R.drawable.pg1){
            iv.setImageResource(iv1);
        } else if (myImage[card] == R.drawable.pg2) {
            iv.setImageResource(iv2);
        }else if (myImage[card] == R.drawable.pg3) {
            iv.setImageResource(iv3);
        }else if (myImage[card] == R.drawable.pg8) {
            iv.setImageResource(iv4);
        }else if (myImage[card] == R.drawable.pg5) {
            iv.setImageResource(iv5);
        }else if (myImage[card] == R.drawable.pg10) {
            iv.setImageResource(iv6);
        }else if (myImage[card] == R.drawable.pg1) {
            iv.setImageResource(iv7);
        } else if (myImage[card] == R.drawable.pg2) {
            iv.setImageResource(iv8);
        }else if (myImage[card] == R.drawable.pg3) {
            iv.setImageResource(iv9);
        }else if (myImage[card] == R.drawable.pg8) {
            iv.setImageResource(iv10);
        }else if (myImage[card] == R.drawable.pg5) {
            iv.setImageResource(iv11);
        }else if (myImage[card] == R.drawable.pg10) {
            iv.setImageResource(iv12);
        }
        if(cardNumber==1){
            firstCard=myImage[card];
            if(firstCard>200){
                firstCard=firstCard-100;
            }
            cardNumber=2;
            clickedFirst=card;
            iv.setEnabled(false);
        } else if (cardNumber==2) {
            secondCard=myImage[card];
            if (secondCard>200){
                secondCard=secondCard-100;
            }
            cardNumber=1;
            clickSecond=card;
            im1.setEnabled(false);
            im2.setEnabled(false);
            im3.setEnabled(false);
            im4.setEnabled(false);
            im5.setEnabled(false);
            im6.setEnabled(false);
            im7.setEnabled(false);
            im8.setEnabled(false);
            im9.setEnabled(false);
            im10.setEnabled(false);
            im11.setEnabled(false);
            im12.setEnabled(false);
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },1000);
        }
    }
    private void calculate() {
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                im1.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                im2.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                im3.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                im4.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                im5.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                im6.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                im7.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                im8.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                im9.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                im10.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                im11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                im12.setVisibility(View.INVISIBLE);
            }
            if (clickSecond == 0) {
                im1.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 1) {
                im2.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 2) {
                im3.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 3) {
                im4.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 4) {
                im5.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 5) {
                im6.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 6) {
                im7.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 7) {
                im8.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 8) {
                im9.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 9) {
                im10.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 10) {
                im11.setVisibility(View.INVISIBLE);
            } else if (clickSecond == 11) {
                im12.setVisibility(View.INVISIBLE);
            }
        } else if (firstCard != secondCard) {
            if (clickedFirst == 0) {
                im1.setImageResource(R.drawable.pg0);
            } else if (clickedFirst == 1) {
                im2.setImageResource(R.drawable.pg0);
            } else if (clickedFirst == 2) {
                im3.setImageResource(R.drawable.pg0);
            } else if (clickedFirst == 3) {
                im4.setImageResource(R.drawable.pg0);
            } else if (clickedFirst == 4) {
                im5.setImageResource(R.drawable.pg0);
            } else if (clickedFirst == 5) {
                im6.setImageResource(R.drawable.pg0);
            } else if (clickedFirst == 6) {
                im7.setImageResource(R.drawable.pg0);
            } else if (clickedFirst == 7) {
                im8.setImageResource(R.drawable.pg0);
            } else if (clickedFirst == 8) {
                im9.setImageResource(R.drawable.pg0);
            } else if (clickedFirst == 9) {
                im10.setImageResource(R.drawable.pg0);
            } else if (clickedFirst == 10) {
                im11.setImageResource(R.drawable.pg0);
            } else if (clickedFirst == 11) {
                im12.setImageResource(R.drawable.pg0);
            }
            if (clickSecond == 0) {
                im1.setImageResource(R.drawable.pg0);
            } else if (clickSecond == 1) {
                im2.setImageResource(R.drawable.pg0);
            } else if (clickSecond == 2) {
                im3.setImageResource(R.drawable.pg0);
            } else if (clickSecond == 3) {
                im4.setImageResource(R.drawable.pg0);
            } else if (clickSecond == 4) {
                im5.setImageResource(R.drawable.pg0);
            } else if (clickSecond == 5) {
                im6.setImageResource(R.drawable.pg0);
            } else if (clickSecond == 6) {
                im7.setImageResource(R.drawable.pg0);
            } else if (clickSecond == 7) {
                im8.setImageResource(R.drawable.pg0);
            } else if (clickSecond == 8) {
                im9.setImageResource(R.drawable.pg0);
            } else if (clickSecond == 9) {
                im10.setImageResource(R.drawable.pg0);
            } else if (clickSecond == 10) {
                im11.setImageResource(R.drawable.pg0);
            } else if (clickSecond == 11) {
                im12.setImageResource(R.drawable.pg0);
            }
        }
        im1.setEnabled(true);
        im2.setEnabled(true);
        im3.setEnabled(true);
        im4.setEnabled(true);
        im5.setEnabled(true);
        im6.setEnabled(true);
        im7.setEnabled(true);
        im8.setEnabled(true);
        im9.setEnabled(true);
        im10.setEnabled(true);
        im11.setEnabled(true);
        im12.setEnabled(true);
        //checkEnd();
        checkEnd2();
    }
    private  void checkEnd2(){
        if (im1.getVisibility()==View.INVISIBLE &&
                im2.getVisibility()==View.INVISIBLE &&
                im3.getVisibility()==View.INVISIBLE &&
                im4.getVisibility()==View.INVISIBLE &&
                im5.getVisibility()==View.INVISIBLE &&
                im6.getVisibility()==View.INVISIBLE &&
                im7.getVisibility()==View.INVISIBLE &&
                im8.getVisibility()==View.INVISIBLE &&
                im9.getVisibility()==View.INVISIBLE &&
                im10.getVisibility()==View.INVISIBLE &&
                im11.getVisibility()==View.INVISIBLE &&
                im12.getVisibility()==View.INVISIBLE
        ) {
            chronometer.stop();
            chronometer.setBase(SystemClock.elapsedRealtime());
            finishTime = SystemClock.elapsedRealtime();
            long totalTime = finishTime - startTime;
            totalTimeTextView.setText("總花費時間: " + formatElapsedTime(totalTime));
        }
    }
    // 將毫秒數格式化為可讀的時間字符串
    private String formatElapsedTime(long elapsedTime) {
        long minutes = TimeUnit.MILLISECONDS.toMinutes(elapsedTime);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTime) -
                TimeUnit.MINUTES.toSeconds(minutes);
        if (minutes==0){
            return String.format(Locale.getDefault(), "%02d秒",  seconds);
        }else {
            return String.format(Locale.getDefault(), "%02d分%02d秒", minutes, seconds);
        }
    }
    private  void frontOfCardsResources(){
        iv1=R.drawable.pg1;
        iv2=R.drawable.pg2;
        iv3=R.drawable.pg3;
        iv4=R.drawable.pg8;
        iv5=R.drawable.pg5;
        iv6=R.drawable.pg10;
        iv7=R.drawable.pg1;
        iv8=R.drawable.pg2;
        iv9=R.drawable.pg3;
        iv10=R.drawable.pg8;
        iv11=R.drawable.pg5;
        iv12=R.drawable.pg10;
    }
    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        switch (i){
            case DialogInterface.BUTTON_POSITIVE:
                finish();
                break;
            case DialogInterface.BUTTON_NEGATIVE:
                Toast.makeText(this,"按下取消紐!",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void button_Click(View view){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("確認")
                .setMessage("確認結束本程式?")
                .setPositiveButton("確定",this)
                .setNegativeButton("取消",this)
                .show();
    }
    public  void button3(View view){
        Intent intent=new Intent(this,home.class);
        startActivity(intent);
    }
}
























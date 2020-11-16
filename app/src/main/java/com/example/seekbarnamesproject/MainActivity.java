package com.example.seekbarnamesproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView tv1;
SeekBar sk;
Random rnd=new Random();
String []names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        names=new String[] {"adam","david","ron","shlomi","zion","youssef","micheal","jonathan","john","oz"};

        tv1=findViewById(R.id.textView);
        sk=findViewById(R.id.seekBar);
        sk.setOnSeekBarChangeListener(sklistener);



    }
    private SeekBar.OnSeekBarChangeListener sklistener=new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
         // int num=rnd.nextInt(names.length);
        //  tv1.setText(names[num]);
            int n=seekBar.getProgress();
            tv1.setText(names[n]);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {



        }
    };
}
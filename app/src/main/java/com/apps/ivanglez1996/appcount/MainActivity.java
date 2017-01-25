package com.apps.ivanglez1996.appcount;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView  display;
    private Button boton1;
    private Button boton2;
    private Integer counter;

    class MyButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            if(view.equals(boton1.findViewById(R.id.button1))){
                counter++;
            }else{
                counter--;
            }
            display.setText(counter.toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = 0;
        boton1 = (Button)findViewById(R.id.button1);
        boton2 = (Button)findViewById(R.id.button2);
        display = (TextView) findViewById(R.id.display);
        boton1.setOnClickListener(new MyButtonListener());
        boton2.setOnClickListener(new MyButtonListener());
    }
}

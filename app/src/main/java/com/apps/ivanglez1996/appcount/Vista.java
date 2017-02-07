package com.apps.ivanglez1996.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Vista extends Activity {
    private static TextView display;
    private Button boton1;
    private Button boton2;
    private Mediador mediador;
    private Presentador presentador;

    public void mostrarTexto(String text){
        display.setText(text);
    }
    class MyButtonListener1 implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            presentador.aumentar();
        }
    }

    //Listener para el boton de resta
    class MyButtonListener2 implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            presentador.disminuir();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button) findViewById(R.id.button1);
        boton2 = (Button) findViewById(R.id.button2);
        display = (TextView) findViewById(R.id.display);

        boton1.setOnClickListener(new MyButtonListener1());
        boton2.setOnClickListener(new MyButtonListener2());

        mediador = (Mediador)getApplication();
        presentador = mediador.getPresentador();
    }
}

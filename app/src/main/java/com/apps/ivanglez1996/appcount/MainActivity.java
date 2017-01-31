package com.apps.ivanglez1996.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static TextView display;
    private Button boton1;
    private Button boton2;
    private Presentador presentador;


    class MyButtonListener1 implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            presentador.aumentar();
        }
    }

    class MyButtonListener2 implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            presentador.disminuir();
        }
    }

    public static void mostrarTexto(Integer numero){
        display.setText(numero.toString());
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

        presentador = new Presentador();
    }
}

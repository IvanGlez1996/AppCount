package com.apps.ivanglez1996.appcount;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Vista extends Activity {
    private TextView display;
    private Button boton1;
    private Button boton2;
    private Presentador presentador;

    public void mostrarTexto(String text){
        display.setText(text);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton1 = (Button) findViewById(R.id.button1);
        boton2 = (Button) findViewById(R.id.button2);
        display = (TextView) findViewById(R.id.display);
        presentador = new Presentador(this);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presentador.aumentar();
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presentador.disminuir();
            }
        });


    }
}

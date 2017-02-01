package com.apps.ivanglez1996.appcount;

import android.view.View;

/**
 * Created by ivang_000 on 29/01/2017.
 */

public class Presentador {
    private Vista vista;
    private Modelo modelo;

    public Presentador(Vista vista){
        this.vista = vista;
        this.modelo = new Modelo();
    }

    public void aumentar(){
        modelo.aumentar();
        vista.mostrarTexto(modelo.getCounter().toString());
    }

    public void disminuir(){
        modelo.disminuir();
        vista.mostrarTexto(modelo.getCounter().toString());
    }
}

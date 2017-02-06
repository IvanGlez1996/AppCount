package com.apps.ivanglez1996.appcount;

import android.app.Application;

/**
 * Created by ivang_000 on 06/02/2017.
 */

public class Mediador extends Application {
    private Presentador presentador;
    private Modelo modelo;
    private Vista vista;

    @Override
    public void onCreate(){
        super.onCreate();

        this.vista = new Vista();
        this.modelo = new Modelo();
        this.presentador = new Presentador(this);
    }

    public Presentador getPresentador(){
        return this.presentador;
    }

    public Modelo getModelo(){
        return this.modelo;
    }

    public Vista getVista(){
        return this.vista;
    }
}

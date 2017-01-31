package com.apps.ivanglez1996.appcount;

/**
 * Created by ivang_000 on 29/01/2017.
 */

public class Presentador implements InterfazPresentador {
    private Modelo modelo;

    public Presentador(){
        modelo = new Modelo();
    }

    public void aumentar(){
        Integer numero = modelo.aumentar();
        mostrarTexto(numero);

    }
    public void disminuir(){
        Integer numero = modelo.disminuir();
        mostrarTexto(numero);


    }
    public void mostrarTexto (Integer numero){
        MainActivity.mostrarTexto(numero);
    }
}

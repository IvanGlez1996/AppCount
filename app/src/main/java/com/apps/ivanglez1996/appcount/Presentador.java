package com.apps.ivanglez1996.appcount;

/**
 * Created by ivang_000 on 29/01/2017.
 */

public class Presentador {
    private Mediador mediador;
    private Modelo modelo;
    private Vista vista;

    public Presentador(Mediador mediador){
        this.mediador = mediador;
        this.modelo = mediador.getModelo();
        this.vista = mediador.getVista();
    }

    public void aumentar(){
        this.modelo.aumentar();
        this.vista.mostrarTexto(this.modelo.getCounter().toString());
    }

    public void disminuir(){
        this.modelo.disminuir();
        this.vista.mostrarTexto(this.modelo.getCounter().toString());
    }
}

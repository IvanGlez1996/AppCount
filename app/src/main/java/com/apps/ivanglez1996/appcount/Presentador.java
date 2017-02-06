package com.apps.ivanglez1996.appcount;

/**
 * Created by ivang_000 on 29/01/2017.
 */

public class Presentador {
    private Mediador mediador;

    public Presentador(Mediador mediador){
        this.mediador = mediador;
    }

    public void aumentar(){
        mediador.getModelo().aumentar();
        mediador.getVista().mostrarTexto(mediador.getModelo().getCounter().toString());
    }

    public void disminuir(){
        mediador.getModelo().disminuir();
        mediador.getVista().mostrarTexto(mediador.getModelo().getCounter().toString());
    }
}

package com.apps.ivanglez1996.appcount;

/**
 * Created by ivang_000 on 29/01/2017.
 */

public class Modelo {
    private Integer counter;


    public Modelo(){
        this.counter = 0;
    }

    public void aumentar(){
        this.counter++;
    }

    public void disminuir(){
        this.counter--;
    }

    public Integer getCounter(){
        return this.counter;
    }
}

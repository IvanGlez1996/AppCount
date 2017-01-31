package com.apps.ivanglez1996.appcount;

/**
 * Created by ivang_000 on 29/01/2017.
 */

public class Modelo {
    private Integer counter;


    public Modelo(){
        this.counter = 0;

    }

    public Integer aumentar(){
        counter++;
        return counter;

    }
    public Integer disminuir(){
        counter--;
        return counter;

    }
}

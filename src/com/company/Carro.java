package com.company;

import java.util.Date;
import java.util.Random;

public class Carro extends Viatura {

    public int distancia;
    public IOnExcesso lst;
    public static final int MAXLEV = 500;

    public Carro(String modelo, String marca, int velocidade) {
        super(modelo, marca, velocidade);
    }

    public void acelera() {
        this._velocidade += (new Random()).nextInt(300) + 1;
        this.distancia += this._velocidade;
        if(this._velocidade > MAXLEV)
            this.lst.OnExcessoHandler(new OnExcesso(this, new Date()));

        this.ver();
    }

    public void setOnExcessoListener(IOnExcesso lst) {
        this.lst = lst;
    }

    public void ver() {
        System.out.println("Modelo: " + super.Modelo + "\nMarca: " + super.Marca + "\nVelocidade: " + super._velocidade + "\nDistância: " + distancia + "\n\n");
    }
}
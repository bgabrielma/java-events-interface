package com.company;

public class Viatura {
    public String Modelo;
    public String Marca;
    protected  int _velocidade;

    public Viatura(String modelo, String marca, int velocidade) {
        this.Modelo = modelo;
        this.Marca = marca;
        this._velocidade = velocidade;
    }

    public int get_velocidade() {
        return _velocidade;
    }

    public void set_velocidade(int _velocidade) {
        if(_velocidade > 0) this._velocidade = _velocidade;
    }
}

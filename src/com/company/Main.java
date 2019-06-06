package com.company;

public class Main {

    public static void main(String[] args) {
        Carro fiat = new Carro("Fiat 600","Fiat", 0);
        Carro ford = new Carro("Ford Gt", "Ford", 0);

        IOnExcesso iOnExcesso = evt -> {
            System.out.println(evt.data);
            System.out.println("Excesso de velocidade");
            ((Carro)evt.getSource()).distancia = 0;
        };

        fiat.setOnExcessoListener(iOnExcesso);
        ford.setOnExcessoListener(iOnExcesso);

        for(int i = 0; i < 10 ; i++) {
            fiat.acelera();
            ford.acelera();
        }
    }
}

package br.com.dio.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        List<Carro> ListCarros = new ArrayList<>();
        ListCarros.add(new Carro("Ford"));
        ListCarros.add(new Carro("Chevrolet"));
        ListCarros.add(new Carro("Fiat"));
        ListCarros.add(new Carro("Pegeout"));
        System.out.println(ListCarros);

        System.out.println(ListCarros.contains(new Carro("Ford")));

        System.out.println(ListCarros.get(2));
        System.out.println(ListCarros.indexOf(new Carro("Fiat")));

        System.out.println(ListCarros.remove(2));
        System.out.println(ListCarros);


    }
}

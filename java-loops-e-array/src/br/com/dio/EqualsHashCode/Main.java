package br.com.dio.EqualsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> ListaCarro = new ArrayList<>();


        ListaCarro.add(new Carro("ford"));
        ListaCarro.add(new Carro("chevrolet"));
        ListaCarro.add(new Carro("volkswagen"));

        System.out.println(ListaCarro.contains(new Carro("ford")));
        System.out.println(new Carro("ford").hashCode());

        Carro carro1 = (new Carro("ford"));
        Carro carro2 = (new Carro("ford"));
        System.out.println(carro1.equals(carro2));

    }
}

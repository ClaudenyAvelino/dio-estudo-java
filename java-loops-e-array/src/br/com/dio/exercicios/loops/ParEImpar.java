package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quantNumeros;
        int numero;

        System.out.println("Quantidade de números: ");
        quantNumeros = in.nextInt();

        int cout = 0;
        do {
            System.out.println("Numéro: ");
            numero = in.nextInt();
            cout++;
        }while (cout < quantNumeros );

    }
}

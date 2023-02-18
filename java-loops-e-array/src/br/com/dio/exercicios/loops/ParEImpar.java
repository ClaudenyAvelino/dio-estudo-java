package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares=0,quantIpares=0;

        System.out.println("Quantidade de números: ");
        quantNumeros = in.nextInt();

        int cout = 0;
        do {
            System.out.println("Numéro: ");
            numero = in.nextInt();

            if (numero % 2 == 0)quantPares++;
            else quantIpares++;


            cout++;
        }while (cout < quantNumeros );
        System.out.println("Quantidade Par"+quantPares);
        System.out.println("Quantidade Impares"+quantIpares);
    }
}

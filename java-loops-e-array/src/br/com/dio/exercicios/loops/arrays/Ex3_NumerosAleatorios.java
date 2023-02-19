package br.com.dio.exercicios.loops.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random radon = new Random();

        int[] numerosAleatorios = new int[20];


        for (int i =0;i < numerosAleatorios.length;i++){
           int numero = radon.nextInt(100);
            numerosAleatorios[i] = numero;

        }
        System.out.print("Numeros aleatorios: ");
        for ( int numero: numerosAleatorios  ) {
            System.out.print(numero+ " ");
        }

        System.out.print("\nSucessor dos Numeros aleatorios: ");
        for ( int numero: numerosAleatorios  ) {
            System.out.print(numero+1+" ");
        }
        System.out.print("\nAntecessor dos Numeros aleatorios: ");
        for ( int numero: numerosAleatorios  ) {
            System.out.print(numero-1+" ");
        }

    }
}

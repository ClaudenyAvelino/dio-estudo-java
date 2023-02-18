package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex_5A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a tabuada:");
        int numero = in.nextInt();

        for ( int i=1;i <= 10;i++){
            System.out.println(numero+" X "+ i +" = "+ (i * numero));
        }
    }
}

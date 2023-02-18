package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int multiplicacao=1;

        System.out.println("informe fatorial");
        int fat = in.nextInt();
        for (int i=fat;i >= 1;i--){
        multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }
}

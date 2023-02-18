package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cout=1;
        System.out.println("Informe a tabuada:");
        int numero = in.nextInt();
        do {

            System.out.println(numero+" X "+ cout +" = "+ (cout * numero));
            cout++;
        }while (cout <= 10);
    }
}

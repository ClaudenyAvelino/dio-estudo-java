package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int nota;

        System.out.println("informe nota:");
        nota = entrada.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Nota infalida informe novamente");
            nota = entrada.nextInt();
        }

    }
}

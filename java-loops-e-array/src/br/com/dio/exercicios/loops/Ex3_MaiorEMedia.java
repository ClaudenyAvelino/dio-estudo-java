package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int maio = 0;
        int menor = 0;
        int soma = 0;

        int cont= 0;

        do {
            System.out.println("Numero");
            numero = entrada.nextInt();

            soma = soma + numero;

            if (numero > maio) maio = numero;

                cont = cont + 1;


        }while (cont < 5);
        System.out.println("Maior: "+maio);
        System.out.println("Menor: "+menor);
        System.out.println("Média: "+ (soma/5));
    }
}

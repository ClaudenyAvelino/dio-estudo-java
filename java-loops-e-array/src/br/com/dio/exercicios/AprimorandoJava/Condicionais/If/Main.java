package br.com.dio.exercicios.AprimorandoJava.Condicionais.If;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite idade:");
        int idade = in.nextInt();

        if (idade <= 14){
            System.out.println("Pré adolescente!");
        }else if(idade > 14 && idade < 18){
            System.out.println("Adolescente");
        }else {
            System.out.println("Adulto");
        }
    }
}

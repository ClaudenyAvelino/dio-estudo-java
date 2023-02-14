package br.com.dio.exercicios.loops;

import java.util.Scanner;


public class Ex1_NomeEIdade {

    /*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        int cont=0;

        while (true){

            System.out.println("Nome: ");
            nome = entrada.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = entrada.nextInt();

        }

        System.out.println(cont);
    }

}

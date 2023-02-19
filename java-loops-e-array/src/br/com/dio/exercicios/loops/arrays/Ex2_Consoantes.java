package br.com.dio.exercicios.loops.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            String [] consoantes = new String[6];

            int qiantidadeConsoantes = 0;

            int cout =0;
            do {
                System.out.println("Letra:");
                String lentra = in.next();

                if ( !(lentra.equalsIgnoreCase("a")|
                        lentra.equalsIgnoreCase("e")|
                                lentra.equalsIgnoreCase("i")|
                                        lentra.equalsIgnoreCase("o")|
                                                lentra.equalsIgnoreCase("u")) ){
                    consoantes[cout] = lentra;
                    qiantidadeConsoantes++;

                }
                    cout++;

            }while (cout < consoantes.length);
        System.out.println("Consoantes: ");
        for ( String consoante : consoantes) {
            if ( consoante != null)

            System.out.print(consoante+" ");
        }

    }
}

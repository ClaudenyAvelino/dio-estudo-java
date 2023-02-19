package br.com.dio.exercicios.loops.arrays;

public class Ex1_Ordeminversa {
    public static void main(String[] args) {

        int [] vetor = {-5,-6,15,50,8,4};

        int cout=0;
        while (cout<(vetor.length)){
            System.out.print(vetor[cout]+ " ");
            cout++;
        }
        System.out.println("");

        for (int i = (vetor.length -1); i >= 0;i--){
            System.out.print(vetor[i]+" ");
        }



    }
}

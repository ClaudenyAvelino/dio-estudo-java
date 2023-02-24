package br.com.dio.Poo.Conta;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPáulo = new Conta();
        contaDoPáulo.saldo = 100;
        contaDoPáulo.deposita(50);

        boolean conseguiuretirar = contaDoPáulo.saca(20);

        System.out.println(contaDoPáulo.saldo);

        System.out.println(conseguiuretirar);
        System.out.println("----------------");
        Conta contaDaMarcela = new Conta();

        contaDaMarcela.deposita(1000);
        contaDaMarcela.transfere(300,contaDoPáulo);

        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPáulo.saldo);

    }
}

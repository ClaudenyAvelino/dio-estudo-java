package br.com.dio.Poo.Conta;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPáulo = new Conta();
        contaDoPáulo.saldo = 100;
        contaDoPáulo.deposita(50);

        boolean conseguiuretirar = contaDoPáulo.saca(60);

        System.out.println(contaDoPáulo.saldo);

        System.out.println(conseguiuretirar);

    }
}

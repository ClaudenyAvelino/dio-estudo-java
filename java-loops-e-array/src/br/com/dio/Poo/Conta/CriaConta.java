package br.com.dio.Poo.Conta;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        primeiraConta.saldo = 200;
        System.out.println("Primeira conta\nSaldo   :"+primeiraConta.saldo);
        primeiraConta.saldo +=100;
        primeiraConta.titular = "Claudeny";

        System.out.println("Saldo   :"+primeiraConta.saldo+
                "\nTitular :"+primeiraConta.titular);
        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println("-------------");

        System.out.println("Segunda conta\nsaldo: "+segundaConta.saldo);
        System.out.println(segundaConta.agencia);
        System.out.println(segundaConta.numero);


    }
}

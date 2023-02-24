package br.com.dio.Poo.Conta.BitBanck;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total =0;

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total é " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("Estou criando uma conta "+this.numero);

    }

    public void deposita(double valor){
            this.saldo += valor;
    }
    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return  true;
        }else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else {
            return false;
        }
    }

    public double getSaldo() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia = agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("Não pode valor manor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void getNumero(int numero) {
        if (numero <= 0){
            System.out.println("Não pode valor manor igual a 0");
            return ;
        }
        this.numero = numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}

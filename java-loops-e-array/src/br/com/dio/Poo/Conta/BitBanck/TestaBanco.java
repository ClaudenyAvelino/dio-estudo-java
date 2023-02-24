package br.com.dio.Poo.Conta.BitBanck;

public class TestaBanco {

    public static void main(String[] args) {
       Conta conta = new Conta(1337, 23334);
       Conta conta1 = new Conta(1021, 2233);
       Conta conta2 = new Conta(1022, 2233);
       Conta conta3 = new Conta(1023, 2233);

       conta.deposita(200.0);
        System.out.println(conta.getSaldo());
        conta.setAgencia(570);
        System.out.println(conta.getAgencia());
        System.out.println("o total de contas é : "+ Conta.getTotal());
    }
}

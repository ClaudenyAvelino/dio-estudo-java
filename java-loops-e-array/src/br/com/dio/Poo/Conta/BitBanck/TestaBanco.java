package br.com.dio.Poo.Conta.BitBanck;

public class TestaBanco {

    public static void main(String[] args) {
        Cliente clau = new Cliente();
        clau.nome  ="claudeny";
        clau.cpf = "222.222.222-22";
        clau.profissao = "prog";


        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);

        contaDoPaulo.titular = clau;
        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular);
        System.out.println(clau.nome);


    }
}

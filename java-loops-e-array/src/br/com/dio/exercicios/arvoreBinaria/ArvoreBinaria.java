package br.com.dio.exercicios.arvoreBinaria;

public class ArvoreBinaria<T extends Comparable<T>>{

        private BinNo<T> rais;

    public ArvoreBinaria() {
        this.rais = null;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        rais = inserir(rais,novoNo);

    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> nvoNo){
        if (atual == null){
            return nvoNo;
        }else if(nvoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(),nvoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(),nvoNo));
        }
        return atual;
    }

    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.rais);
    }

    private void exibirInOrdem(BinNo<T> atual){
        if (atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + " , ");
            exibirInOrdem(atual.getNoDir());
        }

    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.rais);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if (atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + " , ");

        }

    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.rais);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if (atual != null){
            System.out.println(atual.getConteudo() + " , ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());

        }

    }
}

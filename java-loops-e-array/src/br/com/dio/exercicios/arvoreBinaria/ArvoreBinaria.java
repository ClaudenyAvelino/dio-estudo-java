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
}

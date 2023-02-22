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

    public void remover(T conteudo){
        try {
            BinNo<T> atual = this.rais;
            BinNo<T> pai = null;
            BinNo<T> filho = null;
            BinNo<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) {
                pai = atual;
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                } else {
                    atual = atual.getNoDir();
                }
            }
            if (atual == null) {
                System.out.println("Conteudo não encontrado. Bloco tri");
            }

            if (pai == null) {
                if (atual.getNoDir() == null) {
                    this.rais = atual.getNoEsq();
                } else if (atual.getNoEsq() == null) {
                    this.rais = atual.getNoDir();
                } else {
                    for (temp = atual, filho = atual.getNoEsq();
                         filho.getNoDir() != null;
                         temp = filho, filho = filho.getNoEsq()
                    ) {
                        if (filho != atual.getNoEsq()) {
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(rais.getNoEsq());
                        }
                    }
                    filho.setNoDir(rais.getNoDir());
                    rais = filho;
                }
            }else if(atual.getNoDir() == null){

            }else if(atual.getNoEsq() == null){

            }else {

            }

        }catch (NullPointerException erro){
            System.out.println("Conteudo não encontrado. Bloco catch");
        }
    }
}

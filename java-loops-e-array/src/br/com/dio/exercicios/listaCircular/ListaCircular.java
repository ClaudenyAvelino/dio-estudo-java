package br.com.dio.exercicios.listaCircular;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;


    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista =0;

    }

    public void add(T conteudo){
        No<T> nonoNo = new No<>(conteudo);

        if(this.tamanhoLista == 0){
            this.cabeca = nonoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);
        }else{
            nonoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(nonoNo);
            this.cauda = nonoNo;
        }
        this.tamanhoLista++;
    }


    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        No<T> noAuxiliar = cauda;
        if(index == 0){ //estou na cauda
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(cauda);
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else{
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }


    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista esta vazia");

        if (index == 0){
            return this.cauda;
        }
        No<T> noAuxiliar = this.cauda;
        for (int i = 0;(i < index) && (noAuxiliar != null);i++){
                    noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }

}

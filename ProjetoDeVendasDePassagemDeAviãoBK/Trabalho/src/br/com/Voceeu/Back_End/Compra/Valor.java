package br.com.Voceeu.Back_End.Compra;

public class Valor {//Essa calsse so serve para nao tem criar o mesmo dados tipo valor em todas as classe que preceissa
    private float valor;

    public float getValor(){
        return this.valor;
    }

    public void setValor(float valor){
        this.valor = valor;
    }

    public float somaValores(float valor){
        return this.valor = this.valor + valor;        
    }
}

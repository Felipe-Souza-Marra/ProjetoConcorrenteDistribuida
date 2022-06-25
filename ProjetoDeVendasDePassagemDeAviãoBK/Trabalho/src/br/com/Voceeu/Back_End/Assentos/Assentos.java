package br.com.Voceeu.Back_End.Assentos;

public class Assentos {//calsse para o calsse Aviao noa ficar com muita coisa que ja tar
    private boolean vago = true;
    private String nomeAcentos;

  

    public boolean getVago(){
        return this.vago;
    }

    public String getNomeAcentos(){
        return this.nomeAcentos;
    }

    public void setVago(boolean vago){
        this.vago = vago;
    }

    public void setNomeAcentos( String nomeAcentos){
        this.nomeAcentos = nomeAcentos;
    }

}

package br.com.Voceeu.Back_End.Compra;

public class DiaHorario {//Essa calsse so serve para nao tem criar o mesmo dados tipo dia, mes e hora em todas as classe que preceissa
    private float hora;
    private int dia;
    private int mes;
    
    public int getMes() {
        return mes;
    }
    public float getHora() {
        return hora;
    }
    public int getDia() {
        return dia;
    }
    
    public void setHora(float hora) {
        this.hora = hora;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
 
    public String getData(){
        return dia+"/"+mes+"\n//Horario: "+hora;
    }

    
}

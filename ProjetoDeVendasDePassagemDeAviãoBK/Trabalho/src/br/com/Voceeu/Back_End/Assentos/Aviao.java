package br.com.Voceeu.Back_End.Assentos;

import java.util.ArrayList;

import br.com.Voceeu.Back_End.Compra.DiaHorario;
import br.com.Voceeu.Back_End.Compra.Valor;



public class Aviao {
    private ArrayList<Assentos> acentos = new ArrayList<Assentos>();
    private String nomeAviao;
    private DiaHorario data ;
    private Valor valor;
    private int lotacao = 20;
    private String saida;
    private String chegada;
    

    public Aviao(String nomeAviao, DiaHorario data, Valor valor, String saida, String chegada){
        this.data = data;
        this.valor = valor;
        this.setNomeAviao(nomeAviao);
        this.saida = saida;
        this.chegada = chegada;
        int i;
        
        //nomeção do acentos a adecionar ao avião 
        for(i=0; i < 20;i++){
            if(i <= 10){//os primeiro 10 acneto e da esqueda(E) os outos 10 e da diretita(D)
                Assentos acentoE = new Assentos();
                acentoE.setNomeAcentos("E"+ (i+1));
                acentoE.setVago(true);
                acentos.add(acentoE);
                
            }else{
                Assentos acentoD = new Assentos();
                acentoD.setNomeAcentos("D"+ (i+1));
                acentoD.setVago(true);
                acentos.add(acentoD);
            }
            
        }
        Assentos acentoN = new Assentos();
        acentoN.setNomeAcentos("NULO");
        acentos.add(acentoN);  
    }

    public String getChegada() {
        return chegada;
    }

    public void setChegada(String chegada) {
        this.chegada = chegada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    //para oupar o acento e retonar o acento para a Casse Pasagem
    public Assentos ocuparAcento(String nomeAcento){
        Assentos selecionado = new Assentos();
        for(Assentos as : acentos){
            
            if(as.getNomeAcentos().compareTo(nomeAcento) == 0  && as.getVago() == false){
                //acento ocupado
                acentos.get(20);
            }else if(as.getNomeAcentos().compareTo(nomeAcento) == 0){
                as.setVago(false);
                selecionado = as;
                this.lotacao--;
                break;
            
            }else if(as.getNomeAcentos() != nomeAcento){
                acentos.get(20);
            }
            
           
        }
        
        
        return selecionado;
    }

    public String getNomeAviao() {
        return nomeAviao;
    }

    public void setNomeAviao(String nomeAviao) {
        this.nomeAviao = nomeAviao;
    }

    public float getValor(){
        return valor.getValor();
    }

    public String getDataAviao(){
        return data.getData();
    }



}

package br.com.Voceeu.Back_End.Acentos;

import java.util.ArrayList;

import br.com.Voceeu.Back_End.Compra.DiaHorario;
import br.com.Voceeu.Back_End.Compra.Valor;



public class Aviao {
    private ArrayList<Acentos> acentos = new ArrayList<Acentos>();
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

        //nomeção do acentos a adecionar ao avião 
        for(int i=0; i < 20; i++){
            if(i+1 <= 10){//os primeiro 10 acneto e da esqueda(E) os outos 10 e da diretita(D)
                Acentos acento = new Acentos();
                acento.setNomeAcentos("E"+ i+1);
                acento.setVago(true);
                acentos.add(acento);
            }else{
                Acentos acento = new Acentos();
                acento.setNomeAcentos("D"+ i+1);
                acento.setVago(true);
                acentos.add(acento);
            }
        }
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
    public Acentos ocuparAcento(String nomeAcento){
        int vetorPossicao = 0;
        for(Acentos as : acentos){
            if(as.getNomeAcentos() == nomeAcento){
                as.setVago(false);
                vetorPossicao++;
                this.lotacao--;
                break;
            }
        }
        return acentos.get(vetorPossicao);
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

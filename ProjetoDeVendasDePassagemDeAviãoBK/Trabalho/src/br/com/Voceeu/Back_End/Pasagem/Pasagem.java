package br.com.Voceeu.Back_End.Pasagem;

import br.com.Voceeu.Back_End.Acentos.Acentos;
import br.com.Voceeu.Back_End.Acentos.Aviao;
import br.com.Voceeu.Back_End.CadastroPessoa.Passageiro;

public class Pasagem {
    private Passageiro passageiro;
    private Aviao aviao;
    private String Acento;    
    //pasagem sera criado so quando ele for compra uma assim no final da compra p sistema passara todas as inforção para criaçao da passagem
    public Pasagem(Passageiro passageiro, Aviao aviao , Acentos acento){
        this.setPassageiro(passageiro);
        this.setAviao(aviao);
        this.setAcento(acento.getNomeAcentos());
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public String getAcento() {
        return Acento;
    }

    public void setAcento(String acento) {
        this.Acento = acento;
    }
 
}

package br.com.Voceeu.Back_End.Main;

import java.util.ArrayList;

import br.com.Voceeu.Back_End.Assentos.Aviao;
import br.com.Voceeu.Back_End.BD_cont.Bd_cont;
import br.com.Voceeu.Back_End.CadastroPessoa.Passageiro;
import br.com.Voceeu.Back_End.CadastroPessoa.adim;
import br.com.Voceeu.Back_End.Compra.DiaHorario;
import br.com.Voceeu.Back_End.Compra.Valor;
import br.com.Voceeu.Back_End.Passagem.Passagem;
import br.com.Voceeu.Back_End.RelatorioVendas.RelatorioVendas;
import br.com.Voceeu.Back_End.Servidor.ServidorLocal;

public class Main {
    public static void main(String[] args) {//Mayco: nao sei se a meins vai ficar aqui mais caso nao fique nao tira ela daqui pode ser usada para testar
        // teste
        
        ArrayList<Aviao> aviaos = new ArrayList<Aviao>();
        ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();
        DiaHorario data = new DiaHorario();
        DiaHorario data1 = new DiaHorario();
        DiaHorario data2 = new DiaHorario();
        Valor valor = new Valor();
        valor.setValor(2000);
        data.setDia(15);
        data.setHora(15);
        data.setMes(5);
        //System.out.println("Bog001");
        Aviao av1 = new Aviao("Bog001", data, valor, "Brasilha-DF", "Portugal");
        aviaos.add(av1);
        data1.setDia(15);
        data1.setHora(18);
        data1.setMes(5);
        //System.out.println("Bog002");
        Aviao av2 = new Aviao("Bog002", data1, valor, "Brasilha-DF", "Portugal");
        aviaos.add(av2);
        data2.setDia(15);
        data2.setHora(15);
        data2.setMes(5);
        //System.out.println("Bog003");
        Aviao av3 = new Aviao("Bog003", data2, valor,"Brasilha-DF", "Portugal");
        aviaos.add(av3);

        adim adim = new adim();
        adim.setCpf("100000000");
        adim.setNivelAcesso(0);
        adim.setNome("Roberto");
        adim.setSenha("0000");
        
        Passageiro p1 = new Passageiro();
        p1.setNivelAcesso(1);
        p1.setCpf("1222222222");
        p1.setEmail("carlos@gamil.com");
        p1.setNome("Carlos");
        p1.setSenha("0000");

        Valor valorTotal = new Valor();
        valorTotal.setValor(0);
        Passagem psg = new Passagem(p1, aviaos.get(1), aviaos.get(1).ocuparAcento("E1"));
        valorTotal.somaValores(valor.getValor());
        p1.addPasagem(psg);
        Passagem psg2 = new Passagem(p1, aviaos.get(2), aviaos.get(2).ocuparAcento("D11"));
        valorTotal.somaValores(valor.getValor());
        p1.addPasagem(psg2);
        passageiros.add(p1);

        ServidorLocal s = new ServidorLocal();
        RelatorioVendas r = new RelatorioVendas();

        java.io.File  a = r.CriaçãoArquivo(30, 5, s);
        
        Bd_cont bd = new Bd_cont();
        bd.createConnection();

        r.escritaRelatorio(a, aviaos.size(), 1, s , passageiros, valorTotal.getValor());


        bd.closeConnection();

        System.out.println("foi");
        
        



    }
}

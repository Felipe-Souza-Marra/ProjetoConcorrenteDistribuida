package Aula_2;

import java.util.ArrayList;
import java.util.List;

public class Principal_2 {

	public static void main(String[] args) {
		
		List<Operacao> operacoes = new ArrayList<Operacao>();
		
		operacoes.add(Operacao.SOMA);
		operacoes.add(Operacao.SUBTRACAO);
		operacoes.add(Operacao.DIVICAO);
		operacoes.add(Operacao.MUTIPLICACAO);
		
		realizaOperacoes(operacoes);

	}
	
	public static void realizaOperacoes(List<Operacao> operacoes) {
		
		RealizacaoOperacao realiza = new RealizacaoOperacao();
		
		operacoes.forEach((operacao) -> {
			Thread thread = new Thread(() ->  realiza.realizaOperacao(operacao), operacao.toString());
			thread.start();
		});
		
	}

}

package br.com.Voceeu.Back_End.RelatorioVendas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import br.com.Voceeu.Back_End.CadastroPessoa.Passageiro;
import br.com.Voceeu.Back_End.Pasagem.Pasagem;
import br.com.Voceeu.Back_End.Servidor.Servidor;

public class RelatorioVendas {
    
    //dados nessesario para criar o arquivo do ralatorio
    public java.io.File CriaçãoArquivo(int data,int mes, Servidor nomeServidor){
        String nomeRelation = "Relatorio_venda_"+data+"_"+mes+"_"+nomeServidor.getNome()+".txt";//nome da do arquivo .txt ficando Relatorio_venda_15_05_Ser01.txt
        //coloca seu diretorio 
        java.io.File diretorio = new java.io.File("C:\\Users\\admin\\Downloads\\ENE\\teste para o trabalho\\java\\Trabalho\\src\\br\\com\\Voceeu\\Back_End\\RelatorioVendas\\Relatorio");//indereço do arquivo onde ficara o relatorio
        java.io.File arquivo = new java.io.File(diretorio, nomeRelation);//usado para se cria o arquivo o diretorio e o nome do arquivo
        return arquivo;
    }
    //escriata do raltorio(se nao quiser meche nisso pois e grande deixa como o Mayco)
    public void escritaRelatorio(java.io.File arquivo, int TotalVoos, int totalVendas, Servidor nomeServidor, ArrayList<Passageiro> passageiros, float valorTotal){
        
        try {
            arquivo.createNewFile();//criação do arquivo
            FileWriter fileWriter = new FileWriter(arquivo, false);//abrindo arquivo 
            PrintWriter printWriter = new PrintWriter(fileWriter);//abre o fluxo do arquivo

            //como sera a estrutura e as inforação de casa topico do relatorio
            printWriter.println("++++++++++++++Relatorio de venda++++++++++++++");
            printWriter.println("//Nome do Servidor: "+ nomeServidor.getNome());
            printWriter.printf("//Valor total das vendas: R$%.2f\n", valorTotal);
            printWriter.println("//Numeros de voos: "+ TotalVoos);
            printWriter.println("//Numeros de vendas: "+ totalVendas);
            printWriter.println("++++++++++++++Fim do Relatorio++++++++++++++");
            
            //coisa complementar pois sou o Mayco e louco kkk mais isso e serve para ter 100% da inforção do servidor
            for (Passageiro passageiroPasagem : passageiros) {
                printWriter.print("\n\n");
                printWriter.println("++++++++++++++Hitorio Passagem++++++++++++++");
                printWriter.println("//Nome do Passageiro: "+ passageiroPasagem.getNome());
                printWriter.println("//CPF do Passageiro: "+ passageiroPasagem.getCpf());
                printWriter.println("//Numero de passagem: " +passageiroPasagem.getPasagens().size());
                printWriter.print("\n");
                printWriter.println("++++++++++++++Pasagens++++++++++++++");
                //validação caso nao tenha nhuma passagem
                if(passageiroPasagem.getPasagens().size() == 0){
                    printWriter.println("Não a passagem");

                }else{
                    for (Pasagem pasagens : passageiroPasagem.getPasagens()) {
                        printWriter.println("------------------------------------");
                        printWriter.println("//Nome do Vou: "+ pasagens.getAviao().getNomeAviao());
                        printWriter.println("//Saida: "+ pasagens.getAviao().getSaida());
                        printWriter.println("//Chegada: "+ pasagens.getAviao().getChegada());
                        printWriter.println("//Data e hora do voou: "+ pasagens.getAviao().getDataAviao());
                        printWriter.printf("//Valor da pasagem: R$%.2f\n", pasagens.getAviao().getValor());
                        printWriter.println("//Acento: "+ pasagens.getAcento());
                        
                    }
                }
                printWriter.println("------------------------------------");
                printWriter.println("++++++++++++++Fim do Hitorioco++++++++++++++");

                
            }
            printWriter.flush();//fechamento do flush
            printWriter.close();//fechando arquivo
            System.out.println("foi");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //cauco do valor de todas a vendas
    
    public File CriaçãoArquivo(int data, int mes, String string) {
        return null;
    }


}

package br.com.Voceeu.Back_End.Seguranca;

import java.util.ArrayList;

import br.com.Voceeu.Back_End.CadastroPessoa.Passageiro;

public class Acesso {
    public boolean validarSenha(String senha, Passageiro passageiro){
        boolean acesso = false;
        if(senha == passageiro.getSenha()){
            acesso = true;
        }
        return acesso;
    }

    public Passageiro VlaidaLogin(ArrayList<Passageiro> passageiros, String nome){
        Passageiro p = new Passageiro();
        p.setCpf("0");//se o cpf for 0 siginifica que noa foi encontrado
        for (Passageiro VarrePassageiros : passageiros) {
            if(VarrePassageiros.getCpf() == nome){
                p =VarrePassageiros;
            }else if(VarrePassageiros.getEmail() == nome){
                p =VarrePassageiros;
            }
        }
        return p;
    }
}

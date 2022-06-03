package br.com.Voceeu.Back_End.CadastroPessoa;

import java.util.ArrayList;

import br.com.Voceeu.Back_End.Pasagem.Pasagem;

public class Passageiro extends Pessoa{ //calsse filha da pessoa, essa classe cleinte onde ele so pode acessar o que o cliente precissa
    private ArrayList<Pasagem> pasagens = new ArrayList<Pasagem>();

    public void addPasagem(Pasagem p){
        this.pasagens.add(p);
    }

    public void remuviPasagem(Pasagem p){
        this.pasagens.remove(p);
    }

    public ArrayList<Pasagem> getPasagens(){
        return this.pasagens;
    }

    @Override
    public String getCpf() {
        // TODO Auto-generated method stub
        return super.getCpf();
    }

    @Override
    public String getEmail() {
        // TODO Auto-generated method stub
        return super.getEmail();
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public String getSenha() {
        // TODO Auto-generated method stub
        return super.getSenha();
    }

    @Override
    public void setCpf(String cpf) {
        // TODO Auto-generated method stub
        super.setCpf(cpf);
    }

    @Override
    public void setEmail(String email) {
        // TODO Auto-generated method stub
        super.setEmail(email);
    }

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    @Override
    public void setSenha(String senha) {
        // TODO Auto-generated method stub
        super.setSenha(senha);
    }

    @Override
    public int getNivelAcesso() {
        // TODO Auto-generated method stub
        return super.getNivelAcesso();
    }

    @Override
    public void setNivelAcesso(int nivelAcesso) {
        // TODO Auto-generated method stub
        super.setNivelAcesso(nivelAcesso);
    }

        
}

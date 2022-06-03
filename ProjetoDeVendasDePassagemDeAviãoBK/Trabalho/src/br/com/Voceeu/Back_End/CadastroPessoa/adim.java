package br.com.Voceeu.Back_End.CadastroPessoa;

public class adim extends Pessoa{//calsse filha da pessoa, essa classe para que ele tenha acesso ao servidor ao relatorio

    @Override
    public String getCpf() {
        // TODO Auto-generated method stub
        return super.getCpf();
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

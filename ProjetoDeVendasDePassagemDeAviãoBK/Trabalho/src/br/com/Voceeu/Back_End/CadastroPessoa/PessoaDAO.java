package br.com.Voceeu.Back_End.CadastroPessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.Voceeu.Back_End.BD_cont.Bd_cont;

public class PessoaDAO {
    
    public List<Pessoa> Select () throws SQLException, ClassNotFoundException{

        Connection con = Bd_cont.getConnection(); // Busca uma conexão com o banco de dados
        
        PreparedStatement stmt = null;
        
        ResultSet rs = null; // Objeto que armazena o resultado de uma busca em uma estrutura de dados que pode ser percorrida
        
        // Instanciando uma nova lista para receber os valores do banco
        
        List<Pessoa>pessoas = new ArrayList<>();
        
        try{
        
         // Inserindo o comando SQL a ser usado
        
        stmt = con.prepareStatement("SELECT * FROM pessoa");
        
        rs = stmt.executeQuery(); // Executa o comando SQL
        
         /* Loop responsável pela busca dos dados no banco que o repetirá até que não
        
         haja valores */
        
        while(rs.next()){
        
        Pessoa pes = new Pessoa();
        
        pes.setId(rs.getInt("idPessoa"));
        
        pes.setNome(rs.getString("nome"));

        pes.setCpf(rs.getString("cpf"));

        pes.setEmail(rs.getString("email"));

        pes.setSenha(rs.getString("senha"));

        pes.setNivelAcesso(rs.getInt("nivelAcesso"));
        
        pessoas.add(pes); // Adiciona o objeto na lista
        
        }
        
        }catch(SQLException ex){ // Tratamento das exceções
        
        Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        
        }
        
        return pessoas;  
         // Retorna a lista
        
        }
}
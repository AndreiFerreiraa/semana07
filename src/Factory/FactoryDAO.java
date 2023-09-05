
package Factory;

import DAO.ContaDAO;
import DAO.PessoaDAO;
import DAO.postgres.ContaDAOPostgres;
import DAO.postgres.PessoaDAOPostgres;
import Util.GerenciadorConexao;
import java.sql.Connection;



public class FactoryDAO {
    public static ContaDAO makeContaDAO(){
        Connection conexao = GerenciadorConexao.getConexao();
        ContaDAOPostgres contaDao = new ContaDAOPostgres(conexao);   
        return contaDao;
    }
    
    
    public static PessoaDAO makePessoaDAO(){
        Connection conexao = GerenciadorConexao.getConexao();
        PessoaDAOPostgres pessoaDao = new PessoaDAOPostgres(conexao);   
        return pessoaDao;
        
        
    }
}

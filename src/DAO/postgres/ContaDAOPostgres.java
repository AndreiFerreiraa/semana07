package DAO.postgres;

import DAO.ContaDAO;
import Models.Conta;
import Models.ContaCorrente;
import Models.ContaPoupanca;
import Models.ContaSalario;
import Models.Pessoa;
import Models.PessoaFisica;
import Models.PessoaJuridica;
import Models.Transacao;
import Util.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaDAOPostgres implements ContaDAO {

    private final Connection conexao;
    
    public ContaDAOPostgres(Connection conexao){
        this.conexao = conexao;
    }
    
    @Override
    public void insereConta(Conta conta) {
        String sql = "INSERT INTO conta(id, numero, saldo, tipo, pessoa_id, senha) VALUES (?, ?, ?, CAST(? as tipo_conta), ?, ?)";
        String tipoConta = (conta instanceof ContaCorrente) ? "corrente" : (conta instanceof ContaSalario) ? "salario" : "poupanca";
        
        try {
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setObject(1, conta.getId());
            stm.setInt(2, conta.getNumero());
            stm.setDouble(3, conta.getSaldo());
            stm.setString(4, tipoConta);
            stm.setObject(5, conta.getTitular(). getId());
            stm.setString(6, conta.getSenha());
            
            stm.executeUpdate();
        }catch(SQLException error){
            System.out.println(error);
        }
        
    }

    @Override
    public Conta buscarContaPorDocumentoTitular(String documento) {
        String sql = "SELECT c.id, c.numero, c.saldo, c.tipo, c.pessoa_id, c.senha, p.nome, p.tipo AS pessoa_tipo FROM conta c JOIN pessoa p ON c.pessoa_id = p.id WHERE p.documento = ?";
    
        try{
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setString (1, documento);
            
            ResultSet resultado = stm.executeQuery();
            if(resultado.next()){
                UUID id = resultado.getObject("pessoa_id", UUID.class);
                String nome = resultado.getString("nome");
                String tipo = resultado.getString ("pessoa_tipo");
                Pessoa pessoa =(tipo.equals("PF")) ? new PessoaFisica(id, nome, documento) : new PessoaJuridica(id, nome, documento);
                
                UUID idConta = resultado.getObject("id", UUID.class);
                int numero = resultado.getInt("numero");
                double saldo = resultado.getDouble("saldo");
                String tipoC = resultado.getString("tipo");
                String senha = resultado.getString("senha");
                
                switch(tipoC){
                    case "corrente":
                        return new ContaCorrente(idConta, numero, saldo, pessoa,senha);
                    case "poupanca":
                        return new ContaPoupanca(idConta, numero, saldo, pessoa,senha);
                    case "salario":
                        return new ContaSalario(idConta, numero, saldo, pessoa, senha);    
                    default:
                        return null; 
                }        
            }
            return null;
        }catch(SQLException error){
            System.out.println(error);
            return null;
        }
        
    }

    @Override
    public void atualizaSaldo(Conta conta) {
        String sql = "UPDATE conta SET saldo = ? WHERE id = ?";

        try {
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setDouble(1, conta.getSaldo());
            stm.setObject(2, conta.getId());
            stm.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }

    @Override
    public List<Transacao> transacaoDasContas(UUID id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
//    public void addTransacoes(Transacao transacao, UUID id, Object contaId){
//        String sql = "INSERT INTO transacao (id, data, tipo, valor, conta_id, saldo_resultante) VALUES (?, ?, CAST(?, as tipo_transacao), ?, ?, ?";
//        
//        try (Connection connection = GerenciadorConexao.getConexao();
//            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
//                
//            preparedStatement.setObject(1,UUID.randomUUID());
//            preparedStatement.setDate(2,(java.sql.Date) (Date) transacao.getData());
//            preparedStatement.setString(3, transacao.getTipoTransacao());
//            preparedStatement.setDouble(4, transacao.getValor());
//            preparedStatement.setObject(5, contaId);
//            preparedStatement.setDouble(6, transacao.getSaldoResultante());
//            
//            preparedStatement.executeUpdate();
//            
//                } catch (SQLException e) {
//                    e.printStackTrace();
//        }
//        
//        
//        
//        
//    }
//
//    @Override
//    public List<Transacao> transacaoDasContas(UUID id) {
//        List<Transacao> transacoes = new ArrayList<>();
//        
//        String sql = "SELECT id, data, tipo, valor, saldo_resultante FROM transacao WHERE conta_id = ? order BY data";
//        
//        try(PreparedStatement stmt = this.conexao.prepareStatement(sql)){
//            stmt.setObject(1, contaId);
//            ResultSet rs =stmt.executeQuery();
//            
//            while(rs.next()){
//                Transacao transacao = new Transacao();
//                
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(ContaDAOPostgres.class.getName()).log(Level.SEVERE, null, ex);
//        }
//     }
//    
//}

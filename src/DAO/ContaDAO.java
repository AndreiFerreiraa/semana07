
package DAO;

import Models.Conta;
import Models.Transacao;
import java.util.List;
import java.util.UUID;


public interface ContaDAO {
    public void insereConta (Conta conta);
    public Conta buscarContaPorDocumentoTitular(String documento);
    public void atualizaSaldo(Conta conta);
    List<Transacao>transacaoDasContas(UUID id);
}

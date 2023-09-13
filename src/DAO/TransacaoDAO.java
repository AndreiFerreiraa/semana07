
package DAO;

import Models.Conta;
import Models.Transacao;
import java.util.List;

public interface TransacaoDAO {
    public void registrarTransacao(Transacao transacao);
    public List<Transacao> buscarTransacaoesPorConta(Conta conta);
}

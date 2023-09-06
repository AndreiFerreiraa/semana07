package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.mindrot.jbcrypt.BCrypt;

public class Conta {
    private List<Transacao> extrato;
    
    
            
    public Conta(Pessoa titular, String senha) {
        this.id = UUID.randomUUID();
        this.titular = titular;
        this.saldo = 0.0;
        this.numero = this.gerarNumeroConta();
        this.senha = BCrypt.hashpw(senha,BCrypt.gensalt());
        this.extrato = new ArrayList<>();
    }

    public Conta(UUID id, int numero, double saldo, Pessoa titular, String senha) {
        this.id = id;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.senha = senha;
    }
    
    private UUID id;
    private String senha;
    private int numero;
    double saldo;
    private Pessoa titular;
    

    
    public String getSenha(){
        return senha;
    }
    
    public UUID getId() {
        return id;
    }
    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void transferir(Conta destinatario, double valor) {

        this.saldo -= valor;
        destinatario.saldo += valor;

    }
    
    public boolean validaSenha(String senha){
        return BCrypt.checkpw(senha, this.senha);
    }
    

    private int gerarNumeroConta() {
        Random random = new Random();
        return random.nextInt(90000) + 10000;
    }
    
    public void adicionarTransacao(Transacao transacao) {
        extrato.add(transacao);
    }
    public List<Transacao> getExtrato() {
        return extrato;
    }   
    
}
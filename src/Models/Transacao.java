
package Models;

import java.util.Date;
import java.util.UUID;


public class Transacao {
    public Transacao(UUID id, Date data, String tipo, double valor, double saldoResultante) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.valor = valor;
        this.saldoResultante = saldoResultante;
    }
    private UUID id;
    private Date data;
    private String tipo;
    private double valor;
    private double saldoResultante;

    public Transacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
    
  
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldoResultante() {
        return saldoResultante;
    }

    public void setSaldoResultante(double saldoResultante) {
        this.saldoResultante = saldoResultante;
    }

    public String getTipoTransacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

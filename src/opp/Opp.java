package opp;

import Models.Conta;
import Util.GerenciadorConexao;
import java.util.ArrayList;
import Views.Sistema;
import io.github.cdimascio.dotenv.Dotenv;

public class Opp {
    //BANCO DE DADOS FAKE
    public static ArrayList<Conta> banco = new ArrayList<>();
    public static Dotenv dotenv = Dotenv.load();
    
    public static void main(String[] args) {
     new Sistema().setVisible(true); 
     GerenciadorConexao.getConexao();
     











//        ArrayList<Conta> banco = new ArrayList<>();
//        
//        Pessoa pUm = new Pessoa("Gustavo", "999.999.999-99");
//        Pessoa pDois = new Pessoa("Maçaneiro", "888.888.888.88");
//        Pessoa pTres = new Pessoa ("Filipe", "777.777.777-77");
//              
//        banco.add(new Conta (pUm));
//        banco.add(new Conta (pDois));
//        banco.add(new Conta (pTres));
//       
//        banco.get(0).depositar(1000.0);       
//    
//        for (Conta conta:banco){
//            conta.depositar(100.00);
//        }
//          
//      banco.get(0).sacar(500.0);
//      banco.get(2).sacar(80.0);  
//      
//      banco.get(0).transferir(banco.get(1), 100.00);
    }  
    
}
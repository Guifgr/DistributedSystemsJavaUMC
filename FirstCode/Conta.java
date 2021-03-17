import java.rmi.*;
import java.net.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Conta extends UnicastRemoteObject implements IConta {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public Conta() throws RemoteException{}

    public void setNumeroConta(int nc){
        numeroConta = nc;
    };

    public int getNumeroConta(){
        return numeroConta;
    };

    public void setNomeTitular(String nt){
        nomeTitular = nt;
    };

    public String getNomeTitular(){
        return nomeTitular;
    };

    public double getSaldo(){
        return saldo;
    };

    public boolean deposito(double vd){
        if(vd < 0){
         return false;
        }
        saldo += vd;
        return true;
    }
    
    public boolean saque(double vs){
        if((saldo > vs)&&(vs>0)){
            saldo -= vs;
            return true;
        }
         return false;
    }

}

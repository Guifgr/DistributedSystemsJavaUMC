import java.rmi.*;
import java.net.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Cliente{
    public static void main(String args[]){
        try{
            IConta conta = (IConta)Naming.lookup("//localhost/conta");
            conta.deposito(100);
            conta.saque(20);
            System.out.println("Saldo atual: "+conta.getSaldo());
        }
        catch(Exception ex){
            System.out.println("ERRO: "+ex.getMessage());
        }
    }
}


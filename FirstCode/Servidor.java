import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Servidor{
  public static void main(String args[]) {
        try {
            Conta conta = new Conta();

            LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/conta", conta);
            System.out.println("cadastrando o objeto Conta no registry");
        } catch (Exception e) {
          System.out.println("erro: " + e.getMessage());
        }
    }
}
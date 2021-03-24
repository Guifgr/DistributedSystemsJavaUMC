import java.net.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class AplicServidor{
  public static void main(String args[]) {
        try {
            Comprador objServ = new Comprador();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//localhost/objDist", objServ);
            System.out.println("cadastrando o objeto Conta no registry");
        } catch (Exception e) {
          System.out.println("erro: " + e.getMessage());
        }
    }
}
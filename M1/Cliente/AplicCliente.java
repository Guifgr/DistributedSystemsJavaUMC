import java.rmi.*;
import java.net.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.util.Scanner;

public class AplicCliente{
    public static void main(String args[]){
        try{
            IComprador objCli = (IComprador)Naming.lookup("//localhost/objDist");
            Scanner scanf = new Scanner(System.in);

            System.out.println("Digite id");
            objCli.setId(scanf.nextInt()); 
            
            System.out.println("Digite nome");
            objCli.setNome(scanf.next());
            
            System.out.println("Digite email");
            objCli.setEmail(scanf.next());
            
            System.out.println("Digite totalCompra");
            objCli.setTotalCompra(Double.parseDouble(scanf.next()));

            objCli.calcularPorcentagemDesconto();
            objCli.calcularTotalPagar();

            System.out.println("id..............: "+objCli.getId());
            System.out.println("Nome............: "+objCli.getNome());
            System.out.println("Email...........: "+objCli.getEmail());
            System.out.println("Total da Compra.: "+objCli.getTotalCompra());
            System.out.println("Porc Desconto...: "+objCli.getProcentagemDesconto());
            System.out.println("Total a Pagar...: "+objCli.getTotalPagar());
        }
        catch(Exception ex){
            System.out.println("ERRO: "+ex.getMessage());
        }
    }
}


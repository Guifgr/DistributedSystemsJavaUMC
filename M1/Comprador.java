import java.rmi.*;
import java.net.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Comprador extends UnicastRemoteObject implements IComprador {
    private int id;
    private String nome;
    private String email;
    private double porcentagemCompra;
    private double totalCompra;
    private double totalPagar;

    public Comprador() throws RemoteException{}

    public void setId(int id){
        this.id = id;
    };
    
    public int getId(){
        return id;
    };
    
    public void setNome(String nome){
        this.nome = nome;
    };
    
    public String getNome(){
        return nome;
    };
    
    public void setEmail(String email){
        this.email = email;
    };
    
    public String getEmail(){
        return email;
    };
    
    public void setTotalCompra(double totalCompra){
        this.totalCompra = totalCompra;
    };
    
    public double getTotalCompra(){
        return totalCompra;
    };
    
    public double getProcentagemDesconto(){
        return porcentagemCompra;
    };
    
    public double getTotalPagar(){
        return totalPagar;
    };
    
    public void calcularPorcentagemDesconto(){
        if(totalCompra<1000){
            porcentagemCompra = 10;
        }else if(totalCompra<5000){
            porcentagemCompra = 15;
        }else{
            porcentagemCompra = 20;
        };
    };
    
    public void calcularTotalPagar(){
        if(porcentagemCompra == 10){
            totalPagar = totalCompra * 0.90;
        }
        else if(porcentagemCompra == 20){
            totalPagar = totalCompra * 0.85;
        }
        else{
           totalPagar = totalCompra * 0.80;
        }
    };

}

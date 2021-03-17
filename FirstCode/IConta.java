import java.net.*;
import java.rmi.*;

public interface IConta extends Remote{
    public void setNumeroConta(int nc) throws RemoteException;
    public int getNumeroConta() throws RemoteException;
    public void setNomeTitular(String nt) throws RemoteException;
    public String getNomeTitular() throws RemoteException;
    public double getSaldo() throws RemoteException;
    public boolean deposito(double vd) throws RemoteException;
    public boolean saque(double vs) throws RemoteException;
}
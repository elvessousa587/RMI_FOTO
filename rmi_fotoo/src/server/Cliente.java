package server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;


public class Cliente<T extends Remote> {
	private static final int PORT = 2000;
    private final T remote;

    public Cliente(String ip, String name)
            throws RemoteException, NotBoundException, MalformedURLException
    {
        //Acessa um objeto remotamente através do ip do local onde está o objeto e seu nome.
        remote = (T)Naming.lookup("rmi://" + ip + ":" + PORT + "/" + name);
    }

 
    public T getRemoteObj()
    {
        return remote;
    }
}

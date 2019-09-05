package server;

import java.rmi.RemoteException;

public class ServidorMain {
	public static void main(String[] args) {
            
		String ip = "10.180.54.199", name = "SD";
		try {
			Aplicar aplica = new Aplicar();
			Server servidor = new Server(aplica, ip, name);
                        
		} catch (IllegalAccessException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (InstantiationException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (RemoteException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
                
                
	}
}

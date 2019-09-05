package server;

import java.awt.image.BufferedImage;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public interface InterfaceAplica extends Remote {
    
	   ImageIcon aplicarFiltro(ImageIcon image) throws RemoteException;

    
        
}

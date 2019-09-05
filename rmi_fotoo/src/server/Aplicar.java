package server;

import DAO.SequenciaDAO;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import javax.swing.GrayFilter;
import javax.swing.ImageIcon;

public class Aplicar extends UnicastRemoteObject implements InterfaceAplica{
   
    
	protected Aplicar() throws RemoteException {
		
	}
	
        public ImageIcon aplicarFiltro(ImageIcon imagem) throws RemoteException {
             System.out.println("HSUDHAUIDHAUHAUAHUIAUAU");
            //ImageIcon icon = new ImageIcon("yourFile.gif"); 
            Image normalImage = imagem.getImage(); 
            Image grayImage = GrayFilter.createDisabledImage(normalImage); //APLICA O FILTRO
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA");  
             System.out.println(grayImage);
             ImageIcon icon = new ImageIcon(grayImage); //convert Image to ImageIcon
              
             SequenciaDAO sdao = new SequenciaDAO();       
              sdao.add(icon.toString());
              
            
              ServerShow ss = new ServerShow();
             ss.grayImage2 = grayImage;
             ss.setVisible(true);
             
            /*  System.out.println("HSUDHAUIDHAUHAUAHUIAUAU");
            ImageIcon imagem_com_filtro_IC;
            //CONVERTENDO IMAGEICON TO BF
            Image img = image.getImage();
            BufferedImage imagem = (BufferedImage) img;
            
            
            
            Color cor;
            int i;
            for (int x = 0; x<imagem.getWidth(); x++){
            for(int y = 0; y<imagem.getHeight(); y++){
            cor = new Color(imagem.getRGB(x,y));
            i = (cor.getRed()+cor.getGreen()+cor.getBlue()/3);
            imagem.setRGB(x, y, i);
            
            }
            }
            System.out.println("\n33333333");
            imagem_com_filtro_IC = new ImageIcon(imagem);
            
            //int ii = 89;*/
          return icon;  
          
        }
        
}
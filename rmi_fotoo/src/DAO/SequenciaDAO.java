


package DAO;

import server.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class SequenciaDAO {
    
    ConexaoBD cc = new ConexaoBD();
    Connection cn = cc.conexion();

    public void add(String sequencia){
        
        try {
            PreparedStatement pst = cn.prepareStatement("insert into imagem (img) value (?)"); // nome da tabela - nome do atributo
            pst.setString(1, sequencia);
            
            pst.executeUpdate();
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro : " + e);
        }

    }
     
    
    
}

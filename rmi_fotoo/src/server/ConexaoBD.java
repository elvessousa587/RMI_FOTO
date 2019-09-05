
package server;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/sd_rmi","root",""); // rmi nome do banco
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
    
}

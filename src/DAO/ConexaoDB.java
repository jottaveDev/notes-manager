package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Murilo Studio
 */
public class ConexaoDB {
    
    private Connection con;     
    private final String url ="jdbc:mariadb://srv1193.hstgr.io:3306/u464362699_a3projeto";
    private final String usuario ="u464362699_A_Tres_ProjetO";
    private final String password ="L9%x9texS$r+&P@";
    
    public Connection conectar(){
        try {
            con = DriverManager.getConnection(url, usuario, password);
            return con;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}

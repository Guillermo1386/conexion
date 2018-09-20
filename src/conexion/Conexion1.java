package conexion; 
import java.sql.*;

public class Conexion1{
    public Connection conex;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost/conexionMysqlCorba","root","");
            System.out.println("Conexion establecida");
            
        }catch (Exception e){
            System.out.println(e.getMessage());
                
        }
        return conex;
    }
}
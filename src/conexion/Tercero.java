package conexion;

import java.sql.*;
import Terceros.*;

public class Tercero extends TerceroPOA {
    Conexion1 objConec= new Conexion1();

    @Override
    public boolean insertarTercero(String nombres, String apellidos, String telefonos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarTercero(int id, String nombres, String apellidos, String telefonos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarTercero(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String consultarTercero(int id) {
         
        String resultado="";
        try {
            String sqlConsultar = "Select * from terceros where in="+ id;
            objConec.conectar();
            Statement st=objConec.conex.createStatement();
            ResultSet rs=st.executeQuery(sqlConsultar);
            while(rs.next()){
                resultado += rs.getString(2)+"-"
                        +rs.getString(3)+ "-"
                        +rs.getNString(4);
            }
            rs.close();
            objConec.conex.close();
            
        }catch(Exception e){
            System.out.println("Error"+e.getMessage());
        } 
            
    
    return resultado;
    }

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

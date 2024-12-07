package conexion;

import java.sql.*;

/**
 *
 * @author katel
 */

public class Conexion {
   public static Connection conectar(){
       try{
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:33065/bd_parqueadero", "root", "");
           return cn;
       } catch(SQLException e){
           System.out.println("Error en la conexion local" + e);
       }
       return null;
   }
}

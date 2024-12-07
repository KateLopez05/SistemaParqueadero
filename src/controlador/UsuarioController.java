package controlador;

import conexion.Conexion;
import modelo.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author katel
 */
public class UsuarioController {
    //Metodo para iniciar sesion 

    public boolean login(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "select usuario, contraseña from tb_usuarios where usuario = '" + objeto.getUsuario()
                + "' and contraseña = '" + objeto.getContraseña() + "'";

        Statement at;

        try {
            at = cn.createStatement();
            ResultSet rs = at.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al iniciar sesión");
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }
        return respuesta;
    }
}


package com.mycompany.tiendaalimentacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rayko
 */
public class ConexionBD {
    // Variable para manejar la conexión con la base de datos
    Connection con = null;
    
    // Datos de configuración para la conexión
    String usuario= "root";    // Usuario de la base de datos
    String password= "root";   // Contraseña de la base de datos
    String bd= "tienda";       // Nombre de la base de datos
    String ip= "localhost";    // Dirección IP del servidor de base de datos
    String puerto= "3306";     // Puerto de conexión (por defecto en MySQL)
    
    // Cadena de conexión JDBC
    String cadena= "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    // Método para conectar a la base de datos
    public Connection conectar() throws ClassNotFoundException{
        
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión utilizando la cadena, usuario y contraseña
            con = DriverManager.getConnection(cadena,usuario,password);
//            JOptionPane.showMessageDialog(null, "Conectado");
            
        } catch (SQLException e) {
            // Mostrar un mensaje de error si falla la conexión
            JOptionPane.showMessageDialog(null, "Error de conexión:,ERROR: "+e.toString());
        }
        return con; // Devolver la conexión (puede ser null si falló)
    }
    
    // Método para cerrar la conexión
    public void cerrarConexion(){       
        try {
            // Verificar que la conexión esté activa antes de cerrarla
            if(con!=null && !con.isClosed()){
                con.close(); // Cerrar conexión
               JOptionPane.showMessageDialog(null, "Conexion cerrada");             
            }
        } catch (SQLException e) {
            // Mostrar mensaje si hay error al cerrar
            JOptionPane.showMessageDialog(null, "Error al cerrar conexion:,ERROR: "+e.toString());
        }
    } 
}

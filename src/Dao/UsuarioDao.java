package Dao;

import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDao {
    
     Conexion objConexion = new Conexion();
    
    public ResultSet consultar() throws ClassNotFoundException, SQLException
    {
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "SELECT * FROM usuario";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public int insertar(String strUsuario, String strPassword, int intEstado) throws SQLException, ClassNotFoundException{
        int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "INSERT INTO usuario (usuario, password, estado)  VALUES ( " 
                +"'" +strUsuario +"'"  + ","
                +"'" +strPassword +"'"  + ","
                + intEstado +")" ;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
    public int actualizar(int intId, String strUsuario, String strPassword, int intEstado) throws SQLException, ClassNotFoundException{
        int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "UPDATE usuario SET usuario=" 
                +"'" +strUsuario +"'"  + ", password="
                +"'" +strPassword +"'"  + ", estado="
                +"'" + intEstado +"' WHERE id="+intId;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
    public int eliminar(int intId) throws ClassNotFoundException, SQLException{
         int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "DELETE FROM usuario WHERE id="+intId;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
}

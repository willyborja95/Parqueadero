package Dao;

import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioRolDao {
    
    Conexion objConexion = new Conexion();
    
    public ResultSet consultarPorIdUsuario(int intIdUsuario) throws ClassNotFoundException, SQLException
    {
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "SELECT * FROM rol_usuario WHERE idUsuario="+intIdUsuario;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public int insertar(int intIdUsuario, int intIdRol) throws SQLException, ClassNotFoundException{
        int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "INSERT INTO rol_usuario (idUsuario, idRol)  VALUES ( " 
                + intIdUsuario + ","
                + intIdRol+")" ;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
    public int eliminar(int intIdUsuario, int intIdRol) throws ClassNotFoundException, SQLException{
         int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "DELETE FROM rol_usuario WHERE idRol="+intIdRol+" AND idUsuario="+intIdUsuario;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
}

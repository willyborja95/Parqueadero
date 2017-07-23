package Dao;

import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RolDao {

    Conexion objConexion = new Conexion();
    
    public ResultSet consultar() throws ClassNotFoundException, SQLException
    {
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "SELECT * FROM rol";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public int insertar(String strNombre, String strDescripcion) throws SQLException, ClassNotFoundException{
        int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "INSERT INTO rol (nombre, descripcion)  VALUES ( " 
                +"'" +strNombre +"'"  + ","
                +"'" + strDescripcion+"')" ;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
    public int actualizar(int intId, String strNombre, String strDescripcion) throws SQLException, ClassNotFoundException{
        int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "UPDATE rol SET nombre=" 
                +"'" +strNombre +"'"  + ", descripcion="
                +"'" + strDescripcion +"' WHERE id="+intId;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
    public int eliminar(int intId) throws ClassNotFoundException, SQLException{
         int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "DELETE FROM rol WHERE id="+intId;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
}

package Dao;

import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionalidadDao {

    Conexion objConexion = new Conexion();
    
    public ResultSet consultar() throws ClassNotFoundException, SQLException
    {
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "SELECT * FROM funcionalidad";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public ResultSet consultarPorId(int intIdFuncionalidad) throws ClassNotFoundException, SQLException
    {
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "SELECT * FROM funcionalidad WHERE id="+intIdFuncionalidad;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public int insertar(String strNombre, String strDescripcion) throws SQLException, ClassNotFoundException{
        int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "INSERT INTO funcionalidad (nombre, descripcion)  VALUES ( " 
                +"'" +strNombre +"'"  + ","
                +"'" + strDescripcion+"')" ;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
    public int actualizar(int intId, String strNombre, String strDescripcion) throws SQLException, ClassNotFoundException{
        int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "UPDATE funcionalidad SET nombre=" 
                +"'" +strNombre +"'"  + ", descripcion="
                +"'" + strDescripcion +"' WHERE id="+intId;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
    public int eliminar(int intId) throws ClassNotFoundException, SQLException{
         int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("seguridad").createStatement();
        String Sentencia = "DELETE FROM funcionalidad WHERE id="+intId;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
}

package Dao;

import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ItemDao {
    
    Conexion objConexion = new Conexion();
    
    public ResultSet consultarPorIdCatalogo(int intIdCatalogoBuscado) throws ClassNotFoundException, SQLException
    {
        Statement st = objConexion.AbrirConexion("administracion").createStatement();
        String Sentencia = "SELECT * FROM item WHERE idCatalogo="+intIdCatalogoBuscado;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public ResultSet consultar() throws ClassNotFoundException, SQLException
    {
        Statement st = objConexion.AbrirConexion("administracion").createStatement();
        String Sentencia = "SELECT * FROM item";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public int insertar(int intIdCatalogo, String strDescripcion) throws SQLException, ClassNotFoundException{
        int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("administracion").createStatement();
        String Sentencia = "INSERT INTO item (idCatalogo, descripcion)  VALUES ( " 
                + intIdCatalogo + ","
                +"'" + strDescripcion+"')" ;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
    public int actualizar(int intId, int intIdCatalogo, String strDescripcion) throws SQLException, ClassNotFoundException{
        int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("administracion").createStatement();
        String Sentencia = "UPDATE item SET idCatalogo=" 
                + intIdCatalogo + ", descripcion="
                +"'" + strDescripcion +"' WHERE id="+intId;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
    public int eliminar(int intId) throws ClassNotFoundException, SQLException{
         int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("administracion").createStatement();
        String Sentencia = "DELETE FROM item WHERE id="+intId;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
}

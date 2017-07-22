package Dao;

import Clases.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CatalogoDao {
    
    Conexion objConexion = new Conexion();
    
    public ResultSet consultar() throws ClassNotFoundException, SQLException
    {
        Statement st = objConexion.AbrirConexion("administracion").createStatement();
        String Sentencia = "SELECT * FROM catalogo";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public ResultSet consultarPorNombre(String strNombreBuscado) throws ClassNotFoundException, SQLException
    {
        Statement st = objConexion.AbrirConexion("administracion").createStatement();
        String Sentencia = "SELECT * FROM catalogo WHERE nombre='"+strNombreBuscado+"'";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public int insertar(String strCodigo, String strNombre, Boolean blnEstado) throws SQLException, ClassNotFoundException{
        int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("administracion").createStatement();
        String Sentencia = "INSERT INTO catalogo (codigo, nombre, estado)  VALUES ( " 
                +"'" +strCodigo +"'"  + ","
                +"'" +strNombre +"'"  + ","
                +blnEstado+")" ;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
    public int actualizar(int intId, String strCodigo, String strNombre, boolean blnEstado) throws SQLException, ClassNotFoundException{
        int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("administracion").createStatement();
        String Sentencia = "UPDATE catalogo SET codigo="
                +"'" + strCodigo + "', nombre=" 
                +"'" + strNombre + "', estado="
                + blnEstado +" WHERE id="+intId;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }
    
    public int eliminar(int intId) throws ClassNotFoundException, SQLException{
         int intResultado=0;
        //Utilizando Statement
        Statement st = objConexion.AbrirConexion("administracion").createStatement();
        String Sentencia = "DELETE FROM catalogo WHERE id="+intId;
        intResultado = st.executeUpdate(Sentencia);
        return intResultado;
    }

}

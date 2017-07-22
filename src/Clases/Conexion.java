package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection conexion;//obj tipo Conecction
    
    public Connection getConnection (String strBaseDatos) throws ClassNotFoundException, SQLException{
        String driver="com.mysql.jdbc.Driver";
        String user="root";
        String password="1234";
        String url="jdbc:mysql://localhost:3306/"+strBaseDatos;
        Class.forName(driver) ;
        conexion =DriverManager.getConnection(url,user,password);
        return conexion;//retorna la cioneccion url+ruta bd
        
    }
    //Objeto tipo Connection para majenar la conecion
    public Connection AbrirConexion(String strBaseDatos) throws ClassNotFoundException, SQLException
    {
        conexion = getConnection(strBaseDatos);
        return conexion;
    }
    //cerrar la coneccion 
    public void CerrarConexion() throws SQLException
    {
       conexion.close();
    }
}
package Clases;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Validar {
    
    Conexion objConexion = new Conexion();
    
    public boolean verificarExistencia(String strBaseDatos, String strTabla, ArrayList<String> lstColumnas, ArrayList<String> lstValores) throws ClassNotFoundException, SQLException
        {
            boolean blnExiste = false;
            Statement st = objConexion.AbrirConexion(strBaseDatos).createStatement();
            String strCondicional ="";
            for (int i = 0; i < lstColumnas.size(); i++) {
                strCondicional = strCondicional+lstColumnas.get(i)+"='"+lstValores.get(i)+"' ";
                if(i+1<lstColumnas.size()){
                    strCondicional = strCondicional+"AND ";
                }
            }
            String Sentencia = "SELECT COUNT(*) registrosEncontrados FROM "+strTabla+" WHERE "+strCondicional;
            ResultSet rs = st.executeQuery(Sentencia);
            int intTotalEncontrados = 0;
            while(rs.next()){
                intTotalEncontrados = rs.getInt("registrosEncontrados");
            }
            if(intTotalEncontrados>0){
                blnExiste = true;
            }
            return blnExiste;
        }
    
    public boolean verificarExistenciaIntegers(String strBaseDatos, String strTabla, ArrayList<String> lstColumnas, ArrayList<Integer> lstValores) throws ClassNotFoundException, SQLException
        {
            boolean blnExiste = false;
            Statement st = objConexion.AbrirConexion(strBaseDatos).createStatement();
            String strCondicional ="";
            for (int i = 0; i < lstColumnas.size(); i++) {
                strCondicional = strCondicional+lstColumnas.get(i)+"='"+lstValores.get(i)+"' ";
                if(i+1<lstColumnas.size()){
                    strCondicional = strCondicional+"AND ";
                }
            }
            String Sentencia = "SELECT COUNT(*) registrosEncontrados FROM "+strTabla+" WHERE "+strCondicional;
            ResultSet rs = st.executeQuery(Sentencia);
            int intTotalEncontrados = 0;
            while(rs.next()){
                intTotalEncontrados = rs.getInt("registrosEncontrados");
            }
            if(intTotalEncontrados>0){
                blnExiste = true;
            }
            return blnExiste;
        }
}

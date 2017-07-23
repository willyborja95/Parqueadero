package BusinessLogic;

import Clases.Usuario;
import Dao.UsuarioDao;
import java.sql.SQLException;
import Clases.Validar;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BLUsuario {
    
    UsuarioDao objUsuarioDao = new UsuarioDao();
    
    public int insertar(Usuario objUsuario) throws SQLException, ClassNotFoundException{
        String strUsuario = objUsuario.getStrUsuario();
        String strPassword = objUsuario.getStrPassword();
        int intEstado = objUsuario.getIntEstado();
        Validar objValidar = new Validar();
        ArrayList <String> lstColumnas = new ArrayList<String>();
        ArrayList <String> lstValores = new ArrayList<String>();
        lstColumnas.add("usuario");
        lstValores.add(strUsuario);
        if(objValidar.verificarExistencia("seguridad","usuario", lstColumnas, lstValores)==false){
            return objUsuarioDao.insertar(strUsuario, strPassword, intEstado);
        }
        return -1;
    }
    
    public ArrayList<Usuario> consultar() throws ClassNotFoundException, SQLException{
        ResultSet objResultados = objUsuarioDao.consultar();
        ArrayList<Usuario> lstCatalogos = new ArrayList<Usuario>();
        while(objResultados.next()){
            int intId = objResultados.getInt("id");
            String strUsuario = objResultados.getString("usuario");
            String strPassword = objResultados.getString("password");
            int intEstado = objResultados.getInt("estado");
            lstCatalogos.add(new Usuario(intId, strUsuario, strPassword, intEstado));
        }
        return lstCatalogos;
    }
    
    public int actualizar(Usuario objUsuario) throws SQLException, ClassNotFoundException{
        int intId = objUsuario.getIntId();
        String strUsuario = objUsuario.getStrUsuario();
        String strPassword = objUsuario.getStrPassword();
        int intEstado = objUsuario.getIntEstado();
        return objUsuarioDao.actualizar(intId, strUsuario, strPassword, intEstado);
    }
    
    public int eliminar(int intId) throws SQLException, ClassNotFoundException{
        return objUsuarioDao.eliminar(intId);
    }
}

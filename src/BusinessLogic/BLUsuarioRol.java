package BusinessLogic;

import Clases.UsuarioRol;
import Clases.Validar;
import Dao.UsuarioRolDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BLUsuarioRol {

    UsuarioRolDao objUsuarioRolDao = new UsuarioRolDao();
    
    public int insertar(UsuarioRol objUsuarioRol) throws SQLException, ClassNotFoundException{
        int intIdUsuario = objUsuarioRol.getIntIdUsuario();
        int intIdRol = objUsuarioRol.getIntIdRol();
        Validar objValidar = new Validar();
        ArrayList <String> lstColumnas = new ArrayList<String>();
        ArrayList <Integer> lstValores = new ArrayList<Integer>();
        lstColumnas.add("idUsuario");
        lstColumnas.add("idRol");
        lstValores.add(intIdUsuario);
        lstValores.add(intIdRol);
        if(objValidar.verificarExistenciaIntegers("seguridad","rol_usuario", lstColumnas, lstValores)==false){
            return objUsuarioRolDao.insertar(intIdUsuario, intIdRol);
        }
        return -1;
    }
    
    public ArrayList<UsuarioRol> consultarPorIdUsuario(int intIdUsuarioBuscado) throws ClassNotFoundException, SQLException{
        ResultSet objResultados = objUsuarioRolDao.consultarPorIdUsuario(intIdUsuarioBuscado);
        ArrayList<UsuarioRol> lstUsuariosRoles = new ArrayList<UsuarioRol>();
        while(objResultados.next()){
            int intIdUsuario = objResultados.getInt("idUsuario");
            int intIdRol = objResultados.getInt("idRol");
            lstUsuariosRoles.add(new UsuarioRol(intIdUsuario, intIdRol));
        }
        return lstUsuariosRoles;
    }
    
    public int eliminar(int intIdUsuario, int intIdRol) throws SQLException, ClassNotFoundException{
        return objUsuarioRolDao.eliminar(intIdUsuario, intIdRol);
    }
}

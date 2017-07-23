package BusinessLogic;

import Clases.Rol;
import Clases.Validar;
import Dao.RolDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BLRol {

    RolDao objRolDao = new RolDao();
    
    public int insertar(Rol objRol) throws SQLException, ClassNotFoundException{
        String strNombre = objRol.getStrNombre();
        String strDescripcion = objRol.getStrDescripcion();
        Validar objValidar = new Validar();
        ArrayList <String> lstColumnas = new ArrayList<String>();
        ArrayList <String> lstValores = new ArrayList<String>();
        String strTabla = "rol";
        lstColumnas.add("nombre");
        lstValores.add(strNombre);
        if(objValidar.verificarExistencia("seguridad"
                , strTabla, lstColumnas, lstValores)==false){
            return objRolDao.insertar(strNombre, strDescripcion);
        }
        return -1;
    }
    
    public ArrayList<Rol> consultar() throws ClassNotFoundException, SQLException{
        ResultSet objResultados = objRolDao.consultar();
        ArrayList<Rol> lstRoles = new ArrayList<Rol>();
        while(objResultados.next()){
            int intId = objResultados.getInt("id");
            String strNombre = objResultados.getString("nombre");
            String strDescripcion = objResultados.getString("descripcion");
            lstRoles.add(new Rol(intId, strNombre, strDescripcion));
        }
        return lstRoles;
    }
    
    public int actualizar(Rol objRol) throws SQLException, ClassNotFoundException{
        int intId = objRol.getIntId();
        String strNombre = objRol.getStrNombre();
        String strDescripcion = objRol.getStrDescripcion();
        return objRolDao.actualizar(intId, strNombre, strDescripcion);
    }
    
    public int eliminar(int intId) throws SQLException, ClassNotFoundException{
        return objRolDao.eliminar(intId);
    }
        
}

package BusinessLogic;

import Clases.Funcionalidad;
import Clases.Validar;
import Dao.FuncionalidadDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BLFuncionalidad {
    
    FuncionalidadDao objFuncionalidadDao = new FuncionalidadDao();
    
    public int insertar(Funcionalidad objFuncionalidadVo) throws SQLException, ClassNotFoundException{
        String strNombre = objFuncionalidadVo.getStrNombre();
        String strDescripcion = objFuncionalidadVo.getStrDescripcion();
        Validar objValidar = new Validar();
        ArrayList <String> lstColumnas = new ArrayList<String>();
        ArrayList <String> lstValores = new ArrayList<String>();
        lstColumnas.add("nombre");
        lstValores.add(strNombre);
        if(objValidar.verificarExistencia("seguridad", "funcionalidad", lstColumnas, lstValores)==false){
            return objFuncionalidadDao.insertar(strNombre, strDescripcion);
        }
        return -1;
        
    }
    
    public ArrayList<Funcionalidad> consultar() throws ClassNotFoundException, SQLException{
        ResultSet objResultados = objFuncionalidadDao.consultar();
        ArrayList<Funcionalidad> lstFuncionalidades = new ArrayList<Funcionalidad>();
        while(objResultados.next()){
            int intId = objResultados.getInt("id");
            String strNombre = objResultados.getString("nombre");
            String strDescripcion = objResultados.getString("descripcion");
            lstFuncionalidades.add(new Funcionalidad(intId, strNombre, strDescripcion));
        }
        return lstFuncionalidades;
    }
    
    public ArrayList<String> consultarPorId(ArrayList<Integer> lstIdFuncionalidades) throws ClassNotFoundException, SQLException{
        ArrayList <String> lstNombresFuncionalidades = new ArrayList<String>();
        for(int idFuncionalidad:lstIdFuncionalidades){
            ResultSet objResultados = objFuncionalidadDao.consultarPorId(idFuncionalidad);
            while(objResultados.next()){
                lstNombresFuncionalidades.add(objResultados.getString("nombre"));
            }
        }
        return lstNombresFuncionalidades;
    }
    
    public int actualizar(Funcionalidad objFuncionalidadVo) throws SQLException, ClassNotFoundException{
        int intId = objFuncionalidadVo.getIntId();
        String strNombre = objFuncionalidadVo.getStrNombre();
        String strDescripcion = objFuncionalidadVo.getStrDescripcion();
        return objFuncionalidadDao.actualizar(intId, strNombre, strDescripcion);
    }
    
    public int eliminar(int intId) throws SQLException, ClassNotFoundException{
        return objFuncionalidadDao.eliminar(intId);
    }
}

package BusinessLogic;

import Clases.Item;
import Clases.Validar;
import Dao.ItemDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BLItem {

    ItemDao objItemDao = new ItemDao();
    Validar objValidar = new Validar();
    
    public int insertar(Item objItem) throws SQLException, ClassNotFoundException{
        int intIdCatalogo = objItem.getIntIdCatalogo();
        String strDescripcion = objItem.getStrDescripcion();
        ArrayList <String> lstColumnas = new ArrayList<String>();
        ArrayList <String> lstValores = new ArrayList<String>();
        lstColumnas.add("descripcion");
        lstValores.add(strDescripcion);
        if(objValidar.verificarExistencia("administracion", "item", lstColumnas, lstValores)==false){
            return objItemDao.insertar(intIdCatalogo, strDescripcion);
        }
        return -1;
    }
    
    public ArrayList<Item> consultarPorIdCatalogo(int intIdCatalogoBuscado) throws ClassNotFoundException, SQLException{
        ResultSet objResultados = objItemDao.consultarPorIdCatalogo(intIdCatalogoBuscado);
        ArrayList<Item> lstItems = new ArrayList<Item>();
        while(objResultados.next()){
            int intId = objResultados.getInt("id");
            int intIdCatalogo = objResultados.getInt("idCatalogo");
            String strDescripcion = objResultados.getString("descripcion");
            lstItems.add(new Item(intId, intIdCatalogo, strDescripcion));
        }
        return lstItems;
    }
    
    public ArrayList<Item> consultar() throws ClassNotFoundException, SQLException{
        ResultSet objResultados = objItemDao.consultar();
        ArrayList<Item> lstItems = new ArrayList<Item>();
        while(objResultados.next()){
            int intId = objResultados.getInt("id");
            int intIdCatalogo = objResultados.getInt("idCatalogo");
            String strDescripcion = objResultados.getString("descripcion");
            lstItems.add(new Item(intId, intIdCatalogo, strDescripcion));
        }
        return lstItems;
    }
    
    public int actualizar(Item objItem) throws SQLException, ClassNotFoundException{
        int intId = objItem.getIntId();
        int intIdCatalogo = objItem.getIntIdCatalogo();
        String strDescripcion = objItem.getStrDescripcion();
        ArrayList <String> lstColumnas = new ArrayList<String>();
        ArrayList <String> lstValores = new ArrayList<String>();
        lstColumnas.add("descripcion");
        lstValores.add(strDescripcion);
        if(objValidar.verificarExistencia("administracion", "item", lstColumnas, lstValores)==false){
            return objItemDao.actualizar(intId, intIdCatalogo, strDescripcion);
        }
        return -1;
    }
    
    public int eliminar(int intId) throws SQLException, ClassNotFoundException{
        return objItemDao.eliminar(intId);
    }
    
}

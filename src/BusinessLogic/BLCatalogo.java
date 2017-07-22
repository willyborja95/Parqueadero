package BusinessLogic;

import Clases.Catalogo;
import Clases.Validar;
import Dao.CatalogoDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BLCatalogo {
    
    CatalogoDao objCatalogoDao = new CatalogoDao();
    
    public int insertar(Catalogo objCatalogo) throws SQLException, ClassNotFoundException{
        String strCodigo = objCatalogo.getStrCodigo();
        String strNombre = objCatalogo.getStrNombre();
        boolean blnEstado = objCatalogo.isBlnEstado();
        Validar objValidar = new Validar();
        ArrayList <String> lstColumnas = new ArrayList<String>();
        ArrayList <String> lstValores = new ArrayList<String>();
        lstColumnas.add("nombre");
        lstValores.add(strNombre);
        if(objValidar.verificarExistencia("administracion","catalogo", lstColumnas, lstValores)==false){
            return objCatalogoDao.insertar(strCodigo, strNombre, blnEstado);
        }
        return -1;
    }
    
    public ArrayList<Catalogo> consultar() throws ClassNotFoundException, SQLException{
        ResultSet objResultados = objCatalogoDao.consultar();
        ArrayList<Catalogo> lstCatalogos = new ArrayList<Catalogo>();
        while(objResultados.next()){
            int intId = objResultados.getInt("id");
            String strCodigo = objResultados.getString("codigo");
            String strNombre = objResultados.getString("nombre");
            Boolean blnEstado = objResultados.getBoolean("estado");
            lstCatalogos.add(new Catalogo(intId, strCodigo, strNombre, blnEstado));
        }
        return lstCatalogos;
    }
    
    public ArrayList<Catalogo> consultarPorNombre(String strNombreBuscado) throws ClassNotFoundException, SQLException{
        ResultSet objResultados = objCatalogoDao.consultarPorNombre(strNombreBuscado);
        ArrayList<Catalogo> lstCatalogos = new ArrayList<Catalogo>();
        while(objResultados.next()){
            int intId = objResultados.getInt("id");
            String strCodigo = objResultados.getString("codigo");
            String strNombre = objResultados.getString("nombre");
            Boolean blnEstado = objResultados.getBoolean("estado");
            lstCatalogos.add(new Catalogo(intId, strCodigo, strNombre, blnEstado));
        }
        return lstCatalogos;
    }
    
    public int actualizar(Catalogo objCatalogo) throws SQLException, ClassNotFoundException{
        int intId = objCatalogo.getIntId();
        String strCodigo = objCatalogo.getStrCodigo();
        String strNombre = objCatalogo.getStrNombre();
        boolean blnEstado = objCatalogo.isBlnEstado();
        return objCatalogoDao.actualizar(intId, strCodigo, strNombre, blnEstado);
    }
    
    public int eliminar(int intId) throws SQLException, ClassNotFoundException{
        return objCatalogoDao.eliminar(intId);
    }
}

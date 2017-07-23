package Clases;

public class Funcionalidad {

    int intId;
    String strNombre;
    String strDescripcion;

    public Funcionalidad(int intId, String strNombre, String strDescripcion) {
        this.intId = intId;
        this.strNombre = strNombre;
        this.strDescripcion = strDescripcion;
    }

    public Funcionalidad(String strNombre, String strDescripcion) {
        this.strNombre = strNombre;
        this.strDescripcion = strDescripcion;
    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrDescripcion() {
        return strDescripcion;
    }
    
}

package Clases;

public class Rol {
    
    int intId;
    String strNombre;
    String strDescripcion;

    public Rol(int intId, String strNombre, String strDescripcion) {
        this.intId = intId;
        this.strNombre = strNombre;
        this.strDescripcion = strDescripcion;
    }

    public Rol(String strNombre, String strDescripcion) {
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

    public void setStrDescripcion(String strDescripcion) {
        this.strDescripcion = strDescripcion;
    }
    
}

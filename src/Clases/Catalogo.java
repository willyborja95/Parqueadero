package Clases;

public class Catalogo {
    
    private int intId;
    private String strCodigo;
    private String strNombre;
    private boolean blnEstado;

    public Catalogo(int intId, String strCodigo, String strNombres, boolean blnEstado) {
        this.intId = intId;
        this.strCodigo = strCodigo;
        this.strNombre = strNombres;
        this.blnEstado = blnEstado;
    }

    public Catalogo(String strCodigo, String strNombres, boolean blnEstado) {
        this.strCodigo = strCodigo;
        this.strNombre = strNombres;
        this.blnEstado = blnEstado;
    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

    public String getStrCodigo() {
        return strCodigo;
    }

    public void setStrCodigo(String strCodigo) {
        this.strCodigo = strCodigo;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombres) {
        this.strNombre = strNombres;
    }

    public boolean isBlnEstado() {
        return blnEstado;
    }

    public void setBlnEstado(boolean blnEstado) {
        this.blnEstado = blnEstado;
    }
    
}

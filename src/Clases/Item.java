package Clases;

public class Item {

    private int intId;
    private int intIdCatalogo;
    private String strDescripcion;

    public Item(int intId, int intIdCatalogo, String strDescripcion) {
        this.intId = intId;
        this.intIdCatalogo = intIdCatalogo;
        this.strDescripcion = strDescripcion;
    }

    public Item(int intIdCatalogo, String strDescripcion) {
        this.intIdCatalogo = intIdCatalogo;
        this.strDescripcion = strDescripcion;
    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

    public int getIntIdCatalogo() {
        return intIdCatalogo;
    }

    public void setIntIdCatalogo(int intIdCatalogo) {
        this.intIdCatalogo = intIdCatalogo;
    }

    public String getStrDescripcion() {
        return strDescripcion;
    }

    public void setStrDescripcion(String strDescripcion) {
        this.strDescripcion = strDescripcion;
    }

    @Override
    public String toString() {
        return strDescripcion;
    }

}

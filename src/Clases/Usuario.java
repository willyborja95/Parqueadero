package Clases;

public class Usuario {
    
    int intId;
    String strUsuario;
    String strPassword;
    int intEstado;

    public Usuario(int intId, String strUsuario, String strPassword, int intEstado) {
        this.intId = intId;
        this.strUsuario = strUsuario;
        this.strPassword = strPassword;
        this.intEstado = intEstado;
    }

    public Usuario(String strUsuario, String strPassword, int intEstado) {
        this.strUsuario = strUsuario;
        this.strPassword = strPassword;
        this.intEstado = intEstado;
    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

    public String getStrUsuario() {
        return strUsuario;
    }

    public void setStrUsuario(String strUsuario) {
        this.strUsuario = strUsuario;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public int getIntEstado() {
        return intEstado;
    }

    public void setIntEstado(int intEstado) {
        this.intEstado = intEstado;
    }
    
}

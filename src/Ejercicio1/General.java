package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class General {
    public String Id;
    public String nombre;
    private String usuarioBaseDatos;
    protected String contraseniaBaseDatos;
    private String nombreBaseDatos;
    private String urlBaseDatos;

    public General(String id,String name, String usuario, String nombreBa, String url) {
        this.Id = id;
        this.nombre = name;
        this.usuarioBaseDatos = usuario;
        this.nombreBaseDatos = nombreBa;
        this.urlBaseDatos = url;

    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuarioBaseDatos() {
        return usuarioBaseDatos;
    }

    public void setUsuarioBaseDatos(String usuarioBaseDatos) {
        this.usuarioBaseDatos = usuarioBaseDatos;
    }

    public String getNombreBaseDatos() {
        return nombreBaseDatos;
    }

    public void setNombreBaseDatos(String nombreBaseDatos) {
        this.nombreBaseDatos = nombreBaseDatos;
    }

    public String getUrlBaseDatos() {
        return urlBaseDatos;
    }

    public void setUrlBaseDatos(String urlBaseDatos) {
        this.urlBaseDatos = urlBaseDatos;
    }
}

package Ejercicío2;

public class Rule {
    public String nombre;
    public int posicionInicio;
    public int posicionFinal;
    public String descripcion;

    public Rule(String name, int posIn, int posFin, String descri){
        this.nombre = name;
        this.posicionFinal = posFin;
        this.posicionInicio = posIn;
        this.descripcion = descri;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicionInicio() {
        return posicionInicio;
    }

    public void setPosicionInicio(int posicionInicio) {
        this.posicionInicio = posicionInicio;
    }

    public int getPosicionFinal() {
        return posicionFinal;
    }

    public void setPosicionFinal(int posicionFinal) {
        this.posicionFinal = posicionFinal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}



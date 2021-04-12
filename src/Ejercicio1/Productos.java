package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Productos extends General{
    private int cantidad;
    private String fechaCreacion;
    private String fechaVencimiento;
    private  List<Productos> produc;

    public Productos(String id, String nombre, String usuario, String nombreBa, String url, int can, String fechaC, String fechaV){
        super(id,nombre,usuario,nombreBa,url);
        this.cantidad = can;
        this.fechaCreacion = fechaC;
        this.fechaVencimiento = fechaV;
        this.produc = new ArrayList<Productos>();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void CrearProductos(Productos pro){
        this.produc.add(pro);
        System.out.println("NUEVO PRODUCTO CREADO");
    }

    public void ImprimirProductos(){
        for(Productos productos : this.produc) {
            System.out.println(produc);
        }
        System.out.println("IMPRIMIR LISTA DE PRODUCTOS");
    }

    public void EliminarProductos(Productos pro){
        this.produc.remove(pro);
        System.out.println("SE ELIMINO ESTE PRODUCTO");
    }

    public void ObtenerProducto(int posicion) {
        System.out.println("INGRESE POSICION DEL PRODUCTOS");
        this.produc.get(posicion);
        System.out.println("Producto"+ this.produc.get(posicion));
    }

    public void ActualizarProductos(int posicion, Productos p){
        this.produc.set(posicion, p);
        System.out.println("INFORMACION ACTUALIZADA");
    }

}

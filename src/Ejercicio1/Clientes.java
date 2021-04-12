package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Clientes extends General{
    private String direccion;
    private  String fechaNacimiento;
    private List<Clientes> clientes;
    public Clientes(String id, String name,String usuario, String nombreBa, String url, String direccion, String fechaNacimiento) {
        super(id, name, usuario, nombreBa, url);
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.clientes = new ArrayList<Clientes>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void CrearCliente(Clientes cli){
        this.clientes.add(cli);
        System.out.println("NUEVO CLIENTE CREADO");
    }

    public void ImprimirCliente(){
        for(Clientes clien : this.clientes) {
            System.out.println(clientes);
        }
        System.out.println("IMPRIMIR LISTA DE CLIENTES");
    }

    public void EliminarCliente(Clientes cli){
        this.clientes.remove(cli);
        System.out.println("SE ELIMINO ESTE CLIENTE");
    }

    public void ObtenerCliente(int posicion) {
        System.out.println("INGRESE POSICION DEL CLIENTE");
        this.clientes.get(posicion);
        System.out.println("cliente"+ this.clientes.get(posicion));
    }

    public void ActualizarCliente(int posicion, Clientes cli){
        this.clientes.set(posicion, cli);
        System.out.println("INFORMACION ACTUALIZADA");
    }



}

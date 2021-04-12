package Application;

import Ejercicio1.Clientes;
import Ejercicio1.General;
import Ejercicio1.Productos;
import Ejercicio3.VerificacionTargeta;

public class App {
    public static void main(String[] args) {

        // ejercicio 1
        Clientes c1 = new Clientes("08208377","Ricardo Arriaga","RicAr974","ricardo","http://ussariox" ,"col. Cerro Grande","12/07/1997");
        Clientes c2 = new Clientes("07632827","Carolina Lazo","CarLa093","carolina","http://ussariox1" ,"col. 3 de Mayo","22/12/1997");
        Productos p1 = new Productos("5652","Cacao","Supercacao","Srcacao","http://Supercacao",259,"12/03/2021","30/12/2030");
        c1.CrearCliente(c1);
        c2.CrearCliente(c2);
        c1.ImprimirCliente();
        c1.ObtenerCliente(0);
        c1.ActualizarCliente(0,c2);
        c2.ObtenerCliente(0);
        c1.EliminarCliente(c1);
        System.out.println("\n");
        // ejercicio 3

        VerificacionTargeta v1 = new VerificacionTargeta("7367172789752565");
        VerificacionTargeta v2 = new VerificacionTargeta("627389******1524");
        VerificacionTargeta v3 = new VerificacionTargeta("36712387213897");

        v1.Verificacion(v1.targe);
        v2.Verificacion(v2.targe);
        v3.Verificacion(v3.targe);





    }
}

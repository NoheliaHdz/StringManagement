package Ejercicío2;

import java.util.ArrayList;
import java.util.List;

public class StringManagement {
    public List<Rule> rul;
    public String trama;
    public int array[]= new int[10];

    public StringManagement(String trama,int array[]){
        this.trama = trama;
        this.array = array;
        this.rul = new ArrayList<Rule>();
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void tamanoTrama(int array){
        if(array<10){
            System.out.println("EL TAMAÑO DE LA TRAMA ES INCORRECTO");
        }
    }

    public void reglas(Rule rul) {
        this.rul.add(rul);
    }

}

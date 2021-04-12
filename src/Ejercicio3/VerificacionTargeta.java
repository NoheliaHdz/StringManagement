package Ejercicio3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificacionTargeta {
    public String targe;

    public VerificacionTargeta(String tar) {
        this.targe = tar;
    }

    public String getTarge() {
        return targe;
    }

    public void setTarge(String targe) {
        this.targe = targe;
    }

    public void Verificacion(String targe) {
        if (targe.length() == 16) {
            System.out.println("VERFICANDO SI ESTA ENMASCARADA");
            Pattern pat = Pattern.compile("^([\\d]{6}+)*.{6}+[\\d]{4}+$");
            Matcher mat = pat.matcher(targe);

            if (mat.matches()) {
                System.out.println("ESTA TARGUETA ESTA ENMASCARADA");
            } else {
                System.out.println("ESTA TARGETA NO ESTA ENMASCARADA");
            }
        } else {
            if (targe.length() < 16) {
                System.out.println("EL NUMERO DE LA TARGETA ESTA INCOMPLETO");
            } else {
                System.out.println("EL NUMERO DE LA TARGETA ES INCORRECTO");
            }
        }
    }
}

package ServiceRaices;

import EntidadRaices.Raices;
import java.util.Scanner;

public class ServiceRaices {

    Scanner leer = new Scanner(System.in);

    public Raices crearRaices() {

        Raices r = new Raices();

        System.out.println("Ingrese los coeficientes (abc) de la ecuación cuadrática");
        r.setA(leer.nextInt());
        r.setB(leer.nextInt());
        r.setC(leer.nextInt());

        return r;

    }

    public boolean tieneRaices(Raices r) {
        //Metodo booleano (el retorno es true/false) no hace falta definirlo con un if    
        return r.getDiscriminante() > 0;

    }

    public boolean tieneRaiz(Raices r) {
        //Metodo booleano (el retorno es true/false) no hace falta definirlo con un if    
        return r.getDiscriminante() == 0;
    }

    public void obtenerRaices(Raices r) {
//Math.round(d*100.0)/100.0

        if (tieneRaices(r)) {
            System.out.println("Las raíces son ");
            System.out.println((-r.getB() + Math.sqrt(r.getDiscriminante())) / (2 * r.getA()));
            System.out.println(Math.round((-r.getB() - Math.sqrt(r.getDiscriminante())) / (2 * r.getA())));

//(-b±√((b^2)-(4*a*c)))/(2*a)
        }

    }

    public void obtenerRaiz(Raices r) {

        if (tieneRaiz(r)) {
            System.out.println("Esta ecuación tiene una sola raíz y su resultado es: ");
            System.out.println(-r.getB() / (2 * r.getA()));

        }
    }

    public void calcular(Raices r) {

        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else System.out.println("La ecuación de segundo grado no tiene raíces");
        
    }

}

package guia_poo_extra3;

import EntidadRaices.Raices;
import ServiceRaices.ServiceRaices;

public class Guia_POO_extra3 {
    
    public static void main(String[] args) {
        
        ServiceRaices sr = new ServiceRaices();
        Raices r = sr.crearRaices();
        sr.calcular(r);
        
        
    }
    
}

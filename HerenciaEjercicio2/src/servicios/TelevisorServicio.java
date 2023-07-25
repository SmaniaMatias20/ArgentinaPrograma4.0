package servicios;

import entidades.Electrodomestico;
import entidades.Televisor;

public class TelevisorServicio extends ElectrodomesticoServicio {
    
    public Televisor crearTelevisor() {
        boolean sintonizadorTDT = false;
        Electrodomestico electrodomestico = crearElectrodomestico();
        System.out.print("INGRESE LAS PULGADAS: ");
        Integer pulgadas = entrada.nextInt();
        System.out.println("¿TIENE SINTONIZADOR? SI/NO");
        String respuesta = entrada.next();
        
        if (respuesta.equalsIgnoreCase("SI")) {
            sintonizadorTDT = true;
        }
        
        Televisor televisor = new Televisor(pulgadas, sintonizadorTDT, electrodomestico.getPrecio(), electrodomestico.getColor(), electrodomestico.getConsumoEnergetico(), electrodomestico.getPeso());
        
        return televisor;
    }
    
    public void precioFinal(Televisor televisor) {
        Integer aumento = 0;
        ElectrodomesticoServicio servicio = new ElectrodomesticoServicio();
        
        televisor.setPrecio(servicio.precioFinal(televisor));
        
        if (televisor.getPulgadas() > 40) {
            aumento = televisor.getPrecio() * 30 / 100;
        }
        
        if (televisor.isSintonizadorTDT()) {
            aumento = aumento + 500;
        }
        
        televisor.setPrecio(televisor.getPrecio()+aumento);
    }
    
    public void mostrarTelevisor(Televisor televisor) {
        System.out.println(televisor);
    }
    
}

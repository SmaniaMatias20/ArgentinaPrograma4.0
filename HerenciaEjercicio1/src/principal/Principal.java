package principal;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

public class Principal {

    public static void main(String[] args) {
    
        //DECLARACION DEL OBJETO PERRO
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.Alimentarse();
        
        //DECLARACION DE OTRO OBJETO PERRO
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuaha");
        perro2.Alimentarse();
        
        //DECLARACION DEL OBJETO GATO
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.Alimentarse();
        
        //DECLARACION DEL OBJETO CABALLO
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
        
        
    }
    
}

package paquete;

public class Principal {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("SMANIA", 70000);
        Cuenta cuenta2 = new Cuenta("PALOPOLO",50000);
        cuenta1.retirarDinero();
        cuenta2.retirarDinero();
    }

}

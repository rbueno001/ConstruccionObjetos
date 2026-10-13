
public class Main {
    public static void main(String[] args) {
        // Construcción de clientes
        Cliente cliente1 = new Cliente("Raquel", "Bueno", "184000008611", "femenino", "Heredia");

        Cliente cliente2 = new Cliente("Henry", "Sandoval Ramírez", "4-0177-0193", "Heredia");

        Cliente cliente3 = new Cliente();
        cliente3.setNombre("Alexander");
        cliente3.setApellidos("Bueno");

        // Construcción de suscripciones
        Suscripcion suscripcion1 = new Suscripcion("Premium", 15000, (byte) 12);
        Suscripcion suscripcion2 = new Suscripcion("Básica", 5000, (byte) 1);
        Suscripcion suscripcion3 = new Suscripcion("Estándar", 10000, (byte) 6);

        // Suscripciones de los clientes
        cliente1.suscribirse(suscripcion1);
        cliente2.suscribirse(suscripcion2);
        cliente3.suscribirse(new Suscripcion("Premium", 15000, (byte) 12));
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Construcción del objeto
        Cliente cliente1 = new Cliente("Raquel ", "Bueno", "184000008611, ", "femenino","Heredia");
        //System.out.println("El/la cliente se llama " + cliente1.nombre + cliente1.apellidos + ", con la cédula número " + cliente1.cedula +
        //        "de sexo " + cliente1.sexo + ", vive en "  + cliente1.ubicacion + ".\n");
        //System.out.println(cliente1);

        Cliente cliente2 = new Cliente("Henry ", "Sandoval Ramírez", "4-0177-0193, ", "masculino","Heredia");
        System.out.println("El/la cliente se llama " + cliente2.nombre + cliente2.apellidos + ", con la cédula número " + cliente2.cedula +
               "de sexo " + cliente2.sexo + ", vive en "  + cliente2.ubicacion + ".\n");

        //System.out.println(cliente2);

        Cliente cliente3 = new Cliente("Alexander ", "Bueno", "123456789, ", "masculino","New Jersey");

        System.out.println("El/la cliente se llama " + cliente3.nombre + cliente3.apellidos + ", con la cédula número " + cliente3.cedula +
        "de sexo " + cliente3.sexo + ", vive en "  + cliente3.ubicacion + ".\n");
        //System.out.println(cliente3);
    }
}

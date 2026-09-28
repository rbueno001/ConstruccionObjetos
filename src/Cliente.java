public class Cliente {
    // Atributos
    String nombre;
    String apellidos;
    String cedula;
    String sexo; //(M/F)
    String ubicacion;

    // Métodos
    // Constructor
    Cliente(String nombre, String apellidos, String cedula, String sexo, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }
}

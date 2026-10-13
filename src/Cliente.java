
public class Cliente {
    // Atributos
    private String nombre;
    private String apellidos;
    private String cedula;
    private String sexo;
    private String ubicacion;

    // Métodos
    // Constructores:
    // Constructor completo
    public Cliente(String nombre, String apellidos, String cedula, String sexo, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }

    // Constructor sin sexo
    public Cliente(String nombre, String apellidos, String cedula, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.ubicacion = ubicacion;
    }

    // Constructor por defecto
    public Cliente() {
    }

    // Getters and Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Métodos
    public void suscribirse(Suscripcion suscripcion) {
        System.out.println(nombre + " " + apellidos + " adquirió una suscripción " + suscripcion.getTipo() + ".");
    }
}

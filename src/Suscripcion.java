
public class Suscripcion {
    // Atributos
    private String tipo;
    private double costo;
    private byte periodicidad;

    // Constructores
    public Suscripcion(String tipo, double costo, byte periodicidad) {
        this.tipo = tipo;
        this.costo = costo;
        this.periodicidad = periodicidad;
    }

    // Getters and Setters
    public String getTipo() { return tipo; }
}

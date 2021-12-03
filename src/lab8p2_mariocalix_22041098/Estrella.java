
package lab8p2_mariocalix_22041098;

public class Estrella {
    private int distancia;
    private String descripcion, nombre;

    public Estrella() {
    }

    public Estrella(int distancia, String descripcion, String nombre) {
        this.distancia = distancia;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estrella{" + "distancia=" + distancia + ", descripcion=" + descripcion + ", nombre=" + nombre + '}';
    }
    
}


package lab8p2_mariocalix_22041098;

import java.io.Serializable;

public class Jugador implements Serializable{
    private int velocidad;
    private String nombre;

    public Jugador() {
    }

    public Jugador(int velocidad, String nombre) {
        this.velocidad = velocidad;
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jugador{" + "velocidad=" + velocidad + ", nombre=" + nombre + '}';
    }
    
}

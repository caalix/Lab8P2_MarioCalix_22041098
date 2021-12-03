
package lab8p2_mariocalix_22041098;

import java.util.ArrayList;
import java.util.Date;

public class Partida {
    private String nombre;
    private Date fecha_creacion;
    private ArrayList<Estrella> estrellas = new ArrayList();
    private ArrayList<Jugador> jugadores = new ArrayList();

    public Partida() {
    }

    public Partida(String nombre, Date fecha_creacion) {
        this.nombre = nombre;
        this.fecha_creacion = fecha_creacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public ArrayList<Estrella> getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(ArrayList<Estrella> estrellas) {
        this.estrellas = estrellas;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Partida{" + "nombre=" + nombre + ", fecha_creacion=" + fecha_creacion + ", estrellas=" + estrellas + ", jugadores=" + jugadores + '}';
    }
    
}

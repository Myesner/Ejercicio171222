
package herencia201;


public class Deporte {
    private String nombre;
    private int score;
    private int jugadores;

    public Deporte() {
    }

    public Deporte(String nombre, int score, int jugadores) {
        this.nombre = nombre;
        this.score = score;
        this.jugadores = jugadores;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
    
    
}

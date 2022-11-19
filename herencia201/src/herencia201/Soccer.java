
package herencia201;


public class Soccer extends Deporte{
    private double time;
    private String equipo;

    public Soccer() {
    }

    public Soccer(double time, String equipo) {
        this.time = time;
        this.equipo = equipo;
    }

    public Soccer(double time, String equipo, String nombre, int score, int jugadores) {
        super(nombre, score, jugadores);
        this.time = time;
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
    
    
    
    
}


package herencia201;


public class Tenis extends Deporte{
    private int set;

    public Tenis() {
    }

    public Tenis(int set) {
        this.set = set;
    }

    public Tenis(int set, String nombre, int score, int jugadores) {
        super(nombre, score, jugadores);
        this.set = set;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }
    
    
}

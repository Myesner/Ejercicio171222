
package herencia201;

public class volleybol extends Deporte{
    private int set;

    public volleybol() {
    }

    public volleybol(int set) {
        this.set = set;
    }

    public volleybol(int set, String nombre, int score, int jugadores) {
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

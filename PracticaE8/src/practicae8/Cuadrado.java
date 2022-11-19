
package practicae8;

public class Cuadrado extends Poligono {

    @Override
    public double area() {
        return Math.pow(getLado(), 2);
    }

    @Override
    public void Dibujar() {
        System.out.println("Dibujando un cuadrado");
    }

    @Override
    public double perimetro() {
        return (getLado()*4);
    }
    
}

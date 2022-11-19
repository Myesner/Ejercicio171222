
package practicae8;

public class Rectangulo extends Poligono{

    @Override
    public double area() {
        return (getBase()*getAltura());
    }

    @Override
    public void Dibujar() {
        System.out.println("Dibujando el area del redtangulo");
    }

    @Override
    public double perimetro() {
        return (getBase()+getAltura())*2;
    }
    
}


package practicae8;

public class Triangulo extends Poligono{

    @Override
    public double area() {
        return (getBase()*getAltura())/2;
    }

    @Override
    public void Dibujar() {
        System.out.println("Dibujando el area del triangulo");
    }

    @Override
    public double perimetro() {
       return (getLado()*3);
    }
    
}


package javaapplication45;

public class Rectangulo extends Figura {

    @Override
    public double area() {
        return (getBase()*getAltura());
    }

    @Override
    public double perimetro() {
        return (getBase()+getAltura())*2;
    }
    
}

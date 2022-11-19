
package javaapplication45;


public class Circulo extends Figura{
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, double base, double altura) {
        super(base, altura);
        this.radio = radio;
    }
    
     public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    

    @Override
    public double area() {
        return (Math.PI*Math.pow(getRadio(), 2));
    }

    @Override
    public double perimetro() {
        return (2*Math.PI*getRadio());
    }

   
    
}

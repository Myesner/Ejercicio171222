
package practicae8;


public abstract class Poligono {
    private double lado;
    private double base;
    private double altura;

    public Poligono() {
    }

    public Poligono(double lado, double base, double altura) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public abstract double area();
   
    public abstract void Dibujar();
    
    public abstract double perimetro();
}

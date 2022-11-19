
package circunferen;


public class Circunferencia {
    
    private double radio;

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double longitud(){
        double longt=2*3.1416*getRadio();
        return longt;
    }
    
    public double area(){
        double are=3.1416*(getRadio()*getRadio());
        return are;
    }
    
    public void imprimirDatos(){
        System.out.println("Los productos Usando constructor vacio:\n");
        System.out.println("El Radio es:" +" " +getRadio());
        System.out.println("La longitud es:" +" "+longitud());
        System.out.println("el area es :"+ " " +area());
        System.out.println("\n");
    
    }
 
}

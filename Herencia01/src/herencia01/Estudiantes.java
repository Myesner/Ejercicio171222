
package herencia01;


public class Estudiantes extends Persona{
    
    private String carnet;
    private double Nota1;
    private double Nota2;
    private double Nota3;

    public Estudiantes() {
    }

    public Estudiantes(String carnet, double Nota1, double Nota2, double Nota3) {
        this.carnet = carnet;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
    }

    public Estudiantes(String carnet, double Nota1, double Nota2, double Nota3, String cedula, String nombre, String apellido, int edad, double estatura) {
        super(cedula, nombre, apellido, edad, estatura);
        this.carnet = carnet;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }
    
    public double Promedio(){
      double Promedio;
      Promedio=(getNota1()+getNota2()+getNota3())/3;
      return Promedio;
    }
    
    public void DatosEstudiante(){
        System.out.println("*** Datos del Estudiante ***");
        System.out.println("Cedula:" +getCedula());
        System.out.println("Carnet:" +getCarnet());
        System.out.println("Nombre:" +getNombre());
        System.out.println("Apellido:" +getApellido());
        System.out.println("Edad:" +getEdad());
        System.out.println("Estatura" +getEstatura());
        double t=(getNota1()+getNota2()+getNota3());
        System.out.println("Notas:" +getNota1()+"+"+getNota2()+"+"+getNota3()+"="+t+"Promedio:" +Promedio());
        
    }
}

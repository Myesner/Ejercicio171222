
package herencia01;

public class Docente extends Persona{
    
    private String inss;
    private double salario;
    private String Especialidad;

    public Docente() {
    }

    public Docente(String inss, double salario, String Especialidad) {
        this.inss = inss;
        this.salario = salario;
        this.Especialidad = Especialidad;
    }

    public Docente(String inss, double salario, String Especialidad, String cedula, String nombre, String apellido, int edad, double estatura) {
        super(cedula, nombre, apellido, edad, estatura);
        this.inss = inss;
        this.salario = salario;
        this.Especialidad = Especialidad;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getInss() {
        return inss;
    }

    public void setInss(String inss) {
        this.inss = inss;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void DatosDocente(){
        System.out.println("*** Datos del Docente ***");
        System.out.println("Cedula:" +getCedula());
        System.out.println("INSS:" +getInss());
        System.out.println("Nombre:" +getNombre());
        System.out.println("Apellido:" +getApellido());
        System.out.println("Edad:" +getEdad());
        System.out.println("Estatura:" +getEstatura());
        System.out.println("Especialidad:" +getEspecialidad());
        System.out.println("Salario:" +getSalario());
        
    
    }
}

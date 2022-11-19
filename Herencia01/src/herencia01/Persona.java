
package herencia01;


public class Persona {
    
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private double estatura;

    public Persona() {
    }
    public Persona(String cedula, String nombre, String apellido, int edad, double estatura) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void imprimirDatos(){
        System.out.println("*** Datos Personales ***");
        System.out.println("Cedula:" +getCedula());
        System.out.println("Nombre:" +getNombre());
        System.out.println("Apellido:" +getApellido());
        System.out.println("Edad:" +getEdad());
        System.out.println("Estatura:" +getEstatura());
    }
    
}

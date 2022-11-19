
package herencia01;

import java.util.Scanner;



public class Herencia01 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //usando el constructor parametrizado
        Docente d=new Docente("182405", 5900, "Lic. Fisico Matematico", "121-150680-1000T", "Juan", "Perez", 42, 1.75);
        d.DatosDocente();
        //usando el constructor vacio
        Docente d1=new Docente();
        System.out.println("Introduzca su Cedula");
        d1.setCedula(sc.next());
        System.out.println("Deme su nombre");
        d1.setNombre(sc.next());
        System.out.println("Deme su apellido");
        d1.setApellido(sc.next());
        System.out.println("Cual es su especialidad");
        d1.setEspecialidad(sc.next());
        System.out.println("Digite su numero de inss");
        d1.setInss(sc.next());
        System.out.println("Cuanto ganas?");
        d1.setSalario(sc.nextDouble());
        System.out.println("Cuantos años tienes");
        d1.setEdad(sc.nextInt());
        System.out.println("Cuanto es su estatura");
        d1.setEstatura(sc.nextDouble());
        
        System.out.println("***Datos del Estudiante***");
        System.out.println("Introduzca su numero de carnet");
        String carnet=sc.next();
        System.out.println("Nota 1");
        int n1=sc.nextInt();
        System.out.println("Nota 2");
        int n2=sc.nextInt();
        System.out.println("Nota 3");
        int n3=sc.nextInt();
        System.out.println("INtroduzca su numero de cedula");
        String cedula=sc.next();
        System.out.println("Digite su nombre");
        String nombre=sc.next();
        System.out.println("Digite su apellido");
        String apellido=sc.next();
        System.out.println("Digite su edad");
        int edad=sc.nextInt();
        System.out.println("Digite su estatura");
        double est=sc.nextDouble();
        
       Estudiantes e=new Estudiantes(carnet, n1, n2, n3, cedula, nombre, apellido, edad, est);
       e.DatosEstudiante();
        
        
    }
    
}

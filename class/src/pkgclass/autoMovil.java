package pkgclass;
public class autoMovil {//Nombre de la clase
    //Caracteristica
     private String Marca;
     private String Modelo;
     private String Color;
     private  int velocidad;
     
     //Metodo Constructor Vacio y Parametrizado

    public autoMovil() {
    }

    public autoMovil(String Marca, String Modelo, String Color, int velocidad) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.velocidad = velocidad;
    }
    
    //Metodos de getter and setter

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
     
    //Metodos personalizados
    
    public void imprimirDatos(){
        System.out.println("Los Datos del Vehiculo Usando constructor vacio:\n");
        System.out.println("La marca de la comioneta es:" +" " +getMarca());
        System.out.println("El modelo de la camioneta es:" +" "+getModelo());
        System.out.println("El color de la camoneta es:" +" "+getColor());
        System.out.println("La Velocidad es:" +" "+getVelocidad());
        System.out.println("\n");
    
    }
    
}

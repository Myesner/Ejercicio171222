
package examen08;


public abstract class DispositivoMovil {
    private String marca;
    private String tipo;
    private String modelo;
    private String color;

    public DispositivoMovil() {
    }

    public DispositivoMovil(String marca, String tipo, String modelo, String color) {
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract void llamar();
        
    public abstract void colgar();
     
    public abstract void buscar();
      
    public abstract void ubicar();
    
    public abstract void foto();
    
    public abstract void bucargps();
    
    public abstract void interartuar();
    
}


package examen08;

public class Notebook extends DispositivoMovil{
    private String marca;
    private String tipo;
    private String modelo;

    public Notebook() {
    }

    public Notebook(String marca, String tipo, String modelo) {
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
    }
    
    @Override
     public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    

    @Override
    public void llamar() {
        System.out.println("llamando a Jeffry");
    }

    @Override
    public void colgar() {
         System.out.println("Colgando a Jeffry");
    }

    @Override
    public void buscar() {
        System.out.println("Buscando Facebook.com");
    }

   
    @Override
    public void bucargps() {
        System.out.println("Buscando a Jefrry sevilla en google maps");
    }

    @Override
    public void interartuar() {
        System.out.println("enviaste un mensaje por whatsapp a Jefrry ");
    }

    @Override
    public void ubicar() {
        System.out.println("Mi telefono esat ubicado en Acoyapa Chontales");
    }

    @Override
    public void foto() {
        System.out.println("Foto guardada en galeria");
    }

   

   
    
    
}

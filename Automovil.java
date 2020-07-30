public class Automovil
{
    // instance variables - replace the example below with your own
    private String marca;
    private String modelo;

    /**
     * Constructor for objects of class Automovil
     */
    public Automovil()
    {
        // initialise instance variables
        marca = "cualqueir";
        modelo = "kdjslkdsa";
    }
    
    /**
     * Constructor for objects of class Automovil
     */
    public Automovil(String marca, String modelo)
    {
        // initialise instance variables
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void imprimirInformacion(){
        System.out.println("Mi automovil es un: " + this.marca + " y su modelo es: " + this.modelo);
    }
    
}

public class Automovil
{
    private String marca; //texto
    private String modelo; //texto
    private int cilindrada; //numeros
    private boolean hibrido; //true, false
    
    /**
     * Constructor for objects of class Automovil
     */
    public Automovil()
    {
        // initialise instance variables por defecto
        marca = "cualqueir";
        modelo = "kdjslkdsa";
        cilindrada = 0;
        hibrido = false;
    }
    
    /**
     * Constructor for objects of class Automovil
     */
    public Automovil(String marca, String modelo, int cc, boolean hibrido)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cc;        
        this.hibrido = hibrido;
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
   
    public int getCilindrada() {
        return cilindrada;
    }
    
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    public boolean isHibrido() {
        return hibrido;
    }
    
    public void setHibrido(boolean hibrido) {
        this.hibrido = hibrido;
    }
    
    public void imprimirInformacion(){
        System.out.println("Mi automovil es un: " + this.marca + " y su modelo es: " + this.modelo);
    }
    
}

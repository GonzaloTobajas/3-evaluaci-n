public class Barco{
    private String nombreBarco;
    private int tamano;
    private int numPalos;

    public Barco(String nombreBarco, int tamano, int numPalos){
        super();
        this.nombreBarco=nombreBarco;
        this.tamano=tamano;
        this.numPalos=numPalos;
    }

    public Barco(String nombreBarco){
        super();
        this.nombreBarco=nombreBarco;
    }
    public String getNombreBarco(){
        return nombreBarco;
    }
    public void setNombreBarco(String nombreBarco){
        this.nombreBarco=nombreBarco;
    }
    public int getTamano(){
        return tamano;
    }
    public void setTamano(){
        this.tamano=tamano;
    }
    public int getNumPalos(){
        return numPalos;
    }
    public void setNumPalos(){
        this.numPalos=numPalos;
    }
}
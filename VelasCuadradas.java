public class VelasCuadradas extends Barco{
    private boolean tieneVelasCuadradas;
    public VelasCuadradas(String nombreBarco, int tamano, int numPalos,boolean tieneVelasCuadradas){
        super(nombreBarco, tamano, numPalos);
        this.tieneVelasCuadradas=tieneVelasCuadradas;
    }
    public boolean isTieneVelasCuadradas(){
        return tieneVelasCuadradas;
    }
    public void setTieneVelasCuadradas(boolean tieneVelasCuadradas){
        this.tieneVelasCuadradas=tieneVelasCuadradas;
    }
}
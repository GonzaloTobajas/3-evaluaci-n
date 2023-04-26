public class ManejaBarcos{
    public static void main(String[] args){
        Barco miPrimBarco, miSegBarco;
        BarcoVelasCuadradas miBarcoBebe;
        miPrimBarco=new Barco("velero",12,2);
        miSegBarco=new Barco("bergantín",67,5);
        System.out.println(miPrimBarco.getNombreBarco());
        System.out.println(miSegBarco.getNombreBarco());
        miBarcoBebe= new BarcoVelasCuadradas("trirreme",10,1,true);
        System.out.println(miBarcoBebe.getNombreBarco());
    }
}
public class Tobajas_G_ejercicio_2 {
    public static void main(String[] args) {
        int vector1[] = {2,3,1};
        int vector2[] = {3,1,2};
        int suma[] = {0,0,0};
        int resta[] = {0,0,0};
        int productoesc = 0;
        suma[]=vector1-vector2;
        System.out.println(suma);
        resta[]=vector1-vector2;
        productoesc = vector1[1]*vector2[1] + vector1[2]*vector2[2] + vector1[3]*vector2[3];
        System.out.println(productoesc);
        
    }
}
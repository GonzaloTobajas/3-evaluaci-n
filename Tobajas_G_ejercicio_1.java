import java.util.Scanner;

public class Tobajas_G_ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = 0.00;
        double color = "azul";

        System.out.println("¿Cual es el radio del cilindro");
            double radio = scanner.nextDouble();

        System.out.println("¿Cual es la altura del cilindro");
            String altura = scanner.nextLine();

        System.out.println("¿Quieres cambiar el color del cilindro? (s/n)");
            String opcion = scanner.nextLine();
            
        if (opcion.equals("s")) { 
            System.out.println("¿Qué color quieres poner?");
            double opcion2 = scanner.nextDouble();
        }

            System.out.println("EL color es: "+ opcion2);
        if (opcion.equals("n")) {
            System.out.println("El color es: "+ color);
        }
        
        area=3.14*radio*radio;
        System.out.println("El area es: "+ area);
        
    }
}

public class Piramide {
    public static void main(String[] args) {
        int altura = 5; // Altura de la pirámide
        
        for (int i = 0; i < altura; i++) {
            // Imprimir espacios en blanco para alinear los asteriscos
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Imprimir asteriscos
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            
            // Cambiar de línea
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class VectorOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the vectors: ");
        int size = input.nextInt();

        int[] vector1 = new int[size];
        int[] vector2 = new int[size];

        // Fill in the first vector
        System.out.println("Enter the elements of the first vector:");
        for (int i = 0; i < size; i++) {
            vector1[i] = input.nextInt();
        }

        // Fill in the second vector
        System.out.println("Enter the elements of the second vector:");
        for (int i = 0; i < size; i++) {
            vector2[i] = input.nextInt();
        }

        // Print the two vectors
        System.out.print("Vector 1: [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(vector1[i] + " ");
        }
        System.out.println("]");

        System.out.print("Vector 2: [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(vector2[i] + " ");
        }
        System.out.println("]");

       
        int[] sum = new int[size];
        for (int i = 0; i < size; i++) {
            sum[i] = vector1[i] + vector2[i];
        }

   
        System.out.print("Vector 1 + Vector 2: [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(sum[i] + " ");
        }
        System.out.println("]");

        
        int[] difference = new int[size];
        for (int i = 0; i < size; i++) {
            difference[i] = vector1[i] - vector2[i];
        }

     
        System.out.print("Vector 1 - Vector 2: [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(difference[i] + " ");
        }
        System.out.println("]");

       
        int scalarProduct = 0;
        for (int i = 0; i < size; i++) {
            scalarProduct += vector1[i] * vector2[i];
        }

        
        System.out.println("Vector 1 . Vector 2 = " + scalarProduct);

    }
}
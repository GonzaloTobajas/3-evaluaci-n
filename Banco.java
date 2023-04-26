import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 100.00; 
        
        while (true) {
            System.out.println("Tu saldo actual es: $" + saldo);
            System.out.println("¿Quieres ingresar o retirar dinero? (i/r)");
            String opcion = scanner.nextLine();
            
            if (opcion.equals("i")) { 
                System.out.println("¿Cuánto dinero quieres ingresar?");
                double cantidad = scanner.nextDouble();
                
                if (cantidad > 0) { 
                    saldo += cantidad;
                    System.out.println("Ingreso exitoso. Tu nuevo saldo es: $" + saldo);
                } else { 
                    System.out.println("No se puede ingresar una cantidad negativa o cero.");
                }
                
                scanner.nextLine(); 
            } else if (opcion.equals("r")) { 
                System.out.println("¿Cuánto dinero quieres retirar?");
                double cantidad = scanner.nextDouble();
                
                if (cantidad > 0 && cantidad <= saldo) { 
                    saldo -= cantidad;
                    System.out.println("Retiro exitoso. Tu nuevo saldo es: $" + saldo);
                } else if (cantidad > saldo) { 
                    System.out.println("No se puede retirar una cantidad mayor que el saldo actual.");
                } else { 
                    System.out.println("No se puede retirar una cantidad negativa o cero.");
                }
                
                scanner.nextLine(); 
            } else { 
                System.out.println("Opción inválida. Por favor, ingresa 'i' para ingresar dinero o 'r' para retirar dinero.");
            }
        }
    }
}

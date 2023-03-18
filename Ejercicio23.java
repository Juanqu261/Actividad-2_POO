import java.util.Scanner;

public class Ejercicio23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de a:");
        double a = sc.nextDouble();
        System.out.println("Ingrese el valor de b:");
        double b = sc.nextDouble();
        System.out.println("Ingrese el valor de c:");
        double c = sc.nextDouble();
        double discriminante = b * b - 4.0 * a * c;
        double x;
        if (discriminante > 0.0) {
            x = (-b + Math.sqrt(discriminante)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2.0 * a);
            System.out.println("Las soluciones son: x1 = " + x + " y x2 = " + x2);
        } else if (discriminante == 0.0) {
            x = -b / (2.0 * a);
            System.out.println("La solución doble es: x = " + x);
        } else {
            System.out.println("No existen soluciones reales");
        }
    }
}

    

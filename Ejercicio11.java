import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Dados tres numeros, se retornara el mayor de ellos.");
    System.out.println("Primer numero: ");
    a = sc.nextInt();
    System.out.println("Segundo numero: ");
    b = sc.nextInt();
    System.out.println("Tercer numero: ");
    c = sc.nextInt();
    sc.close();

    if (a>b && a>b) {
        System.out.println("El mayor es: " + a);
    } 
    else if (b>c) {
        System.out.println("El mayor es: " + b);

    }
    else {
        System.out.println("El mayor es: " + c);

    }
    }
}

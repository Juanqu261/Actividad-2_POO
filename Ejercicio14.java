import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        float d1, d2, d3, salario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Se analizaran las ventas por departamento de una empresa.");
        System.out.println("Ingrese las ventas del departamento 1: ");
        d1 = sc.nextFloat();
        System.out.println("Ingrese las ventas del departamento 2: ");
        d2 = sc.nextFloat();
        System.out.println("Ingrese las ventas del departamento 3: ");
        d3 = sc.nextFloat();
        System.out.println("Ingrese el salario de los trabajadores: ");
        salario = sc.nextFloat();
        sc.close();

        float Totalventas = d1 + d2 + d3;
        float porcentaje = (float) (0.33*Totalventas);
        float salario1, salario2, salario3;

        if (d1>porcentaje) {
            salario1 = (float) (salario + salario * 0.2);
        }
        else {
            salario1 = salario;
        }
        if (d2>porcentaje) {
            salario2 = (float) (salario + salario * 0.2);
        }
        else {
            salario2 = salario;
        }
        if (d3>porcentaje) {
            salario3 = (float) (salario + salario * 0.2);
        }
        else {
            salario3 = salario;
        }

        System.out.println("El salario para los vendedores del dpto. 1 es: " + salario1);
        System.out.println("El salario para los vendedores del dpto. 2 es: " + salario2);
        System.out.println("El salario para los vendedores del dpto. 3 es: " + salario3);
    }
}

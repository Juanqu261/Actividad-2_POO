import java.util.Scanner;

public class Ejercicio22 {
    

    public static void main(String[] args) {
        Scanner trabajador = new Scanner(System.in);
        System.out.println("Digite el nombre del trabajador: ");
        String nombre = trabajador.nextLine();
        System.out.println("Digite el salario que gana el trabajador por hora: ");
        float salario_hora = trabajador.nextFloat();
        System.out.println("Digite las horas trabajadas en el mes: ");
        int horas_trabajadas = trabajador.nextInt();
        float salario_mensual = salario_hora * (float)horas_trabajadas;
        if (salario_mensual > 450000.0F) {
            System.out.println(nombre + " tiene un Salario mensual de " + salario_mensual);
        } else {
            System.out.println(nombre);
        }

    }
}
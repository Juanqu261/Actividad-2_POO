import java.util.Scanner;

public class Ejercicio24 {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el peso de la esfera A: ");
        double pesoA = input.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        double pesoB = input.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        double pesoC = input.nextDouble();
        if (pesoA > pesoB && pesoA > pesoC) {
            System.out.println("La esfera A es la de mayor peso con " + pesoA + " unidades.");
        } else if (pesoB > pesoA && pesoB > pesoC) {
            System.out.println("La esfera B es la de mayor peso con " + pesoB + " unidades.");
        } else if (pesoC > pesoA && pesoC > pesoB) {
            System.out.println("La esfera C es la de mayor peso con " + pesoC + " unidades.");
        } else {
            System.out.println("Hay dos o más esferas con el mismo peso máximo.");
        }

    }
}

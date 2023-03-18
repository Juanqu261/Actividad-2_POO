

import java.util.Scanner;

public class Ejercicio15 {
   

    public static void main(String[] args) {
        Scanner esfera = new Scanner(System.in);
        System.out.println("Digite el peso de la esfera 1: ");
        float esfera1 = esfera.nextFloat();
        System.out.println("Digite el peso de la esfera 2: ");
        float esfera2 = esfera.nextFloat();
        System.out.println("Digite el peso de la esfera 3: ");
        float esfera3 = esfera.nextFloat();
        System.out.println("Digite el peso de la esfera 4: ");
        float esfera4 = esfera.nextFloat();
        if (esfera1 == esfera2 && esfera2 == esfera3) {
            System.out.println("La esfera cuatro tiene un peso diferente");
        } else if (esfera2 == esfera3 && esfera3 == esfera4) {
            System.out.println("La esfera 1 tiene un peso diferente");
        } else if (esfera3 == esfera4 && esfera4 == esfera1) {
            System.out.println("La esfera 2 tiene un peso diferente");
        } else if (esfera4 == esfera1 && esfera1 == esfera2) {
            System.out.println("La esfera 3 tiene un peso diferente");
        }

    }
}
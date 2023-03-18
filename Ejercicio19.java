/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import static java.lang.Math.sqrt;
import java.text.DecimalFormat;
import java.util.Scanner;


public class Ejercicio19 {

    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      
      int lado,perimetro;
      double altura,area;
      
      System.out.println("Digite el valor de un lado del triangulo: ");
      lado= input.nextInt();
      input.close();
      
      perimetro=lado*3;
      altura= (sqrt(3)/2)*lado;
      area=lado*altura/2;
      
      DecimalFormat dosD= new DecimalFormat("#.00");
      
      
      System.out.println("La altura del triangulo es : "+ dosD.format(altura));
      System.out.println("El perimetro del triangulo es : "+perimetro);
      System.out.println("El area del triangulo es : "+ dosD.format(area));
    }
}

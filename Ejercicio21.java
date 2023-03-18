import static java.lang.Math.sqrt;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      
      
      double perimetro, semiP, area,lado1,lado2,lado3;
      
      System.out.println("Digite el valor del cateto 1 del triangulo: ");
      lado1= input.nextDouble();
      System.out.println("Digite el valor del cateto 2 del triangulo: ");
      lado2= input.nextDouble();
      System.out.println("Digite el valor del cateto 3 del triangulo: ");
      lado3= input.nextDouble();
      input.close();
     
      perimetro= lado1+lado2+lado3;
      semiP= perimetro/2;
      area= sqrt((semiP*(semiP-lado1))*(semiP-lado2)*(semiP-lado3));
      
      DecimalFormat dosD= new DecimalFormat("#.00");
      
      System.out.println("El perimetro del triangulo es : "+dosD.format(perimetro));
      System.out.println("El semiperimetro del triangulo es : "+dosD.format(semiP));
      System.out.println("El area del triangulo es : "+dosD.format(area));
      
    }

}

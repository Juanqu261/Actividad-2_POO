import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      
      int codigoE, horasTrabajadas, valorHora;
      double porcentajeRetencion, salarioB, salarioN;
      String nombres;
      
      System.out.println("Digite el codigo del empleado: ");
      codigoE= input.nextInt();
      
      System.out.println("Digite el nombre del empleado: ");
      nombres= input.next();
      
      System.out.println("Digite las horas trabajadas: ");
      horasTrabajadas= input.nextInt();
      
      System.out.println("Digite el valor hora del empleado: ");
      valorHora= input.nextInt();
      
      System.out.println("Digite el porcentaje de retencion: ");
      porcentajeRetencion= input.nextDouble();
      input.close();
      
      salarioB= horasTrabajadas*valorHora;
      salarioN= salarioB-(salarioB*(porcentajeRetencion/100));
      
      System.out.println("Codigo empleado: "+codigoE);
      System.out.println("Nombre: "+nombres);
      System.out.println("El salario bruto es: "+salarioB);
      System.out.println("El salario neto es: "+salarioN);
    }
}

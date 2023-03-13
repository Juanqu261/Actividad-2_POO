package actividad_2;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        String name;
        float hrs, pay;
        Scanner sc = new Scanner(System.in);
        System.out.println("Se determinara el pago por o sin horas extras a un trabajador.");
        System.out.println("Ingrese el nombre del trabajador:");
        name = sc.nextLine();
        System.out.println("Ingrese las horas trabajadas (por semana) del trabajador:");
        hrs = sc.nextFloat();
        System.out.println("Ingrese pago por hora del trabajador:");
        pay = sc.nextFloat();
        sc.close();

        float sal;
        if (hrs>40) {
            float ex = hrs-40;
            if (ex>8) {
                float ext = ex-8;
                sal = 40*pay + 16*pay + ext*3*pay;
            }
            else {
                sal = 40*pay + ex*2*pay;
            }
        }
        else{
            sal = hrs*pay;
        }

        System.out.println("El trabajador " + name + "devengo: $" + sal);
    }
}

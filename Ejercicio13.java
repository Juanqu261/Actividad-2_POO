import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        
        float compra, descuento, pago;
        String ball;

        Scanner sc = new Scanner(System.in);
        System.out.println("Se determinara el descuento y el valor total a pagar.");
        System.out.println("Ingrese el valor total: ");
        compra = sc.nextFloat();
        System.out.println("Ingrese el color de la bolita sacada: ");
        ball = sc.next();
        sc.close();

        ball = ball.toUpperCase();
        if (ball.equals("BLANCO")) {
            descuento = 0;
        }
        else if (ball.equals("VERDE")) {
            descuento = (float) 0.1;
        }
        else if (ball.equals("AMARILLO")) {
            descuento = (float) 0.25;
        }
        else if (ball.equals("AZUL")) {
            descuento = (float) 0.5;
        }
        else {
            descuento = 1;
        }

        pago = compra - (descuento*compra);
        System.out.println("El cliente debe pagar: $" + pago);
        System.out.println("Descuento del " + descuento*100 + "% aplicado.");
    }
}

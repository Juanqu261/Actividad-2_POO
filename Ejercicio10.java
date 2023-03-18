/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int numI,patrim,estrato;
        double valorM;
        String nombre;
        
        valorM=50000;
                
        System.out.println("Digite su numero de inscripcion:");
        numI= input.nextInt();
        
        System.out.println("Digite su nombre:");
        nombre= input.next();
        
        System.out.println("Digite su patrimonio:");
        patrim= input.nextInt();
        
        System.out.println("Digite su estrato social:");
        estrato= input.nextInt();
        input.close();
        
        if(patrim>2000000 && estrato>3){
            valorM=valorM+(patrim*(0.03));   
       
       }
    
        System.out.println("Numero de inscripcion: "+numI);
        System.out.println("Nombre: "+nombre);
        System.out.println("Pago de matricula: "+valorM);
    
       
    }
}

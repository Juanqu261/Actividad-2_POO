/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.util.Scanner;


public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        double numA,numB;
        
        System.out.println("Digite el primer numero: ");
        numA= input.nextDouble();
        
        System.out.println("Digite el segundo numero: ");
        numB= input.nextDouble();
        input.close();
        
        if(numA>numB){
            System.out.println(numA +" es mayor que "+ numB);
        } else if(numA<numB){
            System.out.println(numA +" es menor que "+ numB);
                
        } else{
            System.out.println(numA +" es igual que "+ numB);
        }
          
    }
}


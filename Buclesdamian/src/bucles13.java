
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paloma
 */
public class bucles13 {
    //programa que lea 10 num y determine cuantos son positivos y cuantos negstivos.
    public static void main(String[] args){
        
        Scanner teclado= new Scanner(System.in);
         
        for(int i=1; i<=10; i++){
            System.out.println("introduce un numero");
        
        int numero=teclado.nextInt();
            if(numero<0){
                System.out.println("el numero es negativo");
            }else if(numero>=0){
                System.out.println("el numero es positivo");
            }
        }
        
        
        
    }
}

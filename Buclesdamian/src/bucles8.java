
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paloma
 */
public class bucles8 {
    //tabla de multiplicar de un numero introducido
    public static void main(String[] args){
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Introduce un numero para saber su tabla de multiplicación");
        
        int numero=teclado.nextInt();
        
        for(int i=numero;  i<=numero*10 ;i=i+numero){
            System.out.println(i);
        }
        
    }
    
}

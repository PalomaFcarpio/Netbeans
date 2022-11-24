/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Paloma
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
		int num; //numero introducido por el usuario
		System.out.println("Introduzca digito");
		
                num =teclado.nextInt();
                
		if(num % 2==0) {
			System.out.println("Es par");
			
			
	  } else {
		  System.out.println("es impar");
	  }
    }
    
}

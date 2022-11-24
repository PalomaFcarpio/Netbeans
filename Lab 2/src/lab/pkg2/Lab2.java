/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg2;

import java.util.Scanner;

/**
 *
 * @author Paloma
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CALCULAR AREA DE UN TRIANGULO.
        System.out.println("Vamos a calcular el area de un triángulo");
        
        Scanner teclado= new Scanner(System.in);
        
        //1.Entrada de datos
       //Las variables y declaración de variables.
       double base;
        System.out.println("Introduce la base del triángulo");
       base= teclado.nextDouble();
        System.out.println("el valor recogido es.."+base);
        System.out.println("Introduce la altura del triángulo");
        double altura;
        altura = teclado.nextDouble();
        System.out.println("el valor recogido es..."+altura);
        
        //2.Algoritmo
        // area de triangulo: base x altura /2
        double area;
        area=(base * altura) / 2;
        
        //3. Salida de datos
        
        System.out.println("el area es.."+area);
        System.out.println("para la base"+base+"para la altura"+altura+ "el area es"+area);
                
        
        
        
        // TODO code application logic here
    }
    
}

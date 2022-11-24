/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer003bitcoins;

import java.util.Scanner;

/**
 *
 * @author Paloma
 */
public class ejer003Bitcoins {
    //Calcular los euros que valen los bitcoins introducidos por teclado
    //La equivalencia entre bitcoins y euros, introducir previamente.
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        //1.Entrada de datos
        System.out.println("Introduce la equivalencia de 1 bitcoins en euros");
        double equivalencia= teclado.nextDouble();
        System.out.println("Introduce los bitcoins que tienes");
        double bitcoins= teclado.nextDouble();
        
        //2.Algoritmos
        double conversion= equivalencia * bitcoins;
        
        //3.Salida de datos
        System.out.println("el resultado es.."+conversion);
    }
    
}

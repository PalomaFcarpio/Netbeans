/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejer002Circulo;

import java.util.Scanner;

/**
 *
 * @author Paloma
 */
public class Principal {
    //Area del círculo
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                
                //1.ENTRADA DE DATOS
                System.out.println("Vamos a conseguir el area de un circulo");
                System.out.println("Introduce el radio del circulo");
                double radio= teclado.nextDouble();
               
        
                //2. ALGORITMOS
                //area= PI x radio al cuadrado
                double area= Math.PI * radio * radio;
                area=Math.PI * Math.pow(radio, 2);
                        
                        
                //3.SALIDA DE DATOS
                System.out.println("el area del circulo es.."+area);
    }
}

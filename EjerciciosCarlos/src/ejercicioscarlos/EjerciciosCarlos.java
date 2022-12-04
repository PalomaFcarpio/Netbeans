/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioscarlos;

import java.util.Scanner;

/**
 *
 * @author Paloma
 */
public class EjerciciosCarlos {

    /**
     * @param args the command line arguments
     *
     *
     */
    //Crear un programa que muestre los números primos desde el 2,
    // hasta un número introducido por el usuario
    //de los números que no son primos, mostrar todos sus divisores
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca hasta que numero quiere saber numeros primos");

        int limitesuperior = teclado.nextInt();

        int limiteinferior = 1;

        for (int i = limiteinferior; i <= limitesuperior; i++) {
            int divisores = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    divisores += 2;
                }
                if (divisores > 2) {
                    for (int k = i; k != limiteinferior; k--) {
                        if (i % k == 0) {
                   System.out.println("los divisores"+i + "son"+k);
                        }
                    }
                    break;
                }

            }
            if (divisores == 2) {
                System.out.println(i);
            }
        }
        System.out.println();

    }

}

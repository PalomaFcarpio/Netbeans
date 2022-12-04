/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paloma
 */
public class bucles23 {
    //scribe un programa que lea un número n e imprima una pirámide de números con n filas 
    //1
    //12
//  123
//1234
    public static void main(String[] args) {

        /*  for(int i=1; i<=10; i++){
            for(int j=1; j<i+1;j++){
                System.out.print(j);
                        
                        
            }
            System.out.println();
        }*/
        //pares ||
        // impares **
        /* for(int i=4;i<=20;i++){
          for(int j=4;j!=i+1;j++){
            if (i % 2==0)  
                System.out.print("|");
            else if (i % 2 !=0)
                System.out.print("*");
            
              
          }
          System.out.println();
          
      }*/
 /* for(int i=4;i<=20;i++){
          for(int j=4;j!=i+1;j++){
            if (j % 2==0)  
                System.out.print("|");
            else if (j % 2 !=0)
                System.out.print("*");
            
              
          }
          System.out.println();
          
      }*/
        //1
//121
//12321
//1234321
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j != i + 1; j++) {
                System.out.print(j);
                if (i == j) {
                    for (int k = j - 1; k >= 1; k--) {
                        System.out.print(k);
                    }
                }

            }
               System.out.println();
               
        }

    }
}

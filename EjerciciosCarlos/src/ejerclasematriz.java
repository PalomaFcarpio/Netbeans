
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paloma
 */
public class ejerclasematriz {
    
    //cREA MATRIZ CON TAMA´ÑO INTRODUCIDO POR TECLADO
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("introduzca tamaño para matriz");
        
        int numero= teclado.nextInt();
        
        for(int i=1; i<=numero;i++){
            
            for(int j=1; j<=numero; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
}

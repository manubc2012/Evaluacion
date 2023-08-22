/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaluacionFinal;
import java.util.Scanner;
/**
 *
 * @author 503
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String names[]= new String[6];
        
        for(int i=0; i<names.length; i++){
            System.out.println("Ingrese el nombre " + (i+1));
            names[i]=sc.nextLine();
            System.out.println("El nombre en la posicion " + i + " es " + names[i]);
        }
    }
}

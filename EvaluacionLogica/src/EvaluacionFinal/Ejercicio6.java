/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaluacionFinal;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author 503
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        System.out.println("Ingrese el largo del Array");
        int largo=sc.nextInt();
        int i=0;
        
        do{
            System.out.println("Ingrese el numero: " + (i+1));
            int num1 = sc.nextInt();
            num.add(num1);
            i++;
        }while(i<largo);
        
        
        //Ejercicio 7
       for(int j=0;j<num.size();j++){
           System.out.println("El numero en la posicion " +j+" es "+num.get(j));
       }
        
    }
          
}

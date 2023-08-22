/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaluacionFinal;

/**
 *
 * @author 503
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
       int edades[][]={{40,20,28},{21,80,41},{50,52,70}};
        
        for (int i=0; i<edades.length; i++){
            for (int j=0; j<edades[i].length; j++){
                System.out.print( edades[i][j] + "\t");
            }
            System.out.println();
        }
        
    }
}

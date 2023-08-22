/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaluacionFinal;

/**
 *
 * @author 503
 */
public class Ejercicio345 {
    public static void main(String[] args) {
        String [][] jugadores={{"Juan ", "15 años ", "Delantero"},{"Pedro ","16 años ","Defensa"},{"Luis ","17 años ","Arquero"}};
        for (int i=0; i<jugadores.length; i++){
            for (int j=0; j<jugadores[i].length; j++){
                System.out.print( jugadores[i][j] + "\t");
            }
            System.out.println();
        }
        
        //Ejercicio 4
        System.out.println("La posicion 2,2 es "+jugadores[2][2]);
        
        //Ejercicio 5
        System.out.println("La posicion 1,1 es "+jugadores[1][1]);
    }
}

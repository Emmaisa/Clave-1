/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_6;



public class Monte_Carlo{
    
    public static void main(String[] args) {
        int total = 1000;
        float suma = 0, resultado;
        for(int i = 0; i<total;i++){
            suma = (float) (suma + Math.random());
        }
        resultado = suma/total;
        System.out.println("Resultado"+resultado);
    
    }
    
}

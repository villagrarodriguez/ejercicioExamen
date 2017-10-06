/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      
        System.out.println("Examen PArcial");
        System.out.println("");
        System.out.println("Villagra Rodriguez Edgardo");
        System.out.println("");
        System.out.println("Telefonos Moviles");
        System.out.println("");
        System.out.println("(1) Samsung");
        System.out.println("(2) iphone");
        System.out.println("(3) Huawey");
        System.out.println("");
        System.out.println("Seleccione un modelo");
        
        char opcion = input.next().charAt(0);
              
        switch (opcion) {
            case '1':   System.out.println(""); 
                        System.out.println("Pantalla   :   8.4"); 
                        System.out.println("Camara     :   8MP"); 
                        System.out.println("Procesador :   1.4Ghz"); break;
                
            case '2':   System.out.println(""); 
                        System.out.println("Pantalla   :   5.8"); 
                        System.out.println("Camara     :   326ppp"); 
                        System.out.println("Procesador :   Apple A11 Bionic "); break;
                        
            case '3':   System.out.println(""); 
                        System.out.println("Pantalla   :   5.1"); 
                        System.out.println("Camara     :   20MP"); 
                        System.out.println("Procesador :   2.36 GHz. "); break;
                
                default:
                    System.out.println("Seleccion incorrecta numeros entre 1 y 3");
        
                
                    char operador = input.next().charAt(0);
              
        switch (operador) {
            case 'c':   System.out.println(""); 
                        System.out.println("Claro"); 
                        System.out.println("plan        :  Control S/100 "); 
                        System.out.println("Internet    :   Ilimitado");
                        System.out.println("Minutos     :  500"); break;
                
            case 'm':   System.out.println(""); 
                        System.out.println("Movistar"); 
                        System.out.println("plan     :   326ppp"); 
                        System.out.println("Procesador :   Apple A11 Bionic "); break;
                        
            case 'e':   System.out.println(""); 
                        System.out.println("Pantalla   :   5.1"); 
                        System.out.println("Camara     :   20MP"); 
                        System.out.println("Procesador :   2.36 GHz. "); break;
                
                default:
                    System.out.println("Seleccion incorrecta numeros entre 1 y 3");
        }
        
        }
    
    }   
}

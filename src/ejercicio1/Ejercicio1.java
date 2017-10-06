/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author alumno
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroInicial = 1; //el numero donde empieza
        int numeroFinal = 100; //el numero donde termina
        for (int i = 1; i <= (numeroFinal - numeroInicial + 1); i++ ) { 
            int divisores = 0; //un numero primo solo puede tener 2 divisores
            int numeroActual = 0;
            for (int e = 1; e <= i; e++) { //este for por ejemplo revisa 5 y lo divide por 1, luego 2, 3, 4 y hasta 5
                numeroActual = e;
                if ( (i % e) == 0) divisores++; //aumenta los divisores si se
                /*Explicación*/if (divisores == 2)  {break;} 
            }
            if (numeroActual == i && i != 1)  System.out.println (i); //muestre el número si cumplió los requisitos, excepto
        
    }
    }   
}

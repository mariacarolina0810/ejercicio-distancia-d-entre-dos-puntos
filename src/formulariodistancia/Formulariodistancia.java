/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariodistancia;

import java.util.Scanner;

/**
 *
 * @author jaimetoon
 */
public class Formulariodistancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
       int x1,x2,y1,y2; 
       double d;
        
       System.out.println("Digite la primera coordenada en X: ");
       x1=leer.nextInt();
       System.out.println("Digite la segunda coordenada en X: ");
       x2=leer.nextInt();
       System.out.println("Digite la primera coordenada en y: ");
       y1=leer.nextInt();
       System.out.println("Digite la segunda coordenada en y: ");
       y2=leer.nextInt();
       d=Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
       System.out.println("La distancia entre dos puntos es: "+d);

    }
    
}

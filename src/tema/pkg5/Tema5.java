/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema.pkg5;

import java.util.Scanner;

/**
 *
 * @author AlumnoUTM
 */
public class Tema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner sc = new Scanner (System.in);
        double ladoA, ladoB, hipotenusa;
        System.out.println("Ingrese valor del lado A");
        ladoA = sc.nextDouble();
        System.out.println("Ingrese valor del lado B");
        ladoB = sc.nextDouble();
        hipotenusa = CalcularHipotenusa(ladoA,ladoB);
        System.out.println("El valor d ela hipotenusa es"+ hipotenusa);*/
        
        computadora dell = new computadora();
        System.out.println(dell.getValor());
        computadora.ImprimeValor();
    }
    
    public static double CalcularHipotenusa(double ladoA, double ladoB){
        return Math.sqrt(ladoA * ladoA + ladoB * ladoB);
    }
    
}

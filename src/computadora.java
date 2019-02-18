/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlumnoUTM
 */
public class computadora {
    private int valor;
    private static int contador;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public static void ImprimeValor(){
        System.out.println(contador);
    }
}

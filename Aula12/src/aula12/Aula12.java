/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author ice
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calculadora = new Calculadora();
        float a = calculadora.divisao(8, 0);
        System.out.println("Resultado = "+a);
        calculadora.percorrer(0);
        calculadora.percorrer2(0);
    }
        
    
}

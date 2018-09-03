/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author ice
 */
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dado dado1 = new Dado();
        dado1.numfaces = 6;
       // dado1.rolarDado();
        
        Dado [] dados = new Dado [5];
            for (int i=0; i<5;i++){
            dados[i].numfaces = 6;
            }   
        
        for (int i=0; i<5;i++){
            dados[i].rolarDado();
            }
        }
   
    
}

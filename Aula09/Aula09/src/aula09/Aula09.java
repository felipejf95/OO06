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
     * @author juarez
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dado[] dados = new Dado[6];
        Jogador [] jogador = new Jogador[2];
        
        for (int i = 0; i < 5; ++i) {
               dados[i] = new Dado();
               dados[i].numfaces = 6;
        }
        
        for(int i=0; i<5; i++){
            dados[i].rolarDado();
        }   
        
        
        
        
           
        
        }
   
    
}

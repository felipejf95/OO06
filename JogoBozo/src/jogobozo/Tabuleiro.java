/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogobozo;

/**
 *
 * @author ice
 */
public class Tabuleiro {
    int[] tabuleiro = new int[10];
    
    public void iniciaTabuleiro(){
        for(int i=0; i<10; i++){
            this.tabuleiro[i] = 0;
        }
    }
    
    public void exibeTabuleiro(){
        for(int i=0; i <10; i++){
            System.out.println(i+1 +" ");
        }
    }
    
    public void calculaPontuacao(){
      
        
    }
}

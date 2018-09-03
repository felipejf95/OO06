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
    int pontPosicao[] = new int[10];
    
    public void exibeTabuleiro(){
        for(int i=0; i < pontPosicao.length; i++){
            System.out.print(i+1 +" ");
        }
    }
    
    public void calculaPontuacao(){
      
        
    }
}

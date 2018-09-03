package aula09;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ice
 */
public class Placar {
    int posicaoPontuacao [] = new int[10];
    int pontos = 0;
    
    public void exibirPlacar (){
        for (int i=0; i<10; i++){
          System.out.print(" " + posicaoPontuacao[i]);
        }
    }
    
    
    
    public int exibirPontuacao(){
        for (int i=0; i<10; i++){
        this.pontos += posicaoPontuacao[i];
        }
            
        return this.pontos;   
    }    
        
    
    
}

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
public class Jogador {
   private String nome;
   Dado dados []= new Dado[5];
   
   public void lancarDados(int n){
       for(int i=0; i<n; i++){
           dados[i].rolarDados();           
       }
   }
    
   public void escolheDado(){
       
   }
   
   public void escolhePosicao(){
       
   }
    
}

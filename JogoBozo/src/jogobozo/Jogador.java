/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogobozo;

import java.util.Scanner;


/**
 *
 * @author ice
 */
public class Jogador {
   private String nome;
   private int soma = 0;
   int posicao;
   int n = 5;
   int nJogadas = 3;
   String rolar;
   String face;
   int dados []= new int[n];
   Dado dado = new Dado();
   
   public void lancarDados(){
       for(int i=0; i<n; i++){
           dados[i] = dado.rolarDados();           
       }
       this.nJogadas--;
   }
    
   public void escolheDado(){
       for(int i=0; i<n; i++){
           this.face = dado.imprimeDado(dados[i]);
           System.out.print(this.face +"     ");           
       }
       System.out.println();
       Scanner ler = new Scanner(System.in);      
       System.out.println("Deseja rolar os dados novamente? ");
       this.rolar = ler.next();
       if(this.rolar.equals("sim") && nJogadas > 0){
           lancarDados();
           escolheDado();
       }      
   }
   
   public void escolhePosicao(){
       System.out.println("Escolha a posicao(valor do dado): ");
       Scanner ler = new Scanner(System.in);
       this.posicao = ler.nextInt();
       for(int i =0; i<this.posicao; i++){
           if(dados[i] == posicao)
               this.soma += dados[i];
       }
        
   }
    public int getSoma() {
        return soma;
    }
   
   public int getPosicao(){
       return posicao;
   }
    
}

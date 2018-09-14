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
   int posicao;
   private int nDados = 5;
   private int nJogadas = 3;
   String rolar;
   String face;
   int dados []= new int[nDados];
   Dado dado = new Dado();
   
   public void lancarDados(){       
        for(int i=0; i<nDados; i++){
        dados[i] = dado.rolarDados();           
        }          
       this.nJogadas--;      
   }
    
   public void escolheDado(){
       for(int i=0; i<nDados; i++){
           this.face = dado.imprimeDado(dados[i]);
           System.out.print(this.face +"     ");           
       }
       System.out.println();
       Scanner ler = new Scanner(System.in);      
       if(this.nJogadas > 0)
       {
            System.out.println("Deseja rolar os dados novamente? ");
            this.rolar = ler.next();
            if(this.rolar.equals("sim")){
                lancarDados();
                escolheDado();
            }
       }
   }
   
   public void escolhePosicao(){
       System.out.println("Escolha a posicao(valor do dado): ");
       Scanner ler = new Scanner(System.in);
       this.posicao = ler.nextInt();
       int soma = 0;
       for(int i =0; i<this.posicao; i++){
           if(dados[i] == posicao)
               soma += dados[i];
       }
        
   }    
   
   public int getPosicao(){
       return posicao;
   }
    
}

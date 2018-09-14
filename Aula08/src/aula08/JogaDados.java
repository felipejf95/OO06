/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;

/**
 *
 * @author ice
 */
public class JogaDados {
    int dados[] = new int[5];
    Dado dado = new Dado();
    
    public void sorteiaDados(){
        for(int i=0; i<5; i++){
            dados[i] = dado.getFace();
        }
    }

    public int[] getDados() {
        sorteiaDados();
        return dados;
    }
    
    public void imprimeFaces(){
        for(int i=0; i<dados.length; i++){
            System.out.println(dados[i]);
        }
    }
            
}

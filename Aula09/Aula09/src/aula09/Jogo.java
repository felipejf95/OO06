package aula09;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ice
 */
public class Jogo {
    int numJogadores =0;
    
    
    Scanner leitura = new Scanner(System.in);
    public void iniciajogo(){
        System.out.println("Digite o numero de jogadores: ");
        this.numJogadores = leitura.nextInt();        
    }

    public Jogo(int numJogadores) {
        
    }
    
    
    
}

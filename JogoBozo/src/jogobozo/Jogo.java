/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogobozo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Jogo {
    int numFaces;
    ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    
    
    public void quantFaces(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a quantidade de dados: ");
        this.numFaces = ler.nextInt();
    }
    
    public void defineFaces(){
        quantFaces();
        Dado dado = new Dado(this.numFaces);        
    }  
}

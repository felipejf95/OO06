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
public class JogoBozo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jogador j1 = new Jogador();
        j1.lancarDados();
        j1.escolheDado();
        j1.escolhePosicao();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg10;

/**
 *
 * @author ice
 */
public class Gato extends Animal implements Robo{   
    
    public void emitirSom(){
        System.out.println("Miando");
    } 

    public Gato() {
    }

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void aspirarChao() {
        
    }

    @Override
    public void tocarMusica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
    
}

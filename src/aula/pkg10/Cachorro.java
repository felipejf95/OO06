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
public class Cachorro extends Animal {

    public Cachorro() {
    }

    public Cachorro(String nome) {
        super(nome);
    }
    
    @Override 
    public void emitirSom(){        
        System.out.println("Latindo");
    }
}

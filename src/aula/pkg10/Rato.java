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
public class Rato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Fungando");
    }

    public Rato() {
    }

    public Rato(String nome) {
        super(nome);
    }
    
}

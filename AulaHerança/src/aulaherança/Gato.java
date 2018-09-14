/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaherança;

/**
 *
 * @author ice
 */
public class Gato extends Animal {
    public void emitirSom(){
        System.out.println("Miau!");
    }
    
    public void dormir(){
        System.out.println("Dormindo!");
    }
    
    public void comer(){
        System.out.println("Comendo ração de gato!");
    }
}

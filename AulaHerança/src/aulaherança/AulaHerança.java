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
public class AulaHerança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal();
        animal.comer();
        animal.dormir();
        animal.emitirSom();
        
        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.dormir();
        cachorro.emitirSom();
        
        Gato gato = new Gato();               
        gato.comer();
        gato.dormir();
        gato.emitirSom();
    }
    
}

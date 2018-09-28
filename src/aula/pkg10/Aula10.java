/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg10;

import java.util.ArrayList;

/**
 *
 * @author ice
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Cachorro dog = new Cachorro();
        dog.comer();
        dog.dormir();
        dog.emitirSom();
        
        Gato cat = new Gato();
        cat.comer();
        cat.dormir();
        cat.emitirSom();*/
        
        ArrayList<Animal> animais = new ArrayList<Animal>();
            animais.add(new Gato("Tobias"));
            animais.add(new Cachorro("Toto"));
            animais.add(new Rato("Stuart"));
            Gato gato1 = new Gato();
            gato1.setNome("Tobias");
            Gato gato2 = new Gato();
            gato2.setNome("Tobias");
            for(int i = 0; i<animais.size(); i++){
                animais.get(i).emitirSom();                
                System.out.println("Nome: "+animais.get(i).toString());
                if(animais.get(i).getClass() == Gato.class){
                    animais.get(i).comer("Ração");
                }
                else if(animais.get(i).getClass() == Cachorro.class){
                    animais.get(i).comer("Carne");
                }else{
                    animais.get(i).comer("Queijo");
                }
            }
            
            System.out.println(gato1.equals(gato2));
            
            
    }
    
}

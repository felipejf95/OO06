/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author ice
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro pinsher;
        Cachorro labrador;
        Cachorro golden;
        
        Petshop pet = new Petshop();
        
        golden = pet.compra("Delph", "caramelo");
        labrador = pet.compra("Rapha", "azul");
        golden.getCachorro();
        golden = pet.venda(golden);
        
    }
    
}
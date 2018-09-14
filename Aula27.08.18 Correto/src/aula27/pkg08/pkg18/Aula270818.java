/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula27.pkg08.pkg18;

/**
 *
 * @author ice
 */
public class Aula270818 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro cac1 = new Cachorro("gold","golden", 2);
        Cachorro cac2 = new Cachorro("preto","pincher", 3);
        Cachorro cac3 = new Cachorro("gray","lobo", 1);
        PetShop buteco = new PetShop();
        
        cac1.informacaoCachorros();
        cac2.informacaoCachorros();
        cac3.informacaoCachorros();
        
        cac3 = buteco.Venda(cac3);
        cac1 = cac1.venderCachorro();
        
        cac1.informacaoCachorros();
        cac2.informacaoCachorros();
        cac3.informacaoCachorros();
        
        
        
        
               
    }
    
}

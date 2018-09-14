/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula24.pkg08.pkg18;

import aula24.pkg08.pkg18.Estoque.Estoque;

/**
 *
 * @author ice
 */
public class Aula240818 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estoque prod1 = new Estoque("jato de tinta", 13, 3);
        Estoque prod2 = new Estoque("cartucho", 17, 5);
        Estoque prod3 = new Estoque("impressora", 10, 2);
        Estoque prod4 = new Estoque("toner", 20, 4);
        
       prod1.informaDados();
       prod1.baixaProduto(4);
       prod1.informaDados();
       prod1.reporProduto(5);
       prod1.informaDados();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Petshop {
    
    String nome;
    float valor; 
    int num = 0; //numero de cachorros
    Scanner leitura = new Scanner(System.in);
    
    public Cachorro compra(String nome, String cor){
        Cachorro dog = new Cachorro(nome, cor);
        System.out.println("Comprando cachorro "+ dog.getNome());
        System.out.println("Valor da compra: R$");
        valor = leitura.nextFloat();
        System.out.println("Cachorros disponiveis para venda: "+ dog.getQuantidadeCachorro());
        return dog;
    }
    
    public Cachorro venda(Cachorro dog){
        if(dog.getQuantidadeCachorro() != 0){
            System.out.println("Vendendo "+ dog.getNome());
            System.out.println("Digite o valor da venda: R$");            
            valor = leitura.nextFloat();
            System.out.println(dog.getNome() + " Vendido");
            dog.venderCachorro();
            System.out.println("Cachorros disponiveis para venda: "+ dog.getQuantidadeCachorro());
            dog = dog.venderCachorro();
            return dog;
        }
        else{
                System.out.println("Não tem cachorro disponivel");
                return null;
            }
        }
    
}

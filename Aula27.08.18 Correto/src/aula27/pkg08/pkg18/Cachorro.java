/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula27.pkg08.pkg18;
import java.util.*;
/**
 *
 * @author ice
 */
public class Cachorro {
    private String nome;
    private String raca;
    private int idade;
    public static int qtdCachorro =0;
    /* 
    public
    
    */
    
    Scanner leitura = new Scanner(System.in);

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        qtdCachorro++;
    }
    
    public Cachorro venderCachorro(){
    qtdCachorro--;
    return null;
    
    }
    
    public String getNome() {
        return nome;
    }
    
    public void informacaoCachorros(){
        System.out.println("Nome: " + getNome());
        System.out.println("Raça: " + getRaca());
        System.out.println("Idade: " + getIdade());
        System.out.println();
    }
        
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
        
}

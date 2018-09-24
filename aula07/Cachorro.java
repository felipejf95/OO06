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
public class Cachorro {
    
    private String nome;
    private String cor;
    private int idade;
    private int peso;
    public static int quantidadeCachorro = 0;
    
    public Cachorro(){
        
    }  
      

    public Cachorro(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
        quantidadeCachorro++;
    }   
    
    public Cachorro venderCachorro(){
        quantidadeCachorro--;
        return null;
    }
    
    public int getQuantidadeCachorro(){
        return this.quantidadeCachorro;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void getCachorro(){               
            System.out.println("Nome: " +nome );
            System.out.println("Cor: "+cor);            
    }
    
    public void latir(){
        System.out.println("Cachorro latindo!");
    }
    
    public void criaBicicleta(){
        Bicicleta bike = new Bicicleta();
    }
    
    
}

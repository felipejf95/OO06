package aula.pkg10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juarez
 */

//Classe pai ou superclasse, felino, canino, lobo, leão, vaca (draw.io tem q desenhar)

public abstract class Animal {
    private int idade;
    private String raca;
    private String nome;

    public Animal() {
    }

    public Animal(String nome) {
        this.nome = nome;
    }

     public void comer(){
       System.out.println("Estou comendo");
   }
   
   public void dormir(){
       System.out.println("Estou dormindo");
   }
   
   public abstract void emitirSom();
    
    
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     @Override
    public String toString(){
        return this.nome;
    }
    
    public boolean equals(Animal animal){
        return this.nome.equals(animal.nome);
    }
   
}

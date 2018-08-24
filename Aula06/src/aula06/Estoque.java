/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author ice
 */
public class Estoque {
    String nome;
    int quantidadeAtual, quantidadeMinima;

    public Estoque(String nome, int quantidadeAtual, int quantidadeMinima) {
        this.nome = nome;
        if(quantidadeAtual >=0 && quantidadeMinima >=0){            
            this.quantidadeAtual = quantidadeAtual;
            this.quantidadeMinima = quantidadeMinima;
        }
        else System.out.println("Quantidade invalida!(Não pode ser valor negativo)");
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        if(quantidadeAtual >=0){
            this.quantidadeAtual = quantidadeAtual;
        }
        else System.out.println("Quantidade invalida! (Quantidade minima não pode ser menor que 0)");
        
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        if(quantidadeMinima >=0 && quantidadeMinima <= this.quantidadeAtual){
            this.quantidadeMinima = quantidadeMinima;
        }
        else System.out.println("Quantidade invalida! (Quantidade minima não pode ser menor que 0)");
    }
    
    public void reporEstoque(int quantidade){        
            System.out.println("Repondo "+ quantidade +" unidades de "+nome);
            quantidadeAtual += quantidade;
            verificaEstoque();
    }
    
    public void baixa(int quantidade){
        System.out.println("Dando baixa em "+ quantidade + " unidades de "+ nome);
        quantidadeAtual -= quantidade;
        verificaEstoque();
    }
    public void infoProduto(){
        System.out.println("Nome: "+ nome);
        System.out.println("Quantidade atual: "+ quantidadeAtual);
        System.out.println("Quantidade minima: "+ quantidadeMinima);
    }
    
    public void verificaEstoque(){
        if(quantidadeAtual < quantidadeMinima)
            System.out.println("O estoque precisa ser reposto!");
        else System.out.println("O estoque não precisa ser reposto!");
    }
  
}

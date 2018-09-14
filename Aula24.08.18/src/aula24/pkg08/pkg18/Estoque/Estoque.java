/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula24.pkg08.pkg18.Estoque;
import java.util.*;
/**
 *
 * @author ice
 */
public class Estoque {
    String nome;
    int qtdAtual;
    int qtdMinima;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public Estoque() {
    }
    
    Scanner leitura = new Scanner(System.in);
     //int prod = leitura.nextInt();
    void inicializar(){
        //Estoque estoq1 = new Estoque();
        System.out.println("Iniciar estoque:");
        this.nome = leitura.next();
        this.qtdAtual = leitura.nextInt();
        if(this.qtdAtual < 0){
            System.out.println("Estoque inválido digite novamente:");
            this.qtdAtual = leitura.nextInt();
        }
        this.qtdMinima = leitura.nextInt();
        if(this.qtdMinima > this.qtdAtual && this.qtdMinima < 0){
            System.out.println("Estoque minimo inválido digite novamente:");
            this.qtdMinima = leitura.nextInt();
        }
    }
        public void reporProduto(int qtdReposta){
        
            this.qtdAtual = this.qtdAtual + qtdReposta;        
        }
    
    public void baixaProduto (int qtdBaixa){
        int verifica;
        verifica = this.qtdAtual- qtdBaixa;
        this.qtdAtual = verifica;
        verifica();
    }
    
    public void verifica(){
        if(this.qtdAtual < this.qtdMinima){
            System.out.println("Digite a quantidade reposta:");
            reporProduto(leitura.nextInt());
        }
      
    }
    
    public void informaDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade Atual: " + this.qtdAtual);
        System.out.println("Quantidade Minima: " + this.qtdMinima);
    
    }
}

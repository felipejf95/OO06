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
public class PetShop {
    int valor;
    int qtd;
    String nomeCachorro;
    int total = 0;
    int qtdCachorro = 0;
    Scanner leitura = new Scanner(System.in);
    
    public Cachorro Venda(Cachorro cao){
       cao = null;
       qtdCachorro--;
       return cao;
    }
    
    
    
    public void Compra(Cachorro cao){
        qtdCachorro++;
    }
    
    public void Balanco(){
       
    }
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getNomeCachorro() {
        return nomeCachorro;
    }

    public void setNomeCachorro(String nomeCachorro) {
        this.nomeCachorro = nomeCachorro;
    }
    
    
    
}

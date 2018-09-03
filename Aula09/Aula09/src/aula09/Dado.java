package aula09;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ice
 */
public class Dado {
    int numfaces = 0;
    int faces [];
    int numAleatorio;
    

    public Dado() {
    }

    public Dado(int[] faces) {
        this.faces = faces;
    }
    
    
    
    public void rolarDado(){    
    this.numAleatorio = (int)(Math.random()*this.numfaces);
    exibirFace(this.numAleatorio);
    }
    
    public void exibirFace(int numAleatorio){
        System.out.println(this.numAleatorio);
    }

    public int getNumfaces() {
        return numfaces;
    }

    public void setNumfaces(int numfaces) {
        this.numfaces = numfaces;
    }
    
}

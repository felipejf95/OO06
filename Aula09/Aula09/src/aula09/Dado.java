package aula09;

import java.util.Scanner;

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
    Scanner leitura = new Scanner(System.in);

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
    
    
    public void rolarNovamente(){
        int [] auxiliar  = new int [5];
        System.out.println("Digite o 1 se quiser rolar os dado novamente:");
            for (int i=1; i<6; i++){
                System.out.println("Dado: " + i);
                auxiliar[i] = leitura.nextInt();
            }
    }
    
    public void dadosGirar(int [] auxiliar){
         for (int i = 0; i < 5; ++i) {
            if(auxiliar[i] == 1){
            //   dados[i].rolarDados; 
            }
        }
    
    }
}

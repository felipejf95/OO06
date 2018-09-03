/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogobozo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Dado {
    int faces[] = new int[6];
    int numFaces = 6;
    int face;
    
    public Dado(int n){
        this.numFaces = n;
        faces = new int[n];
    }    
    
    public void rolarDados(){        
            face = new Random().nextInt(6)+1;      
    }
    
    public void exibirFaces(){
            System.out.println(face);
        }
    }
    


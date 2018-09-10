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
    private int face;
        
    public int rolarDados(){        
            return face = new Random().nextInt(6)+1;      
    }
    
    public String imprimeDado(int face){
            switch(face){
                case 1: 
                    return ".";
                case 2:
                    return ":";
                case 3:
                    return ":.";
                case 4:
                    return "::";
                case 5:
                    return "::.";
                case 6: 
                    return ":::";
                
                default:
                    return ("");
            }
        }
    }
    


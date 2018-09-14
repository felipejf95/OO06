/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;

import java.util.Random;

/**
 *
 * @author ice
 */
public class Dado {
    int face;
    
    
    public void sorteiaDado(){
        this.face = new Random().nextInt(6)+1;
    }

    public int getFace() {
        sorteiaDado();
        return face;
    }
}

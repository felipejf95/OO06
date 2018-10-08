/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author ice
 */
public class Calculadora {
    public static float divisao(int a, int b){
        float x = 0;
        try{
           x = a/b;
        } catch(ArithmeticException e){
             System.out.println("Erro!!! Divisão por 0!"+e.getLocalizedMessage());
        }
        return x;
    }
    
    public void percorrer(int a){
        int vet[] = new int[2];        
        try{
            for(int i=0; i<3; i++){
                vet[i] = i+1;
                System.out.println("Posicao "+i+" :"+vet[i]);
                System.out.println("Divindo "+vet[i]+" por "+a);
                int c = vet[i]/a;
            }
           
        } catch (ArithmeticException e){
            System.out.println("Erro!!!"+e.toString());
            
        }
    }   
    
     public void percorrer2(int a){
        int vet[] = new int[2];        
        for(int i=0; i<3; i++){
            try{            
                vet[i] = i+1;
                System.out.println("Posicao "+i+" :"+vet[i]);
                System.out.println("Divindo "+vet[i]+" por "+a);
                int c = vet[i]/a;
            }           
            catch (ArithmeticException e){
                System.out.println("Erro!!!"+e.toString());            
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Erro!!!"+e.toString());
            }
            catch (Exception e){
                System.out.println("Erro!!!"+e.toString());
            }
        }
    }
}


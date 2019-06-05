/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

import java.util.Random;

/**
 *
 * @author CC08767674984
 */
public class Gerencia {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random criarProcesso = new Random();
        Processo processo = new Processo();
        
        while(true){
            int x = criarProcesso.nextInt(10);
            if (x == 1){
                processo.processo1();
            }
            else if (x == 2){
                
                processo.processo2();
            } 
            else if (x == 3){
                processo.processo3();
            }
            else if (x == 4){
                processo.processo4();
            } 
            else if (x == 5){
                processo.processo5();
            } 
            else if (x == 6){
                processo.processo6();
            }
            else if (x == 7){
                processo.processo7();
            } 
            else if (x == 8){
                processo.processo8();
            }
            else if (x == 9){
                processo.processo9();
            } 
            else if (x == 10){
                processo.processo10();
            } 
        }
        
    }
    
   
   
    
}

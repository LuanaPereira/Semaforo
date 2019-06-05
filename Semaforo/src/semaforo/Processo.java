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
public class Processo {
     Random rMemoria = new Random();
     RegiaoCritica memoria = new RegiaoCritica();
     
     public void processo1(){
        int x = rMemoria.nextInt(20);
        int timeSharing = 10;
         if (memoria.regiaoCritica.size() >= 1000){
                System.out.println("Memoria cheia");
                return;

            }
        for(int i=0; i<timeSharing; i++){
            memoria.regiaoCritica.add(x);
            System.out.println("Processo 1 insere na regiao critica os numeros: " + x);
        }
    }
    public void processo2(){
        int x = rMemoria.nextInt(20);
        int timeSharing = 10;
         if (memoria.regiaoCritica.size() >= 1000){
                System.out.println("Memoria cheia");
                return;

            }
        for(int i=0; i<timeSharing; i++){
             memoria.regiaoCritica.add(x);
               System.out.println("Processo 2 insere na regiao critica os numeros: " + x);
        }
    }
    public void processo3(){
        int x = rMemoria.nextInt(20);
        int timeSharing = 10;
         if (memoria.regiaoCritica.size() >= 1000){
                System.out.println("Memoria cheia");
                return;

            }
        for(int i=0; i<timeSharing; i++){
             memoria.regiaoCritica.add(x);
               System.out.println("Processo 3 insere na regiao critica os numeros: " + x);
        }
    }
    public void processo4(){
        int x = rMemoria.nextInt(20);
        int timeSharing = 10;
         if (memoria.regiaoCritica.size() >= 1000){
                System.out.println("Memoria cheia");
                return;

            }
        for(int i=0; i<timeSharing; i++){
           
             memoria.regiaoCritica.add(x);
               System.out.println("Processo 4 insere na regiao critica os numeros: " + x);
        }
    }
    public void processo5(){
        
        int x = rMemoria.nextInt(20);
        int timeSharing = 10;
         if (memoria.regiaoCritica.size() >= 1000){
                System.out.println("Memoria cheia");
                return;

            }
        for(int i=0; i<timeSharing; i++){
           
            memoria.regiaoCritica.add(x);
              System.out.println("Processo 5 insere na regiao critica os numeros: " + x);
        }
    }
    public void processo6(){
        int x = rMemoria.nextInt(20);
        int timeSharing = 10;
        if (memoria.regiaoCritica.size() == -1){
            System.out.println("Não ha processo para ser removido");
            return;
        }
        for(int i=0; i<timeSharing; i++){
            
            memoria.regiaoCritica.remove(x);
            System.out.println("Processo 6 remove na regiao critica os numeros: " + x);
        }
    }
    public void processo7(){
        int x = rMemoria.nextInt(20);
        int timeSharing = 10;
        if (memoria.regiaoCritica.size() == -1){
                System.out.println("Não ha processo para ser removido");
                return;
            }
        for(int i=0; i<timeSharing; i++){
            
            memoria.regiaoCritica.remove(x);        
              System.out.println("Processo 7 remove na regiao critica os numeros: " + x);
        }
    }
    public void processo8(){
        int x = rMemoria.nextInt(20);
        int timeSharing = 10;
        if (memoria.regiaoCritica.size() == -1){
                System.out.println("Não ha processo para ser removido");
                return;
            }
        for(int i=0; i<timeSharing; i++){
           memoria.regiaoCritica.remove(x);
             System.out.println("Processo 8 remove na regiao critica os numeros: " + x);
        }
    }
    public void processo9(){
        int x = rMemoria.nextInt(20);
        int timeSharing = 10;
        if (memoria.regiaoCritica.size() == -1){
                System.out.println("Não ha processo para ser removido");
                return;
            }
        for(int i=0; i<timeSharing; i++){
           
            memoria.regiaoCritica.remove(x);
              System.out.println("Processo 9 remove na regiao critica os numeros: " + x);
        }
    }
    public void processo10(){
        int x = rMemoria.nextInt(20);
        int timeSharing = 10;
        if (memoria.regiaoCritica.size() == -1){
                System.out.println("Não ha processo para ser removido");
                return;
            }
        for(int i=0; i<timeSharing; i++){
            memoria.regiaoCritica.remove(x);
              System.out.println("Processo 10 remove na regiao critica os numeros: " + x);
        }
    }
}

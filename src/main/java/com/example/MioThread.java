package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class MioThread extends Thread{
    Socket s;
    Note n;

     public MioThread(Socket s,Note n){
        this.s=s;
        this.n=n;
     }
     public void run(){
         
        try {
            BufferedReader in= new BufferedReader(new InputStreamReader(s.getInputStream()));
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            
            String scelta;
            String messaggio;
            String aggiungi;
             String nota;
            
            do{
                int numero=0;
                scelta=in.readLine();
                if(scelta.equals("!")){
                    s.close();
                    break;
                }else if(scelta.equals("?")){
                   
                   //note++;
                   numero++;
                   String numeroN=Integer.toString(numero);
                   out.writeBytes(numeroN+"\n");
                   //out.writeBytes(messaggio+"\n");

                   // il numero delle note
                    
                   // iterare sull'arraylist ed inviare ogni singola nota memoraizzata
                   
                }else{
     

          
                    // salvare la nota nell'arraylista
                    nota=in.readLine();
                    aggiungi=n.aggiungi(nota);
                    // rispondere con OK
                    out.writeBytes("OK\n");
                }

            }while(true);




        } catch (IOException e) {
            
            e.printStackTrace();
        }
     }
    
}

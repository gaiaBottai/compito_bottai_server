package com.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("server partito...");
        ServerSocket s1=new ServerSocket(3000);

        do{
           Socket s= s1.accept();
           Note n=new Note();
           MioThread t= new MioThread(s,n);
         t.start();
        }while(true);
    }
}
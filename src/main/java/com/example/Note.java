package com.example;


import java.util.ArrayList;
public class Note {
    
    ArrayList array=new ArrayList<String>();

    public Note(){
        this.array=new ArrayList<String>();
    }

    public String aggiungi(String note){
        array.add(note);
                return "aggiunta";
        
    }
}

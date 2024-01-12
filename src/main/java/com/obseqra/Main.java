package com.obseqra;

import com.obseqra.services.XMLReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        XMLReader reader = new XMLReader ();
        try {
            reader.read ( "/sample.xlsx" );
        } catch (IOException e) {
            System.out.println ("File not found exception");
            throw new RuntimeException ( e );
        }
    }
}








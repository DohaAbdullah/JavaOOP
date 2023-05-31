package com.exceptions.examples;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FinallyBlockEx {
    public static void main(String[] args) {
         readFile("D//:doha-info.txt");
    }

    static void readFile(String filePath){
        try{
            FileReader reader = new FileReader(filePath);
        } catch(FileNotFoundException e) {
            System.out.println(e);
        }

    }
}

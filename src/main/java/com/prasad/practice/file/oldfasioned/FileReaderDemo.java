package com.prasad.practice.file.oldfasioned;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {
    public static final String FILE_PATH="C:\\Users\\prasa\\Downloads\\FileDemo\\";
    public static final String FILE_NAME="text.txt";
    public static void main(String[] args) {
        BufferedReader buffer =null;
        try {

            Reader filereader= new FileReader(FILE_PATH + FILE_NAME);
            buffer = new BufferedReader(filereader);
            System.out.println("=================start of file=====================");
            String strCurrentLine;
            while ((strCurrentLine=buffer.readLine())!=null){
                System.out.println(strCurrentLine);
            }
            System.out.println("==============end of file===============");
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.getStackTrace();
        }
        finally {
            try {
                if (buffer != null)
                    buffer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

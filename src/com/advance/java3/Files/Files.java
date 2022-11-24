package com.advance.java3.Files;

import java.io.*;

public class Files {
    public static void main(String[] args) {
        File file = new File("hello1.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int c =  fileInputStream.read();
            while (c!=-1){
                System.out.print((char) c);
                c =  fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*File file = new File("hello1.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("Hello from java".getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


       /* File file = new File("hello.txt");
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader(file);
               *//* System.out.print((char) fileReader.read());
                System.out.print((char) fileReader.read());
                System.out.print((char) fileReader.read());
                System.out.print((char) fileReader.read());*//*

                int c = fileReader.read();
                //System.out.println(c);
                while (c!=-1){
                    //c = (char) fileReader.read();
                    System.out.print((char) c);
                    c=  fileReader.read();
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("NO exist file ");
        }
*/



        /*try {
         *//* File file = new File("hello.txt");
           System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.getAbsolutePath());
            if(file.exists()){
                System.out.println("Yes");
            }else {
                file.createNewFile();
            }*//*
            //File file = new File("hello.txt");
            FileWriter fileWriter = new FileWriter("hello.txt" );
            fileWriter.write("Hello from java\n");
            char[] cc = {'a', 'b', 'c'};
            fileWriter.write(cc);
            fileWriter.write(70);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
    }
}

package lab9;

import sun.awt.FwDispatcher;

import java.io.*;

public class myfileDemo {
    public static void main(String[] args) {

        File myfile = new File("D:\\360411760009\\src\\lab9\\mit.txt");
        try {
            if (myfile.createNewFile())
                System.out.println("New File is created.");
            else
                System.out.println("File is a already exited");
        } catch (IOException e) {
            e.printStackTrace();
        }
           //System.out.println("Done.");

        writeMyFile (myfile);
        readMyFile (myfile);




    }//main

    private static void readMyFile(File myfile) {
        FileReader r = null;

        try {
            r = new FileReader(myfile);

        int i;
        while ((i = r.read()) !=-1 ) {
            System.out.print((char) i);
        }
    }catch (FileNotFoundException e){
        e.printStackTrace();
    }catch (IOException e){
            e.printStackTrace();
        }

    }

    private static void writeMyFile(File myFile) {
        Writer w = null;
        try {
             w = new FileWriter (myFile,true);
             String content = " may Numtip";
             w.write(content);
             System.out.println("Done");
        }catch ( IOException ex){
            ex.printStackTrace();
        }finally {
            try{
                w.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }






    }//writeMyFile
}//class

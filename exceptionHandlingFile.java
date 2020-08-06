package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.channels.FileLockInterruptionException;

public class exceptionHandlingFile {
    public static void main(String [] Args) {
//
//        File file  = new File("test.txt");
//        FileReader filereader = new FileReader(file);

            try {
                System.out.println("Inside try");
                readFile();
                System.out.println("Excecution begins here");
            }catch(FileNotFoundException e) {
                System.out.println("File doesn't exist");
            }
              System.out.println("Outside main");

    }
//    public static void main(String [] Args){
//
//            File file  = new File("test.txt");
//        try {
//            FileReader filereader = new FileReader(file);
//            System.out.println("Before Catch block");
//        } catch (FileNotFoundException e) {
//            //e.printStackTrace();
//            System.out.println("File doesn't exist");
//        }
//        System.out.println("After Try/Catch block");
//    }

    public static void readFile() throws  FileNotFoundException{

        System.out.println("Inside method");
        File file  = new File("test.txt");
        FileReader filereader = new FileReader(file);
        System.out.println("Back to main");

    }


}



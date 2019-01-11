package domashkaSFiles;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreationOfFiles {
    public static void main(String[] args) throws Exception  {
        byte bute = 100;
        try {
            File file = new File("file2.txt");
            FileWriter fileWriter1 = new FileWriter(file);

            if (file.length()>bute){
                throw new IllegalStateException();
            }

        } catch (IllegalStateException io) {
            System.out.println("Code is too big");
        }
        FileReader fileReader = new FileReader("file2.txt");
        if (fileReader==null){
            System.out.println("File has not been");
        }
    }
}

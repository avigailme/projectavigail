package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Files {

    public static void main(String[] args) throws Exception {

        FileWriter fileWriter = new FileWriter("file 1.txt");
        fileWriter.write("Hello People");
        File file = new File("File.txt");
        FileWriter fileWriter1 = new FileWriter(file);
        String string = "";
        for (char z = 'A'; z <='Z'; z++) {
            string+=(z+"\n");
            //fileWriter.write( "  "+z);
        }
        fileWriter.write(string);

        for (int c = 0; c <=12;  c++) {
            fileWriter.write("  "+Integer.toString(c));
        }
        fileWriter.close();
        FileReader fileReader = new FileReader("file 1.txt");
     //

        Scanner scanner = new Scanner(fileReader);
        File filecopy = new File("div3.txt");
        FileWriter filenew = new FileWriter(filecopy);
        String every3rd = null;
        int i = 1;
        while(scanner.hasNextLine()) {
            if (i%3==0 && i>0){
                System.out.println(scanner.nextLine());
            }
            i++;
            filenew.write(every3rd);
            filenew.close();
           /* for (char z = 'A'; z <='Z'; z++) {
                System.out.println("  "+z);
            }*/
        }
        fileReader.close();

    }
}

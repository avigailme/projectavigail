package praticeOOP;

import javax.swing.*;
import java.awt.*;

public class ChessTest extends Canvas {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();

        Shashka shashka = new Shashka();

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(shashka);
        frame.setVisible(true);
        int[] arr = shashka.temparrayX;
        int[] arrTwo = shashka.temparrayY;
        System.out.println(arr + "" + arrTwo);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        for (int i = 0; i < arrTwo.length; i++) {
            System.out.println(arrTwo[i]);
        }


      /*  for (int i = 0; i < 8  ; i++) {
            for (int j = 0; j <8 ; j++) {
                Rectangle rectangle = new Rectangle(2, Color.GRAY);
                chessBoard.populate(i,j, rectangle);
                System.out.println( rectangle.speak());
            }

        }
        System.out.println(Rectangle.getCountTheCreation());
    }*/
    }
}
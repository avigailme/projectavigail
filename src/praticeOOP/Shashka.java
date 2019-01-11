package praticeOOP;

import javax.swing.*;
import java.awt.*;

import static praticeOOP.Zalivka.PI_C;

public class Shashka extends Canvas{
    public static int temparrayX[]= new int[8];
    public static int temparrayY[]= new int[8];

    public void paint(Graphics graphics) {
        Graphics g=(Graphics)graphics;
        ChessBoard chessBoard[][] = new ChessBoard[8][8];

        int b=0;
        int b1=0;
        for (int i = 0; i < 8  ; i++) {
            b=0;
            b1=b1+50;
            for (int j = 0; j <8 ; j++) {
                b=b+50;
                g.drawRect(b, b1,50,50);
                if((i+j)%2==0){
                    g.drawRect(b, b1,50,50);
                    g.setColor(Color.PINK);
                    g.fillRect(b, b1,50,50);
                    if ((i<3)||(i>4)){
                        g.setColor(Color.BLACK);
                        //g.fillRect(b, b1,20,20);
                        g.fillOval(b+7, b1+7,30,30);
                        g.drawOval(b+7, b1+7,30,30);
                        System.out.println(i+" "+j);
                    }
                    temparrayX[i] = i;
                    temparrayY[i] = j;
                }
            }
        }
        System.out.println(Rectangle.getCountTheCreation());
    }
    public static void main(String[] args) {
        Shashka canvas = new Shashka();
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }

    static void drawCircle(Graphics graphics, Color color,
                           int radius, int x, int y, String rusColor){
        graphics.setColor(color); // Нас интересует только этот блок,
        graphics.fillOval(x, y, radius, radius); // Остальное магия…
        System.out.printf("%s площадь = %s , длина = %s",
                rusColor, PI_C * Math.pow(radius, 2), 2*PI_C*radius);
    }

}

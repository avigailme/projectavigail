package praticeOOP;
        import java.awt.*;
        import javax.swing.*;

public class Zalivka extends Canvas {
    public Zalivka() {
    }

    public static final double PI_C = 3.14;
    public void paint(Graphics graphics) {
        Graphics g=(Graphics)graphics;
            ChessBoard chessBoard = new ChessBoard();
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
                    }
                   // Rectangle rectangle = new Rectangle(50, Color.GRAY);
                   // graphics.setColor(Color.BLACK);
                 // graphics.fillRect(rectangle.getWidth(),rectangle.getWidth() ,rectangle.getHeight(), rectangle.getHeight());
                   // drawCircle(graphics,Color.BLUE,50,100, 50, "Blue");
                   /* Rectangle rectangle = new Rectangle(2, Color.GRAY);
                    chessBoard.populate(i,j, rectangle);
                    System.out.println( rectangle.speak());*/
                }

            }
            System.out.println(Rectangle.getCountTheCreation());
        }
      /*  drawCircle(graphics,Color.BLUE,50,100, 50, "Blue");
        drawCircle(graphics,Color.RED,30,200, 50, "Red");
        drawCircle(graphics,Color.green,40,150, 30, "Green");*/


    public static void main(String[] args) {
        Zalivka canvas = new Zalivka();
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
                rusColor, Zalivka.PI_C * Math.pow(radius, 2), 2*PI_C*radius);
    }
}

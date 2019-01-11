package praticeOOP;


import java.awt.*;

final public class Rectangle extends Figure {
    int height;
    int width;
    static int countTheCreation;
    Color color;

    public Rectangle(int x, int y) {
        this.height = x;
        this.width = y;
        countTheCreation++;
    }

    public static int getCountTheCreation() {
        return countTheCreation;
    }

    public static void setCountTheCreation(int countTheCreation) {
        Rectangle.countTheCreation = countTheCreation;
    }

    public Rectangle(int x, Color color) {
        this.height = x;
        this.width = x;
        this.color = color;
        countTheCreation++;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String speak() {

        if (height==width&&height!=0) {
            return "Squre{"
                    ;
        }
        else {
            return "Rect{";}


    }
}




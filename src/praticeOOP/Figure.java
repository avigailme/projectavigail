package praticeOOP;

import java.awt.*;

public abstract  class Figure {
    Color color;
    LocationOfFigure locationOfFigure;
    boolean Isvisible;

    public String speak() {
        return "Figure{" +
                "color=" + color +
                ", locationOfFigure=" + locationOfFigure +
                ", visible=" + Isvisible +
                '}';
    }
}


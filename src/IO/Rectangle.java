package IO;

import java.util.Scanner;

/*
 *  Rectangle
 */
public class Rectangle extends Forme {
    public float width, height;

    public Rectangle(float x, float y, float w, float h) {
        super(x, y);
        width = w;
        height = h;
    }

    public String serialize() {
        return "rectangle " + x + " " + y + " " + width + " " + height;
    }

    public static  Rectangle deserialize(Scanner input) {
        return new Rectangle(
            input.nextFloat(), input.nextFloat(), input.nextFloat(), input.nextFloat()
        );
    }

    public String toString() {
        return "Rectangle {(" + x + ", " + y + "), (" + width + ", " + height + ")}";
    }
}

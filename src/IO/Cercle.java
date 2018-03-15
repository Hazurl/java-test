package IO;

import java.util.Scanner;
import javafx.scene.shape.Circle;

/*
 *  Cercle
 */
public class Cercle extends Forme implements IOSerialize {
    public float radius;

    public Cercle(float x, float y, float r) {
        super(x, y);
        radius = r;
    }

    public String serialize() {
        return "cercle " + " " + x + " " + y + " " + radius;
    }

    public static Cercle deserialize(Scanner input) {
        return new Cercle(
            input.nextFloat(), input.nextFloat(), input.nextFloat()
        );
    }

    public String toString() {
        return "Cercle {(" + x + ", " + y + "), " + radius + "}";
    }
}

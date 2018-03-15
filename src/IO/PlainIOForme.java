package IO;

import java.io.*;
import java.util.*;

/*
 *  PlainIOForme
 */
public class PlainIOForme implements IOForme {

    public void save(Collection<Forme> formes, String filename) throws IOException {
        FileWriter f = new FileWriter(filename);
        PrintWriter out = new PrintWriter(f);

        for (Forme forme : formes) {
            out.println(forme.serialize());
        }

        out.close();
        f.close();

    }

    public Collection<Forme> read(String filename) throws IOException {
        Collection<Forme> formes = new ArrayList<>();
        File f = new File(filename);
        Scanner scanner = new Scanner(f);
        while(scanner.hasNextLine()) {
            String clss = scanner.next();
            System.out.println("read \"" + clss + "\"");
            switch(clss) {
                case "rectangle":
                    formes.add(Rectangle.deserialize(scanner));
                    break;
                case "cercle":
                    formes.add(Cercle.deserialize(scanner));
                    break;
                default:
                    System.out.println("Unknown class");
            }
        }
        return formes;
    }

}

package IO;

import java.util.Collection;
import java.io.IOException;
import java.util.ArrayList;

/*
 *  IOForme
 */
public interface IOForme {

    public void save(Collection<Forme> formes, String filename) throws IOException;
    public Collection<Forme> read(String filename) throws IOException;

	public static void main(String[] args) {
        Collection<Forme> formes = new ArrayList<Forme>();
        formes.add(new Rectangle(1, 2, 3, 4));
        formes.add(new Cercle(5, 6, 7));

        PlainIOForme io = new PlainIOForme();

        try {
            io.save(formes, "formes.txt");
        } catch(IOException e) {}

        Collection<Forme> output = null;
        try {
            output = io.read("formes.txt");
        } catch(IOException e) {}
        for (Forme forme : output) {
            System.out.println(forme);
        }
    }
}

package Comparable;

import java.util.ArrayList;
import java.util.Collections;

/*
 *  Course
 */
public final class Course {
    
    private int distance;
    private String name;

    private ArrayList<Resultat> results;

    Course(String name, int distance) {
        this.distance = distance;
        this.name = name;
        results = new ArrayList<>();
    }

    public final int get_distance() {
        return distance;
    }

    public final String get_name() {
        return name;
    }

    public final ArrayList<Resultat> get_results() {
        return results;
    }

    public final void add_result(Coureur coureur, int time) {
        results.add(new Resultat(coureur, time));
    }

    public final String toString() {
        Collections.sort(results);

        String str = new String();
        for (Resultat res : results) {
            str += res.toString() + '\n';
        }
        return str;
    }

    public static void main(String[] args) {
        Course c = new Course("Course A", 2000);
        c.add_result(new Coureur("Lennon", "John"), 550);
        c.add_result(new Coureur("Hendrix", "Jimmy"), 480);
        c.add_result(new Coureur("Personne", "A"), 520);
        System.out.println(c.toString());
    }

}

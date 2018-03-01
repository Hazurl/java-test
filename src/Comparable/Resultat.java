package Comparable;

/*
 *  Resultat
 */
public final class Resultat implements Comparable<Resultat> {
    
    private final int time;
    private final Coureur coureur;

    Resultat(Coureur coureur, int time) {
        this.time = time;
        this.coureur = coureur;
    }

    public final int get_time() {
        return time;
    }

    public Coureur get_coureur() {
        return coureur;
    }

    public final String toString() {
        return coureur.get_name() + coureur.get_surname() + " [" + coureur.get_number() + "] : " + time + "s";
    }

    public final int compareTo(Resultat r) {
        return Integer.compare(get_time(), r.get_time());
    }
}

package Thread;

import java.util.Date;

/*
 *  CompteARebours
 */
public class CompteARebours {

    Date debut, fin;

	public CompteARebours(long delai) {
        debut = new Date();
        fin = new Date(debut.getTime() + delai);
    }

    synchronized public Date get_date_fin() {
        return fin;
    }

    synchronized public void set_date_fin_long(long l) {
        fin = new Date(l);
    }

    synchronized public void maj_date_fin_long(long l) {
        set_date_fin_long(get_date_fin().getTime() + l);
    }

    synchronized public long get_temps_restant() {
        return fin.getTime() - new Date().getTime();
    }
}

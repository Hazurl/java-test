package Thread;

/*
 *  Equipe
 */
public class Equipe extends Thread {

    String nom;
    long t_reflexion, t_retard;
    CompteARebours car;

	public Equipe(String nom, CompteARebours car) {
        super(nom);
        this.nom = nom;
        this.car = car;
        set_random_reflexion();
    }

    public void reflexion() {
        try {
            sleep(t_reflexion);
        } catch(InterruptedException e) {}
        car.maj_date_fin_long(t_retard);
    }

    public void run() {
        while(car.get_temps_restant() > 0) {
            reflexion();
            if (isInterrupted())
                return;
            synchronized (System.out) {
                System.out.println(nom + " a pris " + t_reflexion + 
                "ms de reflexion puis à ajouter " + t_retard + "ms de retard");
            }
            set_random_reflexion();
        }
    }

    void set_random_reflexion() {
        t_reflexion = (long)(Math.random() * 8000);
        t_retard = (long)(Math.random() * t_reflexion / 2);
    }

}

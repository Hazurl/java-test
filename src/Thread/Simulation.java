package Thread;

import java.sql.Date;

/*
 *  Simulation
 */
public class Simulation {
	public static void main(String[] args) {
        CompteARebours car = new CompteARebours(10000);
        Equipe meteo = new Equipe("Meteo", car);
        Equipe securite = new Equipe("Securite", car);

        meteo.start();
        securite.start();

        while(car.get_temps_restant() > 0) {
            synchronized (System.out) {
                System.out.println(Math.round(car.get_temps_restant() / 1000.) + "...");
            }
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
        }
        System.out.println("Decollage !");
        meteo.interrupt();
        securite.interrupt();
        try {
            meteo.join();
        } catch(InterruptedException e) {}
        try {
            securite.join();
        } catch(InterruptedException e) {}
    }
}

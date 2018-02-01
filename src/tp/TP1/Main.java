package tp.TP1;

import tp.TP1.Vehicule.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Voiture twingo = new Voiture("Twingo", 2018, 10000, "AB123CD", "B", false);
        twingo.print();
        System.out.println();
        System.out.println("Rent price of the twingo : " + twingo.get_rent_price());

        Camion j9 = new Camion("J9", 2008, 20000, "1234AB56", "B", 25);
        j9.print();
        System.out.println();
        System.out.println("J9 can transport 7 m3 ? " + j9.can_transport(7));
        System.out.println("Rent price of the j9 : " + j9.get_rent_price());

        Autocar fri = new Autocar("FRI", 2005, 90000, "123AB45", "D", 3, 53);
        fri.print();
        System.out.println();
        System.out.println("FRI can transport 40 passengers with 0.1m3 each ? " + fri.can_transport(40, 0.1f));


        System.out.println();
    }
}
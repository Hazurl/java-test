package TD2;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.print("Hello world !\n");
        Autocar v = new Autocar();
        v.prix = 1000;
        v.annee_achat = 2000;
        v.volume = 12.2f;
        v.seat_count = 30;
        System.out.println(v.age());
        System.out.println(v.get_rent_price());
        System.out.println(v.volume);
        System.out.println(v.seat_count);
    }
}
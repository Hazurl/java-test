package TD2.Vehicule;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.print("Hello world !\n");
        Autocar v = new Autocar("Bus deluxe", 2016, 68000, "ZX855AB", "C", 16, 40);
        System.out.println(v.age());
        System.out.println(v.get_rent_price());

        v.print();
        System.out.println();
    }
}
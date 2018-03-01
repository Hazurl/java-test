package Convertion;

/*
 *  IConvertibleInteger
 */
public interface IConvertibleInteger {
    int to_int();
    
    public static void main(String[] args) {
        Chaine c = new Chaine("456");
        Compte b = new Compte("Michel");
        b.deposer(42);
        Reel r = new Reel(4.556);
        Date d = new Date(15, 12, 1998);

        System.out.println(c);
        System.out.println(b);
        System.out.println(r);
        System.out.println(d);
    }
}

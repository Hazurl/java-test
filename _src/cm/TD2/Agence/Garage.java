package cm.TD2.Agence;

/**
 * Garage
 */
public class Garage extends Agence {

    private int mechanic_count;

    public Garage() {
        super();
        this.mechanic_count = 0;
    }

    public void add_mechanic(int m) {
        this.mechanic_count += m;
    }

    public void set_mechanic_count(int m) {
        this.mechanic_count = m;
    }

    public void remove_mechanic(int m) {
        this.mechanic_count = Math.max(this.mechanic_count - m, 0);
    }

    public int get_mechanic_count() {
        return this.mechanic_count;
    }

    public int personels_count() {
        return super.personels_count() + this.mechanic_count;
    }

    public int personels_not_admin_count() {
        return super.personels_not_admin_count() + this.mechanic_count;
    }

    @Override
    public void afficher() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Garage – Angers sud –­ 0241234567 –" 
        + get_admin_count() + " adm – " + mechanic_count + "meca";
    }

}
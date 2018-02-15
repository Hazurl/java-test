package cm.TD2.Agence;

/**
 * Agence
 */
public abstract class Agence {

    private String name;
    private String phone_num;
    private int admin_count;

    Ensemble<String> comments;

    public Agence() {
        this.admin_count = 0;
        this.comments = new Ensemble<String>(); 
    }

    public void add_admin(int a) {
        this.admin_count += a;
    }

    public void set_admin_count(int a) {
        this.admin_count = a;
    }

    public void remove_admin(int a) {
        this.admin_count = Math.max(this.admin_count - a, 0);
    }

    public int get_admin_count() {
        return this.admin_count;
    }

    public void add_comment(String comment) {
        this.comments.add_element(comment);
    }

    public int personels_count() {
        return this.admin_count;
    }

    public int personels_not_admin_count() {
        return 0;
    }

    public String get_name() {
        return name;
    }

    public abstract void afficher();

    public int categorie() {
        int nb = personels_count();
        if (nb > 19)
            return 3;
        if (nb > 9)
            return 2;
        return 1;
    }

    public Agence compareTo(Agence other) {
        return other.personels_count() > personels_count() ? other : this;
    }
    
}
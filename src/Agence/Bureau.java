package Agence;

import Structures.Ensemble;

/**
 * Bureau
 */
public class Bureau extends Agence {

    private Ensemble<Garage> garages;
    
    private int salesman_count;

    public Bureau() {
        this.salesman_count = 0;
    }

    public void add_salesman(int s) {
        this.salesman_count += s;
    }

    public void set_salesman_count(int s) {
        this.salesman_count = s;
    }

    public void remove_salesman(int s) {
        this.salesman_count = Math.max(this.salesman_count - s, 0);
    }

    public int get_salesman_count() {
        return this.salesman_count;
    }

    public int personels_count() {
        return super.personels_count() + this.salesman_count;
    }

    public int total_mechanics_count() {
        int count = super.personels_count() + this.salesman_count;
        for (Garage garage : this.garages) {
            count += garage.personels_count();
        }
        return count;
    }

    public int personels_not_admin_count() {
        return super.personels_not_admin_count() + this.salesman_count;
    }

    public boolean add_garage(Garage garage) {
        if (this.garages.size() < 4) {
            this.garages.add_element(garage);
            return true;
        }
        return false;
    }

    public boolean remove_garage(Garage garage) {
        int old_size = this.garages.size();
        this.garages.remove_element(garage);
        return this.garages.size() < old_size;
    }

    public int garage_count() {
        return this.garages.size();
    }

    @Override
    public void afficher() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Bureau de location – Angers – 0241123456 – " 
        + get_admin_count() + " adm – " + salesman_count + " comm";
    }

    public void afficherGarages(int cat) {
        System.out.println("Garage de catégorie >= " + cat + " du " + this);
        for (Garage garage : garages) {
            if (garage.categorie() >= cat)
                System.out.println(garage);
        }
    }

}
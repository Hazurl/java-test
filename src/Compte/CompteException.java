package Compte;

/**
 * CompteException
 */
public class CompteException extends Exception {

    private static final long serialVersionUID = 1L;
	private int id;
    private String message;

    CompteException(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public String get_message() {
        return message;
    }

    public int get_id() {
        return id;
    }
    
}
package IO;

/*
 *  Forme
 */
public abstract class Forme implements IOSerialize {
	public float x, y;

    public Forme(float x, float y) {
        this.x = x;
        this.y = y;
    }
}

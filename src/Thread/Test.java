package Thread;

/**
 * A
 */
class A extends Thread {
    public void run() {
        for(int i = 0; i < 8; ++i) {
            System.out.print("A" + i + " ");
            try {
                sleep(100);
            } catch(InterruptedException e) {}
        }
    }
}
/**
 * B
 */
class B extends Thread {
    public void run() {
        for(int i = 0; i < 8; ++i) {
            System.out.print("B" + i + " ");
            try {
                sleep(200);
            } catch(InterruptedException e) {}
        }
    }
}

/*
 *  Test
 */
public class Test {
	public static void main(String[] args) {
        new A().start();
        new B().start();
    }
}

package Exception;


import java.util.Scanner;


/*
 *  EssaiException
 */
public class EssaiException {
	public static void main(String[] args) {
		int a,b,res;
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("a = ");
		a=clavier.nextInt();
		System.out.print("b = ");
		b=clavier.nextInt();
		clavier.close();
		
		res=a/b; // division entière
		
		System.out.println(a+"/"+b+"="+res);
		
		System.out.println("Fin du programme.");
	}
}

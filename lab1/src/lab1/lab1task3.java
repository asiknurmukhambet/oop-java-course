package lab1;
import java.util.Scanner;

public class lab1task3 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		Grade(a);
	}
	public static void Grade(int a) {
		if(a<0 || a>100) System.out.println("Error!");
		else if(a<=24) System.out.println('F');
		else if(a<=49) System.out.println("FX");
		else if(a<=54) System.out.println("D-");
		else if(a<=59) System.out.println("D+");
		else if(a<=64) System.out.println("C-");
		else if(a<=69) System.out.println("C");
		else if(a<=74) System.out.println("C+");
		else if(a<=79) System.out.println("B-");
		else if(a<=84) System.out.println("B");
		else if(a<=89) System.out.println("B+");
		else if(a<=94) System.out.println("A-");
		else if(a<=100) System.out.println("A");
	}
}
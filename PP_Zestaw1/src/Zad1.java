/* Napisaæ program s³u¿¹cy do konwersji wartoœci temperatury podanej w stopniach
 * Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
 * Celsjusza + 32.0)
*/

package src;
import java.util.Scanner;

public class Zad1
{
	public static void main (String[] args)
	{
		// Celsjusz - c, Fahrenheit - f
	
		double c;
		double f;
		Scanner stopnie = new Scanner(System.in);
		System.out.println("Podaj wartoœæ temperatury w stopniach Celsjusza");
		c = stopnie.nextDouble();
		
		f = (c*9/5)+32.0;
		
		
	//	double c = 23.7;
	//	double f = (c*9/5)+32.0;
		 
		System.out.println(c + " stopni Celsjusza = " + f + " stopni Fahrenheita");
		stopnie.close();
	}
}

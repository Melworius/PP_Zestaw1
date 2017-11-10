/* Napisaæ  program, który oblicza wartoœæ  wspó³czynnika BMI (ang. body mass index) 
 * wg. wzoru: waga/wzrost^2 . Je¿eli wynik jest w przedziale (18,5 - 24,9) 
 * to wypisuje ”waga prawid³owa”, je¿eli poni¿ej to ”niedowaga”, je¿eli powy¿ej ”nadwaga”.
*/
import java.util.Scanner;

public class Zad3
{
	 public static void main(String[] args)
	 {
		 // k - waga (kg), c - wzrost (cm), b - BMI (kg/cm^2)
		 
		 double k;
		 double c;
		 double b;
		 
		 	Scanner dane = new Scanner(System.in);
	        System.out.println("Podaj wagê");
	        
	        k = dane.nextDouble();
	        System.out.println("Podaj wzrost");
	        
	        c = dane.nextDouble();
	        
	        b = k/Math.pow(c, 2);
	        if (b < 18.5)
	        {
	            System.out.println("Niedowaga");
	        } 
	        else
	        {
	            if (b < 24.9)
	            {
	                System.out.println("Waga Prawid³owa");
	            }
	            else
	            {
	                System.out.println("Nadwaga");
	                dane.close();
	            }
	        }
	    }
}

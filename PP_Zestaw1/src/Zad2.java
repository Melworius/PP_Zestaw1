/* Wczytaæ od u¿ytkownika 3 liczby ca³kowite i wypisaæ na ekran 
 * najwiêksz¹ oraz najmniejsz¹ z nich.
*/
package src;

import java.util.Scanner;

public class Zad2 
{
	public static void main (String[] args)
	{
		int a;
		int b;
		int c;
		
		Scanner liczba = new Scanner(System.in);
		
		System.out.println("Podaj liczbê a");
		a = liczba.nextInt();
		System.out.println("Liczba a to " + a);
		
		System.out.println("Podaj liczbê b");
		b = liczba.nextInt();
		System.out.println("Liczba b to " + b);
		
		System.out.println("Podaj liczbê c");
		c = liczba.nextInt();
		System.out.println("Liczba c to " + c);
		
		 int max = Math.max(Math.max(a, b), c);
		 System.out.print("Najwiêksza liczba to " + max);
		 int min = Math.min(Math.min(a, b), c);
		 System.out.print(", a najmniejsza liczba to " + min);
		 liczba.close();
	}
		
}

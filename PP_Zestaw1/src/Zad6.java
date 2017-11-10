/* Napisaæ program realizuj¹cy funkcje prostego kalkulatora, pozwalaj¹cego na wykonywanie operacji dodawania, 
 * odejmowania, mno¿enia i dzielenia na dwóch liczbach rzeczywistych. Program ma identyfikowaæ sytuacjê
 * wprowadzenia b³êdnego symbolu dzia³ania oraz próbê dzielenia przez zero. Zastosowaæ instrukcjê
 * switch do wykonania odpowiedniego dzia³ania w zale¿noœci od wprowadzonego symbolu
 * operacji. Scenariusz dzia³ania programu:
 * a) Program wyœwietla informacjê o swoim przeznaczeniu.
 * b) Wczytuje pierwsz¹ liczbê.
 * c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
 * d) Wczytuje drug¹ liczbê.
 * e) Wyœwietla wynik lub - w razie koniecznoœci - informacjê o niemo¿noœci wykonania dzia³ania.
 * f) Program koñczy swoje dzia³anie po naciœniêciu przez u¿ytkownika klawisza Enter
*/
package src;

import java.util.Scanner;
public class Zad6 {

	public static void main(String[] args) {
		
		int a;
		int b;
		char znak;
		
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj liczbê a");
		a = dane.nextInt();
		System.out.println("Podaj liczbê b");
		b = dane.nextInt();
		
		System.out.println("Dodawanie +");
		System.out.println("Odejmowanie -");
		System.out.println("Mno¿enie *");
		System.out.println("Dzielenie /");
		System.out.println("Modulo %");

		znak = dane.next().charAt(0);
		switch(znak) {
		
		case '+': {
			System.out.println(a+b);
			break;
		}
		case '-': {
			System.out.println(a-b);
			break;
		}
		case '*': {
			System.out.println(a*b);
			break;	
		}
		case '/': {
			if(b != 0) {
			System.out.println(a/b + "reszty" + a%b);
		}
		else {
			System.out.println("Nie dzielimy przez 0");
		}
			break;
		}
		
		case '%': {
			if(b != 0) {
			System.out.println(a%b);
		}
		else {
			System.out.println("Nie dzielimy przez 0");
		}
			break;
		}
		
		}
		dane.close();
	}

}

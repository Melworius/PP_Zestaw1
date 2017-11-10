/* Napisa� program realizuj�cy funkcje prostego kalkulatora, pozwalaj�cego na wykonywanie operacji dodawania, 
 * odejmowania, mno�enia i dzielenia na dw�ch liczbach rzeczywistych. Program ma identyfikowa� sytuacj�
 * wprowadzenia b��dnego symbolu dzia�ania oraz pr�b� dzielenia przez zero. Zastosowa� instrukcj�
 * switch do wykonania odpowiedniego dzia�ania w zale�no�ci od wprowadzonego symbolu
 * operacji. Scenariusz dzia�ania programu:
 * a) Program wy�wietla informacj� o swoim przeznaczeniu.
 * b) Wczytuje pierwsz� liczb�.
 * c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
 * d) Wczytuje drug� liczb�.
 * e) Wy�wietla wynik lub - w razie konieczno�ci - informacj� o niemo�no�ci wykonania dzia�ania.
 * f) Program ko�czy swoje dzia�anie po naci�ni�ciu przez u�ytkownika klawisza Enter
*/
package src;

import java.util.Scanner;
public class Zad6 {

	public static void main(String[] args) {
		
		int a;
		int b;
		char znak;
		
		Scanner dane = new Scanner(System.in);
		System.out.println("Podaj liczb� a");
		a = dane.nextInt();
		System.out.println("Podaj liczb� b");
		b = dane.nextInt();
		
		System.out.println("Dodawanie +");
		System.out.println("Odejmowanie -");
		System.out.println("Mno�enie *");
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

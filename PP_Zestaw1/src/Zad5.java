/* W sklepie ze sprz�tem AGD oferowana jest sprzeda� ratalna. 
 * Napisz program umo�liwiaj�cy wyliczenie wysoko�ci miesi�cznej raty 
 * za zakupiony sprz�t. Danymi wej�ciowymi dla programu s� :
 * � cena towaru (od 100 z� do 10 ty�. z�),
 * � liczba rat (od 6 do 48).
 * Kredyt jest oprocentowany w zale�no�ci od liczby rat:
 * � od 6�12 wynosi 2.5% ,
 * � od 13�24 wynosi 5%,
 * � od 25�48 wynosi 10%.
 * Obliczona miesi�czna rata powinna zawiera� r�wnie� odsetki. Program powinien sprawdza�, 
 * czy podane dane mieszcz� si� w okre�lonych powy�ej zakresach, a wprzypadku b��du 
 * pyta� prosi� u�ytkownika ponownie o podanie danych.
*/
import java.util.Scanner;

public class Zad5
{
	public static void main(String[] args)
	{
        System.out.println("Program sprzeda�y ratalnej!");
        System.out.print("Podaj kwot�: ");
       
        double kwota;
        int rata;
        double odsetki1;
        double odsetki2;
        double odsetki3;
        
        Scanner odczyt = new Scanner(System.in);
        kwota = odczyt.nextDouble();
        if(kwota<100 || kwota>10000)
        {
            System.out.println("B��dne dane!");
            System.out.println("Bank udziela kredyt�w od 100z� do 10tys z�");
        }
        System.out.print("Podaj liczb� rat: ");
         
        rata = odczyt.nextInt();
        if(rata<6 || rata>48)
        {
            System.out.println("B��dne dane!");
            System.out.println("Bank rozk�ada od 6 do 48 rat");
        }
        if (rata>=6 && rata<=12)
        {
            odsetki1 = (kwota+ (kwota * 0.025))/rata;
            System.out.println("Koszt raty to: " + odsetki1);
        }
        else if(rata>=13 && rata <=24)
        {
            odsetki2 = (kwota+(kwota * 0.05))/rata;
            System.out.println("Koszt raty to: " + odsetki2);
        }
        else if(rata>=25 && rata<=48)
        {
            odsetki3 = (kwota+ (kwota * 0.10))/rata;
            System.out.println("Koszt raty to: " + odsetki3);
        }
        else
        {
            System.out.println("Popraw dane!");
            odczyt.close();           
        }
    }
}

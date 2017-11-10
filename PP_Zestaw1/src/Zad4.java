/* Napisaæ program obliczaj¹cy nale¿ny podatek dochodowy od osób
 * fizycznych. Program ma pobieraæ od u¿ytkownika dochód i po obliczeniu wypisywaæ
 * na ekranie nale¿ny podatek. Podatek obliczany jest wg. nastêpuj¹cych regu³:
 * • do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
 * • od 85.528 podatek wynosi 14.839,02 z³ + 32% nadwy¿ki ponad 85.528,00
*/
import java.util.Scanner;
public class Zad4
{
	public static void main(String[] args)
    {   
        double a;
		double b;
		double d;
		
        Scanner dochod = new Scanner(System.in);
        {
        System.out.println("Podaj swoje dochody brutto");
        d = dochod.nextDouble();
 
        if (d<=85528)
        {
            a = (d*0.18)-556.02;
            System.out.println("Twój podatek wynosi " + a);
        }
        else
        {
        b = 14839.02+((d-85528)*0.32);
        System.out.println("Twój podatek wynosi " + b);
        dochod.close();
        }
        }
    }
}

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int liczba1 = scann.nextInt();
        System.out.println("Podaj druga liczbe: ");
        int liczba2 = scann.nextInt();

        CalculatorMetody calculator = new CalculatorMetody();

        calculator.dodajLiczby(liczba1,liczba2);
        calculator.odejmijLiczby(liczba1,liczba2);
        calculator.pomnozLiczby(liczba1,liczba2);
        calculator.podzielLiczby(liczba1,liczba2);
        calculator.modulo(liczba1,liczba2);

        System.out.println("Dodawanie: "+ calculator.dodajLiczby(liczba1,liczba2));
        System.out.println("Odejmowanie: "+ calculator.odejmijLiczby(liczba1,liczba2));
        System.out.println("Mnozenie: "+ calculator.pomnozLiczby(liczba1,liczba2));
        System.out.println("Dzielenie: "+ calculator.podzielLiczby(liczba1,liczba2));
        System.out.println("Modulo: "+ calculator.modulo(liczba1,liczba2));
    }
}

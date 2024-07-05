public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto();

        // Wartosci obiektu mercedes
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 1000;

        // Metody dla obiektu mercedesa
        mercedes.info();
        mercedes.hamuj();
        mercedes.jedz();

        // Wartosci obiektu Audi
        Auto Audi = new Auto();
        Audi.marka = "Audi";
        Audi.model = "A5";
        Audi.rok = 2020;
        Audi.przebieg = 0;

        // Metody dla obiektu Audi
        Audi.info();



    }
}

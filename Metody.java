public class Metody {

    public int policzWynik(){
        System.out.println("Policze wynik: ");
        int result = 0;
        for (int i = 0; i < 100; i++){
            System.out.println("Wynik pierwszy to: " + result);
            result = result + i;
            System.out.println("Wynik drugi(po) to: " + result);
        }
        System.out.println("Wynik drugi(po) to: " + result);
        return result;
    }
}

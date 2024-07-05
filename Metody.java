public class Metody {

//    public int policzWynik(){
//        System.out.println("Policze wynik: ");
//        int result = 0;
//        for (int i = 0; i < 100; i++){
//            System.out.println("Wynik pierwszy to: " + result);
//            result = result + i;
//            System.out.println("Wynik drugi(po) to: " + result);
//        }
//        System.out.println("Wynik drugi(po) to: " + result);
//        return result;
//    }

    public int policzWynikParam(int number){
        System.out.println("Number ma wartosc: "+ number);
        System.out.println("Policze wynik: ");
        int result = 0;
        for (int i = 0; i < number; i++){

            result = result + i;

        }
        System.out.println("Wynik to: " + result);
        return result;
    }

    public int add(int firstNumber, int secondNumber) {
        System.out.println("Wynik Add to: "+ (firstNumber+secondNumber));
        if(firstNumber == 0 ){
            System.out.println("First number to 0");
            return 0;
        }
        return firstNumber + secondNumber;
    }
}

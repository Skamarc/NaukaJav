public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int nrIndexu;
    public String uczelnia;

    public static String nazwaUczelni = "AGH lub nie";

    public void przedstawSie(){
        System.out.println("Moje imie to: "+ imie + "" + nazwisko);
    }
    public void podajNrIndexu(){
        System.out.println("Moj numer indexu to: "+ nrIndexu);
    }
    public void podajEmail(){
        System.out.println("Moj email to: " + email);
    }
    public void zalogujSie(){
        System.out.println("Zalogowany to: "+ nick);
    }

    public static void infoUczelnia(){
        System.out.println("Moja uczelnia to:" + nazwaUczelni );
        Druga();
    }

    public static void Druga(){
        System.out.println("test");

    }
}

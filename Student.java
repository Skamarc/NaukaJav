public class Student {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int nrIndexu;

    public void przedstawSie(){
        System.out.println("Moje imie to: "+ imie + "" + nazwisko);
    }
    public void podajNrIndexu(){
        System.out.println("Moj numer indexu to: "+ nrIndexu);
    }
    public void podajEmail(){
        System.out.println("Moj email to: " + email);
    }
}

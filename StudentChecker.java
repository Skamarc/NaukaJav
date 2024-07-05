import java.util.Scanner;

public class StudentChecker {
    public static void main(String[] args) {
        Student Adam = new Student();
        Adam.imie = "Adam";
        Adam.nazwisko = "Adamski";
        Adam.nrIndexu = 12345;
        Adam.email = "Adam@gmail.com";
        Adam.nick = " AdamkskiA";

        Student Kasia = new Student();
        Kasia.imie = "Kasia";
        Kasia.nazwisko = "Kasiownica";
        Kasia.nrIndexu = 123456;
        Kasia.email = "Kasia@gmial.com";
        Kasia.nick = " Kasiunia";

        Student Piotr = new Student();
        Piotr.imie = "Piotr";
        Piotr.nazwisko = "Piotrowski";
        Piotr.nrIndexu = 12345;
        Piotr.email = "Piotr@gmail.com";
        Piotr.nick = " Piotrowski";


        Student[] students = new Student[3];
        students[0] = Adam;
        students[1] = Kasia;
        students[2] = Piotr;

        for (int i = 0; i < students.length; i++){
            students[i].podajEmail();
            students[i].podajNrIndexu();
            students[i].przedstawSie();
            students[i].zalogujSie();
        }

        String imie = "Kasia";
        Scanner scan = new Scanner(System.in);

        

    }
}

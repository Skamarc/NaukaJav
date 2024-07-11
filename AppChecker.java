// Stworz klase bazowa App - zawiera pole name i metode app info, dodaj konstruktor do ktoego porzekazesz wartosc name
//  sworz klase potomne androidAPp i IpphoneApp -  zawiera metode runAdroidApp / runIphoneApp

public class AppChecker {
    public String name;

    public AppChecker(String name){
        System.out.println("Jestem w konstruktorze AppChecker");
        this.name = name;
    }
    public void appInfo(){
        System.out.println("App to :" + name);
    }

}

public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("Jestem  w konstruktorze Footballer");
        this.footballClub = footballClub;
    }

    public void eat(){
        System.out.println("I like healthy food");
    }

    public void playFootball(){
        System.out.println("I'm Playing football");
        walk();
    }
    public void SayFootball(){
        System.out.println("I am " + age + " Years old and my name is: " + name);
    }

}

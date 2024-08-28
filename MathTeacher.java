public class MathTeacher extends Person {

    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem  w konstruktorze MathTeacher");
        this.school = school;
    }

    public void teachMath(){
        System.out.println("i'm teching Math");
    }

    public void walk(){
        System.out.println("I walk super fast");
    }

    public void sayHello(){
        System.out.println("Hello, my name is " + name);
        System.out.println("i'm " + age);
        System.out.println("TEst");
    }
}

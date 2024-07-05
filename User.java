public class User {

    public String username;
    public String password;

//    public User(String user, String pass){
//        System.out.println("Hello z konstruktora - wtf");
//        // user i pass przypisuja wartosci do username i password
//        username = user;
//        password = pass;

        public User(String username, String password){
            System.out.println("Hello z konstruktora - wtf");
            this.username = username;
            this.password = password;


        }

    public void sayHello() {
        System.out.println("Hello, my name is: " + username +" "+ password);

    }
}

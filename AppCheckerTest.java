public class AppCheckerTest {
    public static void main(String[] args) {

        AppChecker applicationTest = new AppChecker("Matylda");
        applicationTest.appInfo();

        AndroidApp android = new AndroidApp("Andro-1");
        android.runAdroidApp();

        IphoneApp iphone = new IphoneApp("Jablko");
        iphone.runIphoneApp();




    }
}

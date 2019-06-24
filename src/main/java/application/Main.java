package application;

public class Main {

    private static JsonConvert json = new JsonConvert();
    private static Initializer screen = new Initializer();

    public static void main(String[] args) {

        json.deserialization();

        Global.configScreen("Home", "home");

        screen.home();
    }
}

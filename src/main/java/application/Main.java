package application;

public class Main {
    public static void main(String[] args) {

        Initializer screen = new Initializer();

        Global.configScreen("Home", "home");

        screen.home();

    }
}

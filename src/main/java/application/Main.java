package application;

public class Main {

    private static JsonConvert json = new JsonConvert();

    public static void main(String[] args) {

        json.deserialization();

        Global.initHome();
    }
}

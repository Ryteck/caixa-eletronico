package application;

public class Global {

    public static void configScreen(String title, String path){

        Initializer.sets[0] = "/views/" + path + ".fxml";
        Initializer.sets[1] = title;

    }

}

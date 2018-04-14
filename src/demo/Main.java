package demo;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;

 public class Main extends Application {

     @Override
     public void start(Stage primaryStage) throws Exception {
         Button character = new Button("Персонаж");

         primaryStage.show();
     }

    public static void main(String[] args) {
        launch(args);
    }
}

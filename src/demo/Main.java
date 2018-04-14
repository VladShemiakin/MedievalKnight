package demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

     private Stage primaryStage;
     private BorderPane rootLayout;

     @Override
     public void start(Stage primaryStage) throws Exception {
         this.primaryStage = primaryStage;
         this.primaryStage.setTitle("Medieval Knight");

         initRootLayout();

         showPersonOverview();
     }

     public void initRootLayout() {
         try {
             // Загружаем корневой макет из fxml файла.
             FXMLLoader loader = new FXMLLoader();
             loader.setLocation(Main.class.getResource("view/RootLayout.fxml"));
             rootLayout = (BorderPane) loader.load();

             // Отображаем сцену, содержащую корневой макет.
             Scene scene = new Scene(rootLayout);
             primaryStage.setScene(scene);
             primaryStage.show();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }

    public void showPersonOverview() {
        try {
            // Загружаем сведения об адресатах.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/CharacterView.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Помещаем сведения об адресатах в центр корневого макета.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}

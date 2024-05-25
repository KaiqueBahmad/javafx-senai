package senai.monitoria.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import senai.monitoria.javafx.models.Rifa;

/**
 * JavaFX App
 */
public class App extends Application {

//    Menu Principal pra levar a gente pras outras telas
//    - Ver as Rifas (Tem que ter botão de sortear)
//    - Comprar uma Rifa
//    - Reembolsar rifa
    
    private static Scene scene;
    public static Rifa[] rifas;
    @Override
    public void start(Stage stage) throws IOException {
        int numeroDeRifas = 20;
        rifas = new Rifa[numeroDeRifas];
        for (int numRifa = 1; numRifa <= numeroDeRifas; numRifa++) {
            rifas[numRifa-1] = new Rifa(numRifa);
        }        
        
        scene = new Scene(loadFXML("views/principal"));
        stage.setScene(scene);
        stage.show();
        
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
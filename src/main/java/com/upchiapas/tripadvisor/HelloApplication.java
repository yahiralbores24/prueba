package com.upchiapas.tripadvisor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("crearCuenta-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Registro - Tripadvisor");
        stage.setScene(scene);
        stage.show();


          /*  FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
            Scene scene2 = new Scene(fxmlLoader.load());
            stage.setTitle("Terrain Scanner");
            stage.setScene(scene2);
            stage.show();*/

    }


    public static void main(String[] args) {
        launch();
    }
}
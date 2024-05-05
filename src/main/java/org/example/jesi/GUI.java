package org.example.jesi;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fx = new FXMLLoader(GUI.class.getResource("sign_in.fxml"));
        Scene sc = new Scene(fx.load());
        stage.setResizable(false);
        stage.setTitle("Obat Jessy");
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args){launch();}

}

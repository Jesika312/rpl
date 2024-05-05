package org.example.jesi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeControl {

    @FXML
    private Text txtNama;

    @FXML
    public Text txtuserName;
    private String user;

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }



    public void setAndInitializeUser(String user,String nama){
        setUser(user);
        setName(nama);
        initialize();
        txtNama.setText(getUser());
        txtuserName.setText(getName());
    }

    private void initialize() {
    }

}

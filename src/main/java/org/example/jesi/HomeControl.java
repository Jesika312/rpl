package org.example.jesi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeControl {
    @FXML
    private Label txtNama;
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

    public void setAndInitialUser(String user){
        setUser(user);
        txtNama.setText(getName());
    }

}

package org.example.jesi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.*;

public class loginControl {
    @FXML TextField username;
    @FXML PasswordField password;
    @FXML Button btnLogin;
    private Connection connection;



    public loginControl() throws SQLException {
    }


    @FXML
    private void  btnLoginClick() throws SQLException {
      Alert a;
      String uname =username.getText();
      String pass = password.getText();
      Connection koneksi;
      String querycon = "jdbc:sqlite:voq.db";
      String query = "SELECT * FROM user where username = ? And password = ?";
      koneksi = DriverManager.getConnection(querycon);
      try(PreparedStatement preparedStatement = koneksi.prepareStatement(query)){
          preparedStatement.setString(1,uname);
          preparedStatement.setString(2,pass);
          try (ResultSet resultSet = preparedStatement.executeQuery()){
              if (resultSet.next()){
                  String name = resultSet.getString("firstname");
                  a = new Alert(Alert.AlertType.INFORMATION);
                  a.setHeaderText("Information");
                  a.setContentText("Selamat datang  " + name);
                  a.showAndWait();
                  String user = username.getText();
                  try {
                      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("homeUI.fxml"));
                      Scene sc = new Scene(fxmlLoader.load());
                      Stage stage = (Stage) btnLogin.getScene().getWindow();
//                      HomeControl homeControl = fxmlLoader.getController();
//                      homeControl.set
                      stage.setScene(sc);
                      stage.setResizable(false);
                      stage.show();
                      System.out.println(user + "Login Berhasil");

                  } catch (Exception e) {
                      e.printStackTrace();
                  }
              }
          }
      } catch (SQLException e) {
          e.printStackTrace();
      }


    }


}

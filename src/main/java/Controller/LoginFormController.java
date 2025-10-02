package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    public PasswordField password;
    public TextField username;

    Stage stage = new Stage();
    public void loginonaction(ActionEvent event) {
        String name = username.getText();
        String pword = password.getText();

        if ("admin".equals(name) && "1234".equals(pword)){
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dashborad.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.show();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Error");
            alert.setContentText("Invalid Username or Password");
            alert.show();
            System.out.println("Login Failed");
        }

    }

}

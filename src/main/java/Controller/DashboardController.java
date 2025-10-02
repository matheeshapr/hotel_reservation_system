package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {
    Stage stage = new Stage();
    public void roomaction(ActionEvent actionEvent) {

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/room_infomation.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    Stage stage1 = new Stage();
    public void custaction(ActionEvent actionEvent) {

        try {
            stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

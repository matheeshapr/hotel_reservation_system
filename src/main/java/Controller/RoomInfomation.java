package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.dto.RoominfoDTO;

public class RoomInfomation {

    ObservableList<RoominfoDTO> roominfoDTOS = FXCollections.observableArrayList(
            new RoominfoDTO("001","Single","Sea View",100.0),
            new RoominfoDTO("002","Double","City View",150.0),
            new RoominfoDTO("003","Suite","Mountain View",250.0),
            new RoominfoDTO("004","Single","Garden View",120.0)
    );

    @FXML
    private TableColumn<?, ?> coldisc;

    @FXML
    private TableColumn<?, ?> colno;

    @FXML
    private TableColumn<?, ?> colprice;

    @FXML
    private TableColumn<?, ?> coltype;

    @FXML
    private TableView<RoominfoDTO> tblroominfo;

    @FXML
    void custaction(ActionEvent event) {

    }

    @FXML
    void reloadaction(ActionEvent event) {
        colno.setCellValueFactory(new PropertyValueFactory<>("colno"));
        coltype.setCellValueFactory(new PropertyValueFactory<>("coltype"));
        coldisc.setCellValueFactory(new PropertyValueFactory<>("coldisc"));
        colprice.setCellValueFactory(new PropertyValueFactory<>("colprice"));
        tblroominfo.setItems(roominfoDTOS);
    }

    @FXML
    void roomaction(ActionEvent event) {

    }

}

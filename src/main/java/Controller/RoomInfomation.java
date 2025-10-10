package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javafx.scene.control.cell.PropertyValueFactory;
import model.dto.RoominfoDTO;

import java.net.URL;
import java.util.ResourceBundle;

public class RoomInfomation implements Initializable {

    ObservableList<RoominfoDTO> roominfoDTOS = FXCollections.observableArrayList(
            new RoominfoDTO("001", "Single", "Sea View", 100.0),
            new RoominfoDTO("002", "Double", "City View", 150.0),
            new RoominfoDTO("003", "Suite", "Mountain View", 250.0),
            new RoominfoDTO("004", "Single", "Garden View", 120.0)
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
    private TextField txtDes;

    @FXML
    private TextField txtPrice;

    @FXML
    private TextField txtRoomid;

    @FXML
    private TextField txtType;

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colno.setCellValueFactory(new PropertyValueFactory<>("colno"));
        coltype.setCellValueFactory(new PropertyValueFactory<>("coltype"));
        coldisc.setCellValueFactory(new PropertyValueFactory<>("coldisc"));
        colprice.setCellValueFactory(new PropertyValueFactory<>("colprice"));
        tblroominfo.setItems(roominfoDTOS);

        tblroominfo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                txtRoomid.setText(newValue.getColno());
                txtType.setText(newValue.getColtype());
                txtDes.setText(newValue.getColdisc());
                txtPrice.setText(String.valueOf(newValue.getColprice()));

            }
            ;

        });

    }


    public void addAction(ActionEvent actionEvent) {
        String roomId = txtRoomid.getText();
        String type = txtType.getText();
        String des = txtDes.getText();
        double price = Double.parseDouble(txtPrice.getText());
        RoominfoDTO newRoom = new RoominfoDTO(roomId, type, des, price);
        roominfoDTOS.add(newRoom);
        tblroominfo.refresh();

        txtRoomid.setText("");
        txtType.setText("");
        txtDes.setText("");
        txtPrice.setText("");

    }

    public void updateAction(ActionEvent actionEvent) {
        RoominfoDTO selectedRoom = tblroominfo.getSelectionModel().getSelectedItem();
        if (selectedRoom != null) {
            selectedRoom.setColno(txtRoomid.getText());
            selectedRoom.setColtype(txtType.getText());
            selectedRoom.setColdisc(txtDes.getText());
            selectedRoom.setColprice(Double.parseDouble(txtPrice.getText()));
            tblroominfo.refresh();

            txtRoomid.setText("");
            txtType.setText("");
            txtDes.setText("");
            txtPrice.setText("");
        }
    }

    public void deleteAction(ActionEvent actionEvent) {
        RoominfoDTO selectedRoom = tblroominfo.getSelectionModel().getSelectedItem();
        if (selectedRoom != null) {
            roominfoDTOS.remove(selectedRoom);
            tblroominfo.refresh();

            txtRoomid.setText("");
            txtType.setText("");
            txtDes.setText("");
            txtPrice.setText("");
        }
    }

    public void clearAction(ActionEvent actionEvent) {
        txtRoomid.setText("");
        txtType.setText("");
        txtDes.setText("");
        txtPrice.setText("");
    }

    public void staffaction(ActionEvent actionEvent) {
    }

    public void dashaction(ActionEvent actionEvent) {
    }
}

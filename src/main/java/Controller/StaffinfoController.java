package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.dto.StaffinfoDTO;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StaffinfoController implements Initializable {

    ObservableList<StaffinfoDTO> staffinfoDTOS = FXCollections.observableArrayList(
            new StaffinfoDTO("S001", "Alice Johnson", "Manager", "alice@gmail.com", "1234567890", 60000.0),
            new StaffinfoDTO("S002", "Bob Smith", "Receptionist", "bob@gmail.com", "0987654321", 40000.0),
            new StaffinfoDTO("S003", "Charlie Brown", "Housekeeper", "char@gmail.com", "5555555555", 35000.0),
            new StaffinfoDTO("S004", "Diana Prince", "Chef", "diana@gmail.com", "4444444444", 50000.0)
    );

    @FXML
    private TableColumn<?, ?> colemail;

    @FXML
    private TableColumn<?, ?> colid;

    @FXML
    private TableColumn<?, ?> colname;

    @FXML
    private TableColumn<?, ?> colphno;

    @FXML
    private TableColumn<?, ?> colrole;

    @FXML
    private TableColumn<?, ?> colsalary;

    @FXML
    private TableView<StaffinfoDTO> tblstaffinfo;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhno;

    @FXML
    private TextField txtRole;

    @FXML
    private TextField txtSalary;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colid.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("colid"));
        colname.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("colname"));
        colrole.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("colrole"));
        colemail.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("colemail"));
        colphno.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("colphno"));
        colsalary.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("colsalary"));
        tblstaffinfo.setItems(staffinfoDTOS);

        tblstaffinfo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                txtId.setText(newValue.getColid());
                txtName.setText(newValue.getColname());
                txtRole.setText(newValue.getColrole());
                txtEmail.setText(newValue.getColemail());
                txtPhno.setText(newValue.getColphno());
                txtSalary.setText(String.valueOf(newValue.getColsalary()));
            }
        });
    }

    @FXML
    void addAction(ActionEvent event) {
        String id = txtId.getText();
        String name = txtName.getText();
        String role = txtRole.getText();
        String email = txtEmail.getText();
        String phno = txtPhno.getText();
        double salary = Double.parseDouble(txtSalary.getText());

        StaffinfoDTO newStaff = new StaffinfoDTO(id, name, role, email, phno, salary);
        staffinfoDTOS.add(newStaff);
        tblstaffinfo.refresh();

        txtId.setText("");
        txtName.setText("");
        txtRole.setText("");
        txtEmail.setText("");
        txtPhno.setText("");
        txtSalary.setText("");

    }

    @FXML
    void clearAction(ActionEvent event) {
        txtId.setText("");
        txtName.setText("");
        txtRole.setText("");
        txtEmail.setText("");
        txtPhno.setText("");
        txtSalary.setText("");

    }

    @FXML
    void deleteAction(ActionEvent event) {
        StaffinfoDTO selectedStaff = tblstaffinfo.getSelectionModel().getSelectedItem();
        if (selectedStaff != null) {
            staffinfoDTOS.remove(selectedStaff);
            tblstaffinfo.refresh();

            txtId.setText("");
            txtName.setText("");
            txtRole.setText("");
            txtEmail.setText("");
            txtPhno.setText("");
            txtSalary.setText("");
        }

    }

    Stage stage2 = new Stage();
    @FXML
    void custaction(ActionEvent event) {
        try {
            stage2.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/customer_infomation.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ;
        stage2.show();


    }

    Stage stage3 = new Stage();
    @FXML
    void roomaction(ActionEvent event) {
        try {
            stage3.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/room_infomation.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage3.show();

    }

    @FXML
    void updateAction(ActionEvent event) {
        StaffinfoDTO selectedStaff = tblstaffinfo.getSelectionModel().getSelectedItem();
        if (selectedStaff != null) {
            selectedStaff.setColid(txtId.getText());
            selectedStaff.setColname(txtName.getText());
            selectedStaff.setColrole(txtRole.getText());
            selectedStaff.setColemail(txtEmail.getText());
            selectedStaff.setColphno(txtPhno.getText());
            selectedStaff.setColsalary(Double.parseDouble(txtSalary.getText()));
            tblstaffinfo.refresh();

            txtId.setText("");
            txtName.setText("");
            txtRole.setText("");
            txtEmail.setText("");
            txtPhno.setText("");
            txtSalary.setText("");
        }

    }

    Stage stage1 = new Stage();
    public void dashaction(ActionEvent actionEvent) {
        try {
            stage1.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dashborad.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage1.show();
    }
}

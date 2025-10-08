package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import model.dto.CustomerinfoDTO;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerInfomation implements Initializable {

    ObservableList<CustomerinfoDTO> customerinfoDTOS = FXCollections.observableArrayList(
            new CustomerinfoDTO("C001","John Doe","1234567890","123 Main St","New York"),
            new CustomerinfoDTO("C002","Jane Smith","0987654321","456 Elm St","Los Angeles"),
            new CustomerinfoDTO("C003","Alice Johnson","5555555555","789 Oak St","Chicago"),
            new CustomerinfoDTO("C004","Bob Brown","4444444444","321 Pine St","Houston")
    );

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colCity;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPhno;

    @FXML
    private TableView<CustomerinfoDTO> tblcustinfo;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtCity;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtPhno;

    @FXML
    void custaction(ActionEvent event) {

    }

    @FXML
    void roomaction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        colId.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("colId"));
        colName.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("colName"));
        colPhno.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("colPhno"));
        colCity.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("colCity"));
        colAddress.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("colAddress"));
        tblcustinfo.setItems(customerinfoDTOS);

        tblcustinfo.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                txtId.setText(newValue.getColId());
                txtName.setText(newValue.getColName());
                txtPhno.setText(newValue.getColPhno());
                txtCity.setText(newValue.getColCity());
                txtAddress.setText(newValue.getColAddress());

            };

        });
    }

    public void addcustAction(ActionEvent actionEvent) {
        String id = txtId.getText();
        String name = txtName.getText();
        String phno = txtPhno.getText();
        String city = txtCity.getText();
        String address = txtAddress.getText();
        CustomerinfoDTO customerinfoDTO = new CustomerinfoDTO(id, name, phno, city, address);
        customerinfoDTOS.add(customerinfoDTO);
        tblcustinfo.refresh();

        txtId.setText("");
        txtName.setText("");
        txtPhno.setText("");
        txtCity.setText("");
        txtAddress.setText("");


    }

    public void updatecustAction(ActionEvent actionEvent) {
        CustomerinfoDTO selectedCustomer = tblcustinfo.getSelectionModel().getSelectedItem();
        if (selectedCustomer != null) {
            selectedCustomer.setColId(txtId.getText());
            selectedCustomer.setColName(txtName.getText());
            selectedCustomer.setColPhno(txtPhno.getText());
            selectedCustomer.setColCity(txtCity.getText());
            selectedCustomer.setColAddress(txtAddress.getText());
            tblcustinfo.refresh();

            txtId.setText("");
            txtName.setText("");
            txtPhno.setText("");
            txtCity.setText("");
            txtAddress.setText("");
        }
    }

    public void deletecustAction(ActionEvent actionEvent) {
        CustomerinfoDTO selectedCustomer = tblcustinfo.getSelectionModel().getSelectedItem();
        if (selectedCustomer != null) {
            customerinfoDTOS.remove(selectedCustomer);
            tblcustinfo.refresh();

            txtId.setText("");
            txtName.setText("");
            txtPhno.setText("");
            txtCity.setText("");
            txtAddress.setText("");
        }
    }

    public void clearcustAction(ActionEvent actionEvent) {
        txtId.setText("");
        txtName.setText("");
        txtPhno.setText("");
        txtCity.setText("");
        txtAddress.setText("");
    }

    public void staffaction(ActionEvent actionEvent) {

    }
}

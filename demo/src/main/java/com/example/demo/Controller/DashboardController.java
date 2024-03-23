package com.example.demo.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DashboardController implements Initializable {
    @FXML
    private Button book_btn;

    @FXML
    private TableColumn<?, ?> book_description_col;

    @FXML
    private TableColumn<?, ?> book_index_col;

    @FXML
    private TextField book_index_tfield;

    @FXML
    private Label book_pane;

    @FXML
    private TableColumn<?, ?> book_price_col;

    @FXML
    private TextField book_price_tfield;

    @FXML
    private TableColumn<?, ?> book_roomNo_col;

    @FXML
    private ComboBox<?> book_room_combo;

    @FXML
    private AnchorPane book_room_form;

    @FXML
    private TextField book_search;

    @FXML
    private TableColumn<?, ?> book_status_col;

    @FXML
    private TableView<?> book_table;

    @FXML
    private TableView<?> center_table_pane;

    @FXML
    private Button feedBack_btn;

    @FXML
    private AnchorPane finance_form;

    @FXML
    private TableColumn<?, ?> finance_amountPaid_clmn;

    @FXML
    private TableColumn<?, ?> finance_balance_clmn;

    @FXML
    private TableColumn<?, ?> finance_data_clmn;

    @FXML
    private TableColumn<?, ?> finance_index_clmn;

    @FXML
    private TableColumn<?, ?> finance_price_clmn;

    @FXML
    private TableColumn<?, ?> finance_roomNo_clmn;

    @FXML
    private Button finances_btn;

    @FXML
    private Button home_btn;

    @FXML
    private AnchorPane info_form;

    @FXML
    private AnchorPane left_inner_pane;

    @FXML
    private AnchorPane left_pane;

    @FXML
    private Button notifications_btn;

    @FXML
    private AnchorPane profile_form;

    @FXML
    private TextArea profile_addBio;

    @FXML
    private Label profile_bio;

    @FXML
    private Button profile_btn;

    @FXML
    private TextField profile_change_username;

    @FXML
    private ImageView profile_img;

    @FXML
    private Label profile_months;

    @FXML
    private Label profile_roomNo;

    @FXML
    private Button profile_save_btn;

    @FXML
    private Label profile_show_bio;

    @FXML
    private Label profile_show_months;

    @FXML
    private Label profile_show_room;

    @FXML
    private Button rateUs_btn;

    @FXML
    private Button signOut_btn;

    @FXML
    private Label username_label;

    @FXML
    private Label welcome_label;

    public void close(){
        System.exit(0);
    }

    public void minimise(){

    }

    public void switchForm(ActionEvent event){
        if(event.getSource() == home_btn){
            book_room_form.setVisible(true);
            info_form.setVisible(false);
            finance_form.setVisible(false);
            profile_form.setVisible(false);
        }else if(event.getSource() == finances_btn){
            finance_form.setVisible(true);
            info_form.setVisible(false);
            book_room_form.setVisible(false);
            profile_form.setVisible(false);
        }else if(event.getSource() == profile_btn){
            profile_form.setVisible(true);
            info_form.setVisible(false);
            finance_form.setVisible(false);
           book_room_form.setVisible(false);
        }else if(event.getSource() == notifications_btn){
            info_form.setVisible(true);
            book_room_form.setVisible(false);
            finance_form.setVisible(false);
            profile_form.setVisible(false);
        }

    }

    public void logout() {

        try {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure you want to logout?");

            Optional<ButtonType> option = alert.showAndWait();

            if (option.get().equals(ButtonType.OK)) {

                //HIDE YOUR DASHBOARD FORM
                signOut_btn.getScene().getWindow().hide();

                //LINK YOUR LOGIN FORM
                Parent root = FXMLLoader.load(getClass().getResource("/com/example/demo/Views/login.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            } else {
                return;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

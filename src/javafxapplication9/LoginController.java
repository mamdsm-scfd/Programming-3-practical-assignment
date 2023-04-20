/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapplication9;

import static com.sun.deploy.security.BlockedDialog.show;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class LoginController implements Initializable {

    @FXML
    private TextField userNameField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button Login;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleTextFieldActionUserName(ActionEvent event) {
    }

    @FXML
    private void handleTextFieldActionPassword(ActionEvent event) {
    }

    @FXML
    private void handleButtonActionLogin(ActionEvent event) {
        String username = userNameField.getText();
        String password = passwordField.getText();

        if (username.equals("user") && password.equals("userpass")) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("CurrencyChangeSystem.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage) Login.getScene().getWindow();
                stage.setScene(scene);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            Alert alert = new Alert(AlertType.ERROR, "Invalid username or password.");
            alert.showAndWait();
        }
    }
    }
    
    
    


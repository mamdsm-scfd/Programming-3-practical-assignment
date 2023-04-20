/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package javafxapplication9;

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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class CurrencyChangeSystemController implements Initializable {

    @FXML
    private Button LogOut;
    @FXML
    private TextField UsdFiled;
    @FXML
    private TextField NisFiled;
    @FXML
    private Button Convert;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
    private final double DOLLAR_TO_SHEKEL_RATE = 3.25;

    private final double SHEKEL_TO_DOLLAR_RATE = 0.31;

    @FXML
    private void handleTextFiledActionUsdFiled(ActionEvent event) {
    }

    @FXML
    private void handleTextFiledActionNisFiled(ActionEvent event) {
    }

    @FXML
    private void handleButtonActionConvert(ActionEvent event) {
        double amount = 0;
    if (!NisFiled.getText().isEmpty()) {
        amount = Double.parseDouble(NisFiled.getText()) / DOLLAR_TO_SHEKEL_RATE;
        UsdFiled.setText(String.format("%.2f", amount));
    } else if (!UsdFiled.getText().isEmpty()) {
        amount = Double.parseDouble(UsdFiled.getText()) * DOLLAR_TO_SHEKEL_RATE;
        NisFiled.setText(String.format("%.2f", amount));
    }
    }
    
    
    private void convertButtonClicked() {
        try {
            double dollars = Double.parseDouble(UsdFiled.getText());
            double shekels = Double.parseDouble(NisFiled.getText());
            if (UsdFiled.getText().isEmpty()) {
                dollars = shekels * 0.305;
                UsdFiled.setText(String.format("%.2f", dollars));
            } else if (NisFiled.getText().isEmpty()) {
                shekels = dollars * 3.27;
                NisFiled.setText(String.format("%.2f", shekels));
            }
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid input.");
            alert.showAndWait();
        }
    }

   /* @FXML
    private void logoutButtonClicked() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) LogOut.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }*/
    
    
    
    
    @FXML
    private void handleButtonActionLogOut(ActionEvent event) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) LogOut.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
    

    

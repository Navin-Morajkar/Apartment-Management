/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package apartment.management;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Saish
 */
public class MainScreenController implements Initializable {
    private Stage stage;
    private Parent root;
    private Scene scene;
    public String Username;
    
    @FXML
    private Label welcomeLabel;
    
    @FXML
    private BorderPane mainPane;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
       
        LoadScreen loader = new LoadScreen();
        Pane view = loader.getPage("RentScreen",Username);
        mainPane.setCenter(view);
       
    }
    
    @FXML
    private void handleButtonAction2(ActionEvent event) throws IOException {
        System.out.println("You clicked me!");
        
        LoadScreen loader = new LoadScreen();
        Pane view = loader.getPage("TenantsScreen", Username);
        mainPane.setCenter(view);
    }
    
    @FXML
    private void handleButtonAction3(ActionEvent event) {
        System.out.println("You clicked me!");
        
        LoadScreen loader = new LoadScreen();
        Pane view = loader.getPage("ActivitiesScreen", Username);
        mainPane.setCenter(view);
    }
    
    @FXML
    private void logout(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        stage.centerOnScreen();
    }
    
    public void sendData(String name,String username)
    {
        welcomeLabel.setText("Welcome, " + name);
        Username = username;
        System.out.println(username);
    }
    
   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}

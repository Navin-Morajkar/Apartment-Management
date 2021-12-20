/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package apartment.management;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author Saish
 */
public class MainScreenController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private BorderPane mainPane;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        
        LoadScreen loader = new LoadScreen();
        Pane view = loader.getPage("RentScreen");
        mainPane.setCenter(view);
    }
    
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        System.out.println("You clicked me!");
        
        LoadScreen loader = new LoadScreen();
        Pane view = loader.getPage("TenantsScreen");
        mainPane.setCenter(view);
    }
    
    @FXML
    private void handleButtonAction3(ActionEvent event) {
        System.out.println("You clicked me!");
        
        LoadScreen loader = new LoadScreen();
        Pane view = loader.getPage("ActivitiesScreen");
        mainPane.setCenter(view);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

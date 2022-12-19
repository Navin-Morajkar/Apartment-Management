/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package apartment.management;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Saish
 */
public class loginController implements Initializable {

    private Stage stage;
    private Parent root;
    private Scene scene;

    @FXML
    private TextField txtname;

    @FXML
    private Button btnsub;

    @FXML
    private PasswordField txtpass;

    Connection con;
    PreparedStatement pst;
    ResultSet rs ;

    @FXML
    public void loginSuccessfull(ActionEvent event) throws IOException, SQLException {

        String username = txtname.getText();
        GlobalData.setUsername(username);

        String pass = txtpass.getText();
        String name = "XX";

        if (username.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Username or Password blank");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/test4", "root", ""); //CHANGE DATABASE NAME HERE
                pst = con.prepareStatement("select * from login_admin where username=? and password=?"); //CHANGE LOGIN HERE
               
                pst.setString(1, username);
                pst.setString(2, pass);
              
                // Getting Name of the client, to be displayed on Mainscreen
                

                // Login Authorization Section
                rs = pst.executeQuery();
                if (rs.next()) {
                    name = rs.getString("username");
                    System.out.println(rs);
                    JOptionPane.showMessageDialog(null, "Login successful");
//                    Parent root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
                    FXMLLoader loader = new FXMLLoader((getClass().getResource("MainScreen.fxml")));

                    root = loader.load();  // loading the mainscreen

                    MainScreenController msc = loader.getController();

                    msc.sendData(name, username);  // To send username to mainscreen for displaying.

                    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                    stage.setResizable(false);
                    stage.centerOnScreen();
                } else {
                    JOptionPane.showMessageDialog(null, "Login failed");
                    txtname.setText("");
                    txtpass.setText("");
                    txtname.requestFocus();
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TenantsScreenController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TenantsScreenController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    public void closeWindow(ActionEvent event) {

        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb
    ) {
        // TODO
    }

}

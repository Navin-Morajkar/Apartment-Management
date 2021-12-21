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
    ResultSet rs;

    @FXML
    public void loginSuccessfull(ActionEvent event) throws IOException, SQLException {

String name=txtname.getText();        
        String pass=txtpass.getText();
        if(name.equals("") && pass.equals(""))
        {
           JOptionPane.showMessageDialog(null, "Username or Password blank");
        }
       else
        {
          try
            {
              Class.forName("com.mysql.jdbc.Driver");
              con=DriverManager.getConnection("jdbc:mysql://localhost/accounts", "root","");
              pst = con.prepareStatement("select * from logins where username=? and password=?");
              pst.setString(1,name);
              pst.setString(2,pass); 
              rs=pst.executeQuery();
              if(rs.next())
                {
                    JOptionPane.showMessageDialog(null, "Login successful");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Login failed");
                    txtname.setText("");
                    txtpass.setText("");
                    txtname.requestFocus();
                }

            }catch(ClassNotFoundException ex){
               Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            } catch(SQLException ex){
              Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
}



}
        Parent root = FXMLLoader.load(getClass().getResource("MainScreen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
        stage.centerOnScreen();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

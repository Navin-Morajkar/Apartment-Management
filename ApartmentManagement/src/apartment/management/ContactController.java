/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package apartment.management;

import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author RISHAB GHANTI
 */
public class ContactController implements Initializable {

    @FXML
    private TextField flatno;

    @FXML
    private TextArea message;

    @FXML
    private Button submit;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    private void submitbtn(ActionEvent event) throws IOException {
        try {
            contact.setflat(flatno.getText());
            contact.setmessage(message.getText());
            contact.sendMail("aptowner85@gmail.com");
            JOptionPane.showMessageDialog(null, "Email sent successfully");
            flatno.setText("");
            message.setText("");
        } // TODO
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Email failed");
            flatno.setText("");
            message.setText("");
        }
    }

}

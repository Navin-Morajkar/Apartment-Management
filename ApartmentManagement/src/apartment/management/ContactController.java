/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package apartment.management;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.CountDownLatch;
import javafx.application.Platform;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javax.swing.JOptionPane;


public class ContactController implements Initializable {

    @FXML
    private TextField flatno;

    @FXML
    private TextArea message;

    @FXML
    private Button submit;

    @FXML
    private ImageView spinner;

    private boolean notfinish;
    double progress;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void submitbtn(ActionEvent event) throws IOException {

        if (flatno.getText().equals("") || message.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Flatno or Message cannot be blank");
        } else {
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
        spinner.setVisible(true);

        }
    }
}





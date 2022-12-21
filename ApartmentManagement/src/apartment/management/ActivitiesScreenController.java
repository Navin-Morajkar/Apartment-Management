/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package apartment.management;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author RISHAB GHANTI
 */
public class ActivitiesScreenController implements Initializable {


@FXML
    private TableView<ActivitiesTable>activitiestable ;

    @FXML
    private TableColumn<ActivitiesTable, String> col_1;

    @FXML
    private TableColumn<ActivitiesTable, String> col_2;



    PreparedStatement statement;
    
    ObservableList<ActivitiesTable> oblist = FXCollections.observableArrayList();


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {

            
            Connection con = DBConnector.getConnection();

            statement = con.prepareStatement("SELECT * FROM `mileage` ");

            //statement.setString(1, Username);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                oblist.add(new ActivitiesTable(rs.getString("bus_no"), rs.getDouble("MILAGE")));
            }
        } catch (SQLException ex) {
//            Logger.getLogger(RentScreenController.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println(ex);
        }

        col_1.setCellValueFactory(new PropertyValueFactory<>("bus_no"));
        col_2.setCellValueFactory(new PropertyValueFactory<>("MILAGE"));

        activitiestable.setItems(oblist);
    }
}
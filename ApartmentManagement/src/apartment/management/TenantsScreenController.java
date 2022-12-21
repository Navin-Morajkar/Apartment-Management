/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

public class TenantsScreenController implements Initializable {
    

@FXML
    private TableView<Tenantstable> tenantstableview;

    @FXML
    private TableColumn<Tenantstable, String> col_1;

    @FXML
    private TableColumn<Tenantstable, String> col_2;

    @FXML
    private TableColumn<Tenantstable, String> col_3;

ObservableList<Tenantstable> oblist = FXCollections.observableArrayList();
PreparedStatement statement;
@Override
    public void initialize(URL url, ResourceBundle rb) {

        try {

            
            Connection con = DBConnector.getConnection();

            statement = con.prepareStatement("SELECT * FROM `RevenuePerBus`");

            
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                oblist.add(new Tenantstable(rs.getString("bus_no"), rs.getString("revenue"), rs.getString("tickets_sold")));
            }
        } catch (SQLException ex) {
//            Logger.getLogger(RentScreenController.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println(ex);
        }

        col_1.setCellValueFactory(new PropertyValueFactory<>("bus_no"));
        col_2.setCellValueFactory(new PropertyValueFactory<>("revenue"));
        col_3.setCellValueFactory(new PropertyValueFactory<>("tickets_sold"));

        tenantstableview.setItems(oblist);
    }

}

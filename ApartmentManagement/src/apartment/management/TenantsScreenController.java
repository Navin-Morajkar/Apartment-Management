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

/**
 *
 * @author RISHAB GHANTI
 */
public class TenantsScreenController implements Initializable {
    

@FXML
    private TableView<Tenantstable> tenantstableview;

    @FXML
    private TableColumn<Tenantstable, String> col_fullname;

    @FXML
    private TableColumn<Tenantstable, String> col_flatno;

    @FXML
    private TableColumn<Tenantstable, String> col_phoneno;

ObservableList<Tenantstable> oblist = FXCollections.observableArrayList();
PreparedStatement statement;
@Override
    public void initialize(URL url, ResourceBundle rb) {

        try {

            
            Connection con = DBConnector.getConnection();

            statement = con.prepareStatement("Select fullname,flatno,phoneno FROM tenants");

            
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                oblist.add(new Tenantstable(rs.getString("fullname"), rs.getString("flatno"), rs.getString("phoneno")));
            }
        } catch (SQLException ex) {
//            Logger.getLogger(RentScreenController.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println(ex);
        }

        col_fullname.setCellValueFactory(new PropertyValueFactory<>("fullname"));
        col_flatno.setCellValueFactory(new PropertyValueFactory<>("flatno"));
        col_phoneno.setCellValueFactory(new PropertyValueFactory<>("phoneno"));

        tenantstableview.setItems(oblist);
    }

}

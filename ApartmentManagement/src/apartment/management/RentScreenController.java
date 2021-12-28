/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package apartment.management;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Saish
 */
public class RentScreenController implements Initializable {

    /**
     * Initializes the controller class.
     *
     */
    @FXML
    private TableView<RentsTable> rentsTableView;

    @FXML
    private TableColumn<RentsTable, String> col_duedate;

    @FXML
    private TableColumn<RentsTable, String> col_dueamount;

    @FXML
    private TableColumn<RentsTable, String> col_status;

    @FXML
    private MenuItem paidBtn;

    @FXML
    private MenuItem unpaidBtn;

    PreparedStatement statement;
    public String Username;
//  
    ObservableList<RentsTable> oblist = FXCollections.observableArrayList();

    @FXML
    public void onUnpaidFilterSelect(ActionEvent event) throws IOException {

    try {
            clearRentTable();
            Username = GlobalData.getUsername();
            Connection con = DBConnector.getConnection();
            
            statement = con.prepareStatement("Select duedate,dueamount,status FROM rents where username = ? AND status = 'UNPAID'");

            statement.setString(1, Username);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                oblist.add(new RentsTable(rs.getString("duedate"), rs.getString("dueamount"), rs.getString("status")));
            }
        } catch (SQLException ex) {
//            Logger.getLogger(RentScreenController.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println(ex);
        }

        col_duedate.setCellValueFactory(new PropertyValueFactory<>("duedate"));
        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("dueamount"));
        col_status.setCellValueFactory(new PropertyValueFactory<>("status"));

        rentsTableView.setItems(oblist);
    

    }

 public void onPaidFilterSelect(ActionEvent event) throws IOException {

    try {
            clearRentTable();
            Username = GlobalData.getUsername();
            Connection con = DBConnector.getConnection();
            
            statement = con.prepareStatement("Select duedate,dueamount,status FROM rents where username = ? AND status = 'PAID'");

            statement.setString(1, Username);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                oblist.add(new RentsTable(rs.getString("duedate"), rs.getString("dueamount"), rs.getString("status")));
            }
        } catch (SQLException ex) {
//            Logger.getLogger(RentScreenController.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println(ex);
        }

        col_duedate.setCellValueFactory(new PropertyValueFactory<>("duedate"));
        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("dueamount"));
        col_status.setCellValueFactory(new PropertyValueFactory<>("status"));

        rentsTableView.setItems(oblist);
    

    }

   

    public void clearRentTable() {
        rentsTableView.getItems().clear();
    }

        @Override
        public void initialize(URL url, ResourceBundle rb) {

            try {

                Username = GlobalData.getUsername();

                Connection con = DBConnector.getConnection();

                statement = con.prepareStatement("Select duedate,dueamount,status FROM rents where username = ?");

                statement.setString(1, Username);
                ResultSet rs = statement.executeQuery();

                while (rs.next()) {
                    oblist.add(new RentsTable(rs.getString("duedate"), rs.getString("dueamount"), rs.getString("status")));
                }
            } catch (SQLException ex) {
    //            Logger.getLogger(RentScreenController.class.getName()).log(Level.SEVERE,null,ex);
                System.out.println(ex);
            }

            col_duedate.setCellValueFactory(new PropertyValueFactory<>("duedate"));
            col_dueamount.setCellValueFactory(new PropertyValueFactory<>("dueamount"));
            col_status.setCellValueFactory(new PropertyValueFactory<>("status"));

            rentsTableView.setItems(oblist);
        }

}

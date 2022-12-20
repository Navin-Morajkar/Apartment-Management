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
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 */
public class RentScreenController implements Initializable {

    /**
     * Initializes the controller class.
     *
     */
    @FXML
    private TableView<RentsTable> rentsTableView;

    @FXML
    private TableColumn<RentsTable, String> col_1;

    @FXML
    private TableColumn<RentsTable, String> col_2;

    @FXML
    private TableColumn<RentsTable, String> col_3;
    @FXML
    private TableColumn<RentsTable, String> col_4;

    @FXML
    private TableColumn<RentsTable, String> col_5;

    @FXML
    private TableColumn<RentsTable, String> col_6;

    @FXML
    private TableColumn<RentsTable, String> col_7;

    @FXML
    private TableColumn<RentsTable, String> col_8;

    @FXML
    private TableColumn<RentsTable, String> col_9;


    @FXML
    private MenuItem paidBtn;

    @FXML
    private MenuItem unpaidBtn;

    @FXML
    private Label bal_due;

    PreparedStatement statement, bal;
    public String Username;
//  
    ObservableList<RentsTable> oblist = FXCollections.observableArrayList();

    @FXML
//    public void onUnpaidFilterSelect(ActionEvent event) throws IOException {
//
//        try {
//            clearRentTable();
//            Username = GlobalData.getUsername();
//            Connection con = DBConnector.getConnection();
//
//            statement = con.prepareStatement("SELECT `bus_details`.`trip_no` AS `trip_no`,`bus_details`.`bus_no` AS `bus_no`, `bus_details`.`Source` AS `Source`,`bus_details`.`Destination` AS `Destination`,`bus_details`.`TripDate` AS `TripDate`,`trip_incharge`.`Driver_emp_id` AS `Driver_emp_id`,`trip_incharge`.`Conductor_emp_id` AS `Conductor_emp_id`,`trip_incharge`.`scheduled_dept_time` AS `scheduled_dept_time`,`trip_incharge`.`scheduled_arr_time` AS `scheduled_arr_time` FROM (`bus_details` join `trip_incharge` on(`trip_incharge`.`trip_no_incharge` = `bus_details`.`trip_no`))");
//
//            statement.setString(1, Username);
//            ResultSet rs = statement.executeQuery();
//
//            while (rs.next()) {
//                oblist.add(new RentsTable(rs.getString("trip_no"), rs.getString("bus_no"),rs.getString("Source"),rs.getString("Destination"),rs.getString("TripDate"),rs.getString("Driver_emp_id"),rs.getString("Conductor_emp_id"),rs.getString("scheduled_dept_time"), rs.getString("scheduled_arr_time")));
//            }
//        } catch (SQLException ex) {
////            Logger.getLogger(RentScreenController.class.getName()).log(Level.SEVERE,null,ex);
//            System.out.println(ex);
//        }
//
//        col_duedate.setCellValueFactory(new PropertyValueFactory<>("trip_no"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("bus_no"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("Source"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("Destination"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("TripDate"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("Driver_emp_id"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("Conductor_emp_id"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("scheduled_dept_time"));
//        col_status.setCellValueFactory(new PropertyValueFactory<>("scheduled_arr_time")); try {
//            clearRentTable();
//            Username = GlobalData.getUsername();
//            Connection con = DBConnector.getConnection();
//
//            statement = con.prepareStatement("SELECT `bus_details`.`trip_no` AS `trip_no`,`bus_details`.`bus_no` AS `bus_no`, `bus_details`.`Source` AS `Source`,`bus_details`.`Destination` AS `Destination`,`bus_details`.`TripDate` AS `TripDate`,`trip_incharge`.`Driver_emp_id` AS `Driver_emp_id`,`trip_incharge`.`Conductor_emp_id` AS `Conductor_emp_id`,`trip_incharge`.`scheduled_dept_time` AS `scheduled_dept_time`,`trip_incharge`.`scheduled_arr_time` AS `scheduled_arr_time` FROM (`bus_details` join `trip_incharge` on(`trip_incharge`.`trip_no_incharge` = `bus_details`.`trip_no`))");
//
//            statement.setString(1, Username);
//            ResultSet rs = statement.executeQuery();
//
//            while (rs.next()) {
//                oblist.add(new RentsTable(rs.getString("trip_no"), rs.getString("bus_no"),rs.getString("Source"),rs.getString("Destination"),rs.getString("TripDate"),rs.getString("Driver_emp_id"),rs.getString("Conductor_emp_id"),rs.getString("scheduled_dept_time"), rs.getString("scheduled_arr_time")));
//            }
//        } catch (SQLException ex) {
////            Logger.getLogger(RentScreenController.class.getName()).log(Level.SEVERE,null,ex);
//            System.out.println(ex);
//        }
//
//        col_duedate.setCellValueFactory(new PropertyValueFactory<>("trip_no"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("bus_no"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("Source"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("Destination"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("TripDate"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("Driver_emp_id"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("Conductor_emp_id"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("scheduled_dept_time"));
//        col_status.setCellValueFactory(new PropertyValueFactory<>("scheduled_arr_time"));
//
//        rentsTableView.setItems(oblist);
//
//
//    }


    public void clearRentTable() {
        rentsTableView.getItems().clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        try {
            Username = GlobalData.getUsername();
            Connection con = DBConnector.getConnection();

            statement = con.prepareStatement("SELECT `bus_details`.`trip_no` AS `trip_no`,`bus_details`.`bus_no` AS `bus_no`, `bus_details`.`Source` AS `Source`,`bus_details`.`Destination` AS `Destination`,`bus_details`.`TripDate` AS `TripDate`,`trip_incharge`.`Driver_emp_id` AS `Driver_emp_id`,`trip_incharge`.`Conductor_emp_id` AS `Conductor_emp_id`,`trip_incharge`.`scheduled_dept_time` AS `scheduled_dept_time`,`trip_incharge`.`scheduled_arr_time` AS `scheduled_arr_time` FROM (`bus_details` join `trip_incharge` on(`trip_incharge`.`trip_no_incharge` = `bus_details`.`trip_no`))");

            statement.setString(1, Username);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                oblist.add(new RentsTable(rs.getString("trip_no"), rs.getString("bus_no"), rs.getString("Source"), rs.getString("Destination"), rs.getString("TripDate"), rs.getString("Driver_emp_id"), rs.getString("Conductor_emp_id"), rs.getString("scheduled_dept_time"), rs.getString("scheduled_arr_time")));
            }
        } catch (SQLException ex) {
//            Logger.getLogger(RentScreenController.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println(ex);
        }

        col_1.setCellValueFactory(new PropertyValueFactory<>("trip_no"));
        col_2.setCellValueFactory(new PropertyValueFactory<>("bus_no"));
        col_3.setCellValueFactory(new PropertyValueFactory<>("Source"));
        col_4.setCellValueFactory(new PropertyValueFactory<>("Destination"));
        col_5.setCellValueFactory(new PropertyValueFactory<>("TripDate"));
        col_6.setCellValueFactory(new PropertyValueFactory<>("Driver_emp_id"));
        col_7.setCellValueFactory(new PropertyValueFactory<>("Conductor_emp_id"));
        col_8.setCellValueFactory(new PropertyValueFactory<>("scheduled_dept_time"));
        col_9.setCellValueFactory(new PropertyValueFactory<>("scheduled_arr_time"));

        rentsTableView.setItems(oblist);

//            Username = GlobalData.getUsername();
//
//            Connection con = DBConnector.getConnection();
//
//            statement = con.prepareStatement("Select duedate,dueamount,status FROM rents where username = ?");
//            bal = con.prepareStatement("Select SUM(dueamount) AS bal FROM rents where username = ? AND status = 'UNPAID'");
//
//            statement.setString(1, Username);
//            bal.setString(1, Username);
//
//            ResultSet rs = statement.executeQuery();
//            ResultSet rs2 = bal.executeQuery();
//
//            while (rs.next()) {
//                oblist.add(new RentsTable(rs.getString("trip_no"), rs.getString("bus_no"),rs.getString("Source"),rs.getString("Destination"),rs.getString("TripDate"),rs.getString("Driver_emp_id"),rs.getString("Conductor_emp_id"),rs.getString("scheduled_dept_time"), rs.getString("scheduled_arr_time")));
//            }
//            while (rs2.next()) {
//                bal_due.setText("₹ " +rs2.getString("bal"));
//            }
//        } catch (SQLException ex) {
////            Logger.getLogger(RentScreenController.class.getName()).log(Level.SEVERE,null,ex);
//            System.out.println(ex);
//        }
//
//        col_duedate.setCellValueFactory(new PropertyValueFactory<>("duedate"));
//        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("dueamount"));
//        col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
//
//        rentsTableView.setItems(oblist);
//    }
    }
}

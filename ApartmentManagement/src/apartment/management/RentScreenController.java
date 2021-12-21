/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package apartment.management;
import java.net.URL;
import java.sql.Connection;
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
 * @author Saish
 */
public class RentScreenController implements Initializable {

    /**
     * Initializes the controller class.
     * 
     */
    
    private String Username;
    
    @FXML
    private TableView<RentsTable>rentsTableView;
    
    @FXML
    private TableColumn<RentsTable,String>col_duedate;
     
    @FXML
    private TableColumn<RentsTable,String>col_dueamount;
    
    @FXML
    private TableColumn<RentsTable,String>col_status;
    
    public void setUsername(String username)
    {
        Username = username;
    }
    
    
    ObservableList<RentsTable> oblist = FXCollections.observableArrayList();
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        try{
            
            Connection con = DBConnector.getConnection();
        
            ResultSet rs = con.createStatement().executeQuery("Select duedate,dueamount,status FROM a1rent");
            
            while(rs.next())
            {
                oblist.add(new RentsTable(rs.getString("duedate"),rs.getString("dueamount"), rs.getString("status")));
            }
        } catch (SQLException ex)
        {
//            Logger.getLogger(RentScreenController.class.getName()).log(Level.SEVERE,null,ex);
            System.out.println(ex);
        }
        
        
        
        col_duedate.setCellValueFactory(new PropertyValueFactory<>("duedate"));
        col_dueamount.setCellValueFactory(new PropertyValueFactory<>("dueamount"));
        col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
       
        
        rentsTableView.setItems(oblist);
    }    
    
}

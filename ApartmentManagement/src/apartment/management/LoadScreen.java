/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apartment.management;

import java.net.URL;
import javafx.scene.layout.Pane;
import javafx.*;
import javafx.fxml.FXMLLoader;

/**
 *
 * @author Saish
 */
public class LoadScreen {
    
    private Pane view;
    private String Username;
    
    public Pane getPage(String filename)
    {
        
        
        try {
            
            URL fileurl =  ApartmentManagement.class.getResource("/apartment/management/" + filename + ".fxml");
            
            if(fileurl == null)
            {
                throw new java.io.FileNotFoundException("FXML file not found!");
            }
            
//          FXMLLoader ld = new FXMLLoader(ApartmentManagement.class.getResource("/apartment/management/" + filename + ".fxml"));
//          view = (Pane) ld.load();
            view = new FXMLLoader().load(fileurl);
//  
           
            
        }
        
        
        catch(Exception e)
                {
                    System.out.println("No screen" + filename + " Please check FXML Loader");
                    System.out.println(e);
                }
        return view;
    }
    
//   
    
}

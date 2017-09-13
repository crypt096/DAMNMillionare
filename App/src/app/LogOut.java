/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javafx.scene.control.Alert;


/**
 *
 * @author alex1
 */
public class LogOut {
    
   
    
    
    
    public void LogOutalert () {
        
       Alert alert = new Alert(Alert.AlertType.INFORMATION);
       alert.setTitle("LogOut alert");
       alert.setHeaderText(null);
       alert.setContentText("You have been sucessfully logged out!");

       alert.showAndWait();

      
}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import javafx.scene.control.Alert;


public class AlertBox {
    
    public void  AlertBoxShowing()
            
    {
    
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
       alert.setTitle("Forgot Password Information");
       alert.setHeaderText(null);
       alert.setContentText("Your new password has been sent . Check your entered email!");

       alert.showAndWait();
    
    
    }
    
    
}

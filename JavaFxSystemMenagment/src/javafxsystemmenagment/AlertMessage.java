/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxsystemmenagment;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

/**
 *
 * @author admin
 */
public class AlertMessage {

private Alert alert;
    
    public void succsesMessage(String message){
        alert = new Alert(AlertType,INFORMATION);
        alert.setTitle("Information Message");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
}
    
    public void errorMessage(String message){
        
        alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Message");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }
    
    public boolean confirmMessage(String message){
     
        alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Message");
        alert.setHeaderText(null);
        alert.setContentText(message);
        
        Optional<ButtonTpey> option = alert.showAndWait();
        
        if(option.get().equals(ButtonType.OK)){
           
            return true;}
        else{
        returt false;
        }
       
    }    

    void successMessage(String registered_successfully) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
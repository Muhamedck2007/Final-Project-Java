/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxsystemmenagment;

import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author admin
 */
public class Database {
    
    public static Connection connectDB(){
        
        try {
            Class.forName("com.mysql.jdc.Driver");
            
            Connection connect = DriverManager.getConnection("jbc:mysql://localhost/university","root", "");
            return connect;
        }
      catch (Exception e){
          e.printStackTrace();
      } 
        return null;
    }
    
}

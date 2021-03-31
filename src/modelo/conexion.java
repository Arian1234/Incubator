/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ubuntu
 */
public class conexion {

   //String url = "\\home\\ubuntu\\SQLite\\dbIncubator\\incubator.db";
public static Connection connect=null;
    
    public static Connection connect(){
 try {
     connect = DriverManager.getConnection("jdbc:sqlite:incubator");
     if (connect!=null) {
         System.out.println("Conectado");
     return connect;
     }
     
 }catch (SQLException ex) {
     System.err.println("No se ha podido conectar a la base de datos\n"+ex.getMessage());
  return null;
 }
    return null;
   
}
 public static void close(){
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
 
}

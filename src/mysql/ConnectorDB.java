/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Leisly Pino
 */
public class ConnectorDB {

    public static String url = "jbdc:mysql://localhost/namedb";
    public static String user = "root";
    public static String password = "root";
    public static String library = "com.mysql.jbdc.Driver";

    public static Connection connector() {
        Connection link = null;

        try {
            Class.forName(library);
            link = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Successful Connection");
        } catch (ClassNotFoundException | SQLException e) {

            System.out.println(e);
        }
        return link;
    }
    
    /*    
    Connection con = null;
    Statement stmt =null;
    String txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8;
        
        txt1= txt_name.getText();
        txt2= txt_surname.getText();
        txt3= txt_email.getText();
        txt4= txt_phone.getText();
        txt5= txt_address.getText();
        txt6= cmb_country.getSelectedItem().toString();
        txt7= cmb_city.getSelectedItem().toString();
        txt8= txt_password.getText().toString();
        
        if (txt_name.getText().equals("") || (txt_surname.getText().equals("")) 
           || (txt_email.getText().equals("")) || (txt_phone.getText().equals("")) 
           || (txt_address.getText().equals("")) || (cmb_country.getSelectedItem().equals(""))
           || (cmb_city.getSelectedItem().equals("")) || (txt_password.getText().equals(""))){
            
            javax.swing.JOptionPane.showMessageDialog(this, "empty", "name", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_name.requestFocus();
        }
        
                else {
        try {
           
            String url = "jdbc:mysql://localhost:3306/nombre_de_tu_base_de_datos";
            String usuario = "root";
            String contraseña = "tu_contraseña";
            
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contraseña); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
                  stmt = con.createStatement(); 
                  stmt.executeUpdate("INSERT INTO usuarios VALUES('" + 0 + "','"+cadena2+"','"+cadena3+"','"+cadena4+"','"+cadena5+"','"+cadena6+"','"+cadena7+"')");
                  System.out.println("Los valores han sido agregados a la base de datos ");
                 
                   
        } catch (InstantiationException ex) {
           Logger.getLogger(Form_menu.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           Logger.getLogger(nombre_de_la_clase.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(nombre_de_la_clase.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(nombre_de_la_clase.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        finally {
            if (con != null) {
                try {
                    con.close();
                    stmt.close();
                } catch ( Exception e ) { 
                         System.out.println( e.getMessage());
                }
            }
        }
         javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        this.txt_nombre.setText("");
        this.txt_domicilio.setText("");
        this.txt_telefono.setText("");
        this.txt_nick.setText("");
        this.txt_password.setText("");  

        */

}

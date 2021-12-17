/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static mysql.ConnectorDB.connector;

/**
 *
 * @author Leisly Pino
 */
public class Methods_sql {
    
    public static ConnectorDB link = new ConnectorDB();
    
    public static PreparedStatement ps;
    public static ResultSet result;
    public static String sql;
    public static int num_result = 0;
    
    public int save(String id, String name, String surname, String email, String phone,
            String address, String city, String password){
        int result = 0;
        Connection link  =null;
        
        String save_data =("INSERT INTO users (id, name, surname, email, phone, address, city, password) VALUES (?,?,?,?,?,?,?,?)");
        
        try {
            link = ConnectorDB.connector();
            ps = link.prepareStatement(save_data);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, surname);
            ps.setString(4, email);
            ps.setString(5, phone);
            ps.setString(6, address);
            ps.setString(7, city);
            ps.setString(8, password);
            
            result = ps.executeUpdate();
            link.close();
        }
        catch (Exception e){
           System.out.println(e);
        }
        
        return result;
    
    }
    
    //Login in the system using the database
    
    public static String searchName(String email){
        
        String search_name = null;
        Connection connector = null;
        try {
            connector = ConnectorDB.connector();
            String data_search =("SELECT name FROM users WHERE email = '" + email +"'");
            ps = connector.prepareStatement(data_search);
            result = ps.executeQuery();
            if (result.next()){
                String name = result.getString("name");
                String surname = result.getString("surname");
                search_name = (name + "" + surname);
                
            }
            connector.close();
        } catch (Exception e){
            
            System.out.println(e);
            
        }
        return search_name;
    }
    
    public static String searchUserRegis (String email, String password){
        String search_user =null;
        Connection connector=null;
        try{
            connector =ConnectorDB.connector();
            String statement_search_user = ("SELECT name, email, password FROM users WHERE email = '" + email +"' && password = '" +password+"'");
            ps = connector.prepareStatement(statement_search_user);
            result = ps.executeQuery();
            if (result.next()){
                search_user = "User founded";
                
            } else {
                search_user = "User dosen't founded";
            }
            
            connector.close();
        } catch (Exception e){
            System.out.println(e);
        }
        return search_user;
    }
    
}
 
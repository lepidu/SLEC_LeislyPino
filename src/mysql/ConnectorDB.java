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

    public static String url = "jdbc:mysql://localhost/SLEC_LeislyPino";
    public static String user = "root";
    public static String password = "Dublin";
    public static String library = "com.mysql.jdbc.Driver";

    public static Connection connector() {
        Connection con = null;

        try {
            Class.forName(library);
            con = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Successful Connection");
        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("Error: "+e);
        }
        return con;
    }
}

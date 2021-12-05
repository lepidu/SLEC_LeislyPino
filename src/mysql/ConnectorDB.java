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

    public static Connection relation() {
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

}

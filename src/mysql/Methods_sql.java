package mysql;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * This class contains all the methods that are performed according to the
 * operations selected, in each of the methods it is established with the data
 * obtained from the user towards the update in the database.
 *
 * @author Leisly Pino
 */
public class Methods_sql {

    private static Connection con;
    private static PreparedStatement sentence;
    private static ResultSet result;

    public void save(String name, String surname, String email, String phone,
            String address, String city, String password) {

        try {
            con = ConnectorDB.connector();
            String check = "INSERT INTO users (name, surname, email, phone, address, city, password) VALUES (?,?,?,?,?,?,?)";
            sentence = con.prepareStatement(check);
            sentence.setString(1, name);
            sentence.setString(2, surname);
            sentence.setString(3, email);
            sentence.setString(4, phone);
            sentence.setString(5, address);
            sentence.setString(6, city);
            sentence.setString(7, password);

            int i = sentence.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Data saved");
            } else {
                JOptionPane.showMessageDialog(null, "Error in to save data");
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error: " + e);

            }

        }
    }

    public void saveTwo(String x1, String y1, String r1, String x2,
            String y2, String r2, String x, String y) {

        try {
            con = ConnectorDB.connector();
            String check = "INSERT INTO equation_twov (x1, y1, r1, x2, y2, r2, x, y) VALUES (?,?,?,?,?,?,?,?)";
            sentence = con.prepareStatement(check);
            sentence.setString(1, x1);
            sentence.setString(2, y1);
            sentence.setString(3, r1);
            sentence.setString(4, x2);
            sentence.setString(5, y2);
            sentence.setString(6, r2);
            sentence.setString(7, x);
            sentence.setString(8, y);

            int i = sentence.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Equation saved");
            } else {
                JOptionPane.showMessageDialog(null, "Error in to save equation");
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error: " + e);

            }

        }
    }

    public void saveThree(String x1, String y1, String z1, String r1, String x2,
            String y2, String z2, String r2, String x3, String y3, String z3,
            String r3, String x, String y, String z) {

        try {
            con = ConnectorDB.connector();
            String check = "INSERT INTO equation_threev (x1, y1, z1, r1, x2, y2, z2, r2, x3, y3, z3, r3, x, y, z) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            sentence = con.prepareStatement(check);
            sentence.setString(1, x1);
            sentence.setString(2, y1);
            sentence.setString(3, z1);
            sentence.setString(4, r1);
            sentence.setString(5, x2);
            sentence.setString(6, y2);
            sentence.setString(7, z2);
            sentence.setString(8, r2);
            sentence.setString(9, x3);
            sentence.setString(10, y3);
            sentence.setString(11, z3);
            sentence.setString(12, r3);
            sentence.setString(13, x);
            sentence.setString(14, y);
            sentence.setString(15, z);

            int i = sentence.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Equation saved");
            } else {
                JOptionPane.showMessageDialog(null, "Error in to save equation");
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error: " + e);

            }

        }
    }

    public static String searchEmail(String email) {

        String search_name = null;

        try {
            con = ConnectorDB.connector();
            String data_search = "SELECT email FROM users WHERE email = ? ";
            sentence = con.prepareStatement(data_search);
            sentence.setString(1, email);
            result = sentence.executeQuery();
            if (result.next()) {
                search_name = "Exist email";
            } else {
                search_name = "Is not avaible in the system email";
            }
            con.close();
        } catch (Exception e) {

            System.out.println("Error: " + e);

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Methods_sql.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return search_name;
    }

    public static String searchEmailAdmin(String email) {

        String search_name = null;

        try {
            con = ConnectorDB.connector();
            String data_search = "SELECT email FROM admin WHERE email = ? ";
            sentence = con.prepareStatement(data_search);
            sentence.setString(1, email);
            result = sentence.executeQuery();
            if (result.next()) {
                search_name = "Exist email";
            } else {
                search_name = "Is not avaible in the system email";
            }
            con.close();
        } catch (Exception e) {

            System.out.println("Error: " + e);

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Methods_sql.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return search_name;
    }

    public void changeData(String name, String surname, String address,
            String phone, String password, String city, String email) {
        try {
            con = ConnectorDB.connector();
            String search = "UPDATE users SET name = ?, surname = ?, address = ?, phone = ?, city = ?, password = ? WHERE email = ?";
            sentence = con.prepareStatement(search);
            sentence.setString(1, name);
            sentence.setString(2, surname);
            sentence.setString(3, phone);
            sentence.setString(4, address);
            sentence.setString(5, city);
            sentence.setString(6, password);
            sentence.setString(7, email);

            int i = sentence.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Data change");
            } else {
                JOptionPane.showMessageDialog(null, "Data not change");
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    public void changeDataAdmin(String name, String surname, String phone,
            String password, String email) {
        try {
            con = ConnectorDB.connector();
            String search = "UPDATE admin SET name = ?, surname = ?, phone = ?, password = ? WHERE email = ?";
            sentence = con.prepareStatement(search);
            sentence.setString(1, name);
            sentence.setString(2, surname);
            sentence.setString(3, email);
            sentence.setString(4, password);
            sentence.setString(5, phone);

            int i = sentence.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Data change");
            } else {
                JOptionPane.showMessageDialog(null, "Data not change");
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    public static String searchUserRegis(String email, String password) {
        String search_user = null;
        Connection connector = null;
        try {
            connector = ConnectorDB.connector();
            String statement_search_user = ("SELECT email, password FROM users WHERE email = '" + email + "' && password = '" + password + "'");
            sentence = connector.prepareStatement(statement_search_user);
            result = sentence.executeQuery();
            if (result.next()) {
                search_user = "User founded";

            } else {
                search_user = "User dosen't founded";
            }

            connector.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return search_user;
    }

    public void deleteUser(String email) {
        try {
            con = ConnectorDB.connector();
            String search_delete = "DELETE FROM users WHERE email = ?";
            sentence = con.prepareStatement(search_delete);
            sentence.setString(1, email);
            int row_delete = sentence.executeUpdate();
            if (row_delete > 0) {
                JOptionPane.showMessageDialog(null, "Succefull delete");
            } else {
                JOptionPane.showMessageDialog(null, "Unsuccefull delete");
            }
            con.close();
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error: " + e);

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Methods_sql.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error: " + ex);
            }
        }
    }

}

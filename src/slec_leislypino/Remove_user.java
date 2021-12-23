package slec_leislypino;

import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mysql.ConnectorDB;
import mysql.Methods_sql;

/**
 * This Panel carries out the search for the email that the user enters to
 * delete, where it looks for the email to be existing in the database and gives
 * us the detailed information of the user
 *
 * @author Leisly Pino
 */
public class Remove_user extends javax.swing.JPanel {

    /**
     * Creates new form Remove_user
     */
    public Remove_user() {
        initComponents();
        block();
    }
    private static Connection con;
    private static PreparedStatement sentence;
    private static ResultSet result;
    Methods_sql methods = new Methods_sql();

    public void block() { // Locks panel components
        for (Component c : pnl_delete_user.getComponents()) {
            c.setEnabled(false);
        }
    }

    public void unlock() { // Unlock panel components
        for (Component c : pnl_delete_user.getComponents()) {
            c.setEnabled(true);
        }
    }

    public void erase() { // Clear the data and lock the panel
        name_user.setText("");
        surname_user.setText("");
        address_user.setText("");
        phone_user.setText("");
        password_user.setText("");
        city_user.setText("");
        block();
    }

    public void erase2() { // Clean the email typed by the user
        if (txt_emailUser.getText().isEmpty()) {
            user_status.setText("");
            erase();
        }
    }

    // Search for the email entered in the database to give the user's results
    public void searchUser(String email) {
        try {
            con = ConnectorDB.connector();
            String search_email = "SELECT * FROM users WHERE email = ? ";
            sentence = con.prepareStatement(email);
            sentence.setString(1, email);
            result = sentence.executeQuery();
            if (result.next()) {
                user_status.setText("Existing user");
                name_user.setText(result.getString("name"));
                surname_user.setText(result.getString("surname"));
                phone_user.setText(result.getString("phone"));
                address_user.setText(result.getString("address"));
                password_user.setText(result.getString("password"));
                city_user.setText(result.getString("city"));
                unlock();

            } else {
                user_status.setText("Non-existent user in the System");
                block();
                erase();
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Remove_user.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error: " + ex);
            }
        }
        erase2();
    }

    public void verifyDeletion() { // Ask for the user's confirmation
        int question;
        question = JOptionPane.showConfirmDialog(null, "Are you sure to delete the"
                + " user?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (question == 0) { // 0 is the option yes in the Confim Dialog
            methods.deleteUser(txt_emailUser.getText());
            txt_emailUser.setText("");
            erase2();
            //block(); //check if is neccesary put this method
        } else if (question == 1) {
            // 1 is the option no 2 is cancelar       
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnl_delete_user = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        surname = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        phone_user = new javax.swing.JLabel();
        name_user = new javax.swing.JLabel();
        surname_user = new javax.swing.JLabel();
        address_user = new javax.swing.JLabel();
        city_user = new javax.swing.JLabel();
        password_user = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        user_status = new javax.swing.JLabel();
        txt_emailUser = new javax.swing.JTextField();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Remove User");

        pnl_delete_user.setBackground(new java.awt.Color(255, 255, 255));
        pnl_delete_user.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 16))); // NOI18N

        name.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        name.setText("Name:");

        surname.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        surname.setText("Surname:");

        phone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        phone.setText("Phone:");

        address.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        address.setText("Address:");

        city.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        city.setText("City:");

        password.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        password.setText("Password:");

        btn_delete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        phone_user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        name_user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        surname_user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        address_user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        city_user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        password_user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnl_delete_userLayout = new javax.swing.GroupLayout(pnl_delete_user);
        pnl_delete_user.setLayout(pnl_delete_userLayout);
        pnl_delete_userLayout.setHorizontalGroup(
            pnl_delete_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_delete_userLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_delete_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_delete_userLayout.createSequentialGroup()
                        .addGroup(pnl_delete_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addGroup(pnl_delete_userLayout.createSequentialGroup()
                                .addComponent(phone)
                                .addGap(39, 39, 39)
                                .addComponent(phone_user, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_delete_userLayout.createSequentialGroup()
                                .addComponent(surname)
                                .addGap(22, 22, 22)
                                .addComponent(surname_user, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(pnl_delete_userLayout.createSequentialGroup()
                        .addComponent(name_user, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(pnl_delete_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_delete)
                    .addGroup(pnl_delete_userLayout.createSequentialGroup()
                        .addComponent(city)
                        .addGap(57, 57, 57)
                        .addComponent(city_user, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_delete_userLayout.createSequentialGroup()
                        .addComponent(address)
                        .addGap(30, 30, 30)
                        .addComponent(address_user, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_delete_userLayout.createSequentialGroup()
                        .addComponent(password)
                        .addGap(23, 23, 23)
                        .addComponent(password_user, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        pnl_delete_userLayout.setVerticalGroup(
            pnl_delete_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_delete_userLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_delete_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(address)
                    .addComponent(name_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(address_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(pnl_delete_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surname)
                    .addComponent(surname_user, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city)
                    .addComponent(city_user, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnl_delete_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone)
                    .addComponent(phone_user, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password)
                    .addComponent(password_user, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btn_delete)
                .addGap(22, 22, 22))
        );

        email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        email.setText("Email:");

        user_status.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txt_emailUser.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_delete_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(email)
                .addGap(63, 63, 63)
                .addComponent(txt_emailUser, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(user_status, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(255, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(user_status)
                    .addComponent(txt_emailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(pnl_delete_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        methods.deleteUser(txt_emailUser.getText());
    }//GEN-LAST:event_btn_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel address_user;
    private javax.swing.JButton btn_delete;
    private javax.swing.JLabel city;
    private javax.swing.JLabel city_user;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name_user;
    private javax.swing.JLabel password;
    private javax.swing.JLabel password_user;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel phone_user;
    private javax.swing.JPanel pnl_delete_user;
    private javax.swing.JLabel surname;
    private javax.swing.JLabel surname_user;
    public javax.swing.JTextField txt_emailUser;
    private javax.swing.JLabel user_status;
    // End of variables declaration//GEN-END:variables
}

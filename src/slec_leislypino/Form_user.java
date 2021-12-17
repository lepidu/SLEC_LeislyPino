/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slec_leislypino;

import java.awt.CardLayout;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author Leisly Pino
 */
public class Form_user extends javax.swing.JFrame {

    /**
     * Creates new form Form_user
     */
    
    Change_user change_user =new Change_user();
    Linear_equations equation = new Linear_equations();
    
    CardLayout view;
    
    public Form_user() {
        initComponents();
        this.setTitle("USER");
        this.setResizable(false);
        setLocationRelativeTo(null); //Position in the center of the screen
        
        iconForm();
        
        view = (CardLayout) Main_view.getLayout();
    }
    
    public void iconForm(){
            URL url = getClass().getResource("/images/linear.png");
            ImageIcon icon_form = new ImageIcon();
            setIconImage(icon_form.getImage());
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
        Main_view = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JToggleButton();
        btn_change = new javax.swing.JToggleButton();
        btn_equations = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        Main_view.setBackground(new java.awt.Color(0, 51, 153));

        javax.swing.GroupLayout Main_viewLayout = new javax.swing.GroupLayout(Main_view);
        Main_view.setLayout(Main_viewLayout);
        Main_viewLayout.setHorizontalGroup(
            Main_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );
        Main_viewLayout.setVerticalGroup(
            Main_viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("MENU");

        btn_exit.setBackground(new java.awt.Color(204, 204, 204));
        btn_exit.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btn_exit.setText("Log out");
        btn_exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exit.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_exit.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_change.setBackground(new java.awt.Color(204, 204, 204));
        btn_change.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btn_change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edituser.png"))); // NOI18N
        btn_change.setText("Change Profile");
        btn_change.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_change.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_change.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changeActionPerformed(evt);
            }
        });

        btn_equations.setBackground(new java.awt.Color(204, 204, 204));
        btn_equations.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        btn_equations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/equation.png"))); // NOI18N
        btn_equations.setText("Solve Equations");
        btn_equations.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btn_equations.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equations.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equations.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btn_equations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equationsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_equations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btn_change)
                .addGap(29, 29, 29)
                .addComponent(btn_equations)
                .addGap(31, 31, 31)
                .addComponent(btn_exit)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Main_view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Main_view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        Form_login window = new Form_login();
        window.setVisible(true); //call the Form Regular User
        this.dispose(); //Close this Form          
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changeActionPerformed
        // TODO add your handling code here:
        if (btn_change.isSelected()) {
            Main_view.add(change_user, "change");
            view.show(Main_view, "change");
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();

            btn_equations.setEnabled(false);
            btn_change.setBackground(Color.WHITE);

        } else {
            Main_view.removeAll();
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
            btn_equations.setEnabled(true);
            btn_change.setBackground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_btn_changeActionPerformed

    private void btn_equationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equationsActionPerformed
        // TODO add your handling code here:
        if (btn_equations.isSelected()) {
            Main_view.add(equation, "equation");
            view.show(Main_view, "equation");
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();

            btn_change.setEnabled(false);
            btn_equations.setBackground(Color.WHITE);

        } else {
            Main_view.removeAll();
            SwingUtilities.updateComponentTreeUI(this);
            this.repaint();
            btn_change.setEnabled(true);
            btn_equations.setBackground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_btn_equationsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main_view;
    private javax.swing.JToggleButton btn_change;
    private javax.swing.JToggleButton btn_equations;
    private javax.swing.JToggleButton btn_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

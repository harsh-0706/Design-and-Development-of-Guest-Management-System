/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harsh07_guestmanagementsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hp Vardhan
 */
public class Commit extends javax.swing.JFrame {

  /**
   * Creates new form Commit
   */
  public Commit() {
    initComponents();
    this.setLocationRelativeTo(null);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    jButton1 = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jButton1.setText("Commit");
    jButton1.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton1ActionPerformed(evt);
        }
      }
    );

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel1.setText("Clicking on the button below will save all your records");

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel2.setText("permanently. ");

    jButton2.setText("Okay");
    jButton2.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton2ActionPerformed(evt);
        }
      }
    );

    jButton3.setText("<");
    jButton3.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton3ActionPerformed(evt);
        }
      }
    );

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel3.setText("Save all Records");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
      getContentPane()
    );
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jButton3)
                    .addGap(122, 122, 122)
                    .addComponent(jLabel3)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(171, 171, 171)
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.LEADING,
                          false
                        )
                        .addComponent(
                          jLabel2,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          Short.MAX_VALUE
                        )
                        .addComponent(
                          jButton1,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          javax.swing.GroupLayout.DEFAULT_SIZE,
                          Short.MAX_VALUE
                        )
                        .addGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING,
                          layout
                            .createSequentialGroup()
                            .addComponent(jButton2)
                            .addGap(13, 13, 13)
                        )
                    )
                )
            )
            .addContainerGap(150, Short.MAX_VALUE)
        )
        .addGroup(
          javax.swing.GroupLayout.Alignment.TRAILING,
          layout
            .createSequentialGroup()
            .addGap(0, 50, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(48, 48, 48)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addGap(31, 31, 31)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton3)
                .addComponent(jLabel3)
            )
            .addGap(24, 24, 24)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addGap(38, 38, 38)
            .addComponent(jButton1)
            .addGap(18, 18, 18)
            .addComponent(jButton2)
            .addContainerGap(71, Short.MAX_VALUE)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
    this.dispose();
  } //GEN-LAST:event_jButton3ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    this.dispose();
  } //GEN-LAST:event_jButton2ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement st = con.createStatement();

      String sql = "delete from temp01 ;";
      System.out.println("" + sql);

      try {
        st.executeUpdate(sql);
        //JOptionPane.showMessageDialog(null,"All records deleted successfully. ") ;
      } catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(
          null,
          "Problem in deleting records. \n" + e
        );
      }

      Statement tre = con.createStatement();
      String e = "INSERT INTO TEMP01 SELECT * FROM TEMP ;";

      try {
        tre.executeUpdate(e);
        //JOptionPane.showMessageDialog(null,"All records saved successfully. ") ;
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(
          null,
          ex + "Problem in updating records. \n"
        );
      }

      Statement trea = con.createStatement();
      String eww = "COMMIT ;";

      try {
        trea.executeUpdate(eww);
        JOptionPane.showMessageDialog(null, "All records saved successfully. ");
      } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex + "Problem in Commiting. \n");
      }
    } catch (ClassNotFoundException | SQLException e) {
      JOptionPane.showMessageDialog(
        null,
        "Password cannot be updated. Error in Functions.ChangePassword(int a, String s) function\n " +
        e
      );
    }
  } //GEN-LAST:event_jButton1ActionPerformed

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
      java
        .util.logging.Logger.getLogger(Commit.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java
        .util.logging.Logger.getLogger(Commit.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java
        .util.logging.Logger.getLogger(Commit.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java
        .util.logging.Logger.getLogger(Commit.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {

        public void run() {
          new Commit().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  // End of variables declaration//GEN-END:variables
}

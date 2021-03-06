package harsh07_guestmanagementsystem;

import java.awt.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
// Importing all the required libraries
import java.io.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author harsh-0706
 */
public class CheckOut extends javax.swing.JFrame {

  /**
   * Creates new form CheckOut
   */
  public CheckOut() {
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
    jTextField1 = new javax.swing.JTextField();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jButton1.setText("<");
    jButton1.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton1ActionPerformed(evt);
        }
      }
    );

    jLabel1.setText("Enter the Unique Serial Number");

    jButton2.setText("CheckOut");
    jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton2.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton2ActionPerformed(evt);
        }
      }
    );

    jButton3.setText("Print Receipt");
    jButton3.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton3ActionPerformed(evt);
        }
      }
    );

    jButton4.setText("Okay, Go BAck");
    jButton4.addActionListener(
      new java.awt.event.ActionListener() {

        public void actionPerformed(java.awt.event.ActionEvent evt) {
          jButton4ActionPerformed(evt);
        }
      }
    );

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel2.setText("Check Out a Guest");

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
                    .addGap(20, 20, 20)
                    .addComponent(jButton1)
                    .addGap(126, 126, 126)
                    .addComponent(jLabel2)
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(jLabel1)
                    .addGap(41, 41, 41)
                    .addComponent(
                      jTextField1,
                      javax.swing.GroupLayout.PREFERRED_SIZE,
                      103,
                      javax.swing.GroupLayout.PREFERRED_SIZE
                    )
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(182, 182, 182)
                    .addGroup(
                      layout
                        .createParallelGroup(
                          javax.swing.GroupLayout.Alignment.TRAILING
                        )
                        .addComponent(jButton3)
                        .addComponent(
                          jButton2,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          98,
                          javax.swing.GroupLayout.PREFERRED_SIZE
                        )
                    )
                )
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(jButton4)
                )
            )
            .addGap(22, 80, Short.MAX_VALUE)
        )
    );
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jButton1)
                .addComponent(jLabel2)
            )
            .addGap(31, 31, 31)
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(
                  jTextField1,
                  javax.swing.GroupLayout.PREFERRED_SIZE,
                  javax.swing.GroupLayout.DEFAULT_SIZE,
                  javax.swing.GroupLayout.PREFERRED_SIZE
                )
            )
            .addGap(36, 36, 36)
            .addComponent(jButton2)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.UNRELATED
            )
            .addComponent(jButton3)
            .addGap(46, 46, 46)
            .addComponent(jButton4)
            .addContainerGap(48, Short.MAX_VALUE)
        )
    );

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton1ActionPerformed
    //Front f = new Front() ;
    this.dispose();
    //f.setVisible(true) ;
  } //GEN-LAST:event_jButton1ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton2ActionPerformed
    String SDate = "", SNum = "";

    //        if(jRadioButton1.isSelected())
    //        {
    //            SDate = jTextField2.getText() ;
    //            SNum = jTextField3.getText() ;
    //        }

    boolean oye = true;
    // Modifying this code a bit so that I can incorporate the part when we enter the unique
    // identification string
    //String y = jTextField4.getText() ;

    Functions fx = new Functions();

    boolean aage = true;
    if (jTextField1.getText().equals("")) {
      //if(jTextField4.getText().equals(""))
      {
        aage = false;
        JOptionPane.showMessageDialog(
          null,
          "The field can't be empty. Please enter the correct information."
        );
      }
      //else
      {
        // int e = fx.getSerialNumber(y) ;
      }
    }

    // Previously written code
    int a = Integer.parseInt(jTextField1.getText());
    String s1 = "", s2 = "";
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement rq = con.createStatement();
      String sql =
        "select gdepdate, gdeptime from Temp where gsno = " + a + " ; ";
      ResultSet rs = rq.executeQuery(sql);
      // System.out.println(sql) ;
      rs.next();
      s1 = rs.getString(1);
      if (rs.wasNull()) {
        s1 = "";
      }
      //            rs.next() ;
      s2 = rs.getString(2);
      if (rs.wasNull()) {
        s2 = "";
      }
      boolean okey = (s1.equals("") && s2.equals(""));
      // System.out.println("Okey : " + okey) ;
      //            JOptionPane.showMessageDialog(null,s1+" dsaf "+s2 ) ;
      //            // System.out.println(s1+" dsaf "+s2) ;

      //            ok = (s1.equals(null) && s2.equals(null));
      con.close();
    } catch (SQLException ex) {
      oye = false;
      JOptionPane.showMessageDialog(
        null,
        "You are checking out a guest who hasn't even come yet or has already checked out.\n Please Try again." +
        ex
      );
      Front f = new Front();
      this.dispose();
      f.setVisible(true);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "There's a bug here. " + e);
    }

    boolean ok = (s1.equals("") && s2.equals(""));
    // System.out.println("Value of ok : -" + ok + "  s1 : - " + s1 + " s2 : -  "+ s2 ) ;

    if (!ok) {
      JOptionPane.showMessageDialog(
        null,
        "The guest has already checked out. \nYou can't do this process now.\n Please Try again."
      );
      Front f = new Front();
      this.dispose();
      f.setVisible(true);
    }

    if (ok && oye) try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
      java.util.Date date = new java.util.Date();

      DateFormat dateFormat0 = new SimpleDateFormat("HH:mm");
      java.util.Date date0 = new java.util.Date();

      Statement st = con.createStatement();
      String str =
        "Update Temp set gdepdate = '" +
        dateFormat.format(date) +
        "' , gdeptime =  '" +
        dateFormat0.format(date0) +
        "' where gsno = " +
        a +
        " ; ";
      System.out.println(str);
      try {
        st.executeUpdate(str);
        JOptionPane.showMessageDialog(
          null,
          "Record Updated Successfully! Checkout Successful !!"
        );
      } catch (Exception e) {
        JOptionPane.showMessageDialog(
          null,
          "There is something wrtong with Updation Statement in temp0\n\n" + e
        );
      }
      con.close();

      //            if(jRadioButton1.isSelected())
      //            {
      //                try{
      //                    Class.forName("com.mysql.cj.jdbc.Driver") ;
      //                    //Connection con ;
      //                    con = DriverManager.getConnection(
      //                        "jdbc:mysql://localhost:3306/harsh", "root", "SYSTEM"
      //                    );
      //
      //                    Statement stm = con.createStatement() ;
      //                    String stem = "Update temp set gsecdate = '" + SDate +  "' and gsecnum =  '" + SNum + "' where gsnum  = " + a + "' ; " ;
      //                    // System.out.println(stem) ;
      //                    try{
      //                        stm.executeUpdate(stem) ;
      //                        JOptionPane.showMessageDialog(null,"Security Records Updated Successfully. !! ") ;
      //                    }
      //                    catch(Exception e)
      //                    {
      //                        JOptionPane.showMessageDialog(null, "There is a bug near line 245 in CheckOut \n" + e ) ;
      //                    }
      //                    con.close() ;
      //
      //                }
      //                catch(Exception e)
      //                {
      //
      //                }
      //            }

      //Front f = new Front() ;
      this.dispose();
      //f.setVisible(true) ;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(
        null,
        "Kuch Galti hai. Checkout 265 \n" + e
      );
    }
  } //GEN-LAST:event_jButton2ActionPerformed

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton3ActionPerformed
    int a = Integer.parseInt(jTextField1.getText());
    String Output = "";
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection con;
      con =
        DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/harsh",
          "root",
          "SYSTEM"
        );

      Statement rq = con.createStatement();
      String sql = "select * from Temp where gsno = " + a + " ; ";
      ResultSet rs = rq.executeQuery(sql);

      while (rs.next()) {
        //// System.out.println(
        Output +=
          //for(int i=1 ; i<=22 ; i++) rs.getString(i)+ " " +
          rs.getString(1) +
          " \n" +
          rs.getString(2) +
          " \n" +
          rs.getString(3) +
          " \n" +
          rs.getString(4) +
          " \n" +
          rs.getString(5) +
          " \n" +
          rs.getString(6) +
          " \n" +
          rs.getString(7) +
          " \n" +
          rs.getString(8) +
          " \n" +
          rs.getString(9) +
          " \n" +
          rs.getString(10) +
          " \n" +
          rs.getString(11) +
          " \n" +
          rs.getString(12) +
          " \n" +
          rs.getString(13) +
          " \n" +
          rs.getString(14) +
          " \n" +
          rs.getString(15) +
          " \n" +
          rs.getString(16) +
          " \n" +
          rs.getString(17) +
          " \n" +
          rs.getString(18) +
          " \n" +
          rs.getString(19) +
          " \n" +
          rs.getString(20) +
          " \n" +
          rs.getString(21) +
          " \n" +
          rs.getString(22) +
          " \n" +
          rs.getString(23);
        // ) ;
      }

      con.close();
    } catch (Exception e) {}

    //// yahaan pe I'll write in the file
    try {
      FileWriter fw = new FileWriter("C:\\bill_receipts\\receipts.txt");
      PrintWriter pw = new PrintWriter(fw);
      String str = jTextField1.getText();
      a = Integer.parseInt(str);
      boolean task = true;
      if (str.equals("")) {
        JOptionPane.showMessageDialog(
          null,
          "The field for next episode is empty.\n Fill it again.\n For Fucks Sake, don't do it again. "
        );
        task = false;
      }
      if (task) {
        pw.print("");
        pw.println(Output);
      }
      pw.close();

      if (task) {
        JOptionPane.showMessageDialog(null, "Task Completed Successfully.");
        //jTextField2.setText("") ;
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "275" + e);
    }
  } //GEN-LAST:event_jButton3ActionPerformed

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton4ActionPerformed
    // TODO add your handling code here:
    this.dispose();
  } //GEN-LAST:event_jButton4ActionPerformed

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
        .util.logging.Logger.getLogger(CheckOut.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java
        .util.logging.Logger.getLogger(CheckOut.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java
        .util.logging.Logger.getLogger(CheckOut.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java
        .util.logging.Logger.getLogger(CheckOut.class.getName())
        .log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
      new Runnable() {

        public void run() {
          new CheckOut().setVisible(true);
        }
      }
    );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JTextField jTextField1;
  // End of variables declaration//GEN-END:variables
}

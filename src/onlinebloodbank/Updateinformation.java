/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebloodbank;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author shamimul
 */
public class Updateinformation extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    
    
    /**
     * Creates new form Updateinformation
     */
    public Updateinformation() {
        initComponents();
          setLocation(200,10);
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jttxtfname = new javax.swing.JTextField();
        jttxtlname = new javax.swing.JTextField();
        jttxtuname = new javax.swing.JTextField();
        jttxtcno = new javax.swing.JTextField();
        jttxteadd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jttxtgnd = new javax.swing.JComboBox<>();
        jttxtbgup = new javax.swing.JComboBox<>();
        jttxtpass = new javax.swing.JPasswordField();
        jttxtupdatebut = new javax.swing.JButton();
        jttxtrest = new javax.swing.JButton();
        jbtnbk = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jttxtadd = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jttxtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttxtfnameActionPerformed(evt);
            }
        });

        jttxtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttxtlnameActionPerformed(evt);
            }
        });

        jttxtuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttxtunameActionPerformed(evt);
            }
        });

        jttxtcno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttxtcnoActionPerformed(evt);
            }
        });

        jttxteadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttxteaddActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel4.setText("User Name");

        jLabel5.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel5.setText("Contact No");

        jLabel6.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel6.setText("E-mail Address");

        jLabel7.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel7.setText("Blood Group");

        jLabel8.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel8.setText("Address");

        jLabel9.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel9.setText("Confarm youre Password");

        jLabel11.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jLabel11.setText("Gender");

        jttxtgnd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        jttxtgnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttxtgndActionPerformed(evt);
            }
        });

        jttxtbgup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jttxtbgup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttxtbgupActionPerformed(evt);
            }
        });

        jttxtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttxtpassActionPerformed(evt);
            }
        });

        jttxtupdatebut.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jttxtupdatebut.setText("Update");
        jttxtupdatebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttxtupdatebutActionPerformed(evt);
            }
        });

        jttxtrest.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jttxtrest.setText("Reset");
        jttxtrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jttxtrestActionPerformed(evt);
            }
        });

        jbtnbk.setFont(new java.awt.Font("Stencil", 0, 11)); // NOI18N
        jbtnbk.setText("<-- Back");
        jbtnbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbkActionPerformed(evt);
            }
        });

        jttxtadd.setColumns(20);
        jttxtadd.setRows(5);
        jScrollPane2.setViewportView(jttxtadd);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("User Information Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(444, 444, 444)
                        .addComponent(jbtnbk, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jttxtrest, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jttxtupdatebut, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jttxtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jttxtpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jttxtuname, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jttxtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jttxtcno, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jttxteadd, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jttxtbgup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jttxtgnd, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jttxtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jttxtgnd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jttxtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jttxtbgup, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jttxtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jttxtuname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jttxtcno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jttxteadd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jttxtupdatebut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jttxtrest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnbk, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jttxtupdatebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttxtupdatebutActionPerformed
     try{
          String query = "UPDATE `registration` SET `First Name`=?,`Last Name`=?,`User Name`=?,`Contact No`=?,`E-mail Address`=?,`Gender`=?,`Blood Group`=?,`Address`=? WHERE `Password`=?";
          con = DriverManager.getConnection("jdbc:mysql://localhost/bloodbankdb","root","");
          pst = con.prepareStatement(query);
          
          
          pst.setString(1,jttxtfname.getText());
          pst.setString(2,jttxtlname.getText());
          pst.setString(3,jttxtuname.getText());
          pst.setString(4,jttxtcno.getText());
          pst.setString(5,jttxteadd.getText());
          pst.setString(6,jttxtgnd.getSelectedItem().toString());
          pst.setString(7,jttxtbgup.getSelectedItem().toString());
          pst.setString(8,jttxtadd.getText());
          pst.setString(9,jttxtpass.getText());
          
          
          pst.executeUpdate();
          JOptionPane.showMessageDialog(null, "Update Successful!!!");
          
          
          
        }
         catch(SQLException |HeadlessException ex){
         JOptionPane.showMessageDialog(null, ex);   
        }
     
     
    
    }//GEN-LAST:event_jttxtupdatebutActionPerformed

         
             
     
    private void jttxtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttxtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jttxtfnameActionPerformed

    private void jttxtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttxtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jttxtlnameActionPerformed

    private void jttxtunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttxtunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jttxtunameActionPerformed

    private void jttxtcnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttxtcnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jttxtcnoActionPerformed

    private void jttxteaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttxteaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jttxteaddActionPerformed

    private void jttxtgndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttxtgndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jttxtgndActionPerformed

    private void jttxtbgupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttxtbgupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jttxtbgupActionPerformed

    private void jbtnbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbkActionPerformed
        new choice().setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnbkActionPerformed

    private void jttxtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttxtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jttxtpassActionPerformed

    private void jttxtrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jttxtrestActionPerformed
        jttxtfname.setText("");
        jttxtlname.setText("");
        jttxtuname.setText("");
        jttxtcno.setText("");
        jttxteadd.setText("");
        jttxtadd.setText("");
        
        jttxtpass.setText("");
        
    }//GEN-LAST:event_jttxtrestActionPerformed

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
            java.util.logging.Logger.getLogger(Updateinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Updateinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Updateinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Updateinformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Updateinformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnbk;
    private javax.swing.JTextArea jttxtadd;
    private javax.swing.JComboBox<String> jttxtbgup;
    private javax.swing.JTextField jttxtcno;
    private javax.swing.JTextField jttxteadd;
    private javax.swing.JTextField jttxtfname;
    private javax.swing.JComboBox<String> jttxtgnd;
    private javax.swing.JTextField jttxtlname;
    private javax.swing.JPasswordField jttxtpass;
    private javax.swing.JButton jttxtrest;
    private javax.swing.JTextField jttxtuname;
    private javax.swing.JButton jttxtupdatebut;
    // End of variables declaration//GEN-END:variables
}
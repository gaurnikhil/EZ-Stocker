
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shreyas
 */
public class Remove extends javax.swing.JFrame {

    /**
     * Creates new form remove
     */
    public Remove() {
        initComponents();
    }
    Remove(String userid)
    {
        initComponents();
        jLabel8.setText(userid);
        this.setResizable(false);
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

        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 154, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel3.setText("Product name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 337, 189, 29));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setText("Product Brand");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 385, 189, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel5.setText("Product category");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 429, 197, 40));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setText("Threshold Value");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 488, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel7.setText("Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 539, 123, 31));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 331, 154, -1));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 380, 154, -1));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 429, 154, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        jLabel1.setText("Remove product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 287, 45));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 485, 154, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 131, 33));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setText("Enter product ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 31));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 534, 154, -1));

        jButton7.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton7.setText("Delete");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 611, 152, -1));

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton6.setText("Show Details");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 213, 38));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 700, 90, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel9.setText("Welcome");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 110, 33));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/screenshot__193_-removebg-prev.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/white-blue-water-gradient-background-vector-10507865.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
               // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    String icode=jTextField1.getText();
    String userid=jLabel8.getText();
    int input = JOptionPane.showConfirmDialog(this,
     "Are you sure?", "Confirmation",JOptionPane.YES_NO_OPTION);
    if(input==0)
    {
        try
        {
            if(jTextField2.getText()==null)
            JOptionPane.showMessageDialog(this, "Enter valid item code");
            else
            {
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection
                (EZStockerDataSource.connect,EZStockerDataSource.userid,EZStockerDataSource.passwd);
                Statement stmt=(Statement)con.createStatement();
                String query="Delete from item where itemcode='"+icode+"' and userid='"+userid+"';";
                stmt.executeUpdate(query);

                JOptionPane.showMessageDialog (this,"Item deleted");
        
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
        
        
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());}
        }
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    String icode=jTextField1.getText();
    String userid=jLabel8.getText();
    try
    {
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)DriverManager.getConnection
        ( "jdbc:mysql://localhost:3306/foodpile?verifyServerCertificate=false&useSSL=true","root","shreyas");
        Statement stmt=(Statement)con.createStatement();
        String query="SELECT name,category,brand,price,threshold from item where itemcode='"+icode+"'and userid='"+userid+"';";
        ResultSet rs=stmt.executeQuery(query);    
        if (rs.next())      
        { 
              jTextField2.setText((String)rs.getString("name"));
              jTextField3.setText((String)rs.getString("brand"));
              jTextField4.setText((String)rs.getString("category"));
              jTextField5.setText((String)rs.getString("threshold"));
              jTextField6.setText((String)rs.getString("price"));
        }
       
        else 
            JOptionPane.showMessageDialog (this,"Sorry! Invalid Product Code");
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(this,e.getMessage());
     }


       // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String user=jLabel8.getText();
    new Home(user).setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Remove().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}

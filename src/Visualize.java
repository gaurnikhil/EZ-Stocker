
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shreyas
 */
public class Visualize extends javax.swing.JFrame {

    /**
     * Creates new form Visualize
     */
    public Visualize() {
        initComponents();
         
    }
    Visualize(String userid)
    {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        Date d=new Date();  
        int year=d.getYear(); 
        jSpinner1.setValue(year+1900);
        jLabel1.setText(userid);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 151, 32));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.jpg"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 610, 100, -1));

        jXDatePicker1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        getContentPane().add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 210, 37));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel2.setText("From");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 83, 28));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel3.setText("To");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        jXDatePicker2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jXDatePicker2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDatePicker2ActionPerformed(evt);
            }
        });
        getContentPane().add(jXDatePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 310, 210, 34));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 30)); // NOI18N
        jLabel4.setText("Graphical Representation of Data");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 501, 55));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel5.setText("Welcome");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 120, 32));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel6.setText("Current Inventory Visualization");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, 53));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel7.setText("Transaction Visualization");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 288, -1));

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Any-", "Items per category", "Items per brand" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 330, -1));

        jComboBox2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Any-", "Compare purchase of items", "Compare sale of items", " " }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 360, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1009, 566, 169, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 210, 2, 390));

        jSpinner1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 480, 110, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/screenshot__193_-removebg-prev.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 270, 120));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel11.setText("Select Year");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Any-", "Month-wise purchase", "Month-wise Sale" }));
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 350, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/white-blue-water-gradient-background-vector-10507865.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String userid=jLabel1.getText();
    new Home(userid).setVisible(true);
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    if(jComboBox1.getSelectedIndex()==1)
    {
        String userid=jLabel1.getText();
        DefaultPieDataset pieDataset=new DefaultPieDataset();


        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection
            (EZStockerDataSource.connect,EZStockerDataSource.userid,EZStockerDataSource.passwd);
            Statement stmt=(Statement)con.createStatement();
            String query="SELECT count(itemcode) as count,category FROM ITEM WHERE USERID='"+userid+"' group by category;";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String brand=rs.getString("category");
                int count=Integer.parseInt(rs.getString("count"));
                pieDataset.setValue(brand,count);

            }
            JFreeChart chart=ChartFactory.createPieChart("Items in each category", pieDataset, true, true,true);
            PiePlot P=(PiePlot)chart.getPlot(); 
            ChartFrame frame=new ChartFrame("Pie Chart",chart);
            frame.setVisible(true);
            frame.setSize(450,500);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }
    else if(jComboBox1.getSelectedIndex()==2)
    {
        String userid=jLabel1.getText();
        DefaultPieDataset pieDataset=new DefaultPieDataset();


        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection
            (EZStockerDataSource.connect,EZStockerDataSource.userid,EZStockerDataSource.passwd);
            Statement stmt=(Statement)con.createStatement();
            String query="SELECT count(itemcode) as count,brand FROM ITEM WHERE USERID='"+userid+"' group by brand;";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String brand=rs.getString("brand");
                int count=Integer.parseInt(rs.getString("count"));
                pieDataset.setValue(brand,count);

            }
            JFreeChart chart=ChartFactory.createPieChart("Items in each brand", pieDataset, true, true,true);
            PiePlot P=(PiePlot)chart.getPlot(); 
            ChartFrame frame=new ChartFrame("Pie Chart",chart);
            frame.setVisible(true);
            frame.setSize(450,500);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }

    }
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    if(jComboBox2.getSelectedIndex()==1)
    {
        String userid=jLabel1.getText();
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        try
        {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String fromdate,todate;
            if(jXDatePicker1.getDate()!=null)
                fromdate = format.format(jXDatePicker1.getDate()); 
            else fromdate=format.format(new Date(0));
            if(jXDatePicker2.getDate()!=null)
                todate = format.format(jXDatePicker2.getDate());
            else todate=format.format(new Date());
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection
            (EZStockerDataSource.connect,EZStockerDataSource.userid,EZStockerDataSource.passwd);
            Statement stmt=(Statement)con.createStatement();
            String query="SELECT sum(purchase.quantity) as count,name FROM ITEM,PURCHASE WHERE ITEM.ITEMCODE = PURCHASE.ITEMCODE AND "
                    + "ITEM.USERID='"+userid+"' and PDate<='"+todate+"' and PDate>='"+fromdate+"' group by ITEM.NAME;";       
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String name=rs.getString("name");
                int count=Integer.parseInt(rs.getString("count"));
                dataset.setValue(count,"Count of item",name);
                    
            }
            JFreeChart chart=ChartFactory.createBarChart("No. of items","Item Name","Quantity Purchased", dataset, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot p=chart.getCategoryPlot();
            p.setRangeGridlinePaint(Color.black);
            ChartFrame frame = new ChartFrame("Bar chart for quantity purchased of each item",chart );
            frame.setVisible(true);
            frame.setSize(450,350);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }
    else if(jComboBox2.getSelectedIndex()==2)
    {
        String userid=jLabel1.getText();
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        try
        {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String fromdate,todate;
            if(jXDatePicker1.getDate()!=null)
                fromdate = format.format(jXDatePicker1.getDate()); 
            else fromdate=format.format(new Date(0));
            if(jXDatePicker2.getDate()!=null)
                todate = format.format(jXDatePicker2.getDate());
            else todate=format.format(new Date()); 
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection
            (EZStockerDataSource.connect,EZStockerDataSource.userid,EZStockerDataSource.passwd);
            Statement stmt=(Statement)con.createStatement();
            String query="SELECT sum(SELL.quantity) as count,name FROM ITEM,SELL WHERE ITEM.ITEMCODE = SELL.ITEMCODE AND "
                    + "ITEM.USERID='"+userid+"' and SDate<='"+todate+"' and SDate>='"+fromdate+"' group by ITEM.NAME;";       
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String name=rs.getString("name");
                int count=Integer.parseInt(rs.getString("count"));
                dataset.setValue(count,"Count of item",name);

            }
            JFreeChart chart=ChartFactory.createBarChart("No. of items","Item Name","Quantity Sold", dataset, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot p=chart.getCategoryPlot();
            p.setRangeGridlinePaint(Color.black);
            ChartFrame frame = new ChartFrame("Bar chart for quantity sold of each item",chart );
            frame.setVisible(true);
            frame.setSize(450,350);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }
   
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jXDatePicker2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDatePicker2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXDatePicker2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
    if(jComboBox3.getSelectedIndex()==1)
    {
        String userid=jLabel1.getText();
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        try
        {
            int year=(int) jSpinner1.getValue();
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection
            (EZStockerDataSource.connect,EZStockerDataSource.userid,EZStockerDataSource.passwd);
            Statement stmt=(Statement)con.createStatement();
            String query="SELECT 'January' AS mName, COALESCE(SUM(cprice),0) AS Total_cost FROM purchase p WHERE month(p.pdate) = 1 AND YEAR(p.pdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'February' AS mName, COALESCE(SUM(cprice),0) AS Total_cost FROM purchase p WHERE month(p.pdate) = 2 AND YEAR(p.pdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'March' AS mName, COALESCE(SUM(cprice),0) AS Total_cost FROM purchase p WHERE month(p.pdate) = 3 AND YEAR(p.pdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'April' AS mName, COALESCE(SUM(cprice),0) AS Total_cost FROM purchase p WHERE month(p.pdate) = 4 AND YEAR(p.pdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'May' AS mName, COALESCE(SUM(cprice),0) AS Total_cost FROM purchase p WHERE month(p.pdate) = 5 AND YEAR(p.pdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'June' AS mName, COALESCE(SUM(cprice),0) AS Total_cost FROM purchase p WHERE month(p.pdate) = 6 AND YEAR(p.pdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'July' AS mName, COALESCE(SUM(cprice),0) AS Total_cost FROM purchase p WHERE month(p.pdate) = 7 AND YEAR(p.pdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'August' AS mName, COALESCE(SUM(cprice),0) AS Total_cost FROM purchase p WHERE month(p.pdate) = 8 AND YEAR(p.pdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'September' AS mName, COALESCE(SUM(cprice),0) AS Total_cost FROM purchase p WHERE month(p.pdate) = 9 AND YEAR(p.pdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'October' AS mName, COALESCE(SUM(cprice),0) AS Total_cost FROM purchase p WHERE month(p.pdate) = 10 AND YEAR(p.pdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'November' AS mName, COALESCE(SUM(cprice),0) AS Total_cost FROM purchase p WHERE month(p.pdate) = 11 AND YEAR(p.pdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'December' AS mName, COALESCE(SUM(cprice),0) AS Total_cost FROM purchase p WHERE month(p.pdate) = 12 AND YEAR(p.pdate)="+year+" and userid='"+userid+"';";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String Month=rs.getString("mName");
                int Total_cost=Integer.parseInt(rs.getString("Total_cost"));
                dataset.setValue(Total_cost,"Purchase cost",Month);
                    
            }
            JFreeChart chart=ChartFactory.createBarChart("Month wise purchase for the year "+year,"Year "+year,"Amount", dataset, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot p=chart.getCategoryPlot();
            p.setRangeGridlinePaint(Color.black);
            ChartFrame frame = new ChartFrame("Bar chart for month wise purchase for the year "+year,chart );
            frame.setVisible(true);
            frame.setSize(450,350);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }
    else if(jComboBox3.getSelectedIndex()==2)
    {
         String userid=jLabel1.getText();
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        try
        {
            int year=(int) jSpinner1.getValue();
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection
            (EZStockerDataSource.connect,EZStockerDataSource.userid,EZStockerDataSource.passwd);
            Statement stmt=(Statement)con.createStatement();
            String query="SELECT 'January' AS mName, COALESCE(SUM(sprice),0) AS Total_sale FROM sell p WHERE month(p.sdate) = 1 AND YEAR(p.sdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'February' AS mName, COALESCE(SUM(sprice),0) AS Total_sale FROM sell p WHERE month(p.sdate) = 2 AND YEAR(p.sdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'March' AS mName, COALESCE(SUM(sprice),0) AS Total_sale FROM sell p WHERE month(p.sdate) = 3 AND YEAR(p.sdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'April' AS mName, COALESCE(SUM(sprice),0) AS Total_sale FROM sell p WHERE month(p.sdate) = 4 AND YEAR(p.sdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'May' AS mName, COALESCE(SUM(sprice),0) AS Total_sale FROM sell p WHERE month(p.sdate) = 5 AND YEAR(p.sdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'June' AS mName, COALESCE(SUM(sprice),0) AS Total_sale FROM sell p WHERE month(p.sdate) = 6 AND YEAR(p.sdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'July' AS mName, COALESCE(SUM(sprice),0) AS Total_sale FROM sell p WHERE month(p.sdate) = 7 AND YEAR(p.sdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'August' AS mName, COALESCE(SUM(sprice),0) AS Total_sale FROM sell p WHERE month(p.sdate) = 8 AND YEAR(p.sdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'September' AS mName, COALESCE(SUM(sprice),0) AS Total_sale FROM sell p WHERE month(p.sdate) = 9 AND YEAR(p.sdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'October' AS mName, COALESCE(SUM(sprice),0) AS Total_sale FROM sell p WHERE month(p.sdate) = 10 AND YEAR(p.sdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'November' AS mName, COALESCE(SUM(sprice),0) AS Total_sale FROM sell p WHERE month(p.sdate) = 11 AND YEAR(p.sdate)="+year+" and userid='"+userid+"' UNION\n" +
                    "SELECT 'December' AS mName, COALESCE(SUM(sprice),0) AS Total_sale FROM sell p WHERE month(p.sdate) = 12 AND YEAR(p.sdate)="+year+" and userid='"+userid+"';";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String Month=rs.getString("mName");
                int Total_sale=Integer.parseInt(rs.getString("Total_sale"));
                dataset.setValue(Total_sale,"Total sale",Month);
                    
            }
            JFreeChart chart=ChartFactory.createBarChart("Month wise sale for the year "+year,"Year "+year,"Amount", dataset, PlotOrientation.VERTICAL, false, true, false);
            CategoryPlot p=chart.getCategoryPlot();
            p.setRangeGridlinePaint(Color.black);
            ChartFrame frame = new ChartFrame("Bar chart for month wise sale for the year "+year,chart );
            frame.setVisible(true);
            frame.setSize(450,350);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

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
            java.util.logging.Logger.getLogger(Visualize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visualize().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    // End of variables declaration//GEN-END:variables
}

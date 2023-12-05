/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.shop.billing;

import com.shop.Home;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Sellproduct extends javax.swing.JFrame {


    public Sellproduct() {
        initComponents();
        table_update();
        table_update1();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnClear = new javax.swing.JPanel();
        btnInventoryToHome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtS_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtS_Brand = new javax.swing.JTextField();
        txtS_amountBox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtS_note = new javax.swing.JTextArea();
        btnMakeBill = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtS_customerName = new javax.swing.JTextField();
        txtS_C_address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Sell product");

        btnClear.setBackground(new java.awt.Color(204, 255, 204));

        btnInventoryToHome.setBackground(new java.awt.Color(255, 255, 204));
        btnInventoryToHome.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnInventoryToHome.setText("Go to home page>");
        btnInventoryToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryToHomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Product Name :");

        jLabel3.setText("Brand :");

        jLabel5.setText("Amount of Box :");

        jLabel6.setText("Note :");

        txtS_note.setColumns(20);
        txtS_note.setRows(5);
        txtS_note.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(txtS_note);

        btnMakeBill.setBackground(new java.awt.Color(255, 0, 51));
        btnMakeBill.setText("Make Bill");
        btnMakeBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeBillActionPerformed(evt);
            }
        });

        jLabel7.setText("Customer Name :");

        jLabel8.setText("Customer Address :");

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setText("clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnClearLayout = new javax.swing.GroupLayout(btnClear);
        btnClear.setLayout(btnClearLayout);
        btnClearLayout.setHorizontalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClearLayout.createSequentialGroup()
                .addGroup(btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnClearLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(btnClearLayout.createSequentialGroup()
                                .addGroup(btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtS_name, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(txtS_Brand)
                                        .addComponent(txtS_amountBox)
                                        .addComponent(txtS_customerName)
                                        .addComponent(txtS_C_address))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnInventoryToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(btnClearLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnMakeBill, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        btnClearLayout.setVerticalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClearLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnInventoryToHome)
                .addGap(49, 49, 49)
                .addGroup(btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtS_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtS_Brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtS_customerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtS_C_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtS_amountBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClearLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)))
                .addGap(110, 110, 110)
                .addGroup(btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMakeBill, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        tblProduct.setBackground(new java.awt.Color(255, 204, 204));
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Brand", "Available Box", "Price /Box (TK)", "Description"
            }
        ));
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Shop Name", "Address", "Phone"
            }
        ));
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCustomer);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        Connection con1;
        PreparedStatement insert;
        
        //table for product 
        private void table_update(){
            int c;
            
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_manage","root","Majumder@reshad");
                    insert = con1.prepareStatement("select * from product ");
                    ResultSet rs = insert.executeQuery();
                    ResultSetMetaData rssm = rs.getMetaData();
                    
                    c=rssm.getColumnCount();
                    
                    DefaultTableModel Df = (DefaultTableModel)tblProduct.getModel();
                    
                    Df.setRowCount(0);
                    while(rs.next()){
                    
                    Vector v2=new Vector();
                    
                    for(int a = 1;a<=c;a++){
                        v2.add(rs.getString("id"));
                        v2.add(rs.getString("name"));
                        v2.add(rs.getString("brand"));
                        v2.add(rs.getString("box"));
                        v2.add(rs.getString("price"));
                        v2.add(rs.getString("description"));
                        
                    }
                    
                    Df.addRow(v2);
                   
                }
  
            } catch (Exception e) {
                    System.out.println("table data error");
            }
            
        }
        
        //for customer table 
        
            private void table_update1(){
                int c;

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_manage","root","Majumder@reshad");
                        insert = con1.prepareStatement("select * from customer ");
                        ResultSet rs = insert.executeQuery();
                        ResultSetMetaData rssm = rs.getMetaData();

                        c=rssm.getColumnCount();

                        DefaultTableModel Df = (DefaultTableModel)tblCustomer.getModel();

                        Df.setRowCount(0);
                        while(rs.next()){

                        Vector v2=new Vector();

                        for(int a = 1;a<=c;a++){
                            v2.add(rs.getString("id"));
                            v2.add(rs.getString("name"));
                            v2.add(rs.getString("shop_name"));
                            v2.add(rs.getString("address"));
                            v2.add(rs.getString("mobile"));

                        }

                        Df.addRow(v2);
                    }

                } catch (Exception e) {
                        System.out.println("table data error");
                }

            }
    

    //nagivation to home page
    private void btnInventoryToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryToHomeActionPerformed
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInventoryToHomeActionPerformed

    //click to fill product details
    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
                DefaultTableModel Df = (DefaultTableModel)tblProduct.getModel();
        
        int Selected_index=tblProduct.getSelectedRow();
        txtS_name.setText(Df.getValueAt(Selected_index, 1).toString());
        txtS_Brand.setText(Df.getValueAt(Selected_index, 2).toString());
        
        
    }//GEN-LAST:event_tblProductMouseClicked

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        // customer details auto fill when clicked
                DefaultTableModel Df = (DefaultTableModel)tblCustomer.getModel();
        
        int Selected_index=tblCustomer.getSelectedRow();
        txtS_customerName.setText(Df.getValueAt(Selected_index, 1).toString());
        txtS_C_address.setText(Df.getValueAt(Selected_index, 3).toString());
        
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void btnMakeBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeBillActionPerformed
        DefaultTableModel Df = (DefaultTableModel)tblProduct.getModel();
        int Selected_index=tblProduct.getSelectedRow();
        
        int id= Integer.parseUnsignedInt(Df.getValueAt((Selected_index),0).toString());
        int available_box=Integer.parseInt(Df.getValueAt((Selected_index),3).toString());//get available product from table
        int sellAmount = Integer.parseInt(txtS_amountBox.getText());
        
        if (available_box<=0 && available_box<sellAmount){
            JOptionPane.showMessageDialog(rootPane, "sorry Not enough product");
        }
        else{
            
        
            int remaining = available_box - sellAmount;

            //String remaining_product= String.valueOf(remaining) ;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_manage","root","Majumder@reshad");
                insert = con1.prepareStatement("update product set box=? where id=? ");            
                insert.setInt(1, remaining);
                insert.setInt(2, id);
                insert.executeUpdate();

                JOptionPane.showMessageDialog(rootPane, "Bill confirmed\nbilling print service comming soon ");

                table_update();

            } catch (Exception e) {

                System.out.println("product calculation to database error");
            }

            //add iinto database table = analysis_product

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_manage", "root", "Majumder@reshad");

                // Execute the query
                insert = con1.prepareStatement("select product_id,box from analysis_product");
                ResultSet rs = insert.executeQuery();

                // Process the results and check for matching product ID

                boolean idExists = false;

                while (rs.next()) {
                    int productId = rs.getInt("product_id");

                    // Check for a match
                    if (productId == id) {
                        idExists = true;
                        break;
                    }
                }

                if (idExists) {
                    int availableBox = rs.getInt("box");
                    int productId = rs.getInt("product_id");

                    int sum = availableBox + sellAmount;

                    // Update the database with the sum
                    PreparedStatement updateStatement = con1.prepareStatement("UPDATE analysis_product SET box= ? WHERE product_id = ?");
                    updateStatement.setInt(1, sum);
                    updateStatement.setInt(2, productId);
                    updateStatement.executeUpdate();
                    table_update();

                    JOptionPane.showMessageDialog(rootPane, "IDs matched and updated in the database");
                } else {

                    try {   

                       //add to database
                           String p_name=txtS_name.getText();
                           String p_brand=txtS_Brand.getText();


                           Class.forName("com.mysql.jdbc.Driver");
                           con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_manage","root","Majumder@reshad");
                           insert = con1.prepareStatement("insert into analysis_product (product_id,name,brand,box)values(?,?,?,?)");

                           insert.setInt(1, id);
                           insert.setString(2, p_name);
                           insert.setString(3, p_brand);
                           insert.setInt(4, sellAmount);

                           insert.executeUpdate();

                           //JOptionPane.showMessageDialog(rootPane, "updated");

                           table_update();
                           JOptionPane.showMessageDialog(rootPane, "ID not found in the database");

                   } catch (Exception e) {
                         System.out.println("product add to database error");
                   }


                }
            } catch (Exception e) {
                e.printStackTrace(); // Print the stack trace for debugging
                JOptionPane.showMessageDialog(rootPane, "Error: " + e.getMessage());
            }
        // here shows the total amount of bill to pay
        int price_P=Integer.parseInt(Df.getValueAt((Selected_index),4).toString());
        int bill= price_P*sellAmount;
        System.out.println(bill);
        JOptionPane.showConfirmDialog(rootPane, "Total price :"+bill+"\nClick Yes to confirm bill");


  
        
        }
        
        
        
        
        
    }//GEN-LAST:event_btnMakeBillActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtS_name.setText("");
        txtS_Brand.setText("");
        txtS_customerName.setText("");
        txtS_C_address.setText("");
        txtS_amountBox.setText("");
        txtS_note.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(Sellproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sellproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sellproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sellproduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sellproduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClear;
    private javax.swing.JButton btnInventoryToHome;
    private javax.swing.JButton btnMakeBill;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtS_Brand;
    private javax.swing.JTextField txtS_C_address;
    private javax.swing.JTextField txtS_amountBox;
    private javax.swing.JTextField txtS_customerName;
    private javax.swing.JTextField txtS_name;
    private javax.swing.JTextArea txtS_note;
    // End of variables declaration//GEN-END:variables
}

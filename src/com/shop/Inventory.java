/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.shop;
//
import com.shop.Home;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
//
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class Inventory extends javax.swing.JFrame {


    public Inventory() {
        initComponents();
        table_update();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAddProduct = new javax.swing.JButton();
        btnRemoveProduct = new javax.swing.JButton();
        btnInventoryToHome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtP_box = new javax.swing.JTextField();
        txtP_brand = new javax.swing.JTextField();
        txtP_Name = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtP_desc = new javax.swing.JTextArea();
        btnProductEdit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtP_price = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        btnAddProduct.setBackground(new java.awt.Color(255, 102, 102));
        btnAddProduct.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnAddProduct.setText("Add product");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnRemoveProduct.setBackground(new java.awt.Color(255, 102, 102));
        btnRemoveProduct.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnRemoveProduct.setText("Delete Product");
        btnRemoveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveProductActionPerformed(evt);
            }
        });

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

        jLabel4.setText("Box :");

        jLabel5.setText("Description :");

        txtP_desc.setColumns(20);
        txtP_desc.setRows(5);
        jScrollPane2.setViewportView(txtP_desc);

        btnProductEdit.setBackground(new java.awt.Color(255, 102, 102));
        btnProductEdit.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        btnProductEdit.setText("Edit");
        btnProductEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductEditActionPerformed(evt);
            }
        });

        jLabel6.setText("Price :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnInventoryToHome, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnProductEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnAddProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnRemoveProduct)
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtP_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtP_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtP_box, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtP_price, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnInventoryToHome)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtP_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtP_brand, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtP_box, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtP_price, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProductEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("All available products");

        jTable1.setBackground(new java.awt.Color(255, 204, 255));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Brand", "Available Box", "Price/Box(TK)", "description"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        Connection con1;
        PreparedStatement insert;
        
        
        private void table_update(){
            int c;
            
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_manage","root","Majumder@reshad");
                    insert = con1.prepareStatement("select * from product ");
                    ResultSet rs = insert.executeQuery();
                    ResultSetMetaData rssm = rs.getMetaData();
                    
                    c=rssm.getColumnCount();
                    
                    DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
                    
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
        
    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        String p_name=txtP_Name.getText();
        String p_brand=txtP_brand.getText();
        String p_box=txtP_box.getText();
        String p_price=txtP_price.getText();
        String p_desc=txtP_desc.getText();
        
        if (p_name.equals("") || p_brand.equals("")||p_box.equals("")||p_price.equals("")||p_desc.equals("")){
            JOptionPane.showMessageDialog(rootPane, "please provide every info.");
        } else{


              try {
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_manage","root","Majumder@reshad");
                insert = con1.prepareStatement("insert into product (name,brand,box,price,description)values(?,?,?,?,?)");
                
                insert.setString(1, p_name);
                insert.setString(2, p_brand);
                insert.setString(3, p_box);
                insert.setString(4, p_price);
                insert.setString(5, p_desc);
                
                insert.executeUpdate();
                
                //JOptionPane.showMessageDialog(rootPane, "updated");
                
                table_update();
                
            } catch (Exception e) {
                  System.out.println("product add to database error");
            }



            txtP_Name.setText("");
            txtP_brand.setText("");
            txtP_box.setText("");
            txtP_price.setText("");
            txtP_desc.setText("");
        }
 
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnRemoveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveProductActionPerformed

        
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int Selected_index=jTable1.getSelectedRow();
        
        try {
                int id= Integer.parseUnsignedInt(Df.getValueAt((Selected_index),0).toString());

                
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_manage","root","Majumder@reshad");
                insert = con1.prepareStatement("delete from product where id=? ");
                
                insert.setInt(1, id);

                
                insert.executeUpdate();
                
                JOptionPane.showMessageDialog(rootPane, "Product Deleted!");
                table_update();
                
            txtP_Name.setText("");
            txtP_brand.setText("");
            txtP_box.setText("");
            txtP_price.setText("");
            txtP_desc.setText("");
                
            } catch (Exception e) {
                  System.out.println("product delete from database error");
            }

    }//GEN-LAST:event_btnRemoveProductActionPerformed

    private void btnInventoryToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryToHomeActionPerformed
        new Home().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInventoryToHomeActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        //un used
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            // not used
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        
        int Selected_index=jTable1.getSelectedRow();
        txtP_Name.setText(Df.getValueAt(Selected_index, 1).toString());
        txtP_brand.setText(Df.getValueAt(Selected_index, 2).toString());
        txtP_box.setText(Df.getValueAt(Selected_index, 3).toString());
        txtP_price.setText(Df.getValueAt(Selected_index, 4).toString());
        txtP_desc.setText(Df.getValueAt(Selected_index, 5).toString());
        

    }//GEN-LAST:event_jTable1MouseClicked

    private void btnProductEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductEditActionPerformed
        //edit product info
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int Selected_index=jTable1.getSelectedRow();
        
        try {
                int id= Integer.parseUnsignedInt(Df.getValueAt((Selected_index),0).toString());
                String name=txtP_Name.getText();
                String brand=txtP_brand.getText();
                String box=txtP_box.getText();
                String price=txtP_price.getText();
                String desc=txtP_desc.getText();
                
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop_manage","root","Majumder@reshad");
                insert = con1.prepareStatement("update product set name=?,brand=?,box=?,price=?,description=? where id=? ");
                
                 
                insert.setString(1, name);
                insert.setString(2, brand);
                insert.setString(3, box);
                insert.setString(4, price);
                insert.setString(5, desc);
                insert.setInt(6, id);

                
                insert.executeUpdate();
                
                JOptionPane.showMessageDialog(rootPane, "updated");
                table_update();
                
            } catch (Exception e) {
                  System.out.println("product update to database error");
            }
    }//GEN-LAST:event_btnProductEditActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnInventoryToHome;
    private javax.swing.JButton btnProductEdit;
    private javax.swing.JButton btnRemoveProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtP_Name;
    private javax.swing.JTextField txtP_box;
    private javax.swing.JTextField txtP_brand;
    private javax.swing.JTextArea txtP_desc;
    private javax.swing.JTextField txtP_price;
    // End of variables declaration//GEN-END:variables
}

package com.kruwell.program;



import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class covid extends javax.swing.JFrame {
    
    private void kosongkan_form(){
        txtno_kasus.setEditable(true);
        txtno_kasus.setText(null);
        txtnama.setText(null);
        cbjeniskelamin.setSelectedItem(this);
        txtalamat.setText(null);
        txtumur.setText(null);
        txtprovinsi.setText(null);
    }
     
    private void tampilkan_data(){
       DefaultTableModel model = new DefaultTableModel();
       model.addColumn("No.");
       model.addColumn("No Kasus");
       model.addColumn("Nama");
       model.addColumn("Jenis Kelamin");
       model.addColumn("Umur");
       model.addColumn("Alamat");
       model.addColumn("Provinsi");
       
       try {
           int no = 1;
           String sql = "SELECT * FROM COVID19";
           java.sql.Connection conn = (Connection)konfig.configDB();
           java.sql.Statement stm = conn.createStatement();
           java.sql.ResultSet res = stm.executeQuery(sql);
           
           
          while (res.next()){
              model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6) });
              
          }
          tabelcovid.setModel(model);
          
       }catch(SQLException e){
           System.out.println("Error  : " + e.getMessage());
       }
       
    }
    /**
     * Creates new form covid
     */
    public covid() {
        initComponents();
        tampilkan_data();
        kosongkan_form();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtno_kasus = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtumur = new javax.swing.JTextField();
        txtalamat = new javax.swing.JTextField();
        txtprovinsi = new javax.swing.JTextField();
        cbjeniskelamin = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelcovid = new javax.swing.JTable();
        tbtambah = new javax.swing.JButton();
        tbsimpan = new javax.swing.JButton();
        tbedit = new javax.swing.JButton();
        tbhapus = new javax.swing.JButton();
        tbbatal = new javax.swing.JButton();
        tbkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Data Kasus");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DATA KASUS COVID-19");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 48, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NO KASUS ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 139, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NAMA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 176, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("JENIS KELAMIN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 216, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("UMUR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 265, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ALAMAT");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 312, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("PROVINSI");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 365, -1, -1));
        getContentPane().add(txtno_kasus, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 134, 219, -1));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 174, 269, -1));
        getContentPane().add(txtumur, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 263, 115, -1));

        txtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalamatActionPerformed(evt);
            }
        });
        getContentPane().add(txtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 310, 250, -1));
        getContentPane().add(txtprovinsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 363, 250, -1));

        cbjeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRIA", "WANITA" }));
        cbjeniskelamin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbjeniskelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjeniskelaminActionPerformed(evt);
            }
        });
        getContentPane().add(cbjeniskelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 214, 194, -1));

        tabelcovid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelcovid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelcovidMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelcovid);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 763, 170));

        tbtambah.setText("Tambah Data");
        tbtambah.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtambahActionPerformed(evt);
            }
        });
        getContentPane().add(tbtambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 426, 138, -1));

        tbsimpan.setText("Simpan");
        tbsimpan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(tbsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 426, 70, -1));

        tbedit.setText("Edit");
        tbedit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbeditActionPerformed(evt);
            }
        });
        getContentPane().add(tbedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 426, 83, -1));

        tbhapus.setText("Hapus");
        tbhapus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbhapusActionPerformed(evt);
            }
        });
        getContentPane().add(tbhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 426, 83, -1));

        tbbatal.setText("Batal");
        tbbatal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbbatalActionPerformed(evt);
            }
        });
        getContentPane().add(tbbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 82, -1));

        tbkeluar.setText("Keluar");
        tbkeluar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(tbkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 430, 83, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbjeniskelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjeniskelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbjeniskelaminActionPerformed

    private void txtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalamatActionPerformed

    private void tbkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbkeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tbkeluarActionPerformed

    private void tbtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtambahActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
     
    }//GEN-LAST:event_tbtambahActionPerformed

    private void tbsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbsimpanActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO covid19 VALUES('"+txtno_kasus.getText()+"','"+txtnama.getText()+"','"+cbjeniskelamin.getSelectedItem()+"','"+txtumur.getText()+"','"+txtalamat.getText()+"','"+txtprovinsi.getText()+"')";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Simpan Data Berhasil...");
            tampilkan_data();
            kosongkan_form();
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tbsimpanActionPerformed

    private void tbeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbeditActionPerformed
        // TODO add your handling code here:
        try {
         String sql = "UPDATE covid19 SET no_kasus = '"+txtno_kasus.getText()+"',nama = '"+txtnama.getText()+"',jenis_kelamin = '"+cbjeniskelamin.getSelectedItem()+"',umur = '"+txtumur.getText()+"', alamat = '"+txtalamat.getText()+"',provinsi ='"+txtprovinsi.getText()+"' WHERE no_kasus = '"+txtno_kasus.getText()+"'";
         java.sql.Connection conn = (Connection)konfig.configDB();
         java.sql.PreparedStatement pstm =  conn.prepareStatement(sql);
         pstm.execute();
         JOptionPane.showMessageDialog(null, "Edit Data Berhasil...");
         
         
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_tbeditActionPerformed

    private void tabelcovidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelcovidMouseClicked
        // TODO add your handling code here:
        int baris = tabelcovid.rowAtPoint(evt.getPoint());
        String no_kasus = tabelcovid.getValueAt(baris, 1).toString();
        txtno_kasus.setText(no_kasus);
        
        String nama = tabelcovid.getValueAt(baris, 2).toString();
        txtnama.setText(nama);
        
        String jeniskelamin = tabelcovid.getValueAt(baris, 3).toString();
        cbjeniskelamin.setSelectedItem(jeniskelamin);
        
         String umur = tabelcovid.getValueAt(baris, 4).toString();
        txtumur.setText(umur);
        
        String alamat = tabelcovid.getValueAt(baris, 5).toString();
        txtalamat.setText(alamat);
        
        String provinsi = tabelcovid.getValueAt(baris, 6).toString();
        txtprovinsi.setText(provinsi);
    }//GEN-LAST:event_tabelcovidMouseClicked

    private void tbhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbhapusActionPerformed
        // TODO add your handling code here:
        try {
          String sql = "DELETE FROM covid19 WHERE no_kasus='"+txtno_kasus.getText()+"'";
         java.sql.Connection conn = (Connection)konfig.configDB();
         java.sql.PreparedStatement pstm =  conn.prepareStatement(sql);
         pstm.execute();
         JOptionPane.showMessageDialog(null, "Hapus Data Berhasil...");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_tbhapusActionPerformed

    private void tbbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbbatalActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_tbbatalActionPerformed

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
            java.util.logging.Logger.getLogger(covid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(covid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(covid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(covid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new covid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbjeniskelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelcovid;
    private javax.swing.JButton tbbatal;
    private javax.swing.JButton tbedit;
    private javax.swing.JButton tbhapus;
    private javax.swing.JButton tbkeluar;
    private javax.swing.JButton tbsimpan;
    private javax.swing.JButton tbtambah;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno_kasus;
    private javax.swing.JTextField txtprovinsi;
    private javax.swing.JTextField txtumur;
    // End of variables declaration//GEN-END:variables
}

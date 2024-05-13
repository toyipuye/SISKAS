/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import config.Koneksi;
import dao.DAO_Barang;
import dao.DAO_Jenis_Barang;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.util.List;
import model.Model_Barang;
import service.Service_Barang;
import service.Service_Jenis_Barang;
import tabelmodel.TableMod_Barang;

/**
 *
 * @author UsEr
 */
public class beranda extends javax.swing.JPanel {
 
    private Service_Jenis_Barang serviceJenisBarang;
    private Service_Barang servicebarang;
    private Connection connection;
    int xx, xy;
    private Service_Barang servis = new DAO_Barang();
    private TableMod_Barang tblModel = new TableMod_Barang();
    public Model_Barang brg = new Model_Barang();
    

    /**
     * Creates new form beranda
     */
    public beranda() {
        initComponents();
        
        connection = Koneksi.getConnection();
        tbl_barang.setModel(tblModel);
        serviceJenisBarang = new DAO_Jenis_Barang();
        tampilkanTotalJenisBarang();
        
        servicebarang = new DAO_Barang();
        tampilkanTotalBarang();
        
        tbl_barang.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tbl_barang.getTableHeader().setForeground(Color.WHITE);
        tbl_barang.getTableHeader().setOpaque(false);
        tbl_barang.getTableHeader().setBackground(new Color(60,211,173));
        tbl_barang.setRowHeight(28);
        
        loadData();           
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_barang = new javax.swing.JTable();
        card_polos21 = new custom.card_polos2();
        jLabel1 = new javax.swing.JLabel();
        lb_jenis = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        card_polos22 = new custom.card_polos2();
        jLabel4 = new javax.swing.JLabel();
        lb_barang = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        card_polos23 = new custom.card_polos2();
        jLabel6 = new javax.swing.JLabel();
        lb_barang1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        card_polos24 = new custom.card_polos2();
        jLabel8 = new javax.swing.JLabel();
        lb_jenis1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(530, 417));
        setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 211, 173));
        jLabel2.setText("Beranda");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(60, 211, 173));
        jLabel15.setText("Tabel Penjualan");

        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_barang.setRowHeight(35);
        tbl_barang.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbl_barang);

        card_polos21.setColor1(new java.awt.Color(60, 211, 173));
        card_polos21.setColor2(new java.awt.Color(60, 211, 173));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-new-product-35.png"))); // NOI18N
        jLabel1.setText("Data Jenis Barang");

        lb_jenis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_jenis.setForeground(new java.awt.Color(255, 255, 255));
        lb_jenis.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Jenis Barang");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Detail");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout card_polos21Layout = new javax.swing.GroupLayout(card_polos21);
        card_polos21.setLayout(card_polos21Layout);
        card_polos21Layout.setHorizontalGroup(
            card_polos21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_polos21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_polos21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lb_jenis)
                    .addComponent(jLabel3)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        card_polos21Layout.setVerticalGroup(
            card_polos21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_polos21Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lb_jenis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        card_polos22.setColor1(new java.awt.Color(60, 211, 173));
        card_polos22.setColor2(new java.awt.Color(60, 211, 173));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-open-box-35.png"))); // NOI18N
        jLabel4.setText("Data Barang");

        lb_barang.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_barang.setForeground(new java.awt.Color(255, 255, 255));
        lb_barang.setText("jLabel3");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data Barang");

        javax.swing.GroupLayout card_polos22Layout = new javax.swing.GroupLayout(card_polos22);
        card_polos22.setLayout(card_polos22Layout);
        card_polos22Layout.setHorizontalGroup(
            card_polos22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_polos22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_polos22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lb_barang)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        card_polos22Layout.setVerticalGroup(
            card_polos22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_polos22Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(lb_barang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        card_polos23.setColor1(new java.awt.Color(60, 211, 173));
        card_polos23.setColor2(new java.awt.Color(60, 211, 173));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-open-box-35.png"))); // NOI18N
        jLabel6.setText("Data Barang");

        lb_barang1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_barang1.setForeground(new java.awt.Color(255, 255, 255));
        lb_barang1.setText("jLabel3");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data Barang");

        javax.swing.GroupLayout card_polos23Layout = new javax.swing.GroupLayout(card_polos23);
        card_polos23.setLayout(card_polos23Layout);
        card_polos23Layout.setHorizontalGroup(
            card_polos23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_polos23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_polos23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lb_barang1)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        card_polos23Layout.setVerticalGroup(
            card_polos23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_polos23Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(lb_barang1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        card_polos24.setColor1(new java.awt.Color(60, 211, 173));
        card_polos24.setColor2(new java.awt.Color(60, 211, 173));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-new-product-35.png"))); // NOI18N
        jLabel8.setText("Data Jenis Barang");

        lb_jenis1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lb_jenis1.setForeground(new java.awt.Color(255, 255, 255));
        lb_jenis1.setText("jLabel3");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Data Jenis Barang");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Detail");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout card_polos24Layout = new javax.swing.GroupLayout(card_polos24);
        card_polos24.setLayout(card_polos24Layout);
        card_polos24Layout.setHorizontalGroup(
            card_polos24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card_polos24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card_polos24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lb_jenis1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        card_polos24Layout.setVerticalGroup(
            card_polos24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card_polos24Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(lb_jenis1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(card_polos21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addComponent(card_polos22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addComponent(card_polos24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addComponent(card_polos23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel15))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(card_polos21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(card_polos22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card_polos24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(card_polos23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(90, 90, 90)
                .addComponent(jLabel15)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        
        
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.card_polos2 card_polos21;
    private custom.card_polos2 card_polos22;
    private custom.card_polos2 card_polos23;
    private custom.card_polos2 card_polos24;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_barang;
    private javax.swing.JLabel lb_barang1;
    private javax.swing.JLabel lb_jenis;
    private javax.swing.JLabel lb_jenis1;
    private javax.swing.JTable tbl_barang;
    // End of variables declaration//GEN-END:variables

    private void tampilkanTotalJenisBarang() {
      int totalJenisBarang = serviceJenisBarang.hitungTotalJenisBarang();
        lb_jenis.setText(""+totalJenisBarang);
    }

    private void tampilkanTotalBarang() {
        int totalBarang = servicebarang.hitungTotalBarang();
        lb_barang.setText(""+totalBarang);
    }

    private void loadData() {
       List<Model_Barang>list = servis.getData();
        tblModel.setData(list);
    }
}
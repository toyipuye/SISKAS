/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.DAO_Barang;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Model_Barang;
import model.Model_Jenis_Barang;
import service.Service_Barang;
import tabelmodel.TableMod_Barang;

/**
 *
 * @author UsEr
 */
public class Menu_Barang extends javax.swing.JPanel {

     private Service_Barang servis = new DAO_Barang();
    private TableMod_Barang tblModel = new TableMod_Barang();
    
    public Menu_Barang() {
        initComponents();
        this.tbl_barang.setModel(tblModel);
        loadData();
        btn_tambah.setBackground(new Color(60,211,173));
        btn_hapus.setBackground(new Color(60,211,173));
        btn_batal.setBackground(new Color(60,211,173));
        btn_tambah1.setBackground(new Color(60,211,173));
        btn_batal1.setBackground(new Color(60,211,173));
        btn_jenisbarang.setBackground(new Color(60,211,173));
        btn_kode.setBackground(new Color(60,211,173));
        btn_barcode.setBackground(new Color(60,211,173));
        
        tbl_barang.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tbl_barang.getTableHeader().setForeground(Color.WHITE);
        tbl_barang.getTableHeader().setOpaque(false);
        tbl_barang.getTableHeader().setBackground(new Color(60,211,173));
        tbl_barang.setRowHeight(28);
        
         untuk_pencarian.getDocument().addDocumentListener(new DocumentListener() {
             @Override
            public void insertUpdate(DocumentEvent e) {
               filterData(untuk_pencarian.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                 filterData(untuk_pencarian.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
         }

            private void filterData(String keyword) {
               TableRowSorter<TableModel> sorter = new TableRowSorter<>(tbl_barang.getModel());
               tbl_barang.setRowSorter(sorter);
    
            if (keyword.trim().length() == 0) {
                sorter.setRowFilter(null);
            } else {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + keyword)); // Filter data sesuai dengan kata kunci (ignore case)
            }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        TampilanData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_barang = new javax.swing.JTable();
        untuk_pencarian = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TambahData = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_tambah1 = new javax.swing.JButton();
        txt_kodebarang = new javax.swing.JTextField();
        btn_batal1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_kodejenisbarang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_namajenisbarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_namabarang = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_stok = new javax.swing.JTextField();
        btn_jenisbarang = new javax.swing.JButton();
        cbx_satuan = new javax.swing.JComboBox<>();
        btn_kode = new javax.swing.JButton();
        btn_barcode = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        TampilanData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 167, 98));
        jLabel2.setText("Data Barang");

        btn_tambah.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tambah.png"))); // NOI18N
        btn_tambah.setText(" Tambah");
        btn_tambah.setBorder(null);
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_hapus.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hapus.png"))); // NOI18N
        btn_hapus.setText(" Hapus");
        btn_hapus.setBorder(null);
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-cancel-30.png"))); // NOI18N
        btn_batal.setText("Batal");
        btn_batal.setBorder(null);
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        tbl_barang.setBackground(new java.awt.Color(255, 255, 255));
        tbl_barang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Kode Jenis Barang", "Nama Jenis Barang"
            }
        ));
        tbl_barang.setToolTipText("");
        tbl_barang.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbl_barang.setRowHeight(35);
        tbl_barang.getTableHeader().setReorderingAllowed(false);
        tbl_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_barangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_barang);

        untuk_pencarian.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        untuk_pencarian.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        untuk_pencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                untuk_pencarianActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-search-30.png"))); // NOI18N

        javax.swing.GroupLayout TampilanDataLayout = new javax.swing.GroupLayout(TampilanData);
        TampilanData.setLayout(TampilanDataLayout);
        TampilanDataLayout.setHorizontalGroup(
            TampilanDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TampilanDataLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(TampilanDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TampilanDataLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(651, 651, 651))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TampilanDataLayout.createSequentialGroup()
                        .addGroup(TampilanDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TampilanDataLayout.createSequentialGroup()
                                .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(untuk_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1067, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
        );
        TampilanDataLayout.setVerticalGroup(
            TampilanDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TampilanDataLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(TampilanDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TampilanDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(untuk_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        mainPanel.add(TampilanData, "card2");

        TambahData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 167, 98));
        jLabel3.setText("Tambah Barang");

        btn_tambah1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_tambah1.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tambah.png"))); // NOI18N
        btn_tambah1.setText(" Tambah");
        btn_tambah1.setBorder(null);
        btn_tambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah1ActionPerformed(evt);
            }
        });

        txt_kodebarang.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txt_kodebarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_kodebarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodebarangActionPerformed(evt);
            }
        });

        btn_batal1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_batal1.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-cancel-30.png"))); // NOI18N
        btn_batal1.setText("Batal");
        btn_batal1.setBorder(null);
        btn_batal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batal1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Kode Barang");

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Jenis Barang");

        txt_kodejenisbarang.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txt_kodejenisbarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_kodejenisbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodejenisbarangActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nama Jenis Barang");

        txt_namajenisbarang.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txt_namajenisbarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_namajenisbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namajenisbarangActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nama Barang");

        txt_namabarang.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txt_namabarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_namabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namabarangActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Satuan");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Harga");

        txt_harga.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txt_harga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Stok");

        txt_stok.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txt_stok.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txt_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stokActionPerformed(evt);
            }
        });

        btn_jenisbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-touch-30.png"))); // NOI18N
        btn_jenisbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jenisbarangActionPerformed(evt);
            }
        });

        cbx_satuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogram", "pack", "Pcs", "Liter", "Gram", " " }));
        cbx_satuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_satuanActionPerformed(evt);
            }
        });

        btn_kode.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_kode.setForeground(new java.awt.Color(255, 255, 255));
        btn_kode.setText("Kode");
        btn_kode.setBorder(null);
        btn_kode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kodeActionPerformed(evt);
            }
        });

        btn_barcode.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btn_barcode.setForeground(new java.awt.Color(255, 255, 255));
        btn_barcode.setText("Barcode");
        btn_barcode.setBorder(null);
        btn_barcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_barcodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TambahDataLayout = new javax.swing.GroupLayout(TambahData);
        TambahData.setLayout(TambahDataLayout);
        TambahDataLayout.setHorizontalGroup(
            TambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TambahDataLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(TambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TambahDataLayout.createSequentialGroup()
                        .addGroup(TambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addGroup(TambahDataLayout.createSequentialGroup()
                                .addComponent(btn_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(793, 853, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TambahDataLayout.createSequentialGroup()
                        .addGroup(TambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbx_satuan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_stok, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_harga, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_namajenisbarang, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_namabarang, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TambahDataLayout.createSequentialGroup()
                                .addComponent(txt_kodejenisbarang)
                                .addGap(15, 15, 15)
                                .addComponent(btn_jenisbarang))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TambahDataLayout.createSequentialGroup()
                                .addComponent(txt_kodebarang)
                                .addGap(50, 50, 50)
                                .addComponent(btn_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btn_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        TambahDataLayout.setVerticalGroup(
            TambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TambahDataLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(TambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(TambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_kodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addGroup(TambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_jenisbarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_kodejenisbarang))
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(txt_namajenisbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addComponent(txt_namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(15, 15, 15)
                .addComponent(cbx_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel11)
                .addGap(10, 10, 10)
                .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addGap(10, 10, 10)
                .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        mainPanel.add(TambahData, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
      mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(TambahData);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        btn_tambah1.setText("SIMPAN");
        txt_kodebarang.requestFocus();
        txt_kodejenisbarang.setEnabled(false);
        txt_namajenisbarang.setEnabled(false);
        btn_jenisbarang.setEnabled(true);
//        txt_kodebarang.setText(servis.nomor());
        
        if(btn_tambah.getText().equals("UBAH")){
            dataTabel();
            
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        tampilPanel();
        loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah1ActionPerformed
        if(btn_tambah1.getText().equals("TAMBAH"))
        {
            btn_tambah1.setText("SIMPAN");
            txt_kodebarang.setText(servis.nomor());
            
        }else if (btn_tambah1.getText().equals("SIMPAN"))
        
        {
            simpanData();
            
        }
        else if (btn_tambah1.getText().equals("PERBARUI"))
        {
            perbaruiData(); 
        }
    }//GEN-LAST:event_btn_tambah1ActionPerformed

    private void btn_batal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal1ActionPerformed
        tampilPanel();
        loadData();
        resetForm();
    }//GEN-LAST:event_btn_batal1ActionPerformed

    private void txt_kodebarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodebarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodebarangActionPerformed

    private void txt_kodejenisbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodejenisbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodejenisbarangActionPerformed

    private void txt_namajenisbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namajenisbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namajenisbarangActionPerformed

    private void txt_namabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namabarangActionPerformed
        cbx_satuan.requestFocusInWindow();
    }//GEN-LAST:event_txt_namabarangActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        txt_stok.requestFocusInWindow();
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void txt_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stokActionPerformed
         simpanData();
    }//GEN-LAST:event_txt_stokActionPerformed

    private void btn_jenisbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jenisbarangActionPerformed
        boolean closable = true;
        Data_JenisBarang djb = new Data_JenisBarang(null, closable);
        djb.setVisible(true);
        
        txt_kodejenisbarang.setText(djb.jb.getId_kategori());
        txt_namajenisbarang.setText(djb.jb.getNama_kategori());
        
        txt_kodejenisbarang.setEnabled(false);
        txt_namajenisbarang.setEnabled(false);
        
        txt_namabarang.requestFocus();
        aktif();
    }//GEN-LAST:event_btn_jenisbarangActionPerformed

    private void cbx_satuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_satuanActionPerformed
        txt_harga.requestFocusInWindow();
    }//GEN-LAST:event_cbx_satuanActionPerformed

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
       if(btn_tambah.getText().equals("TAMBAH")){
           
        }
        btn_tambah.setText("UBAH");
        btn_hapus.setVisible(true);
        btn_batal.setVisible(true);
    }//GEN-LAST:event_tbl_barangMouseClicked

    private void untuk_pencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_untuk_pencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_untuk_pencarianActionPerformed

    private void btn_kodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kodeActionPerformed
       txt_kodebarang.setText(servis.nomor());
    }//GEN-LAST:event_btn_kodeActionPerformed

    private void btn_barcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_barcodeActionPerformed
        txt_kodebarang.setText("");
    }//GEN-LAST:event_btn_barcodeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TambahData;
    private javax.swing.JPanel TampilanData;
    private javax.swing.JButton btn_barcode;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_batal1;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_jenisbarang;
    private javax.swing.JButton btn_kode;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_tambah1;
    private javax.swing.JComboBox<String> cbx_satuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tbl_barang;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_kodebarang;
    private javax.swing.JTextField txt_kodejenisbarang;
    private javax.swing.JTextField txt_namabarang;
    private javax.swing.JTextField txt_namajenisbarang;
    private javax.swing.JTextField txt_stok;
    private javax.swing.JTextField untuk_pencarian;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
     btn_hapus.setVisible(false);
        btn_batal.setVisible(false);
        List<Model_Barang> list = servis.getData();
        tblModel.setData(list);
    }

    private void dataTabel() {
    TampilanData.setVisible(false);
        TambahData.setVisible(true);
        
        int row = tbl_barang.getSelectedRow();
        jLabel2.setText("Perbarui Data Barang");
        
        txt_kodebarang.setEnabled(false);
        txt_kodejenisbarang.setEnabled(true);
        txt_namajenisbarang.setEnabled(true);
        
        txt_kodebarang.setText(tbl_barang.getModel().getValueAt(row, 1).toString());
        txt_kodejenisbarang.setText(tbl_barang.getModel().getValueAt(row, 2).toString());
        txt_namajenisbarang.setText(tbl_barang.getModel().getValueAt(row, 3).toString());
        txt_namabarang.setText(tbl_barang.getModel().getValueAt(row, 4).toString());
        cbx_satuan.setSelectedItem (tbl_barang.getModel().getValueAt(row, 5).toString());
        txt_harga.setText(tbl_barang.getModel().getValueAt(row, 6).toString());
        txt_stok.setText(tbl_barang.getModel().getValueAt(row, 7).toString());
        
        aktif();
        btn_tambah1.setText("PERBARUI");
        btn_batal.setVisible(true);
    }

    private void hapusData() {
    int index = tbl_barang.getSelectedRow();
        if(index !=-1){
            Model_Barang brg = tblModel.getData(tbl_barang.convertRowIndexToModel(index));
            if(JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?", "Konfirmasi",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
                servis.hapusData(brg);
                tblModel.hapusData(index);
                loadData();
                resetForm();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih dulu record yang akan diupdate");
        }
    }

    private void tampilPanel() {
     mainPanel.removeAll();
       mainPanel.add(new Menu_Barang());
       mainPanel.repaint();
       mainPanel.revalidate();
    }

    private void simpanData() {
        if (validasiInput()==true) {
        String kode_barang = txt_kodebarang.getText();
        String kode_jenis = txt_kodejenisbarang.getText();
        String nama_jenis = txt_namajenisbarang.getText();
        String nama_barang = txt_namabarang.getText();
        String satuan = cbx_satuan.getSelectedItem().toString();
        int harga = Integer.parseInt(txt_harga.getText());
        int stok = Integer.parseInt(txt_stok.getText());

        Model_Barang brg = new Model_Barang();
        Model_Jenis_Barang jbr = new Model_Jenis_Barang();

        brg.setId_produk(kode_barang);
        jbr.setId_kategori(kode_jenis);
        jbr.setNama_kategori(nama_jenis);
        brg.setNama_produk(nama_barang);
        brg.setSatuan(satuan);
        brg.setHarga(harga);
        brg.setStok(stok);

        brg.setJns_barang(jbr);

        servis.tambahData(brg);
        tblModel.tambahData(brg);

        loadData();
        resetForm();
        tampilPanel();
        btn_tambah1.setText("TAMBAH");
    }
    }

    private void perbaruiData() {
        int index = tbl_barang.getSelectedRow();
        
        if(index!=-1){
            Model_Barang mobar = tblModel.getData(tbl_barang.convertRowIndexToModel(index));
                
            if(validasiInput()== true){
                String kode_barang = txt_kodebarang.getText();
                String kode_jenis = txt_kodejenisbarang.getText();
//                String nama_jenis = txt_namajenisbarang.getText();
                String nama_barang = txt_namabarang.getText();
                String satuan = cbx_satuan.getSelectedItem().toString();
                int harga = Integer.parseInt(txt_harga.getText());
                int stok = Integer.parseInt(txt_stok.getText());
            
                Model_Barang brg = new Model_Barang();
                Model_Jenis_Barang jbr = new Model_Jenis_Barang();
            
                jbr.setId_kategori(kode_jenis);               
//                jbr.setNama_jenis(nama_jenis);
                brg.setId_produk(satuan); 
                brg.setNama_produk(nama_barang);
                brg.setSatuan(satuan);
                brg.setHarga(harga);
                brg.setStok(stok);
            
                brg.setJns_barang(jbr);
            
                servis.perbaruiData(brg);
                tblModel.perbaruiData(index,brg);
            
                loadData();
                resetForm();
                tampilPanel();
                
           }             
    }
    }

    private void resetForm() {
         btn_tambah.requestFocus();
        btn_tambah.setText("TAMBAH");
        txt_kodebarang.setText("");
        txt_kodejenisbarang.setText("");
        txt_namajenisbarang.setText("");
        txt_namabarang.setText("");
        cbx_satuan.setSelectedItem(0);
        txt_harga.setText("");
        txt_stok.setText("");
    }

    private void aktif() {
        txt_namabarang.setEnabled(true);
        cbx_satuan.setEnabled(true);
        txt_harga.setEnabled(true);
        txt_stok.setEnabled(true);
    }

    private boolean validasiInput() {
        
     boolean valid = false;
    if (txt_kodebarang.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Kode Barang Tidak Boleh Kosong");
    } else if (txt_kodejenisbarang.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Kode Jenis Barang Tidak Boleh Kosong");
    } else if (txt_namajenisbarang.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nama Jenis Barang Tidak Boleh Kosong");
    } else if (txt_namabarang.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Nama Barang Tidak Boleh Kosong");
    } else if (cbx_satuan.getSelectedItem().equals(null)) {
        JOptionPane.showMessageDialog(null, "Satuan Tidak Boleh Kosong");
    } else if (txt_harga.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Harga Tidak Boleh Kosong");
    } else if (txt_stok.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Stok Tidak Boleh Kosong");
    } else {
        valid = true;
    }
    return valid;
}
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.alexvariasi.view.impl;

import com.stripbandunk.alexvariasi.entity.master.Barang;
import com.stripbandunk.alexvariasi.entity.master.Kategori;
import com.stripbandunk.alexvariasi.entity.master.Satuan;
import com.stripbandunk.alexvariasi.manager.SpringManager;
import com.stripbandunk.alexvariasi.service.BarangService;
import com.stripbandunk.alexvariasi.service.KategoriService;
import com.stripbandunk.alexvariasi.service.SatuanService;
import com.stripbandunk.alexvariasi.validator.ValidatorException;
import com.stripbandunk.alexvariasi.validator.impl.BarangValidator;
import com.stripbandunk.alexvariasi.view.DialogView;
import com.stripbandunk.alexvariasi.view.FormApp;
import java.awt.Window;
import java.util.Date;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author Eko Kurniawan Khannedy
 */
public class UbahBarangView extends DialogView {

    private Barang barang;

    /**
     * Creates new form TambahBarangView
     */
    public UbahBarangView(FormApp formApp) {
        super(formApp);
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldKode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxKategori = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxSatuan = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jButtonSimpan = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, 24));
        jLabel1.setText("Ubah Barang");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Kategori"));

        jLabel2.setText("Kode :");

        jTextFieldKode.setEnabled(false);

        jLabel3.setText("Nama :");

        jLabel4.setText("Kategori :");

        jLabel5.setText("Satuan :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldKode)
                    .addComponent(jTextFieldNama)
                    .addComponent(jComboBoxKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBoxSatuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSimpan);

        jButtonBatal.setText("Batal");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBatal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 315, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-510)/2, (screenSize.height-379)/2, 510, 379);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonBatalActionPerformed

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed

        barang.setNama(jTextFieldNama.getText());
        barang.setKategori((Kategori) jComboBoxKategori.getSelectedItem());
        barang.setSatuan((Satuan) jComboBoxSatuan.getSelectedItem());
        barang.setTerakhirDirubah(new Date());

        BarangValidator validator = SpringManager.getInstance().getBean(BarangValidator.class);
        BarangService service = SpringManager.getInstance().getBean(BarangService.class);

        try {
            validator.validate(barang);
            service.update(barang);
            dispose();
        } catch (ValidatorException ex) {
            showInfo(ex.getMessage());
        } catch (DataAccessException ex) {
            showError(ex.getRootCause().getMessage());
        }
    }//GEN-LAST:event_jButtonSimpanActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JComboBox jComboBoxKategori;
    private javax.swing.JComboBox jComboBoxSatuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldKode;
    private javax.swing.JTextField jTextFieldNama;
    // End of variables declaration//GEN-END:variables

    @Override
    public void display(Window formApp, Object parameter) {

        KategoriService kategoriService = SpringManager.getInstance().getBean(KategoriService.class);
        for (Kategori kategori : kategoriService.findAll()) {
            jComboBoxKategori.addItem(kategori);
        }

        SatuanService satuanService = SpringManager.getInstance().getBean(SatuanService.class);
        for (Satuan satuan : satuanService.findAll()) {
            jComboBoxSatuan.addItem(satuan);
        }

        barang = (Barang) parameter;
        
        jTextFieldKode.setText(barang.getId());
        jTextFieldNama.setText(barang.getNama());
        jComboBoxKategori.setSelectedItem(barang.getKategori());
        jComboBoxSatuan.setSelectedItem(barang.getKategori());

        setLocationRelativeTo(formApp);
        setVisible(true);
    }
}

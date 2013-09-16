/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.khannedy.simplepos.view.impl;

import com.github.khannedy.simplepos.entity.master.Barang;
import com.github.khannedy.simplepos.entity.user.Grup;
import com.github.khannedy.simplepos.entity.user.HakAksesConstant;
import com.github.khannedy.simplepos.entity.user.Pengguna;
import com.github.khannedy.simplepos.manager.LoginManager;
import com.github.khannedy.simplepos.manager.SpringManager;
import com.github.khannedy.simplepos.service.BarangService;
import com.github.khannedy.simplepos.view.DialogView;
import com.github.khannedy.simplepos.view.FormApp;
import com.stripbandunk.jwidget.JDynamicTable;
import com.stripbandunk.jwidget.model.DynamicTableModel;
import java.awt.Window;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author Eko Kurniawan Khannedy
 */
public class DaftarBarangView extends DialogView {

    private JDynamicTable jDynamicTable;

    private DynamicTableModel<Barang> dynamicTableModel;

    /**
     * Creates new form DaftarBarangView
     */
    public DaftarBarangView(FormApp formApp) {
        super(formApp);
        initComponents();

        dynamicTableModel = new DynamicTableModel<>(Barang.class);
        jDynamicTable = new JDynamicTable(dynamicTableModel);
        jScrollPane1.setViewportView(jDynamicTable);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonDetailBarang = new javax.swing.JButton();
        jButtonTambah = new javax.swing.JButton();
        jButtonUbah = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, 24));
        jLabel1.setText("Daftar Barang");

        jButtonDetailBarang.setText("Daftar Detail Barang");
        jButtonDetailBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetailBarangActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDetailBarang);

        jButtonTambah.setText("Tambah Barang Baru");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTambah);

        jButtonUbah.setText("Ubah Barang Terseleksi");
        jButtonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUbahActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUbah);

        jButtonHapus.setText("Hapus Barang terseleksi");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHapus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-810)/2, (screenSize.height-510)/2, 810, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        TambahBarangView view = new TambahBarangView(getFormApp());
        view.display(this, null);
        resetTable();
    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jButtonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUbahActionPerformed
        if (jDynamicTable.getSelectedRow() == -1) {
            showWarning("Silahkan pilih salah satu");
        } else {
            Barang barang = dynamicTableModel.get(
                    jDynamicTable.convertRowIndexToModel(
                    jDynamicTable.getSelectedRow()));
            UbahBarangView view = new UbahBarangView(getFormApp());
            view.display(this, barang);
            resetTable();
        }
    }//GEN-LAST:event_jButtonUbahActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        if (jDynamicTable.getSelectedRow() == -1) {
            showWarning("Silahkan pilih salah satu");
        } else {
            Barang barang = dynamicTableModel.get(
                    jDynamicTable.convertRowIndexToModel(
                    jDynamicTable.getSelectedRow()));
            BarangService service = SpringManager.getInstance().
                    getBean(BarangService.class);
            try {
                service.remove(barang);
                resetTable();
            } catch (DataAccessException ex) {
                showError(ex.getRootCause().getMessage());
            }
        }
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonDetailBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetailBarangActionPerformed
        if (jDynamicTable.getSelectedRow() == -1) {
            showWarning("Silahkan pilih barang");
        } else {
            Barang barang = dynamicTableModel.get(
                    jDynamicTable.convertRowIndexToModel(
                    jDynamicTable.getSelectedRow()));
            DaftarDetailBarangView view = new DaftarDetailBarangView(getFormApp());
            view.display(this, barang);
        }
    }//GEN-LAST:event_jButtonDetailBarangActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDetailBarang;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JButton jButtonUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void display(Window formApp, Object parameter) {
        resetTable();

        Pengguna pengguna = LoginManager.getInstance().getPengguna();
        Grup grup = pengguna.getGrup();

        jButtonHapus.setEnabled(grup.mengandungHakAkses(HakAksesConstant.HAPUS_BARANG));
        jButtonTambah.setEnabled(grup.mengandungHakAkses(HakAksesConstant.TAMBAH_BARANG));
        jButtonDetailBarang.setEnabled(grup.mengandungHakAkses(HakAksesConstant.LIHAT_DETAIL_BARANG));
        jButtonUbah.setEnabled(grup.mengandungHakAkses(HakAksesConstant.UBAH_BARANG));

        setVisible(true);
    }

    private void resetTable() {
        BarangService barangService = SpringManager.getInstance().getBean(BarangService.class);
        dynamicTableModel.clear();
        for (Barang barang : barangService.findAll()) {
            dynamicTableModel.add(barang);
        }
    }
}
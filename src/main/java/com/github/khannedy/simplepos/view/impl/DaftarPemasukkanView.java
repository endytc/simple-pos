/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.khannedy.simplepos.view.impl;

import com.github.khannedy.simplepos.entity.transaction.Pemasukkan;
import com.github.khannedy.simplepos.entity.user.Grup;
import com.github.khannedy.simplepos.entity.user.HakAksesConstant;
import com.github.khannedy.simplepos.entity.user.Pengguna;
import com.github.khannedy.simplepos.manager.LoginManager;
import com.github.khannedy.simplepos.manager.SpringManager;
import com.github.khannedy.simplepos.service.PemasukkanService;
import com.github.khannedy.simplepos.view.DialogView;
import com.github.khannedy.simplepos.view.FormApp;
import com.stripbandunk.jwidget.JDynamicTable;
import com.stripbandunk.jwidget.model.DynamicTableModel;
import java.awt.Window;

/**
 *
 * @author Eko Kurniawan Khannedy
 */
public class DaftarPemasukkanView extends DialogView {

    private JDynamicTable jDynamicTable;

    private DynamicTableModel<Pemasukkan> dynamicTableModel;

    /**
     * Creates new form DaftarPemasukkanView
     */
    public DaftarPemasukkanView(FormApp formApp) {
        super(formApp);
        initComponents();

        dynamicTableModel = new DynamicTableModel<>(Pemasukkan.class);
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
        jButtonTambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, 24));
        jLabel1.setText("Daftar Pemasukkan");

        jButtonTambah.setText("Tambah Pemasukkan");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonTambah);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
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
        setBounds((screenSize.width-650)/2, (screenSize.height-510)/2, 650, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        TambahPemasukkanView view = new TambahPemasukkanView(getFormApp());
        view.display(this, null);
        resetTable();
    }//GEN-LAST:event_jButtonTambahActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void display(Window formApp, Object parameter) {
        setLocationRelativeTo(formApp);
        resetTable();

        Pengguna pengguna = LoginManager.getInstance().getPengguna();
        Grup grup = pengguna.getGrup();

        jButtonTambah.setEnabled(grup.mengandungHakAkses(HakAksesConstant.TAMBAH_KATEGORI));

        setVisible(true);
    }

    private void resetTable() {
        PemasukkanService pemasukkanService = SpringManager.getInstance().getBean(PemasukkanService.class);
        dynamicTableModel.clear();
        for (Pemasukkan pemasukkan : pemasukkanService.findAll()) {
            dynamicTableModel.add(pemasukkan);
        }
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.khannedy.simplepos.view.impl;

import com.github.khannedy.simplepos.view.DialogView;
import com.github.khannedy.simplepos.view.FormApp;
import java.awt.Window;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author echo
 */
public class CetakLaporanView extends DialogView {

    public CetakLaporanView(FormApp formApp, JasperPrint print) {
        super(formApp);
        initComponents();

        JRViewer viewer = new JRViewer(print);
        getContentPane().add(viewer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-810)/2, (screenSize.height-630)/2, 810, 630);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void display(Window formApp, Object parameter) {
        setLocationRelativeTo(formApp);
        setVisible(true);
    }
}

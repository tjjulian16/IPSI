/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TjJul
 */
public class FormPeminjaman extends javax.swing.JFrame {

    
    /*atribut2 kelas
     * 
     */
   
     ArrayList<BukuDipinjam> bukuDipinjamCollection = new ArrayList<>();
     
    /**
     * Creates new form FormPeminjaman
     */
    public FormPeminjaman() {
        initComponents();
    }

    public void tampilkan() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulBuku = new javax.swing.JTextField();
        tombolCari = new javax.swing.JButton();
        lama = new javax.swing.JTextField();
        pinjam = new javax.swing.JButton();
        batal = new javax.swing.JButton();
        tombolKonfirmasi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        daftarBuku = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        daftarPinjaman = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM PEMINJAMAN");

        judulBuku.setToolTipText("");
        judulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulBukuActionPerformed(evt);
            }
        });

        tombolCari.setText("Cari");
        tombolCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolCariMouseClicked(evt);
            }
        });

        pinjam.setText("Pinjam");
        pinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pinjamMouseClicked(evt);
            }
        });

        batal.setText("Batal");
        batal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batalMouseClicked(evt);
            }
        });

        tombolKonfirmasi.setText("Konfirmasi");
        tombolKonfirmasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolKonfirmasiMouseClicked(evt);
            }
        });

        daftarBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Judul"
            }
        ));
        jScrollPane3.setViewportView(daftarBuku);

        daftarPinjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Judul"
            }
        ));
        jScrollPane4.setViewportView(daftarPinjaman);

        jLabel1.setText("Lama Peminjaman");

        jLabel2.setText("Judul Buku");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tombolKonfirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(tombolCari, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(judulBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(batal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lama, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(judulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolCari))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(pinjam)
                        .addGap(52, 52, 52)
                        .addComponent(batal))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tombolKonfirmasi)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolCariMouseClicked
        // TODO add your handling code here:
        String judul = judulBuku.getText();
        Perpustakaan.controllerPeminjaman.cariBuku(judul);
    }//GEN-LAST:event_tombolCariMouseClicked
 public void show(ArrayList<Buku> bukuList) {
       
     if(bukuList.size() > 0){
          Object[] kolom = { "Judul" };
        DefaultTableModel model = new DefaultTableModel(kolom, 0);
        
        for(Buku buku : bukuList) {
            Object[] baris = { buku.judul };
            model.addRow(baris);
        }
        
        daftarBuku.setModel(model);
     }
     else{
         Perpustakaan.dialogUI.tampilkan("Buku Tidak Ditemukan");
         
     }
    }
    private void pinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinjamMouseClicked
       
        try{
            int lamaPinjam = Integer.parseInt(this.lama.getText());
        String bukuDipilih = (String) daftarBuku.getModel().getValueAt(daftarBuku.getSelectedRow(),daftarBuku.getSelectedColumn());
        
        Buku bukuDipinjam = new Buku(bukuDipilih);
        tambahBuku(bukuDipinjam,lamaPinjam); 
        }
        catch(Exception e){
              DialogUI dialogUI = new DialogUI("Harap diisi waktu peminjaman atau memilih buku yang ingin dipinjam");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
        }
    }//GEN-LAST:event_pinjamMouseClicked
   public void tambahBuku(Buku buku, int lama){
   
       if(lama > 3){
           DialogUI dialogUI = new DialogUI("Lama peminjaman maksimal 3 hari");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
       }
       else{
       Perpustakaan.bukuDipinjam = new BukuDipinjam (buku.judul);
         
       Perpustakaan.bukuDipinjam.setLamaPinjam(lama);
       
         this.bukuDipinjamCollection.add(Perpustakaan.bukuDipinjam);
         
         tampilPinjaman(bukuDipinjamCollection);
       }
    }
    private void batalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batalMouseClicked
        if(daftarPinjaman.getSelectedColumnCount() !=0){
            
            int barisBukuHapus = daftarPinjaman.getSelectedRow();
            
            String judulBukuHapus = daftarPinjaman.getValueAt(barisBukuHapus, 0).toString();
            BukuDipinjam bukuDihapus = new BukuDipinjam (judulBukuHapus);
            hapusBuku(bukuDihapus);
            
            tampilPinjaman(bukuDipinjamCollection);
            
        }
        else{
               DialogUI dialogUI = new DialogUI("Silahkan memilih judul buku");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
        }
    }//GEN-LAST:event_batalMouseClicked
  public void hapusBuku(Buku buku){
      if(bukuDipinjamCollection.size() == 1){
          bukuDipinjamCollection.remove(0);
      }
      try{
           for( BukuDipinjam bukuDihapus : bukuDipinjamCollection){
               if(bukuDihapus.judul.equals(buku.judul))
               bukuDipinjamCollection.remove(bukuDihapus);
           }
      }
      catch (Exception e){
          
      }
    }
   public void tampilPinjaman(ArrayList<BukuDipinjam> listBukuDipinjam){
         Object[] kolom = { "Judul" };
         int baris = 0;
        DefaultTableModel model = new DefaultTableModel(kolom, baris);
        
        
           for(Buku mauDipinjam : listBukuDipinjam){
                 model.addRow(new Object[]{mauDipinjam.judul});
           }
            
        daftarPinjaman.setModel(model);
    }
  
    private void tombolKonfirmasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolKonfirmasiMouseClicked
       
           Perpustakaan.controllerPeminjaman.pinjam(bukuDipinjamCollection);
    }//GEN-LAST:event_tombolKonfirmasiMouseClicked

    private void judulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judulBukuActionPerformed

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
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JTable daftarBuku;
    private javax.swing.JTable daftarPinjaman;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField judulBuku;
    private javax.swing.JTextField lama;
    private javax.swing.JButton pinjam;
    private javax.swing.JButton tombolCari;
    private javax.swing.JButton tombolKonfirmasi;
    // End of variables declaration//GEN-END:variables
}

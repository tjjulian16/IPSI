/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.ArrayList;

/**
 *
 * @author TjJul
 */
public class PeminjamanController {
    
    
    public void showFormPeminjaman() {
        Perpustakaan.formPeminjaman = new FormPeminjaman();
        Perpustakaan.formPeminjaman.tampilkan(); 
    }
    
     public void cariBuku(String judul) {
        BukuProvider bukuProvider = new BukuProvider();
        try {
            ArrayList<Buku> listBuku = bukuProvider.selectBuku(judul);
            if(listBuku.isEmpty())
            {
                DialogUI dialogUI = new DialogUI("Buku tidak terdaftar");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
            } 
            else Perpustakaan.formPeminjaman.show(listBuku);
        } catch(Exception ex) {
            DialogUI dialogUI = new DialogUI("Connection Error");
            dialogUI.pack();
            dialogUI.setLocationRelativeTo(null);
            dialogUI.setVisible(true);
        }
    }
    public void pinjam(ArrayList<BukuDipinjam> bukuDipinjam){
        Perpustakaan.peminjamanManager  = new PeminjamanManager();
        Perpustakaan.dialogUI = new DialogUI();
        
        if(Perpustakaan.peminjamanManager.save(bukuDipinjam)){
              DialogUI dialogUI = new DialogUI("Peminjaman Berhasil");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
        }
    }
}
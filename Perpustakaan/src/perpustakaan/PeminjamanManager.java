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
public class PeminjamanManager {
    
    
    public boolean save(ArrayList<BukuDipinjam> bukuDipinjam){
        
        Perpustakaan.peminjaman = new Peminjaman();
       if(bukuDipinjam.size() > 10){
            DialogUI dialogUI = new DialogUI("Jumlah buku yang dipinjam melebihi batas maksimal 10 buku");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
                return false;
       }
       else if (bukuDipinjam.isEmpty()){
           DialogUI dialogUI = new DialogUI("Daftar pinjam masih kosong");
                dialogUI.pack();
                dialogUI.setLocationRelativeTo(null);
                dialogUI.setVisible(true);
                return false;
       }
       else{
             for(BukuDipinjam mauDipinjam : bukuDipinjam){
            Perpustakaan.peminjaman.add(mauDipinjam);
        
             }
        return true;     
    }
       
    }
}

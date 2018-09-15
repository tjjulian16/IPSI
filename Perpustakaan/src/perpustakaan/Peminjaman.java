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
public class Peminjaman {
    
    private ArrayList<BukuDipinjam> daftarBuku;
    
    public Peminjaman(){
        this.daftarBuku = new ArrayList<>();
    }
    
    public void add(BukuDipinjam bukuDipinjam){
        this.daftarBuku.add(bukuDipinjam);
    }
    
}

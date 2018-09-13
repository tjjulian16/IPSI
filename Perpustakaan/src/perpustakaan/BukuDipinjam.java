/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author TjJul
 */
public class BukuDipinjam extends Buku{
    private int lama;
    
    public BukuDipinjam(String judul,int lamaPinjam){
        super(judul);
        this.lama = lamaPinjam;
    }
}

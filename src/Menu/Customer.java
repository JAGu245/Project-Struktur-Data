/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author jagu
 */
public class Customer {
       String nama,id_pesanan,tanggal;
       Makanan makanan;
       Minuman minuman;
       Snack snack;
       double total;

    public Customer(String id_pesanan, String nama, String tanggal, Makanan makanan, Minuman minuman, Snack snack,double total) {
        this.nama = nama;
        this.id_pesanan = id_pesanan;
        this.tanggal = tanggal;
        this.makanan = makanan;
        this.minuman = minuman;
        this.snack = snack;
        this.total=total;
    }

  
    
       
       
       
}

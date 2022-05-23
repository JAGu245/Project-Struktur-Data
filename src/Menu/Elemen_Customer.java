/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author jagu
 */
public class Elemen_Customer {
    Customer customer;
    Elemen_Customer next;
    Elemen_Customer prev;

    public Elemen_Customer(String id_pesanan,String nama,String tanggal,Makanan makanan,Minuman minuman,Snack snack,double total) {
        customer = new Customer(id_pesanan,nama,tanggal,makanan,minuman,snack,total);
        this.next = null;
        this.prev = null;
    }
    
    
    
}

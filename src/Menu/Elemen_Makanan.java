/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author jagu
 */
public class Elemen_Makanan {
   Makanan makanan;
   Elemen_Makanan next;
   Elemen_Makanan prev;
   
   public Elemen_Makanan(String id_makanan,String nama_makanan,double harga,int stok,int qty){
       makanan = new Makanan(id_makanan,nama_makanan,harga,stok,qty);
       next=null;
       prev=null;
   }
}

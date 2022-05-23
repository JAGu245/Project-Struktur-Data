/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author jagu
 */
public class Elemen_Minuman {
   Minuman minuman;
   Elemen_Minuman next;
   Elemen_Minuman prev;
   
   public Elemen_Minuman(String id_minuman,String nama_minuman,double harga,int stok,int qty){
       minuman = new Minuman(id_minuman,nama_minuman,harga,stok,qty);
       next=null;
       prev=null;
   }
}

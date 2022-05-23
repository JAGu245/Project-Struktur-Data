/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author jagu
 */
public class Elemen_Snack {
    Snack snack;
   Elemen_Snack next;
   Elemen_Snack prev;
   
   public Elemen_Snack(String id_snack,String nama_snack,double harga,int stok,int qty){
       snack = new Snack(id_snack,nama_snack,harga,stok,qty);
       next=null;
       prev=null;
   }
}

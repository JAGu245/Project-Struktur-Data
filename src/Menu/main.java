package Menu;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jagu
 */
public class main {

    private static List list = new List();
    private static int pil;
    private static int increment = 1;
    private static String lanjut, tujuanC, tujuanM, tujuanMi, tujuanS;
    private static Makanan makanan;
    private static Minuman minuman;
    private static Snack snack;
    private static Elemen_Customer firstC;
    private static double total;
    private static String id_pesanan, nama_customer, tanggal;
    private static String id_makanan, nama_makanan, id_minuman, nama_minuman, id_snack, nama_snack;
    private static double harga_makanan, harga_minuman, harga_snack;
    private static int qty_makanan, stok_makanan = 100, stok_minuman = 100, stok_snack = 100, qty_minuman, qty_snack;

    public static void main(String[] args) {

        menu();
    }

    private static void menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("==========");
        System.out.println("1. Lihat List");
        System.out.println("2. Insert First");
        System.out.println("3. Insert Last");
        System.out.println("4. Insert At");
        System.out.println("5. Delete First");
        System.out.println("6. Delete Last");
        System.out.println("7. Delete At");
        System.out.println("8. Data Terurut Dari Depan");
        System.out.println("9. Data Terurut Dari Belakang");
        System.out.println("10.Search Data");
        System.out.println("==========");
        System.out.println("Masukkan Pilihan : ");
        pil = scan.nextInt();
        switch (pil) {
            case 1:

                break;
            case 2:
                insertFirst();
                break;
            case 3:
                insertLast();
                break;
            case 4:
                insertAt();
                break;
            case 5:
                deleteFirst();
                break;
            case 6:
                deleteLast();
                break;
            case 7:
                deleteAt();
                break;
            case 8:
                urutdepan();
                break;
            case 9:
                urutbelakang();
                break;
            case 10:
                search();
                break;
            default:
                System.out.println("Maaf tidak ada dalam pilihan");
                break;
        }

    }

    private static void insertFirst() {

        Scanner scan = new Scanner(System.in);
        listmenu();
        infocustomer();
        increment++;
        infomakanan();
        infominuman();
        infosnack();

        list.insertFirstMakanan(id_makanan, nama_makanan, harga_makanan, stok_makanan, qty_makanan);
        makanan = new Makanan(id_makanan, nama_makanan, harga_makanan, stok_makanan, qty_makanan);

        list.insertFirstMinuman(id_minuman, nama_minuman, harga_minuman, stok_minuman, qty_minuman);
        minuman = new Minuman(id_minuman, nama_minuman, harga_minuman, stok_minuman, qty_minuman);

        list.insertFirstSnack(id_snack, nama_snack, harga_snack, stok_snack, qty_snack);
        snack = new Snack(id_snack, nama_snack, harga_snack, stok_snack, qty_snack);

        total = (harga_makanan * qty_makanan) + (harga_minuman * qty_minuman) + (harga_snack * qty_snack);
        list.insertFirstCustomer(id_pesanan, nama_customer, tanggal, makanan, minuman, snack, total);
        list.print();
        System.out.println("Mau Memesan Lagi ?(Y/N)");
        lanjut = scan.nextLine();
        if (lanjut.equals("Y") || lanjut.equals("y")) {
            insertFirst();
        } else {
            System.out.println("Terimakasih Atas Kunjungan Anda, Silahkan Tunggu Pesanan Anda yaa...");
            menu();
        }

    }

    private static void insertLast() {
        Scanner scan = new Scanner(System.in);
        listmenu();
        infocustomer();
        increment++;
        infomakanan();
        infominuman();
        infosnack();

        list.insertLastMakanan(id_makanan, nama_makanan, harga_makanan, stok_makanan, qty_makanan);
        makanan = new Makanan(id_makanan, nama_makanan, harga_makanan, stok_makanan, qty_makanan);

        list.insertLastMinuman(id_minuman, nama_minuman, harga_minuman, stok_minuman, qty_minuman);
        minuman = new Minuman(id_minuman, nama_minuman, harga_minuman, stok_minuman, qty_minuman);

        list.insertLastSnack(id_snack, nama_snack, harga_snack, stok_snack, qty_snack);
        snack = new Snack(id_snack, nama_snack, harga_snack, stok_snack, qty_snack);
        total = (harga_makanan * qty_makanan) + (harga_minuman * qty_minuman) + (harga_snack * qty_snack);
        list.insertLastCustomer(id_pesanan, nama_customer, tanggal, makanan, minuman, snack, total);
        list.print();
        System.out.println("Mau Memesan Lagi ?(Y/N)");
        lanjut = scan.nextLine();
        if (lanjut.equals("Y") || lanjut.equals("y")) {
            insertLast();
        } else {
            System.out.println("Terimakasih Atas Kunjungan Anda, Silahkan Tunggu Pesanan Anda yaa...");
            menu();
        }

    }

    private static void insertAt() {
        Scanner scan = new Scanner(System.in);
        Elemen_Customer Ecustomer;
        listmenu();
        System.out.println("Masukkan Tujuan : ");
        tujuanC = scan.nextLine();
//        tujuanM =firstC.customer.makanan.id_makanan;
//        tujuanMi = firstC.customer.minuman.id_minuman;
//        tujuanS = firstC.customer.snack.id_snack;
        infocustomer();
        increment++;
        infomakanan();
        infominuman();
        infosnack();

        list.insertAtMakanan("1", id_makanan, nama_makanan, harga_makanan, stok_makanan, qty_makanan);
        makanan = new Makanan(id_makanan, nama_makanan, harga_makanan, stok_makanan, qty_makanan);

        list.insertAtMinuman("1", id_minuman, nama_minuman, harga_minuman, stok_minuman, qty_minuman);
        minuman = new Minuman(id_minuman, nama_minuman, harga_minuman, stok_minuman, qty_minuman);

        list.insertAtSnack("1", id_snack, nama_snack, harga_snack, stok_snack, qty_snack);
        snack = new Snack(id_snack, nama_snack, harga_snack, stok_snack, qty_snack);
        total = (harga_makanan * qty_makanan) + (harga_minuman * qty_minuman) + (harga_snack * qty_snack);

        list.insertAtCustomer(tujuanC, id_pesanan, nama_customer, tanggal, makanan, minuman, snack, total);
        list.print();
        System.out.println("Mau Memesan Lagi ?(Y/N)");
        lanjut = scan.nextLine();
        if (lanjut.equals("Y") || lanjut.equals("y")) {

            insertAt();
        } else {
            System.out.println("Terimakasih Atas Kunjungan Anda, Silahkan Tunggu Pesanan Anda yaa...");
            menu();
        }

    }

    private static void deleteFirst() {
        Scanner scan = new Scanner(System.in);
        list.deleteFirstCustomer();
        list.deleteFirstMakanan();
        list.deleteFirstMinuman();
        list.deleteFirstSnack();
        list.print();
        System.out.println("Mau Pilih Lagi ?(Y/N)");
        lanjut = scan.nextLine();
        if (lanjut.equals("Y") || lanjut.equals("y")) {
            deleteFirst();
        } else {
            System.out.println("Terimakasih Atas Kunjungan Anda, Silahkan Tunggu Pesanan Anda yaa...");
            menu();
        }
    }

    private static void deleteLast() {
        Scanner scan = new Scanner(System.in);
        list.deleteLastCustomer();
        list.deleteLastMakanan();
        list.deleteLastMinuman();
        list.deleteLastSnack();
        list.print();
        System.out.println("Mau Pilih Lagi ?(Y/N)");
        lanjut = scan.nextLine();
        if (lanjut.equals("Y") || lanjut.equals("y")) {
            deleteLast();
        } else {
            System.out.println("Terimakasih Atas Kunjungan Anda, Silahkan Tunggu Pesanan Anda yaa...");
            menu();
        }
    }

    private static void deleteAt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Tujuan : ");
        tujuanC = scan.nextLine();
        list.deleteAtCustomer(tujuanC);

    }

    private static void listmenu() {
        System.out.println("==========");
        System.out.println("#MAKANAN");
        System.out.println("1.Teriyaki Boys");
        System.out.println("2.Burger");
        System.out.println("3.Spaghetti");
        System.out.println("4.Fried Chicken");
        System.out.println("#MINUMAN");
        System.out.println("1.Green Tea");
        System.out.println("2.Lemon");
        System.out.println("3.Natural Water");
        System.out.println("#SNACK");
        System.out.println("1.Mushroom Cryspy");
        System.out.println("2.Fried Potato");
    }

    private static void infocustomer() {
        Date date = new Date();
        id_pesanan = "PS00" + increment;
        if (increment >= 10) {
            id_pesanan = "PS0" + increment;
        } else if (increment >= 100) {
            id_pesanan = "PS" + increment;
        }
        tanggal = date.toString();
        Scanner scan = new Scanner(System.in);
        System.out.println("ID Pesanan : " + id_pesanan);
        System.out.println("Nama Pelanggan : ");
        nama_customer = scan.nextLine();
        System.out.println("Tanggal Pesan : " + tanggal);

    }

    private static void infomakanan() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Nama Makanan : (1-4)");
        nama_makanan = scan.nextLine();
        System.out.println("Masukkan Jumlah Pesanan : ");
        qty_makanan = scan.nextInt();
        if (nama_makanan.equals("1")) {
            id_makanan = "1";
            nama_makanan = "Teriyaki Boys";
            harga_makanan = 100000;
            stok_makanan = stok_makanan - qty_makanan;
        } else if (nama_makanan.equals("2")) {
            id_makanan = "2";
            nama_makanan = "Burger";
            harga_makanan = 50000;
            stok_makanan = stok_makanan - qty_makanan;
        } else if (nama_makanan.equals("3")) {
            id_makanan = "3";
            nama_makanan = "Spaghetti";
            harga_makanan = 90000;
            stok_makanan = stok_makanan - qty_makanan;
        } else if (nama_makanan.equals("4")) {
            id_makanan = "4";
            nama_makanan = "Fried Chicken";
            harga_makanan = 25000;
            stok_makanan = stok_makanan - qty_makanan;
        } else {
            System.out.println("Maaf Tidak Ada");
        }

    }

    private static void infominuman() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Nama Minuman : (1-4)");
        nama_minuman = scan.nextLine();
        System.out.println("Masukkan Jumlah Pesanan : ");
        qty_minuman = scan.nextInt();
        if (nama_minuman.equals("1")) {
            id_minuman = "1";
            nama_minuman = "Green Tea";
            harga_minuman = 10000;
            stok_minuman = stok_minuman - qty_minuman;
        } else if (nama_minuman.equals("2")) {
            id_minuman = "2";
            nama_minuman = "Lemon";
            harga_minuman = 15000;
            stok_minuman = stok_minuman - qty_minuman;
        } else if (nama_minuman.equals("3")) {
            id_minuman = "3";
            nama_minuman = "Natural Water";
            harga_minuman = 5000;
            stok_minuman = stok_minuman - qty_minuman;

        } else {
            System.out.println("Maaf Tidak Ada");
        }

    }

    private static void infosnack() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Nama Snack : (1-4)");
        nama_snack = scan.nextLine();
        System.out.println("Masukkan Jumlah Pesanan : ");
        qty_snack = scan.nextInt();
        if (nama_snack.equals("1")) {
            id_snack = "1";
            nama_snack = "Mushroom Cryspy";
            harga_snack = 10000;
            stok_snack = stok_snack - qty_snack;
        } else if (nama_snack.equals("2")) {
            id_snack = "2";
            nama_snack = "Fried Potato";
            harga_snack = 5000;
            stok_snack = stok_snack - qty_snack;
        } else {
            System.out.println("Maaf Tidak Ada");
        }

    }

    private static void search() {
        Scanner scan = new Scanner(System.in);
        String tujuanCari;
        System.out.println("Masukkan ID Pesanan Yang Ingin Di Cari : ");
        tujuanCari = scan.next();
        list.searchCustomer(tujuanCari);
        System.out.println("Mau Pilih Lagi ?(Y/N)");
        lanjut = scan.nextLine();
        if (lanjut.equals("Y") || lanjut.equals("y")) {
            search();
        } else {
            System.out.println("Terimakasih Atas Kunjungan Anda, Silahkan Tunggu Pesanan Anda yaa...");
            menu();
        }

    }

    private static void urutdepan() {

        list.print();
    }

    private static void urutbelakang() {
        list.reverseC();
        list.print();
    }

    private static void dataawal() {
        id_makanan = "1";
        id_minuman = "1";
        id_snack = "1";
        nama_makanan = "Teriyaki Boys";
        nama_minuman = "Green Tea";
        nama_snack = "Mushroom Cryspy";
        harga_makanan = 100000;
        harga_minuman = 10000;
        harga_snack = 5000;
        qty_makanan = 1;
        qty_minuman = 1;
        qty_snack = 1;
        list.insertFirstMakanan(id_makanan, nama_makanan, harga_makanan, stok_makanan, qty_makanan);
        list.insertFirstMakanan("1", "Teriyaki Boys", 100000, 100, 1);
        list.insertFirstMakanan("1", "Teriyaki Boys", 100000, 100, 1);
        list.insertFirstMakanan("1", "Teriyaki Boys", 100000, 100, 1);
        list.insertFirstMakanan("1", "Teriyaki Boys", 100000, 100, 1);
        
        list.insertFirstMinuman(id_minuman, nama_minuman, harga_minuman, stok_minuman, qty_minuman);
        minuman = new Minuman(id_minuman, nama_minuman, harga_minuman, stok_minuman, qty_minuman);

        list.insertFirstSnack(id_snack, nama_snack, harga_snack, stok_snack, qty_snack);
        snack = new Snack(id_snack, nama_snack, harga_snack, stok_snack, qty_snack);

        total = (harga_makanan * qty_makanan) + (harga_minuman * qty_minuman) + (harga_snack * qty_snack);
        list.insertFirstCustomer("PS001", "Hendi", "24/5/2022", makanan, minuman, snack, total);
    }

}

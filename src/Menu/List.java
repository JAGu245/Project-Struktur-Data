/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author jagu
 */
public class List {

    Elemen_Customer firstC;
    Elemen_Makanan firstM;
    Elemen_Minuman firstMi;
    Elemen_Snack firstS;

    List() {
        firstC = null;
        firstM = null;
        firstMi = null;
        firstS = null;

    }
//INSERTFIRST

    void insertFirstCustomer(String id_pesanan, String nama, String tanggal, Makanan makanan, Minuman minuman, Snack snack, double total) {
        Elemen_Customer customer = new Elemen_Customer(id_pesanan, nama, tanggal, makanan, minuman, snack, total);
        if (firstC == null) {
            firstC = customer;
        } else {
            customer.next = firstC;
            customer.next.prev = customer;
            firstC = customer;
        }
    }

    void insertFirstMakanan(String id_makanan, String nama_makanan, double harga, int stok, int qty) {
        Elemen_Makanan makanan = new Elemen_Makanan(id_makanan, nama_makanan, harga, stok, qty);
        if (firstM == null) {
            firstM = makanan;
        } else {
            makanan.next = firstM;
            makanan.next.prev = makanan;
            firstM = makanan;
        }
    }

    void insertFirstMinuman(String id_minuman, String nama_minuman, double harga, int stok, int qty) {
        Elemen_Minuman minuman = new Elemen_Minuman(id_minuman, nama_minuman, harga, stok, qty);
        if (firstMi == null) {
            firstMi = minuman;
        } else {
            minuman.next = firstMi;
            minuman.next.prev = minuman;
            firstMi = minuman;
        }
    }

    void insertFirstSnack(String id_snack, String nama_snack, double harga, int stok, int qty) {
        Elemen_Snack snack = new Elemen_Snack(id_snack, nama_snack, harga, stok, qty);
        if (firstS == null) {
            firstS = snack;
        } else {
            snack.next = firstS;
            snack.next.prev = snack;
            firstS = snack;
        }
    }

//INSERTLAST
    void insertLastCustomer(String id_pesanan, String nama, String tanggal, Makanan makanan, Minuman minuman, Snack snack, double total) {
        Elemen_Customer customer = new Elemen_Customer(id_pesanan, nama, tanggal, makanan, minuman, snack, total);
        if (firstC == null) {
            firstC = customer;
        } else {
            Elemen_Customer pointer = firstC;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            customer.prev = pointer;
            pointer.next = customer;
        }
    }

    void insertLastMakanan(String id_makanan, String nama_makanan, double harga, int stok, int qty) {
        Elemen_Makanan makanan = new Elemen_Makanan(id_makanan, nama_makanan, harga, stok, qty);
        if (firstM == null) {
            firstM = makanan;
        } else {
            Elemen_Makanan pointer = firstM;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            makanan.prev = pointer;
            pointer.next = makanan;
        }
    }

    void insertLastMinuman(String id_minuman, String nama_minuman, double harga, int stok, int qty) {
        Elemen_Minuman minuman = new Elemen_Minuman(id_minuman, nama_minuman, harga, stok, qty);
        if (firstMi == null) {
            firstMi = minuman;
        } else {
            Elemen_Minuman pointer = firstMi;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            minuman.prev = pointer;
            pointer.next = minuman;
        }
    }

    void insertLastSnack(String id_snack, String nama_snack, double harga, int stok, int qty) {
        Elemen_Snack snack = new Elemen_Snack(id_snack, nama_snack, harga, stok, qty);
        if (firstS == null) {
            firstS = snack;
        } else {
            Elemen_Snack pointer = firstS;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            snack.prev = pointer;
            pointer.next = snack;
        }
    }

//INSERTAT
    void insertAtCustomer(String tujuan, String id_pesanan, String nama, String tanggal, Makanan makanan, Minuman minuman, Snack snack, double total) {
        Elemen_Customer customer = new Elemen_Customer(id_pesanan, nama, tanggal, makanan, minuman, snack, total);
        if (firstC == null) {
            firstC = customer;
        } else {
            Elemen_Customer pointer = firstC;
            while (pointer.next != null) {
                if (pointer.customer.id_pesanan == tujuan) {
                    customer.next = pointer.next;
                    customer.prev = pointer;
                    pointer.next = customer;
                    customer.next.prev = customer;
                    break;
                } else {
                    pointer = pointer.next;
                }
            }
        }

    }

    void insertAtMakanan(String tujuan, String id_makanan, String nama_makanan, double harga, int stok, int qty) {
        Elemen_Makanan makanan = new Elemen_Makanan(id_makanan, nama_makanan, harga, stok, qty);
        if (firstM == null) {
            firstM = makanan;
        } else {
            Elemen_Makanan pointer = firstM;
            while (pointer.next != null) {
                if (pointer.makanan.id_makanan == tujuan) {
                    makanan.next = pointer.next;
                    makanan.prev = pointer;
                    pointer.next = makanan;
                    makanan.next.prev = makanan;
                    break;
                } else {
                    pointer = pointer.next;
                }
            }
        }
    }

    void insertAtMinuman(String tujuan, String id_minuman, String nama_minuman, double harga, int stok, int qty) {
        Elemen_Minuman minuman = new Elemen_Minuman(id_minuman, nama_minuman, harga, stok, qty);
        if (firstMi == null) {
            firstMi = minuman;
        } else {
            Elemen_Minuman pointer = firstMi;
            while (pointer.next != null) {
                if (pointer.minuman.id_minuman == tujuan) {
                    minuman.next = pointer.next;
                    minuman.prev = pointer;
                    pointer.next = minuman;
                    minuman.next.prev = minuman;
                    break;
                } else {
                    pointer = pointer.next;
                }
            }
        }
    }

    void insertAtSnack(String tujuan, String id_snack, String nama_snack, double harga, int stok, int qty) {
        Elemen_Snack snack = new Elemen_Snack(id_snack, nama_snack, harga, stok, qty);
        if (firstS == null) {
            firstS = snack;
        } else {
            Elemen_Snack pointer = firstS;
            while (pointer.next != null) {
                if (pointer.snack.id_snack == tujuan) {
                    snack.next = pointer.next;
                    snack.prev = pointer;
                    pointer.next = snack;
                    snack.next.prev = snack;
                    break;
                } else {
                    pointer = pointer.next;
                }
            }
        }

    }

//DELETEFIRST
    void deleteFirstCustomer() {
        if (firstC == null) {
            firstC = null;
        } else if (firstC.next == null) {
            firstC = null;
        } else {
            firstC = firstC.next;
            firstC.prev.next = null;
            firstC.prev = null;
        }
    }

    void deleteFirstMakanan() {
        if (firstM == null) {
            firstM = null;
        } else if (firstM.next == null) {
            firstM = null;
        } else {
            firstM = firstM.next;
            firstM.prev.next = null;
            firstM.prev = null;
        }
    }

    void deleteFirstMinuman() {
        if (firstMi == null) {
            firstMi = null;
        } else if (firstMi.next == null) {
            firstMi = null;
        } else {
            firstMi = firstMi.next;
            firstMi.prev.next = null;
            firstMi.prev = null;
        }
    }

    void deleteFirstSnack() {
        if (firstS == null) {
            firstS = null;
        } else if (firstS.next == null) {
            firstS = null;
        } else {
            firstS = firstS.next;
            firstS.prev.next = null;
            firstS.prev = null;
        }
    }

//DELETELAST
    void deleteLastCustomer() {
        if (firstC == null) {
            firstC = null;
        } else if (firstC.next == null) {
            firstC = null;
        } else {
            Elemen_Customer pointer = firstC;
            while (pointer.next != null) {
                if (pointer.next.next != null) {
                    pointer = pointer.next;
                }
                pointer.next.prev = null;
                pointer.next = null;
            }
        }
    }

    void deleteLastMakanan() {
        if (firstM == null) {
            firstM = null;
        } else if (firstM.next == null) {
            firstM = null;
        } else {
            Elemen_Makanan pointer = firstM;
            while (pointer.next != null) {
                if (pointer.next.next != null) {
                    pointer = pointer.next;
                }
                pointer.next.prev = null;
                pointer.next = null;
            }
        }
    }

    void deleteLastMinuman() {
        if (firstMi == null) {
            firstMi = null;
        } else if (firstMi.next == null) {
            firstMi = null;
        } else {
            Elemen_Minuman pointer = firstMi;
            while (pointer.next != null) {
                if (pointer.next.next != null) {
                    pointer = pointer.next;
                }
                pointer.next.prev = null;
                pointer.next = null;
            }
        }
    }

    void deleteLastSnack() {
        if (firstS == null) {
            firstS = null;
        } else if (firstS.next == null) {
            firstS = null;
        } else {
            Elemen_Snack pointer = firstS;
            while (pointer.next != null) {
                if (pointer.next.next != null) {
                    pointer = pointer.next;
                }
                pointer.next.prev = null;
                pointer.next = null;
            }
        }

    }

//DELETEAT
    Elemen_Customer deleteAtCustomer(String tujuan) {
        Elemen_Customer current = firstC;
        while (current != null && !current.customer.id_pesanan.equals(tujuan)) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;

        return current;
    }

    Elemen_Makanan deleteAtMakanan(String tujuan) {
        Elemen_Makanan current = firstM;
        while (current != null && !current.makanan.id_makanan.equals(tujuan)) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;

        return current;
    }

    Elemen_Minuman deleteAtMinuman(String tujuan) {
        Elemen_Minuman current = firstMi;
        while (current != null && !current.minuman.id_minuman.equals(tujuan)) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;

        return current;
    }

    Elemen_Snack deleteAtSnack(String tujuan) {
        Elemen_Snack current = firstS;
        while (current != null && !current.snack.id_snack.equals(tujuan)) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;

        return current;
    }

    void searchCustomer(String tujuan) {
        Elemen_Customer sementara = firstC;

//        Elemen_Makanan sementara2 = firstM;
//        Elemen_Minuman sementara3 = firstMi;
//        Elemen_Snack sementara4 = firstS;
        String id = sementara.customer.id_pesanan;
        if (sementara == null) {
            System.out.println("LIST MASIH KOSONG");
        } else {
            while (sementara != null) {

                if (sementara.customer.id_pesanan.equals(tujuan)) {
                    System.out.println("#######################");
                    System.out.println("ID Pesanan : " + (sementara.customer.id_pesanan));
                    System.out.println("Nama : " + (sementara.customer.nama));
                    System.out.println("Tanggal : " + (sementara.customer.tanggal));
                    System.out.println("======================");
                    System.out.println("Nama Makanan : " + (sementara.customer.makanan.nama_makanan));
                    System.out.println("Harga : " + (sementara.customer.makanan.harga));
                    System.out.println("QTY : " + (sementara.customer.makanan.qty));
                    System.out.println("======================");
                    System.out.println("Nama Minuman : " + (sementara.customer.minuman.nama_minuman));
                    System.out.println("Harga : " + (sementara.customer.minuman.harga));
                    System.out.println("QTY : " + (sementara.customer.minuman.qty));
                    System.out.println("======================");
                    System.out.println("Nama Snack : " + (sementara.customer.snack.nama));
                    System.out.println("Harga : " + (sementara.customer.snack.harga));
                    System.out.println("QTY : " + (sementara.customer.snack.qty));
                    System.out.println("======================");
                    System.out.println("Jumlah Total Bayar : " + (sementara.customer.total));
                    System.out.println("#######################");
                    Elemen_Customer sebelum = sementara.prev;
                    Elemen_Customer sesudah = sementara.next;
                    if (sebelum != null) {

                        System.out.println("#######################");
                        System.out.println("ID Pesanan : " + (sebelum.customer.id_pesanan));
                        System.out.println("Nama : " + (sebelum.customer.nama));
                        System.out.println("Tanggal : " + (sebelum.customer.tanggal));
                        System.out.println("======================");
                        System.out.println("Nama Makanan : " + (sebelum.customer.makanan.nama_makanan));
                        System.out.println("Harga : " + (sebelum.customer.makanan.harga));
                        System.out.println("QTY : " + (sebelum.customer.makanan.qty));
                        System.out.println("======================");
                        System.out.println("Nama Minuman : " + (sebelum.customer.minuman.nama_minuman));
                        System.out.println("Harga : " + (sebelum.customer.minuman.harga));
                        System.out.println("QTY : " + (sebelum.customer.minuman.qty));
                        System.out.println("======================");
                        System.out.println("Nama Snack : " + (sebelum.customer.snack.nama));
                        System.out.println("Harga : " + (sebelum.customer.snack.harga));
                        System.out.println("QTY : " + (sebelum.customer.snack.qty));
                        System.out.println("======================");
                        System.out.println("Jumlah Total Bayar : " + (sebelum.customer.total));
                        System.out.println("#######################");
                    }
                    if (sesudah != null) {

                        System.out.println("#######################");
                        System.out.println("ID Pesanan : " + (sesudah.customer.id_pesanan));
                        System.out.println("Nama : " + (sesudah.customer.nama));
                        System.out.println("Tanggal : " + (sesudah.customer.tanggal));
                        System.out.println("======================");
                        System.out.println("Nama Makanan : " + (sesudah.customer.makanan.nama_makanan));
                        System.out.println("Harga : " + (sesudah.customer.makanan.harga));
                        System.out.println("QTY : " + (sesudah.customer.makanan.qty));
                        System.out.println("======================");
                        System.out.println("Nama Minuman : " + (sesudah.customer.minuman.nama_minuman));
                        System.out.println("Harga : " + (sesudah.customer.minuman.harga));
                        System.out.println("QTY : " + (sesudah.customer.minuman.qty));
                        System.out.println("======================");
                        System.out.println("Nama Snack : " + (sesudah.customer.snack.nama));
                        System.out.println("Harga : " + (sesudah.customer.snack.harga));
                        System.out.println("QTY : " + (sesudah.customer.snack.qty));
                        System.out.println("======================");
                        System.out.println("Jumlah Total Bayar : " + (sesudah.customer.total));
                        System.out.println("#######################");
                    }
                    break;
                }

                sementara = sementara.next;

            }
        }
    }

    void reverseC() {
        Elemen_Customer temp = null;
        Elemen_Customer current = firstC;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        if (temp != null) {
            firstC = temp.prev;
        }
    }

    static int search(Elemen_Customer head_ref, String x) {

        // Stores head Node
        Elemen_Customer temp = head_ref;

        // Stores position of the integer
        // in the doubly linked list
        int pos = 0;

        // Traverse the doubly linked list
        while (temp.customer.id_pesanan != x
                && temp.next != null) {
            // Update pos
            pos++;

            // Update temp
            temp = temp.next;
        }

        // If the integer not present
        // in the doubly linked list
        if (temp.customer.id_pesanan != x) {
            return -1;
        }
        // If the integer present in
        // the doubly linked list
        return (pos + 1);
    }

    void print() {
        Elemen_Customer sementara = firstC;
//        Elemen_Makanan sementara2 = firstM;
//        Elemen_Minuman sementara3 = firstMi;
//        Elemen_Snack sementara4 = firstS;
        if (sementara == null) {
            System.out.println("LIST MASIH KOSONG");
        } else {
            System.out.format("+------------------------+---------------+-----------------------------+-------------------+-----------+-----------+-------------------+-----------+-------+-------------------+-----------+-------+-------------------+%n");
            System.out.format("| No | ID PESANAN        | NAMA          | TANGGAL                     | NAMA MAKANAN      | HARGA     | QTY       | NAMA MINUMAN      | HARGA     | QTY   | NAMA SNACK        | HARGA     | QTY   | TOTAL BAYAR       |%n");
            System.out.format("+------------------------+---------------+-----------------------------+-------------------+-----------+-----------+-------------------+-----------+-------+-------------------+-----------+-------+-------------------+%n");
            while (sementara != null) {
//                System.out.println("#######################");
//                System.out.println("ID Pesanan : " + (sementara.customer.id_pesanan));
//                System.out.println("Nama : " + (sementara.customer.nama));
//                System.out.println("Tanggal : " + (sementara.customer.tanggal));
//                System.out.println("======================");
//                System.out.println("Nama Makanan : " + (sementara.customer.makanan.nama_makanan));
//                System.out.println("Harga : " + (sementara.customer.makanan.harga));
//                System.out.println("QTY : " + (sementara.customer.makanan.qty));
//                System.out.println("======================");
//                System.out.println("Nama Minuman : " + (sementara.customer.minuman.nama_minuman));
//                System.out.println("Harga : " + (sementara.customer.minuman.harga));
//                System.out.println("QTY : " + (sementara.customer.minuman.qty));
//                System.out.println("======================");
//                System.out.println("Nama Snack : " + (sementara.customer.snack.nama));
//                System.out.println("Harga : " + (sementara.customer.snack.harga));
//                System.out.println("QTY : " + (sementara.customer.snack.qty));
//                System.out.println("======================");
//                System.out.println("Jumlah Total Bayar : " + (sementara.customer.total));
//                System.out.println("#######################");
                int i = 0;
                i += 1;
                String tbl = "| %-2s | %-17s | %-13s | %-10s |%-15s |%-10s |%-10s |%-15s |%-10s |%-10s |%-15s |%-10s |%-10s |%-10s %n";

                System.out.format(tbl, i, sementara.customer.id_pesanan, sementara.customer.nama, sementara.customer.tanggal, sementara.customer.makanan.nama_makanan,
                        sementara.customer.makanan.harga, sementara.customer.makanan.qty, sementara.customer.minuman.nama_minuman, sementara.customer.minuman.harga,
                        sementara.customer.minuman.qty, sementara.customer.snack.nama, sementara.customer.snack.harga, sementara.customer.snack.qty, sementara.customer.total);

                sementara = sementara.next;

            }
            System.out.format("+------------------------+---------------+-----------------------------+-------------------+-----------+-----------+-------------------+-----------+-------+-------------------+-----------+-------+-------------------+%n");
        }

    }

}

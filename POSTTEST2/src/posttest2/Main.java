package posttest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * AZIIZAH OKI SHOFRINA
 * 2109106004 
 */

public class Main {

    static ArrayList<Bibit> listBibit = new ArrayList<>();
    static ArrayList<Benih> listBenih = new ArrayList<>();
    static ArrayList<Pupuk> listPupuk = new ArrayList<>();

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("\n   Sistem Pendataan Produk pada      ");
        System.out.println("           Toko Tanaman                ");
        
        boolean running = true;
        while (running) {
            System.out.println("\n-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-\n");
            System.out.println("             Menu Utama              \n");
            System.out.println("     1 | Tambahkan produk baru         ");
            System.out.println("     2 | Lihat daftar produk           ");
            System.out.println("     3 | Ubah rincian produk           ");
            System.out.println("     4 | Hapus produk                  ");
            System.out.println("     0 | Exit                        \n");
            System.out.print("=: "); 
            String menu = input.readLine();
    
            switch (menu) {
                case "1":
                    showProduk("Tambah");
                    break;
            
                case "2":
                    showProduk("Lihat");
                    break;
            
                case "3":
                    showProduk("Ubah");
                    break;
            
                case "4":
                    showProduk("Hapus");
                    break;
            
                case "0":
                    running = false;
                    break;
            
                default:
                    System.err.println("\n\tMenu tidak tersedia.");

                    break;
            }

        }

        // hentikan program
        exit();

    }

    // FUNCTIONS ===============================================================


    // menu tampilkan produk
    public static void showProduk(String mode) throws IOException {
        boolean running = true;

        while (running) {
            System.out.println("\n-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-\n");
            System.out.printf("        %s Daftar Produk       \n\n", mode);
            System.out.println("     1 | Bibit     3 | Pupuk          ");
            System.out.println("     2 | Benih     0 | Batalkan     \n");
            System.out.print("=: ");
            String pilihan = input.readLine();

            switch (pilihan) {

                case "1":
                
                    if (mode == "Tambah") {
                        createProduk("Bibit");
                    } else if (mode == "Lihat") {
                        if (!printList(mode, "Bibit", listBibit)) return;
                        readProduk(listBibit);
                    } else if (mode == "Ubah") {
                        if (!printList(mode, "Bibit", listBibit)) return;
                        updateProduk(listBibit);
                    } else if (mode == "Hapus") {
                        if (!printList(mode, "Bibit", listBibit)) return;
                        deleteProduk(listBibit);
                    } 
                    
                    running = false;
                    break;
                    
                case "2":
                    if (mode == "Tambah") {
                        createProduk("Benih");
                    } else if (mode == "Lihat") {
                        if (!printList(mode, "Benih", listBenih)) return;
                        readProduk(listBenih);
                    } else if (mode == "Ubah") {
                        if (!printList(mode, "Benih", listBenih)) return;
                        updateProduk(listBenih);
                    } else if (mode == "Hapus") {
                        if (!printList(mode, "Benih", listBenih)) return;
                        deleteProduk(listBenih);
                    }
                    
                    running = false;
                    break;
                    
                case "3":
                    
                    if (mode == "Tambah") {
                        createProduk("Pupuk");
                    } else if (mode == "Lihat") {
                        if (!printList(mode, "Pupuk", listPupuk)) return;
                        readProduk(listPupuk);
                    } else if (mode == "Ubah") {
                        if (!printList(mode, "Pupuk", listPupuk)) return;
                        updateProduk(listPupuk);
                    } else if (mode == "Hapus") {
                        if (!printList(mode, "Pupuk", listPupuk)) return;
                        deleteProduk(listPupuk);
                    }
                    
                    running = false;
                    break;

                case "0":
                    running = false;
                    break;

                default:
                    System.out.println("\n      Pilihan tidak tersedia.");
                    break;
            }
   
        }
    }
    
    // input data produk
    public static void createProduk(String produk) throws IOException {
        System.out.printf("\n|| Tambah %s ||-||-||-||-||-||-||\n\n", produk);

        if (produk == "Bibit") {
            Bibit bibit = new Bibit(listBibit);
            listBibit.add(bibit);

        } else if (produk == "Benih") {
            Benih benih = new Benih(listBenih);
            listBenih.add(benih);

        } else if (produk == "Pupuk") {
            Pupuk pupuk = new Pupuk(listPupuk);
            listPupuk.add(pupuk);
        }

        System.out.printf("\n%s berhasil ditambahkan!\n", produk);
    }

    // tampilkan daftar produk
    public static boolean printList(String mode, String produk, ArrayList list) {
        
        if (list.isEmpty()) {
            System.out.printf("\n\t%s masih kosong.\n", produk);
            return false;
        }

        System.out.printf("\n|| %s %s ||-||-||-||-||-||-||\n\n", mode, produk);
        
        if (produk == "Bibit") {
            
            for (int i=0; i<listBibit.size(); i++) {
                System.out.printf("%1$d | %2$-22s Rp %3$s\n", i+1, listBibit.get(i).getNama(), listBibit.get(i).getHarga());
            }

        } else if (produk == "Benih") {

            for (int i=0; i<listBenih.size(); i++) {
                System.out.printf("%1$d | %2$-22s Rp %3$s\n", i+1, listBenih.get(i).getNama(), listBenih.get(i).getHarga());
            }
            
        } else if (produk == "Pupuk") {

            for (int i=0; i<listPupuk.size(); i++) {
                System.out.printf("%1$d | %2$-22s Rp %3$s\n", i+1, listPupuk.get(i).getNama(), listPupuk.get(i).getHarga());
            }

        }
    
        return true;
    }

    // tampilkan rincian produk
    public static void readProduk(ArrayList list) throws IOException {

        System.out.print("\nLihat produk nomor =: ");
        int no = Integer.parseInt(input.readLine());

        for (int i=0; i<list.size(); i++) {
    
            if (no == i+1) {

                if (list == listBibit) {
                    listBibit.get(i).printAttribute();
                    
                } else if (list == listBenih) {
                    listBenih.get(i).printAttribute();
                    
                } else if (list == listPupuk) {
                    listPupuk.get(i).printAttribute();
                }
                
                break;
            }
            
        }

    }

    // ubah rincian produk
    public static void updateProduk(ArrayList list) throws IOException {

        System.out.print("\nUbah produk nomor =: ");
        int no = Integer.parseInt(input.readLine());

        for (int i = 0; i < list.size(); i++) {

            if (no == i + 1) {

                if (list == listBibit) {
                    listBibit.get(i).printAttribute();
                    System.out.println();
                    listBibit.get(i).setAttribute();
                    
                } else if (list == listBenih) {
                    listBenih.get(i).printAttribute();
                    System.out.println();
                    listBenih.get(i).setAttribute();
                    
                } else if (list == listPupuk) {
                    listPupuk.get(i).printAttribute();
                    System.out.println();
                    listPupuk.get(i).setAttribute();
                }

                System.out.println("\nRincian berhasil diubah!");

                break;
            }

        }

    }

    // hapus produk
    public static void deleteProduk(ArrayList list) throws IOException {
        System.out.print("\nHapus produk nomor =: ");
        int no = Integer.parseInt(input.readLine());

        int i;
        for (i = 0; i < list.size(); i++) {
            if (no == i+1) {
                break;
            }   
        }

        if (list == listBibit) {
            listBibit.get(i).printAttribute();

        } else if (list == listBenih) {
            listBenih.get(i).printAttribute();

        } else if (list == listPupuk) {
            listPupuk.get(i).printAttribute();
        }

        System.out.println("\nKetik '1' untuk menghapus produk");
        System.out.print("=: ");
        String jawaban = input.readLine();
        
        // hapus produk
        if (jawaban.equals("1")) {
            list.remove(i);
            System.out.println("\nProduk berhasil dihapus!");
            return;
        }
        
        System.out.println("\nProduk gagal dihapus.");
    }

    // keluar program
    public static void exit() {
        System.out.println("\n\t  Program dihentikan.\n");
        System.exit(0);
    }

}

package posttest3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Tema : Pendataan Produk pada Toko Tanaman
 * 
 * AZIIZAH OKI SHOFRINA
 * 2109106004 
 * 
 * Inheritance yang diterapkan:
 * 1. Single Inheritance        = Akun -> Admin
 * 2. Hierarchical Inheritance  = Produk -> Bibit, Benih, Pupuk
 * 
 */

public class Main {

    // DATA ===============================================================
    
    public static ArrayList<Bibit> listBibit = new ArrayList<>();
    public static ArrayList<Benih> listBenih = new ArrayList<>();
    public static ArrayList<Pupuk> listPupuk = new ArrayList<>();

    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    // akun admin default
    public static Admin akunAdmin = new Admin("admin", "123");
    
    // RUNNING ===============================================================
    
    public static void main(String[] args) throws IOException {
        boolean login = false;

        while (!login) {
            System.out.println("\n\n   Harap login terlebih dahulu! \n");

            String username, password;

            System.out.print("      Username : ");
            username = input.readLine();
            
            System.out.print("      Password : ");
            password = input.readLine();

            if (
                username.equals(akunAdmin.getUsername()) &&
                password.equals(akunAdmin.getPassword())
            ) {
                login = true;
            }
        }

        System.out.println("\n\n-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-");
        System.out.println("\n   Sistem Pendataan Produk pada      ");
        System.out.println("           Toko Tanaman                ");

        boolean running = true;
        while (running) {
            System.out.println("\n-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-\n");
            System.out.println("            Menu Utama              \n");
            System.out.println("     1 | Tambahkan produk baru         ");
            System.out.println("     2 | Lihat daftar produk           ");
            System.out.println("     3 | Ubah rincian produk           ");
            System.out.println("     4 | Hapus produk                  ");
            System.out.println("     0 | Keluar                        \n");
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
                    System.out.println("\n\tMenu tidak tersedia.");

                    break;
            }

        }

        // hentikan program
        exit();

    }

    // TAMPILAN ===============================================================

    // menu tampilkan produk
    private static void showProduk(String mode) throws IOException {
        boolean running = true;

        while (running) {
            System.out.println("\n-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-\n");
            System.out.printf("        %s Daftar Produk       \n\n", mode);
            System.out.println("     1 | Bibit     3 | Pupuk          ");
            System.out.println("     2 | Benih     0 | Batalkan     \n");
            System.out.print("=: ");

            String[] produk = {"Bibit", "Benih", "Pupuk"};
            int pilihan;

            try {
                pilihan = Integer.parseInt(input.readLine());

                if (pilihan < 0 || pilihan > 3) {
                    System.out.println("\n      Pilihan tidak tersedia.");
                    continue;
                } 

                if (pilihan == 0) {
                    running = false;
                    break;
                }
                
            } catch (Exception e) {
                System.out.println("\n      Pilihan tidak tersedia.");
                continue;
            }
            
            switch (mode) {
                case "Tambah":
                    createProduk(produk[pilihan-1]);
                    running = false;
                    break;
                    
                case "Lihat":
                    readProduk(produk[pilihan-1]);
                    running = false;

                    break;

                case "Ubah":
                    updateProduk(produk[pilihan-1]);
                    running = false;

                    break;

                case "Hapus":
                    deleteProduk(produk[pilihan-1]);
                    running = false;

                    break;

            } // end switch
   
        } // end while
    }
    
    // input data produk
    private static void createProduk(String produk) throws IOException {
        System.out.printf("\n|| Tambah %s ||-||-||-||-||-||-||\n\n", produk);

        if (produk == "Bibit") {
            akunAdmin.createBibit();

        } else if (produk == "Benih") {
            akunAdmin.createBenih();

        } else if (produk == "Pupuk") {
            akunAdmin.createPupuk();
        }

        System.out.printf("\n%s berhasil ditambahkan!\n", produk);
    }

    // tampilkan daftar produk
    private static boolean printList(String mode, String produk) {
        
        if (
            produk == "Bibit" && listBibit.isEmpty() ||
            produk == "Benih" && listBenih.isEmpty() ||
            produk == "Pupuk" && listPupuk.isEmpty() 
        ) {
            System.out.printf("\n\t%s masih kosong.\n", produk);
            return false;
        }

        System.out.printf("\n|| %s %s ||-||-||-||-||-||-||\n\n", mode, produk);

        if (produk == "Bibit") {
            
            for (int i=0; i<listBibit.size(); i++) {
                System.out.printf(
                        "%1$d | %2$-22s Rp %3$s\n", 
                        i + 1, 
                        listBibit.get(i).getNama(), 
                        listBibit.get(i).getHarga()
                );
            }

        } else if (produk == "Benih") {

            for (int i=0; i<listBenih.size(); i++) {
                System.out.printf(
                        "%1$d | %2$-22s Rp %3$s\n", 
                        i + 1, 
                        listBenih.get(i).getNama(), 
                        listBenih.get(i).getHarga()
                );
            }
            
        } else if (produk == "Pupuk") {

            for (int i=0; i<listPupuk.size(); i++) {
                System.out.printf(
                    "%1$d | %2$-22s Rp %3$s\n", 
                    i+1, 
                    listPupuk.get(i).getNama(),
                    listPupuk.get(i).getHarga()
                );
            }

        }

        return true;
    }

    // tampilkan rincian produk
    private static void readProduk(String produk) throws IOException {
        if (!printList("Lihat", produk)) return;
        
        System.out.print("\nLihat produk nomor =: ");
        try {
            int no = Integer.parseInt(input.readLine());

            if (produk == "Bibit") {
                akunAdmin.readBibit(listBibit.get(no-1));
                
            } else if (produk == "Benih") {
                akunAdmin.readBenih(listBenih.get(no-1));
                
            } else if (produk == "Pupuk") {
                akunAdmin.readPupuk(listPupuk.get(no-1));
            }

        } catch (Exception e) {
            System.out.println("\n      Produk tidak ditemukan.");
            return;
        }



    }

    // ubah rincian produk
    private static void updateProduk(String produk) throws IOException {
        if(!printList("Ubah", produk)) return;

        System.out.print("\nUbah produk nomor =: ");
        try {
            int no = Integer.parseInt(input.readLine());
            
            if (produk == "Bibit") {
                akunAdmin.updateBibit(listBibit.get(no-1));
            } else if (produk == "Benih") {
                akunAdmin.updateBenih(listBenih.get(no-1));
            } else if (produk == "Pupuk") {
                akunAdmin.updatePupuk(listPupuk.get(no-1));
            }
            
        } catch (Exception e) {
            System.out.println("\n      Produk tidak ditemukan.");
            return;
        }

    }

    // hapus produk
    private static void deleteProduk(String produk) throws IOException {
        if (!printList("Lihat", produk)) return;

        System.out.print("\nHapus produk nomor =: ");

        try {
            int no = Integer.parseInt(input.readLine());
    
            if (produk == "Bibit") {
                akunAdmin.deleteBibit(listBibit.get(no-1));
            } else if (produk == "Benih") {
                akunAdmin.deleteBenih(listBenih.get(no-1));
            } else if (produk == "Pupuk") {
                akunAdmin.deletePupuk(listPupuk.get(no-1));
            }
            
        } catch (Exception e) {
            System.out.println("\n      Produk tidak ditemukan.");
            return;

        }
        
    }

    // keluar program
    private static void exit() {
        System.out.println("\n\t  Program dihentikan.\n");
        System.exit(0);
    }


}

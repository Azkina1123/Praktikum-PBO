package posttest5;

import java.io.IOException;

public class Pupuk extends Produk {
    private String tipe;       // padat atau cair
    private double isi;        // berat (gr) atau isi (ml)
    private String kandungan;

    // CONSTRUCTOR ========================================
    public Pupuk(int id, String nama, int harga, int stok, String tipe, double isi, String kandungan) {
        super(id, nama, harga, stok);
        this.tipe = tipe;
        this.isi = isi;
        this.kandungan = kandungan;
    }

    public Pupuk() throws IOException {}

    // SETTER GETTER ========================================
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int getHarga() {
        return harga;
    }

    @Override
    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public int getStok() {
        return stok;
    }

    @Override
    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    
    public double getIsi() {
        return isi;
    }
    
    public void setIsi(double isi) {
        this.isi = isi;
    }
    
    public String getKandungan() {
        return kandungan;
    }
    
    public void setKandungan(String kandungan) {
        this.kandungan = kandungan;
    }
    
    // METHOD ===============================================
    private final void createID() {
        int length = Main.listPupuk.size();
        this.id = Main.listPupuk.isEmpty() ? 1 : Main.listPupuk.get(length - 1).id + 1;
    }

    public void setAttributes() throws IOException {
        if (this.id == 0) {
            this.createID();
        }

        System.out.print("Nama produk   : ");
        this.nama = Main.input.readLine();
        
        System.out.print("Harga produk  : Rp ");
        this.harga = Integer.parseInt(Main.input.readLine());

        System.out.print("Tipe pupuk    : ");
        this.tipe = Main.input.readLine();

        System.out.print("Isi  (kg)/(L) : ");
        this.isi = Double.parseDouble(Main.input.readLine());

        System.out.print("Kandungan     : ");
        this.kandungan = Main.input.readLine();

        System.out.print("Stok          : ");
        this.stok = Integer.parseInt(Main.input.readLine());
    }

    public void printAttributes() {
        System.out.printf("\n%1$c%1$c  %2$-22s Rp %3$s\n", (char) 16, this.nama, this.harga);
        System.out.println("ID Pupuk  : " + this.id);
        System.out.println("Tipe      : " + this.tipe);
        System.out.println("Isi       : " + this.isi + (this.tipe.equals("Padat") ? " kg" : " L"));
        System.out.println("Kandungan : " + this.kandungan);
        System.out.println("Stok      : " + this.stok);
    }

    @Override
    public void addMessage() {
        System.out.println("\nPupuk berhasil ditambahkan!");
    }

    @Override
    public void updateMessage() {
        System.out.println("\nRincian pupuk berhasil diubah!");
    }

    @Override
    public void deleteMessage(String pilihan) {
        if (pilihan.equals("1")) {
            System.out.println("\nPupuk berhasil dihapus!");
            return;
        }
        System.out.println("\nPupuk gagal dihapus.");
    }
}

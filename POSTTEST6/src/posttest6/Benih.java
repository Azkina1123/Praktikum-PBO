package posttest6;

import java.io.IOException;

public class Benih extends Produk {
    private double berat;
    private int isi;
    static final String produk = "Benih";

    // CONSTRUCTOR ========================================

    public Benih(int id, String nama, int harga, int stok, double berat, int isi) {
        super(id, nama, harga, stok);
        this.berat = berat;
        this.isi = isi;
    }
    
    public Benih() throws IOException {}
    
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

    public double getBerat() {
        return berat;
    }
    
    public void setBerat(double berat) {
        this.berat = berat;
    }

    public int getIsi() {
        return isi;
    }

    public void setIsi(int isi) {
        this.isi = isi;
    }

    // METHOD ===============================================
    
    private final void createID() {
        int length = Main.listBenih.size();
        this.id = Main.listBenih.isEmpty() ? 1 : Main.listBenih.get(length - 1).id + 1;
    }

    public void setAttributes() throws IOException {
        if (this.id == 0) {
            this.createID();
        }

        // input data
        System.out.print("Nama produk   : ");
        this.nama = Main.input.readLine();

        System.out.print("Harga produk  : Rp ");
        this.harga = Integer.parseInt(Main.input.readLine());

        System.out.print("Berat (gr)    : ");
        this.berat = Double.parseDouble(Main.input.readLine());

        System.out.print("Isi kemasan   : ");
        this.isi = Integer.parseInt(Main.input.readLine());

        System.out.print("Stok          : ");
        this.stok = Integer.parseInt(Main.input.readLine());
    }

    public void printAttributes() {
        System.out.printf("\n%1$c%1$c  %2$-22s Rp %3$s\n", (char) 16, this.nama, this.harga);
        System.out.println("ID Benih  : " + this.id);
        System.out.println("Berat     : " + this.berat + " gr");
        System.out.println("Isi       : " + this.isi + " biji");
        System.out.println("Stok      : " + this.stok);
    }

    @Override
    public void addMessage() {
        System.out.println("\n" + Benih.produk + " berhasil ditambahkan!");
    }

    @Override
    public void updateMessage() {
        System.out.println("\nRincian " + Benih.produk + " berhasil diubah!");
    }

    @Override
    public void deleteMessage(String pilihan) {
        if (pilihan.equals("1")) {
            System.out.println("\n" + Benih.produk + " berhasil dihapus!");
            return;
        }
        System.out.println("\n" + Benih.produk + " gagal dihapus.");
    }
}

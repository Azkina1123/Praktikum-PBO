package posttest5;

import java.io.IOException;

public class Bibit extends Produk {
    private double berat;   // berat tanaman (kg)
    private double tinggi;
    private String pembiakan;
    private final String produk = "Bibit";

    // CONSTRUCTOR ========================================

    public Bibit(int id, String nama, int harga, int stok, double berat, double tinggi, String pembiakan) {
        super(id, nama, harga, stok);
        this.berat = berat;
        this.tinggi = tinggi;
        this.pembiakan = pembiakan;
    }
    
    public Bibit() throws IOException {}
    
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
    
    public double getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public String getPembiakan() {
        return pembiakan;
    }

    public void setPembiakan(String pembiakan) {
        this.pembiakan = pembiakan;
    }
    
    // METHOD ===============================================
    
    private final void createID() {
        int length = Main.listBibit.size();
        this.id = Main.listBibit.isEmpty() ? 1 : Main.listBibit.get(length - 1).id + 1;
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

        System.out.print("Berat (kg)    : ");
        this.berat = Double.parseDouble(Main.input.readLine());

        System.out.print("Tinggi (cm)   : ");
        this.tinggi = Double.parseDouble(Main.input.readLine());

        System.out.print("Pembiakan     : ");
        this.pembiakan = Main.input.readLine();

        System.out.print("Stok          : ");
        this.stok = Integer.parseInt(Main.input.readLine());
        
    }

    public void printAttributes() {
        System.out.printf("\n%1$c%1$c  %2$-22s Rp %3$s\n", (char) 16, this.nama, this.harga);
        System.out.println("ID Bibit  : " + this.id);
        System.out.println("Berat     : " + this.berat + " kg");
        System.out.println("Tinggi    : " + this.tinggi + " cm");
        System.out.println("Pembiakan : " + this.pembiakan);
        System.out.println("Stok      : " + this.stok);
    }
    
    @Override
    public void addMessage() {
        System.out.println("\n" + this.produk + " berhasil ditambahkan!");
    }

    @Override
    public void updateMessage() {
        System.out.println("\nRincian " + this.produk + " berhasil diubah!");
    }

    @Override
    public void deleteMessage(String pilihan) {
        if (pilihan.equals("1")) {
            System.out.println("\n" + this.produk + " berhasil dihapus!");
            return;
        }
        System.out.println("\n" + this.produk + " gagal dihapus.");
    }

    
}

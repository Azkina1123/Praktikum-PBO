package posttest3;

import java.io.IOException;

public class Benih extends Produk {
    private double berat;
    private int isi;

    // CONSTRUCTOR ========================================

    public Benih(int id, String nama, int harga, int stok, double berat, int isi) {
        super(id, nama, harga, stok);
        this.berat = berat;
        this.isi = isi;
    }
    
    public Benih() throws IOException {}
    
    // SETTER GETTER ========================================
    
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
    
    public void setAttributes() throws IOException {
        // buat id
        int length = Main.listBenih.size();
        this.id = Main.listBenih.isEmpty() ? 1 : Main.listBenih.get(length - 1).id + 1;
        
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

}

package posttest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Benih {
    private int id;
    private String nama;
    private int harga;
    private int stok;
    private double berat;
    private int isi;

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public Benih (ArrayList<Benih> list) throws IOException {
        // buat id
        int length = list.size();
        this.id = list.isEmpty() ? 1 : list.get(length - 1).id + 1;

        // set atribut
        setAttribute();
    }

    public Benih () {}

    // METHOD ===============================================

    public void setAttribute() throws IOException {
        // input data
        System.out.print("Nama produk   : ");
        this.nama = input.readLine();

        System.out.print("Harga produk  : Rp ");
        this.harga = Integer.parseInt(input.readLine());

        System.out.print("Berat (gr)    : ");
        this.berat = Double.parseDouble(input.readLine());

        System.out.print("Isi kemasan   : ");
        this.isi = Integer.parseInt(input.readLine());

        System.out.print("Stok          : ");
        this.stok = Integer.parseInt(input.readLine());
    }

    public void printAttribute() throws IOException {
        System.out.printf("\n%1$c%1$c  %2$-22s Rp %3$s\n", (char) 16, this.nama, this.harga);
        System.out.println("ID Benih  : " + this.id);
        System.out.println("Berat     : " + this.berat + " gr");
        System.out.println("Isi       : " + this.isi + " biji");
        System.out.println("Stok      : " + this.stok);
    }

    // SETTER GETTER ========================================

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

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

    

}

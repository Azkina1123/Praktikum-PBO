package posttest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Pupuk {
    private int id;
    private String nama;
    private int harga;
    private int stok;
    private String tipe;       // padat atau cair
    private double isi;        // berat (gr) atau isi (ml)
    private String kandungan;

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public Pupuk (ArrayList<Pupuk> list) throws IOException {
        // buat id
        int length = list.size();
        this.id = list.isEmpty() ? 1 : list.get(length - 1).id + 1;
        
        // set atribut
        setAttribute();
    }

    public Pupuk () {}

    // METHOD ===============================================

    public void setAttribute() throws IOException {
        System.out.print("Nama produk   : ");
        this.nama = input.readLine();

        System.out.print("Harga produk  : Rp ");
        this.harga = Integer.parseInt(input.readLine());

        System.out.print("Tipe pupuk    : ");
        this.tipe = input.readLine();

        System.out.print("Isi  (kg)/(L) : ");
        this.isi = Double.parseDouble(input.readLine());

        System.out.print("Kandungan     : ");
        this.kandungan = input.readLine();

        System.out.print("Stok          : ");
        this.stok = Integer.parseInt(input.readLine());
    }

    public void printAttribute() throws IOException {
        System.out.printf("\n%1$c%1$c  %2$-22s Rp %3$s\n", (char) 16, this.nama, this.harga);
        System.out.println("ID Pupuk  : " + this.id);
        System.out.println("Tipe      : " + this.tipe);
        System.out.println("Isi       : " + this.isi + (this.tipe.equals("Padat") ? " kg" : " L"));
        System.out.println("Kandungan : " + this.kandungan);
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

    


    
}

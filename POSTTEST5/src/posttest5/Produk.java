package posttest5;

public abstract class Produk {
    public int id;
    public String nama;
    public int harga;
    public int stok;

    // CONSTRUCTOR ========================================

    public Produk(int id, String nama, int harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public Produk() {}

    // SETTER GETTER ========================================

    public abstract int getId();

    public abstract void setId(int id);

    public abstract String getNama();

    public abstract void setNama(String nama);

    public abstract int getHarga();

    public abstract void setHarga(int harga);

    public abstract int getStok();

    public abstract void setStok(int stok);

    // METHOD ===============================================

    public abstract void addMessage();
    
    public abstract void updateMessage();

    public abstract void deleteMessage(String pilihan);
    
}

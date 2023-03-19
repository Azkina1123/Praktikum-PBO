package posttest3;

import java.io.IOException;

public class Admin extends Akun {

    // CONSTRUCTOR ========================================

    public Admin(String username, String password) {
        super(username, password);
    }

    // METHOD ===============================================

    public void createBibit() throws IOException {
        Bibit bibit = new Bibit();
        bibit.setAttributes();
        Main.listBibit.add(bibit);
    }

    public void createBenih() throws IOException {
        Benih benih = new Benih();
        benih.setAttributes();
        Main.listBenih.add(benih);
    }

    public void createPupuk() throws IOException {
        Pupuk pupuk = new Pupuk();
        pupuk.setAttributes();
        Main.listPupuk.add(pupuk);
    }

    public void readBibit(Bibit bibit) {
        bibit.printAttributes();
    }

    public void readBenih(Benih benih) {
        benih.printAttributes();
    }

    public void readPupuk(Pupuk pupuk) {
        pupuk.printAttributes();
    }

    public void updateBibit(Bibit bibit) throws IOException {
        bibit.printAttributes();
        System.out.println();
        bibit.setAttributes();
    }
    
    public void updateBenih(Benih benih) throws IOException {
        benih.printAttributes();
        System.out.println();
        benih.setAttributes();
    }

    public void updatePupuk(Pupuk pupuk) throws IOException {
        pupuk.printAttributes();
        System.out.println();
        pupuk.setAttributes();
    }

    public void deleteBibit(Bibit bibit) throws IOException {
        bibit.printAttributes();

        System.out.println("\nKetik '1' untuk menghapus bibit");
        System.out.print("=: ");
        String jawaban = Main.input.readLine();

        // hapus bibit
        if (jawaban.equals("1")) {
            Main.listBibit.remove(bibit);
            System.out.println("\nBibit berhasil dihapus!");
            return;
        }

        System.out.println("\nBibit gagal dihapus.");
    }

    public void deleteBenih(Benih benih) throws IOException {
        benih.printAttributes();

        System.out.println("\nKetik '1' untuk menghapus benih");
        System.out.print("=: ");
        String jawaban = Main.input.readLine();

        // hapus benih
        if (jawaban.equals("1")) {
            Main.listBenih.remove(benih);
            System.out.println("\nBenih berhasil dihapus!");
            return;
        }

        System.out.println("\nBenih gagal dihapus.");
        
    }

    public void deletePupuk(Pupuk pupuk) throws IOException {
        pupuk.printAttributes();

        System.out.println("\nKetik '1' untuk menghapus pupuk");
        System.out.print("=: ");
        String jawaban = Main.input.readLine();

        // hapus pupuk
        if (jawaban.equals("1")) {
            Main.listPupuk.remove(pupuk);
            System.out.println("\nPupuk berhasil dihapus!");
            return;
        }

        System.out.println("\nPupuk gagal dihapus.");

    }

}

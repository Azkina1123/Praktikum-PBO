package posttest4;

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
        bibit.addMessage();
    }

    public void createBenih() throws IOException {
        Benih benih = new Benih();
        benih.setAttributes();
        Main.listBenih.add(benih);
        benih.addMessage();
    }

    public void createPupuk() throws IOException {
        Pupuk pupuk = new Pupuk();
        pupuk.setAttributes();
        Main.listPupuk.add(pupuk);
        pupuk.addMessage();
    }

    public void readProduk(Bibit bibit) {
        bibit.printAttributes();
    }

    public void readProduk(Benih benih) {
        benih.printAttributes();
    }

    public void readProduk(Pupuk pupuk) {
        pupuk.printAttributes();
    }

    public void updateProduk(Bibit bibit) throws IOException {
        bibit.printAttributes();
        System.out.println();
        bibit.setAttributes();
        bibit.updateMessage();
    }
    
    public void updateProduk(Benih benih) throws IOException {
        benih.printAttributes();
        System.out.println();
        benih.setAttributes();
        benih.updateMessage();
    }

    public void updateProduk(Pupuk pupuk) throws IOException {
        pupuk.printAttributes();
        System.out.println();
        pupuk.setAttributes();
        pupuk.updateMessage();
    }

    public void deleteProduk(Bibit bibit) throws IOException {
        bibit.printAttributes();

        System.out.println("\nKetik '1' untuk menghapus bibit");
        System.out.print("=: ");
        String jawaban = Main.input.readLine();

        // hapus bibit
        if (jawaban.equals("1")) {
            Main.listBibit.remove(bibit);
        }

        bibit.deleteMessage(jawaban);
    }

    public void deleteProduk(Benih benih) throws IOException {
        benih.printAttributes();

        System.out.println("\nKetik '1' untuk menghapus benih");
        System.out.print("=: ");
        String jawaban = Main.input.readLine();

        // hapus benih
        if (jawaban.equals("1")) {
            Main.listBenih.remove(benih);
        }

        benih.deleteMessage(jawaban);
        
    }

    public void deleteProduk(Pupuk pupuk) throws IOException {
        pupuk.printAttributes();

        System.out.println("\nKetik '1' untuk menghapus pupuk");
        System.out.print("=: ");
        String jawaban = Main.input.readLine();

        // hapus pupuk
        if (jawaban.equals("1")) {
            Main.listPupuk.remove(pupuk);
        }

        pupuk.deleteMessage(jawaban);
    }

}

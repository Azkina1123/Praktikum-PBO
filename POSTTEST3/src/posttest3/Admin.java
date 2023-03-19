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

}

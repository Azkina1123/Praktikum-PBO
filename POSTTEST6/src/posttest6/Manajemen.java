package posttest6;

import java.io.IOException;

public interface Manajemen {
    public void createBibit() throws IOException;
    public void createBenih() throws IOException;
    public void createPupuk() throws IOException;

    public void readProduk(Bibit bibit);
    public void readProduk(Benih benih);
    public void readProduk(Pupuk pupuk);

    public void updateProduk(Bibit bibit) throws IOException;
    public void updateProduk(Benih benih) throws IOException;
    public void updateProduk(Pupuk pupuk) throws IOException;

    public void deleteProduk(Bibit bibit) throws IOException;
    public void deleteProduk(Benih benih) throws IOException;
    public void deleteProduk(Pupuk pupuk) throws IOException;
}

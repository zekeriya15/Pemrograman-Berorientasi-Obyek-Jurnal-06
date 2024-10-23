import java.util.ArrayList;


public class Departemen {
    private String nama;
    ArrayList<Karyawan> listKaryawan;

    public Departemen(String nama) {
        this.nama = nama;
        listKaryawan = new ArrayList<>();
    }

    public void addKaryawan(Karyawan k) {
        listKaryawan.add(k);
    }

    public void displayAll() {
        for (Karyawan k : listKaryawan) {
            k.display();
        }
    }

    public void displayKontrak() {
        for (Karyawan k : listKaryawan) {
            if (k instanceof Kontrak) {
                k.display();
            }
        }
    }

    public void displayTetap() {
        for (Karyawan k : listKaryawan) {
            if (k instanceof  Tetap) {
                k.display();
            }
        }
    }
}

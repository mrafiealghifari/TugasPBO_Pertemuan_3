import java.util.Date;

// Class Mahasiswa
public class Mahasiswa {
    private String nama;
    private String Nim;
    private String Jurusan;
    private int umur;
    private Date tglLahir;
    private String[] skills;

    // constractor
    public Mahasiswa(String nama, String Nim, String Jurusan, int umur, Date tglLahir, String[] skills) {
        setNama(nama);
        setJurusan(Jurusan);
        setNim(Nim);
        setUmur(umur);
        setTglLahir(tglLahir);
        setSkills(skills);

    }
    //Method tampilkan info
    public void tampilkanInfo() {
        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + Nim);
        System.out.println("Jurusan       : " + Jurusan);
        System.out.println("Umur          : " + umur);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.print("Keahlian      : ");
        if (skills != null) {
            for (String s : skills) {
                System.out.print(s + " ");
            }
        }
        System.out.println("\n");

    }

    //Getter
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return Nim;
    }
    public String getJurusan() {
        return Jurusan;
    }
    public int getUmur() {
        return umur;
    }
    public Date getTglLahir() {
        return tglLahir;
    }
    public String[] getSkills() {
        return skills;
    }

    //Setter
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("⚠ Nama tidak boleh kosong!!!!!!!!!!!!!");
        } else if  (!nama.matches("[a-zA-Z\\s'.]+")) {
            System.out.println("⚠ Nama Hanya Boleh Huruf!!!!!!!!!!!!!!");
        } else {
            this.nama = nama;
        }

    }

    public void setNim(String Nim) {
        if (Nim == null || Nim.trim().isEmpty()){
            System.out.println("⚠ Nama tidak boleh kosong!!!!!!!!!!!!!");
        }else {
            this.Nim = Nim;
        }
    }

    public void setJurusan(String Jurusan) {
        if (Jurusan == null || Jurusan.trim().isEmpty()){
            System.out.println("⚠ Jurusan tidak boleh kosong!!!!!!!!!!!!!");
        } else if (Jurusan.length() < 3) {
            System.out.println("⚠ Jurusan minimal 3 Karakter!!!!!!!!!!!!!");
        }else {
          this.Jurusan= Jurusan;
        }
    }

    public void setUmur(int umur) {
        if (umur <=0) {
            System.out.println("⚠ Umur Harus lebih dari 0 !!!!!!!!!!!!!");
        }else {
            this.umur = umur;
        }
    }

    public void setTglLahir(Date tglLahir) {
        if (tglLahir == null) {
            System.out.println("⚠️ Tanggal lahir tidak boleh null!");
        }else {
            this.tglLahir = tglLahir;
        }
    }

    public void setSkills(String[] skills) {
        if (tglLahir != null) {
            this.skills = skills.clone();
        } else {
            this.skills = skills;
        }
    }
    public static void main(String[] args) {
        // Membuat contoh tanggal lahir
        Date tgl = new Date(2005 - 1900, 5, 15);

        // Membuat array skills
        String[] skills = {"Jaringan", "Public Speaking", "English"};

        // Membuat objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa(
                "Muhammad Rafie Al'Ghifari",
                "24552011052",
                "Teknik Informatika",
                20,
                tgl,
                skills
        );

        // Menampilkan data mahasiswa ke CLI
        System.out.println("===== Data Mahasiswa =====");
        mhs.tampilkanInfo();
    }

}

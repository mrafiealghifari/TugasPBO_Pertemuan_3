public class Buku {
    private String isbn;
    private String Judul;
    private String pengarang;
    private boolean statusDipinjam;

    //Constructor
    public Buku (String isbn, String judul, String pengarang) {
        this.isbn = isbn;
        this.Judul = Judul;
        this.pengarang = pengarang;
        this.statusDipinjam = false; //belum dipinjam
    }
    //Getter
    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return Judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public boolean isStatusDipinjam() {
        return statusDipinjam;
    }
    //Setter
    public void setStatusDipinjam(boolean statusDipinjam) {
        this.statusDipinjam = statusDipinjam;
    }

    //Tampilkan Info buku
    public void tampilkanInfo(){
        String status = statusDipinjam? "Dipinjam" : "Tersedia";
        System.out.println("ISBN: " + isbn + " | Judul: " + Judul + "| Pengarang: " + pengarang + " | Status " + status);

    }
}

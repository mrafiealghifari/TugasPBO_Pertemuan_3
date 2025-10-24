import java.util.ArrayList;

public class Perpustakaan {
    private String nama;
    private ArrayList<Buku> koleksiBuku;
    private ArrayList<String> daftarPeminjaman;

    // Konstruktor
    public Perpustakaan (String perpustakaanSekolah) {
        this.nama = nama;
        this.koleksiBuku = new ArrayList<>();
        this.daftarPeminjaman = new ArrayList<>();
    }

    // Tambah buku ke koleksi
    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    // Cari buku berdasarkan ISBN
    public Buku cariBuku(String isbn) {
        for (Buku b : koleksiBuku) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null; // jika tidak ditemukan
    }

    // Logika peminjaman buku
    public void pinjamBuku(String idAnggota, String isbn) {
        Buku buku = cariBuku(isbn);
        if (buku == null) {
            System.out.println("Buku tidak ditemukan.");
            return;
        }
        if (buku.isStatusDipinjam()) {
            System.out.println(" Buku sedang dipinjam.");
            return;
        }
        buku.setStatusDipinjam(true);
        daftarPeminjaman.add(idAnggota + " - " + buku.getJudul());
        System.out.println("Buku \"" + buku.getJudul() + "\" berhasil dipinjam oleh " + idAnggota);
    }

    // Tampilkan semua buku
    public void tampilkanKoleksiBuku() {
        System.out.println("\nDaftar Koleksi Buku di " + nama + ":");
        for (Buku b : koleksiBuku) {
            b.tampilkanInfo();
        }
    }

    // Tampilkan log peminjaman
    public void tampilkanLogPeminjaman() {
        System.out.println("\n Log Peminjaman Buku:");
        if (daftarPeminjaman.isEmpty()) {
            System.out.println("Belum ada peminjaman.");
        } else {
            for (String log : daftarPeminjaman) {
                System.out.println("- " + log);
            }
        }
    }
}

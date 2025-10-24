public class Anggota {
    private String idAnggota;
    private String nama;

    //Constructor
    public Anggota(String idAnggota, String nama){
        this.idAnggota = idAnggota;
        this.nama = nama;
    }
    //Getter

    public String getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }

}

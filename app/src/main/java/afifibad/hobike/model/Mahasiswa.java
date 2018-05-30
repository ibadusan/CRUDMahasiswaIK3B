package afifibad.hobike.model;

/**
 * Created by user on 23/05/2018.
 */

public class Mahasiswa {
    private String nama, nim, email, foto;

    public Mahasiswa(){}

    /*
    * tekan ALt+Insert -> pilih constructor dan select semua
    * */
    public Mahasiswa(String nama, String nim, String email, String foto) {
        this.nama = nama;
        this.nim = nim;
        this.email = email;
        this.foto = foto;
    }

    /*
    * fungsi Getter dan Setter
    * geter = fungsinya untuk mendapatkan variabel
    * setter = fungsinya untuk mengisi variabel
    * */

    //mendapatkan variabel nama
    public String getNama() {
        return nama;
    }

    //mengisi variabel nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}

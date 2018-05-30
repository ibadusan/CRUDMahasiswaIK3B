package afifibad.hobike.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 23/05/2018.
 */

public class Mahasiswa {
//    private String nama, nim, email, foto;
//
//    public Mahasiswa(){}
//
//    /*
//    * tekan ALt+Insert -> pilih constructor dan select semua
//    * */
//    public Mahasiswa(String nama, String nim, String email, String foto) {
//        this.nama = nama;
//        this.nim = nim;
//        this.email = email;
//        this.foto = foto;
//    }
//
//    /*
//    * fungsi Getter dan Setter
//    * geter = fungsinya untuk mendapatkan variabel
//    * setter = fungsinya untuk mengisi variabel
//    * */
//
//    //mendapatkan variabel nama
//    public String getNama() {
//        return nama;
//    }
//
//    //mengisi variabel nama
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//
//    public String getNim() {
//        return nim;
//    }
//
//    public void setNim(String nim) {
//        this.nim = nim;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getFoto() {
//        return foto;
//    }
//
//    public void setFoto(String foto) {
//        this.foto = foto;
//    }

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nama")
    @Expose
    private String nama;
    @SerializedName("nim")
    @Expose
    private String nim;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("foto")
    @Expose
    private String foto;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}

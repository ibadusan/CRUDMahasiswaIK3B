package afifibad.hobike.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 30/05/2018.
 */

public class MahasiswaResult {
    @SerializedName("pesan")
    @Expose
    private String pesan;
    @SerializedName("mahasiswas")
    @Expose
    private ArrayList<Mahasiswa> mahasiswas = null;

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public ArrayList<Mahasiswa> getMahasiswas() {
        return mahasiswas;
    }

    public void setMahasiswas(ArrayList<Mahasiswa> mahasiswas) {
        this.mahasiswas = mahasiswas;
    }
}

package afifibad.hobike;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import afifibad.hobike.adapter.MahasiswaAdapter;
import afifibad.hobike.model.Mahasiswa;
import afifibad.hobike.model.MahasiswaResult;
import afifibad.hobike.network.ApiClient;
import afifibad.hobike.network.MahasiswaService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Picasso.with(this).load("https://piscum.photos/200/300?image1").into(ivCobaGambar);
        //1.a data 1 dimensi array
        String[] nama = new String[]{"afif", "ibad", "afifibad","Ibadusan"};

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Afif");
        mahasiswa1.setNim("3.34.15.1.17");
        mahasiswa1.setEmail("afif@gmail.com");
        mahasiswa1.setFoto("https://piscum.photos/200/300?image=1");
        //1.b data 1 dimensi menggunakan pojo
//        Mahasiswa mahasiswa2 = new Mahasiswa(
//                "ibad",
//                "3.34.15.1.18",
//                "ibad@gmail.com",
//                "https://piscum.photos/200/300?image=2"
//
//        );

        //bikin sebuah wadah
        ArrayList<Mahasiswa> mahasiswass = new ArrayList<>();
        mahasiswass.add(mahasiswa1);
//        mahasiswas.add(mahasiswa2);

        //1.c data mengunakan api json
        //Load data API JSON (Retorfit Library)
        MahasiswaService service = ApiClient.getRetrofit().create(MahasiswaService.class);
        Call<MahasiswaResult> mahasiswas = service.getMahasiswa();
        mahasiswas.enqueue(new Callback<MahasiswaResult>() {
            @Override
            public void onResponse(Call<MahasiswaResult> call, Response<MahasiswaResult> response) {
                Toast.makeText(
                        getApplicationContext(),
                        "Jumlah mahasiswa : " + response.body().getMahasiswas().size(),
                        Toast.LENGTH_LONG
                ).show();

                tampilkan(response.body().getMahasiswas());
            }

            @Override
            public void onFailure(Call<MahasiswaResult> call, Throwable t) {

            }
        });

        //2.a adapter 1 dimensi
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                nama);


    }

    private void tampilkan(ArrayList<Mahasiswa> mahasiswas) {
        MahasiswaAdapter mahasiswaAdapter = new MahasiswaAdapter(this,
                R.layout.item_mahasiswa,
                mahasiswas);


        //3. activity {menampilkan data}
        ListView lvDaftarNama = (ListView) findViewById(R.id.lv_daftar_nama);
        lvDaftarNama.setAdapter(mahasiswaAdapter);
    }
}

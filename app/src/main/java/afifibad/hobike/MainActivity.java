package afifibad.hobike;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import afifibad.hobike.adapter.MahasiswaAdapter;
import afifibad.hobike.model.Mahasiswa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //coba gambar dinamis
      //  ImageView ivCobaGambar = (ImageView) findViewById(R.id.iv_coba_gambar);

//        int SDK_INT = android.os.Build.VERSION.SDK_INT;
//        if (SDK_INT > 8){
//            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
//                    .permitAll().build();
//            StrictMode.setThreadPolicy(policy);
//
//            try {
//                URL url = new URL("https://piscum.photos/200/300?image1");
//                Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
//                ivCobaGambar.setImageBitmap(bmp);
//            } catch (MalformedURLException e){
//                e.printStackTrace();
//            } catch (IOException e){
//                e.printStackTrace();
//            }
//        }

        //Picasso.with(this).load("https://piscum.photos/200/300?image1").into(ivCobaGambar);
        //1.data
        String[] nama = new String[]{"afif", "ibad", "afifibad","Ibadusan"};

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Afif");
        mahasiswa1.setNim("3.34.15.1.17");
        mahasiswa1.setEmail("afif@gmail.com");
        mahasiswa1.setFoto("https://piscum.photos/200/300?image=1");

        Mahasiswa mahasiswa2 = new Mahasiswa(
                "ibad",
                "3.34.15.1.18",
                "ibad@gmail.com",
                "https://piscum.photos/200/300?image=2"

        );

        //bikin sebuah wadah
        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        mahasiswas.add(mahasiswa1);
        mahasiswas.add(mahasiswa2);

        //2. adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                nama);

        MahasiswaAdapter mahasiswaAdapter = new MahasiswaAdapter(this,R.layout.item_mahasiswa,mahasiswas);


        //3. activity {menampilkan data}
        ListView lvDaftarNama = (ListView) findViewById(R.id.lv_daftar_nama);
        lvDaftarNama.setAdapter(mahasiswaAdapter);
    }
 }

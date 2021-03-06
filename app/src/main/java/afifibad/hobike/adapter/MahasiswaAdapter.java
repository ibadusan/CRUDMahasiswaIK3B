package afifibad.hobike.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import afifibad.hobike.R;
import afifibad.hobike.model.Mahasiswa;
import afifibad.hobike.model.MahasiswaResult;
import retrofit2.Call;

/**
 * Created by user on 23/05/2018.
 */

public class MahasiswaAdapter extends ArrayAdapter<Mahasiswa> {
    public MahasiswaAdapter(@NonNull Context context,
                            int resource,
                            @NonNull ArrayList<Mahasiswa> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_mahasiswa, parent, false
            );
        }

        Mahasiswa mahasiswa = getItem(position);

        TextView tvNama  = (TextView) convertView.findViewById(R.id.tv_nama);
        tvNama.setText(mahasiswa.getNama());

        TextView tvNIM = (TextView) convertView.findViewById(R.id.tv_nim);
        tvNIM.setText(mahasiswa.getNim());

        TextView tvEmail = (TextView) convertView.findViewById(R.id.tv_email);
        tvEmail.setText(mahasiswa.getEmail());

        ImageView ivImage = (ImageView) convertView.findViewById(R.id.iv_foto);
        Picasso.get()
                .load("http://192.168.43.133:8000/LaraBlog/" + mahasiswa.getFoto())
                .resize(100,100)
                .into(ivImage);

        return convertView;
    }
}

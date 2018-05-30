package afifibad.hobike.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by user on 30/05/2018.
 */

public class ApiClient {
    public static final String BASE_URL = "http://192.168.43.133:8000/LaraBlog/public/api/";

    private static Retrofit mRetrofit;

    public static Retrofit getRetrofit(){
        if (mRetrofit == null){
            mRetrofit = new Retrofit.Builder()
                                    .baseUrl(BASE_URL)
                                    .addConverterFactory(GsonConverterFactory.create())
                                    .build();
        }
        return mRetrofit;
    }
}

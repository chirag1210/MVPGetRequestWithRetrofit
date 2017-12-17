package example.com.mvpexample.Login2;

/**
 * Created by Chirag Chaudhari on 14,December,2017
 */

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by jean on 29/07/16.
 */

public class GetDataService {

    // http://lagaikhai.com/api/v1/matches.json?play_status=concluded
    private static String BASE_URL =  "http://lagaikhai.com/";

    public interface  CountryAPI{
        @GET("api/v1/matches.json?play_status=concluded")
        Call<JsonParentResponse> getResults();
    }

    public static CountryAPI getAPI(){
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(CountryAPI.class);
    }
}
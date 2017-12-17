package example.com.mvpexample.Login2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import example.com.mvpexample.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Win on 16-12-2017.
 */

public class ShowDataActivity extends AppCompatActivity implements ShowDataView{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdata);

        getCountries();
    }

    public void getCountries(){
        GetDataService
                .getAPI()
                .getResults()
                .enqueue(new Callback<JsonParentResponse>() {
                    @Override
                    public void onResponse(Call<JsonParentResponse> call, Response<JsonParentResponse> response) {
                        JsonParentResponse result = response.body();

                        if(result != null){}

                    }

                    @Override
                    public void onFailure(Call<JsonParentResponse> call, Throwable t) {
                        try {
                            throw  new InterruptedException("Error");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
}

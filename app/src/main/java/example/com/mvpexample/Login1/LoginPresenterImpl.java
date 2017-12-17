package example.com.mvpexample.Login1;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Chirag Chaudhari on 14,December,2017
 */
public class LoginPresenterImpl implements LoginPresenter{

    LoginView mView;

    public LoginPresenterImpl(LoginView lView){
        mView=lView;
    }

    @Override
    public void checkValidation(String email, String password) {
        getCountries();

    }


    public void getCountries(){
        CountryService
                .getAPI()
                .getResults()
                .enqueue(new Callback<JsonParentResponse>() {
                    @Override
                    public void onResponse(Call<JsonParentResponse> call, Response<JsonParentResponse> response) {
                        JsonParentResponse result = response.body();

                        if(result != null){}
                            mView.countriesReady(result.getRestResponse().getResult());
                    }

                    @Override
                    public void onFailure(Call<JsonParentResponse> call, Throwable t) {
                        try {
                            throw  new InterruptedException("Erro na comunicação com o servidor!");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                });
    }
}

package example.com.mvpexample.Login1;

import java.util.List;

/**
 * Created by Chirag Chaudhari on 14,December,2017
 */
public interface LoginView {

     void setProgressVisibility(Boolean isProgressVisibility);
     public void countriesReady(List<RestResponse.Country> countries);


}

package example.com.mvpexample.Login;

/**
 * Created by Chirag Chaudhari on 15,September,2017
 */
public interface LoginView {

     public void displayMessage(String message,boolean isLoginSucess);
     public void  setProgressVisibility(boolean isShowing);

}

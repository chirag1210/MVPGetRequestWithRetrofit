package example.com.mvpexample.Login;

import android.os.Handler;

/**
 * Created by Chirag Chaudhari on 15,September,2017
 */
public class LoginPresenterImpl implements LoginPresenter {

    LoginView loginView;

    public LoginPresenterImpl(LoginView loginView) {

        this.loginView = loginView;

    }

    @Override
    public void checkValidation(final String strEmail, final String strPassword) {

        loginView.setProgressVisibility(true);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (strEmail.equalsIgnoreCase("")) {
                    loginView.displayMessage("Please enter email id", false);
                } else if (strPassword.equalsIgnoreCase("")) {
                    loginView.displayMessage("Please enter Password", false);
                } else if (strEmail.equals("chirag") && strPassword.equals("chirag")) {
                    loginView.displayMessage("Login Succesfully.", true);
                }
                loginView.setProgressVisibility(false);
            }
        }, 500);

    }



}

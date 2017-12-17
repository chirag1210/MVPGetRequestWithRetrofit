package example.com.mvpexample.Login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.com.mvpexample.List.ShowListActivity;
import example.com.mvpexample.R;

/**
 * Created by Chirag Chaudhari on 15,September,2017
 */
public class LoginActivity extends AppCompatActivity implements  LoginView{

    private LoginPresenter loginPresenter;

    @BindView(R.id.edEmail)
    EditText edEmail;

    @BindView(R.id.edPassword)
    EditText edPassword;

    ProgressDialog mProgressDialog;

    @OnClick(R.id.btnLogin)
    public void doLogin(){
      //  Toast.makeText(LoginActivity.this,"login btn clicked",Toast.LENGTH_SHORT).show();
        loginPresenter.checkValidation(edEmail.getText().toString().trim(),edPassword.getText().toString().trim());
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(LoginActivity.this);

        loginPresenter = new LoginPresenterImpl(this);

        mProgressDialog = new ProgressDialog(LoginActivity.this);
        mProgressDialog.setMessage("Signing........");
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgressDialog.setCancelable(false);


    }

    @Override
    public void displayMessage(String message,boolean isLoginSuccess) {
        Toast.makeText(LoginActivity.this,message,Toast.LENGTH_LONG).show();

        if(isLoginSuccess){
            startActivity(new Intent(LoginActivity.this, ShowListActivity.class));
        }

    }

    @Override
    public void setProgressVisibility(boolean isShowing) {

        if(isShowing){
            mProgressDialog.show();
        }else {
            mProgressDialog.dismiss();
        }

    }


}

package example.com.mvpexample.Login1;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import example.com.mvpexample.R;

/**
 * Created by Chirag Chaudhari on 14,December,2017
 */
public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener {

    Button mBtnLogin;
    private ProgressDialog mProgressDialog;
    private LoginPresenter mPresenter;
    private EditText mEdEmail,mEdPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();

    }

    private void initViews() {

        mPresenter = new LoginPresenterImpl(this);

        mBtnLogin = (Button) findViewById(R.id.btnLogin);

        mProgressDialog = new ProgressDialog(LoginActivity.this);
        mProgressDialog.setMessage("Signing........");
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgressDialog.setCancelable(false);

        mBtnLogin.setOnClickListener(this);

        mEdEmail= (EditText) findViewById(R.id.edEmail);
        mEdPassword= (EditText) findViewById(R.id.edPassword);

    }

    /**
     * to set visibility to progress dialog
     * @param isProgressVisibility
     */
    @Override
    public void setProgressVisibility(Boolean isProgressVisibility) {

        if (isProgressVisibility) {

            mProgressDialog.show();
        } else {

            if (mProgressDialog.isShowing()) {
                mProgressDialog.dismiss();
            }

        }
    }

    @Override
    public void countriesReady(List<RestResponse.Country> countries) {
        for(RestResponse.Country country : countries){
            Log.e("RETROFIT", country.getName() + "\n"
                    + " - Alpha2:  " + country.getAlphaCode2() +" \n"
                    + " - Alpha3: " + country.getAlphaCode3());
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnLogin:
                mPresenter.checkValidation(mEdEmail.getText().toString(),mEdPassword.getText().toString());
                break;


        }
    }
}

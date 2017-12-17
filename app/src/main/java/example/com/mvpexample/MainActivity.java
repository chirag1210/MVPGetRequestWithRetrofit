package example.com.mvpexample;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.com.mvpexample.Login2.ShowDataActivity;
import example.com.mvpexample.main.MainPresenter;
import example.com.mvpexample.main.MainPresenterImpl;
import example.com.mvpexample.main.MainView;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.username)
    EditText edUserName;
    MainPresenter mainPresenter;

    @BindView(R.id.text)
    TextView tvText;

    @OnClick(R.id.button)
    public void submit() {
        mainPresenter.processText();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mainPresenter = new MainPresenterImpl(this);


        long elapsedTime = SystemClock.elapsedRealtime();
        tvText.setText(""+formatInterval(elapsedTime));

    }


    @Override
    public void showProgressbar() {

    }

    @Override
    public void hideProgressbar() {

    }

    @Override
    public void setUserNameError() {

    }

    @Override
    public void showText(String str) {
      //  Toast.makeText(getApplicationContext(), "cliked " + str, Toast.LENGTH_LONG).show();
        startActivity(new Intent(MainActivity.this, ShowDataActivity.class));
        finish();
    }

    private static String formatInterval(final long millis) {
        final long hr = TimeUnit.MILLISECONDS.toHours(millis);
        final long min = TimeUnit.MILLISECONDS.toMinutes(millis - TimeUnit.HOURS.toMillis(hr));
        final long sec = TimeUnit.MILLISECONDS.toSeconds(millis - TimeUnit.HOURS.toMillis(hr) - TimeUnit.MINUTES.toMillis(min));
        final long ms = TimeUnit.MILLISECONDS.toMillis(millis - TimeUnit.HOURS.toMillis(hr) - TimeUnit.MINUTES.toMillis(min) - TimeUnit.SECONDS.toMillis(sec));
        return String.format("%02d:%02d:%02d", hr, min, sec);
    }
}

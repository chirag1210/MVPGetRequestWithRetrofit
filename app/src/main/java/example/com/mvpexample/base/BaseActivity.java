package example.com.mvpexample.base;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import butterknife.ButterKnife;
import example.com.mvpexample.R;

/**
 * Created by Chirag Chaudhari on 20,November,2017
 */
public abstract class BaseActivity extends AppCompatActivity {

    private ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId());

        ButterKnife.bind(this);

    }

    public abstract int getLayoutResourceId();

    /**
     * initialise all views
     */
    protected abstract void init();

    /**
     *
     * @return Toolbar
     */
    public Toolbar getToolbar()
    {
        return (Toolbar) findViewById(R.id.toolbar);
    }

    /**
     * Show progress dialog
     *
     * @param msg
     */
    protected void showProgress(String msg)
    {
        if (mProgressDialog != null && mProgressDialog.isShowing())
            dismissProgress();

        mProgressDialog = ProgressDialog.show(this, "", msg);
        mProgressDialog.setCancelable(true);
    }

    /**
     * Hide progress dialog
     */
    protected void dismissProgress()
    {
        if (mProgressDialog != null)
        {
            mProgressDialog.dismiss();
            mProgressDialog = null;
        }
    }

    /**
     * Show Toast message
     *
     * @param message
     */
    protected void showToast(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


    protected void showLog(String msg){

        Log.e("---> "+this.getClass().getSimpleName(),msg);
    }

    /**
     * @param cls Activity
     */
    protected void gotoActivityThenKill(Class<?> cls)
    {
        gotoActivityThenKill(cls, null);
    }

    /**
     * @param cls    Activity
     * @param bundle
     */
    protected void gotoActivityThenKill(Class<?> cls, Bundle bundle)
    {
        gotoActivity(cls, bundle);
        finish();
    }

    /**
     * @param cls Activity
     */
    protected void gotoActivity(Class<?> cls)
    {
        gotoActivity(cls, null);
    }

    /**
     * @param ActivityName    Activity
     * @param bundle
     */
    protected void gotoActivity(Class<?> ActivityName, Bundle bundle)
    {
        Intent intent = new Intent(this, ActivityName);
        if (null != bundle)
            intent.putExtras(bundle);
        startActivity(intent);
    }

}

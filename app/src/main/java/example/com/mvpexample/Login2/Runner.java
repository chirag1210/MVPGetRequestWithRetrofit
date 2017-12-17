package example.com.mvpexample.Login2;

/**
 * Created by Win on 16-12-2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Runner {

    @SerializedName("runner")
    @Expose
    private Runner_ runner;

    public Runner_ getRunner() {
        return runner;
    }

    public void setRunner(Runner_ runner) {
        this.runner = runner;
    }

}
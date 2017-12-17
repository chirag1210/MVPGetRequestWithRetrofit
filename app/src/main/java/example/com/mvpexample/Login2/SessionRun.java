package example.com.mvpexample.Login2;

/**
 * Created by Win on 16-12-2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SessionRun {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("session_id")
    @Expose
    private Integer sessionId;
    @SerializedName("no_run")
    @Expose
    private Integer noRun;
    @SerializedName("yes_run")
    @Expose
    private Integer yesRun;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Integer getNoRun() {
        return noRun;
    }

    public void setNoRun(Integer noRun) {
        this.noRun = noRun;
    }

    public Integer getYesRun() {
        return yesRun;
    }

    public void setYesRun(Integer yesRun) {
        this.yesRun = yesRun;
    }

}
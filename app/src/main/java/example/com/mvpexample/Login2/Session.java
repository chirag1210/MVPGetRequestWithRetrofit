package example.com.mvpexample.Login2;

/**
 * Created by Win on 16-12-2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Session {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("match_id")
    @Expose
    private Integer matchId;
    @SerializedName("innings")
    @Expose
    private Integer innings;
    @SerializedName("overs")
    @Expose
    private Integer overs;
    @SerializedName("can_yes")
    @Expose
    private Boolean canYes;
    @SerializedName("can_no")
    @Expose
    private Boolean canNo;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("session_run")
    @Expose
    private SessionRun sessionRun;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getInnings() {
        return innings;
    }

    public void setInnings(Integer innings) {
        this.innings = innings;
    }

    public Integer getOvers() {
        return overs;
    }

    public void setOvers(Integer overs) {
        this.overs = overs;
    }

    public Boolean getCanYes() {
        return canYes;
    }

    public void setCanYes(Boolean canYes) {
        this.canYes = canYes;
    }

    public Boolean getCanNo() {
        return canNo;
    }

    public void setCanNo(Boolean canNo) {
        this.canNo = canNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SessionRun getSessionRun() {
        return sessionRun;
    }

    public void setSessionRun(SessionRun sessionRun) {
        this.sessionRun = sessionRun;
    }

}

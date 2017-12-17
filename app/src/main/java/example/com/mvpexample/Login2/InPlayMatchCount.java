package example.com.mvpexample.Login2;

/**
 * Created by Win on 16-12-2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InPlayMatchCount {

    @SerializedName("play_status")
    @Expose
    private String playStatus;
    @SerializedName("cricket")
    @Expose
    private Integer cricket;
    @SerializedName("football")
    @Expose
    private Integer football;

    public String getPlayStatus() {
        return playStatus;
    }

    public void setPlayStatus(String playStatus) {
        this.playStatus = playStatus;
    }

    public Integer getCricket() {
        return cricket;
    }

    public void setCricket(Integer cricket) {
        this.cricket = cricket;
    }

    public Integer getFootball() {
        return football;
    }

    public void setFootball(Integer football) {
        this.football = football;
    }

}
package example.com.mvpexample.Login2;

/**
 * Created by Win on 16-12-2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Runner_ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("betfair_selection_id")
    @Expose
    private String betfairSelectionId;
    @SerializedName("betfair_runner_name")
    @Expose
    private String betfairRunnerName;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("can_back")
    @Expose
    private boolean canBack;
    @SerializedName("can_lay")
    @Expose
    private boolean canLay;

    @SerializedName("back")
    private String back;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBetfairSelectionId() {
        return betfairSelectionId;
    }

    public void setBetfairSelectionId(String betfairSelectionId) {
        this.betfairSelectionId = betfairSelectionId;
    }

    public String getBetfairRunnerName() {
        return betfairRunnerName;
    }

    public void setBetfairRunnerName(String betfairRunnerName) {
        this.betfairRunnerName = betfairRunnerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getCanBack() {
        return canBack;
    }

    public void setCanBack(Boolean canBack) {
        this.canBack = canBack;
    }

    public Boolean getCanLay() {
        return canLay;
    }

    public void setCanLay(Boolean canLay) {
        this.canLay = canLay;
    }


}


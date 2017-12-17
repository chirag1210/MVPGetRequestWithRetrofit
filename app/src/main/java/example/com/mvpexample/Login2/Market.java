package example.com.mvpexample.Login2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Win on 16-12-2017.
 */

public class Market {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("betfair_market_id")
    @Expose
    private String betfairMarketId;
    @SerializedName("betfair_market_type")
    @Expose
    private String betfairMarketType;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("runners")
    @Expose
    private List<Runner> runners = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBetfairMarketId() {
        return betfairMarketId;
    }

    public void setBetfairMarketId(String betfairMarketId) {
        this.betfairMarketId = betfairMarketId;
    }

    public String getBetfairMarketType() {
        return betfairMarketType;
    }

    public void setBetfairMarketType(String betfairMarketType) {
        this.betfairMarketType = betfairMarketType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Runner> getRunners() {
        return runners;
    }

    public void setRunners(List<Runner> runners) {
        this.runners = runners;
    }

}
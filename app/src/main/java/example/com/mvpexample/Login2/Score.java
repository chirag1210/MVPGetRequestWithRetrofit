package example.com.mvpexample.Login2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Win on 16-12-2017.
 */

public class Score {

    @SerializedName("batteamname")
    @Expose
    private String batteamname;
    @SerializedName("batteamdesc")
    @Expose
    private String batteamdesc;
    @SerializedName("batteamwkts")
    @Expose
    private Integer batteamwkts;
    @SerializedName("batteamovers")
    @Expose
    private String batteamovers;
    @SerializedName("batteamruns")
    @Expose
    private Integer batteamruns;
    @SerializedName("bwlteamname")
    @Expose
    private String bwlteamname;
    @SerializedName("bwlteamdesc")
    @Expose
    private String bwlteamdesc;
    @SerializedName("status")
    @Expose
    private String status;

    public String getBatteamname() {
        return batteamname;
    }

    public void setBatteamname(String batteamname) {
        this.batteamname = batteamname;
    }

    public String getBatteamdesc() {
        return batteamdesc;
    }

    public void setBatteamdesc(String batteamdesc) {
        this.batteamdesc = batteamdesc;
    }

    public Integer getBatteamwkts() {
        return batteamwkts;
    }

    public void setBatteamwkts(Integer batteamwkts) {
        this.batteamwkts = batteamwkts;
    }

    public String getBatteamovers() {
        return batteamovers;
    }

    public void setBatteamovers(String batteamovers) {
        this.batteamovers = batteamovers;
    }

    public Integer getBatteamruns() {
        return batteamruns;
    }

    public void setBatteamruns(Integer batteamruns) {
        this.batteamruns = batteamruns;
    }

    public String getBwlteamname() {
        return bwlteamname;
    }

    public void setBwlteamname(String bwlteamname) {
        this.bwlteamname = bwlteamname;
    }

    public String getBwlteamdesc() {
        return bwlteamdesc;
    }

    public void setBwlteamdesc(String bwlteamdesc) {
        this.bwlteamdesc = bwlteamdesc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



}

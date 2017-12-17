package example.com.mvpexample.Login2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Win on 16-12-2017.
 */

public class Match {

    @SerializedName("match")
    @Expose
    private Match_ match;

    public Match_ getMatch() {
        return match;
    }

    public void setMatch(Match_ match) {
        this.match = match;
    }


}

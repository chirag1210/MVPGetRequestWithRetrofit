package example.com.mvpexample.Login2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Chirag Chaudhari on 14,December,2017
 */
public class JsonParentResponse {

    @SerializedName("matches")
    @Expose
    private List<Match> matches = null;
    @SerializedName("in_play_match_count")
    @Expose
    private InPlayMatchCount inPlayMatchCount;

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public InPlayMatchCount getInPlayMatchCount() {
        return inPlayMatchCount;
    }

    public void setInPlayMatchCount(InPlayMatchCount inPlayMatchCount) {
        this.inPlayMatchCount = inPlayMatchCount;
    }

}

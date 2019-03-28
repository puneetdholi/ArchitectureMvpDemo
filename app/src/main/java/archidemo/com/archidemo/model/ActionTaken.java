
package archidemo.com.archidemo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ActionTaken {

    @SerializedName("action")
    @Expose
    private Object action;

    public Object getAction() {
        return action;
    }

    public void setAction(Object action) {
        this.action = action;
    }

}

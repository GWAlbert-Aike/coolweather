package albert.aike.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityNmae;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}

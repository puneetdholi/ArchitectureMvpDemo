
package archidemo.com.archidemo.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HideFromCompany {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("city_list")
    @Expose
    private List<String> cityList = null;
    @SerializedName("show_city_popup")
    @Expose
    private Boolean showCityPopup;
    @SerializedName("city_popup_text")
    @Expose
    private String cityPopupText;
    @SerializedName("city_popup_image")
    @Expose
    private String cityPopupImage;
    @SerializedName("user_image")
    @Expose
    private String userImage;
    @SerializedName("user_designation")
    @Expose
    private Object userDesignation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getCityList() {
        return cityList;
    }

    public void setCityList(List<String> cityList) {
        this.cityList = cityList;
    }

    public Boolean getShowCityPopup() {
        return showCityPopup;
    }

    public void setShowCityPopup(Boolean showCityPopup) {
        this.showCityPopup = showCityPopup;
    }

    public String getCityPopupText() {
        return cityPopupText;
    }

    public void setCityPopupText(String cityPopupText) {
        this.cityPopupText = cityPopupText;
    }

    public String getCityPopupImage() {
        return cityPopupImage;
    }

    public void setCityPopupImage(String cityPopupImage) {
        this.cityPopupImage = cityPopupImage;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public Object getUserDesignation() {
        return userDesignation;
    }

    public void setUserDesignation(Object userDesignation) {
        this.userDesignation = userDesignation;
    }

}


package archidemo.com.archidemo.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("designation")
    @Expose
    private Designation designation;
    @SerializedName("roles")
    @Expose
    private List<Role> roles = null;
    @SerializedName("industries")
    @Expose
    private List<Industry> industries = null;
    @SerializedName("work_functions")
    @Expose
    private List<WorkFunction> workFunctions = null;
    @SerializedName("skills")
    @Expose
    private List<Skill> skills = null;
    @SerializedName("highest_qualification")
    @Expose
    private HighestQualification highestQualification;
    @SerializedName("last_company")
    @Expose
    private LastCompany lastCompany;
    @SerializedName("experience")
    @Expose
    private String experience;
    @SerializedName("expected_ctc")
    @Expose
    private String expectedCtc;
    @SerializedName("hide_from_companies")
    @Expose
    private List<HideFromCompany> hideFromCompanies = null;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("radius")
    @Expose
    private Integer radius;
    @SerializedName("action_taken")
    @Expose
    private ActionTaken actionTaken;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Industry> getIndustries() {
        return industries;
    }

    public void setIndustries(List<Industry> industries) {
        this.industries = industries;
    }

    public List<WorkFunction> getWorkFunctions() {
        return workFunctions;
    }

    public void setWorkFunctions(List<WorkFunction> workFunctions) {
        this.workFunctions = workFunctions;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public HighestQualification getHighestQualification() {
        return highestQualification;
    }

    public void setHighestQualification(HighestQualification highestQualification) {
        this.highestQualification = highestQualification;
    }

    public LastCompany getLastCompany() {
        return lastCompany;
    }

    public void setLastCompany(LastCompany lastCompany) {
        this.lastCompany = lastCompany;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getExpectedCtc() {
        return expectedCtc;
    }

    public void setExpectedCtc(String expectedCtc) {
        this.expectedCtc = expectedCtc;
    }

    public List<HideFromCompany> getHideFromCompanies() {
        return hideFromCompanies;
    }

    public void setHideFromCompanies(List<HideFromCompany> hideFromCompanies) {
        this.hideFromCompanies = hideFromCompanies;
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

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public ActionTaken getActionTaken() {
        return actionTaken;
    }

    public void setActionTaken(ActionTaken actionTaken) {
        this.actionTaken = actionTaken;
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

}

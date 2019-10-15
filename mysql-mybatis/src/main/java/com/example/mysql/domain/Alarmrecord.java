package com.example.mysql.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

@ApiModel(value="com.example.mysql.domain.Alarmrecord")
public class Alarmrecord implements Serializable {
    @ApiModelProperty(value="null")
    private String id;

    @ApiModelProperty(value="null")
    private Integer height;

    @ApiModelProperty(value="null")
    private Integer width;

    @ApiModelProperty(value="null")
    private Integer fTime;

    @ApiModelProperty(value="null")
    private Double pitch;

    @ApiModelProperty(value="null")
    private Double roll;

    @ApiModelProperty(value="null")
    private Double yaw;

    @ApiModelProperty(value="null")
    private Integer bottom;

    @ApiModelProperty(value="null")
    private Integer left;

    @ApiModelProperty(value="null")
    private Integer right;

    @ApiModelProperty(value="null")
    private Integer top;

    @ApiModelProperty(value="null")
    private String feature;

    @ApiModelProperty(value="null")
    private Integer imgheight;

    @ApiModelProperty(value="null")
    private Integer imgwidth;

    @ApiModelProperty(value="null")
    private Integer imgmode;

    @ApiModelProperty(value="null")
    private String imgurl;

    @ApiModelProperty(value="null")
    private Double qualityscore;

    @ApiModelProperty(value="null")
    private String taskidx;

    @ApiModelProperty(value="null")
    private Integer time;

    @ApiModelProperty(value="null")
    private Integer type;

    @ApiModelProperty(value="null")
    private String userid;

    @ApiModelProperty(value="null")
    private Integer state;

    @ApiModelProperty(value="null")
    private Integer age;

    @ApiModelProperty(value="null")
    private Integer beard;

    @ApiModelProperty(value="null")
    private Integer emotion;

    @ApiModelProperty(value="null")
    private Integer eyeopen;

    @ApiModelProperty(value="null")
    private Integer gender;

    @ApiModelProperty(value="null")
    private Integer glass;

    @ApiModelProperty(value="null")
    private Integer mask;

    @ApiModelProperty(value="null")
    private Integer mouthopen;

    @ApiModelProperty(value="null")
    private Integer race;

    @ApiModelProperty(value="null")
    private String parentid;

    @ApiModelProperty(value="null")
    private String localpath;

    @ApiModelProperty(value="null")
    private String virtualpath;

    @ApiModelProperty(value="null")
    private Date qtime;

    @ApiModelProperty(value="null")
    private String similars;

    @ApiModelProperty(value="null")
    private String imgbigurl;

    @ApiModelProperty(value="null")
    private String vitualbigurl;

    @ApiModelProperty(value="null")
    private String pictureserverid;

    @ApiModelProperty(value="null")
    private String channelid;

    @ApiModelProperty(value="null")
    private Double score;

    @ApiModelProperty(value="null")
    private String taskname;

    @ApiModelProperty(value="null")
    private String username;

    @ApiModelProperty(value="null")
    private String identitycard;

    @ApiModelProperty(value="null")
    private String nation;

    @ApiModelProperty(value="null")
    private String nativeplace;

    @ApiModelProperty(value="null")
    private String taskid;

    @ApiModelProperty(value="null")
    private Long frameindex;

    @ApiModelProperty(value="null")
    private String orgid;

    @ApiModelProperty(value="null")
    private String orgidpath;

    @ApiModelProperty(value="null")
    private String orgname;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getfTime() {
        return fTime;
    }

    public void setfTime(Integer fTime) {
        this.fTime = fTime;
    }

    public Double getPitch() {
        return pitch;
    }

    public void setPitch(Double pitch) {
        this.pitch = pitch;
    }

    public Double getRoll() {
        return roll;
    }

    public void setRoll(Double roll) {
        this.roll = roll;
    }

    public Double getYaw() {
        return yaw;
    }

    public void setYaw(Double yaw) {
        this.yaw = yaw;
    }

    public Integer getBottom() {
        return bottom;
    }

    public void setBottom(Integer bottom) {
        this.bottom = bottom;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getRight() {
        return right;
    }

    public void setRight(Integer right) {
        this.right = right;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Integer getImgheight() {
        return imgheight;
    }

    public void setImgheight(Integer imgheight) {
        this.imgheight = imgheight;
    }

    public Integer getImgwidth() {
        return imgwidth;
    }

    public void setImgwidth(Integer imgwidth) {
        this.imgwidth = imgwidth;
    }

    public Integer getImgmode() {
        return imgmode;
    }

    public void setImgmode(Integer imgmode) {
        this.imgmode = imgmode;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public Double getQualityscore() {
        return qualityscore;
    }

    public void setQualityscore(Double qualityscore) {
        this.qualityscore = qualityscore;
    }

    public String getTaskidx() {
        return taskidx;
    }

    public void setTaskidx(String taskidx) {
        this.taskidx = taskidx;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getBeard() {
        return beard;
    }

    public void setBeard(Integer beard) {
        this.beard = beard;
    }

    public Integer getEmotion() {
        return emotion;
    }

    public void setEmotion(Integer emotion) {
        this.emotion = emotion;
    }

    public Integer getEyeopen() {
        return eyeopen;
    }

    public void setEyeopen(Integer eyeopen) {
        this.eyeopen = eyeopen;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getGlass() {
        return glass;
    }

    public void setGlass(Integer glass) {
        this.glass = glass;
    }

    public Integer getMask() {
        return mask;
    }

    public void setMask(Integer mask) {
        this.mask = mask;
    }

    public Integer getMouthopen() {
        return mouthopen;
    }

    public void setMouthopen(Integer mouthopen) {
        this.mouthopen = mouthopen;
    }

    public Integer getRace() {
        return race;
    }

    public void setRace(Integer race) {
        this.race = race;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getLocalpath() {
        return localpath;
    }

    public void setLocalpath(String localpath) {
        this.localpath = localpath;
    }

    public String getVirtualpath() {
        return virtualpath;
    }

    public void setVirtualpath(String virtualpath) {
        this.virtualpath = virtualpath;
    }

    public Date getQtime() {
        return qtime;
    }

    public void setQtime(Date qtime) {
        this.qtime = qtime;
    }

    public String getSimilars() {
        return similars;
    }

    public void setSimilars(String similars) {
        this.similars = similars;
    }

    public String getImgbigurl() {
        return imgbigurl;
    }

    public void setImgbigurl(String imgbigurl) {
        this.imgbigurl = imgbigurl;
    }

    public String getVitualbigurl() {
        return vitualbigurl;
    }

    public void setVitualbigurl(String vitualbigurl) {
        this.vitualbigurl = vitualbigurl;
    }

    public String getPictureserverid() {
        return pictureserverid;
    }

    public void setPictureserverid(String pictureserverid) {
        this.pictureserverid = pictureserverid;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public Long getFrameindex() {
        return frameindex;
    }

    public void setFrameindex(Long frameindex) {
        this.frameindex = frameindex;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getOrgidpath() {
        return orgidpath;
    }

    public void setOrgidpath(String orgidpath) {
        this.orgidpath = orgidpath;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }
}
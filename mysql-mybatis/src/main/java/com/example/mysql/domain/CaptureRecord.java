package com.example.mysql.domain;

import java.util.Date;

public class CaptureRecord {
    private String id;
    private String taskIdx = "";
    private String taskId = "";
    private String taskName = "";
    private String channelName = "";
    private String channelId = "";
    private double qualityScore;
    private String imgUrl = "";
    private String virtualPath = "";
    private String imgBigurl = "";
    private String vitualBigurl = "";
    private String pictureServerId = "";
    private String parentId = "";
    private int totalCount = 0;
    private Date qtime;
    private int type = 0;
    private String orgId = "";
    private String orgIdPath = "";
    private String orgName = "";
    private String targetName = "";
    private String targetIdCard = "";
    private String targetNative = "";
    private Integer age;
    private String name;
    private String idCard;
    private Long time;
    private Long imgMode;
    private String extendType;
    private String native1;
    private Integer gender;
    private Integer glass;
    private Integer race;
    private String lng;
    private String lat;

    public Long getImgMode() {
        return imgMode;
    }

    public void setImgMode(Long imgMode) {
        this.imgMode = imgMode;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public Integer getRace() {
        return race;
    }

    public void setRace(Integer race) {
        this.race = race;
    }

    public String getNative1() {
        return native1;
    }

    public void setNative1(String native1) {
        this.native1 = native1;
    }

    public Integer getGlass() {
        return glass;
    }

    public void setGlass(Integer glass) {
        this.glass = glass;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getExtendType() {
        return extendType;
    }

    public void setExtendType(String extendType) {
        this.extendType = extendType;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskIdx() {
        return taskIdx;
    }

    public void setTaskIdx(String taskIdx) {
        this.taskIdx = taskIdx;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public double getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(double qualityScore) {
        this.qualityScore = qualityScore;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getVirtualPath() {
        return virtualPath;
    }

    public void setVirtualPath(String virtualPath) {
        this.virtualPath = virtualPath;
    }

    public String getImgBigurl() {
        return imgBigurl;
    }

    public void setImgBigurl(String imgBigurl) {
        this.imgBigurl = imgBigurl;
    }

    public String getVitualBigurl() {
        return vitualBigurl;
    }

    public void setVitualBigurl(String vitualBigurl) {
        this.vitualBigurl = vitualBigurl;
    }

    public String getPictureServerId() {
        return pictureServerId;
    }

    public void setPictureServerId(String pictureServerId) {
        this.pictureServerId = pictureServerId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public Date getQtime() {
        return qtime;
    }

    public void setQtime(Date qtime) {
        this.qtime = qtime;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getOrgIdPath() {
        return orgIdPath;
    }

    public void setOrgIdPath(String orgIdPath) {
        this.orgIdPath = orgIdPath;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getTargetIdCard() {
        return targetIdCard;
    }

    public void setTargetIdCard(String targetIdCard) {
        this.targetIdCard = targetIdCard;
    }

    public String getTargetNative() {
        return targetNative;
    }

    public void setTargetNative(String targetNative) {
        this.targetNative = targetNative;
    }
}

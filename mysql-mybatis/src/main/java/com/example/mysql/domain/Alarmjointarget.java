package com.example.mysql.domain;

import java.io.Serializable;
import java.util.Date;

public class Alarmjointarget implements Serializable {
    private String id;

    private String dbid;

    private String dbname;

    private String userIdx;

    private String imageid;

    private Double score;

    private String alarmid;

    private Long alarmtime;

    private String taskids;

    private String taskname;

    private String users;

    private String username;

    private String identitycard;

    private String channelid;

    private String channelname;

    private String imgurl;

    private String localimgurl;

    private String localrecurl;

    private Double qualityscore;

    private Date createdate;

    private Integer state;

    private Integer tAge;

    private Integer tGender;

    private String tName;

    private String tImgurl;

    private String taskid;

    private String orgid;

    private String orgidpath;

    private String orgname;

    private String targeturl;

    private Integer isdispose;

    private String description;

    /**
     * 报警状态：0 未处理 ；1 真实报警；2误报 ；
     */
    private Integer alarmstate;

    /**
     * 报警类型
     */
    private Integer alarmtype;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDbid() {
        return dbid;
    }

    public void setDbid(String dbid) {
        this.dbid = dbid;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(String userIdx) {
        this.userIdx = userIdx;
    }

    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getAlarmid() {
        return alarmid;
    }

    public void setAlarmid(String alarmid) {
        this.alarmid = alarmid;
    }

    public Long getAlarmtime() {
        return alarmtime;
    }

    public void setAlarmtime(Long alarmtime) {
        this.alarmtime = alarmtime;
    }

    public String getTaskids() {
        return taskids;
    }

    public void setTaskids(String taskids) {
        this.taskids = taskids;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
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

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    public String getChannelname() {
        return channelname;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getLocalimgurl() {
        return localimgurl;
    }

    public void setLocalimgurl(String localimgurl) {
        this.localimgurl = localimgurl;
    }

    public String getLocalrecurl() {
        return localrecurl;
    }

    public void setLocalrecurl(String localrecurl) {
        this.localrecurl = localrecurl;
    }

    public Double getQualityscore() {
        return qualityscore;
    }

    public void setQualityscore(Double qualityscore) {
        this.qualityscore = qualityscore;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    public Integer gettGender() {
        return tGender;
    }

    public void settGender(Integer tGender) {
        this.tGender = tGender;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettImgurl() {
        return tImgurl;
    }

    public void settImgurl(String tImgurl) {
        this.tImgurl = tImgurl;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
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

    public String getTargeturl() {
        return targeturl;
    }

    public void setTargeturl(String targeturl) {
        this.targeturl = targeturl;
    }

    public Integer getIsdispose() {
        return isdispose;
    }

    public void setIsdispose(Integer isdispose) {
        this.isdispose = isdispose;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAlarmstate() {
        return alarmstate;
    }

    public void setAlarmstate(Integer alarmstate) {
        this.alarmstate = alarmstate;
    }

    public Integer getAlarmtype() {
        return alarmtype;
    }

    public void setAlarmtype(Integer alarmtype) {
        this.alarmtype = alarmtype;
    }
}
package com.zb.studio.model;

import com.ZLHW.base.HTable.HIntTable;
import com.ZLHW.base.table.TableDeclare;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-5-27
 * Time: 下午9:27
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="T_NEWS")
@TableDeclare(comment = "新闻内容", tableName = "news")
public class News extends HIntTable {
    private Integer type_id;
    private String type_roue_id;
    private Integer user_id;
    private String tag;
    private Integer bedeck;
    private String title;
    private String title_md5;
    private String linkurl;
    private String summary;
    private String structon_tb;
    private String thumbnail;
    @Temporal(TemporalType.TIMESTAMP)
    private Date submit_date;
    private Integer topflag;
    private Integer recommendflag;
    private Integer stars;
    private Integer clicktimes;
    private Integer pass;

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public String getType_roue_id() {
        return type_roue_id;
    }

    public void setType_roue_id(String type_roue_id) {
        this.type_roue_id = type_roue_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getBedeck() {
        return bedeck;
    }

    public void setBedeck(Integer bedeck) {
        this.bedeck = bedeck;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_md5() {
        return title_md5;
    }

    public void setTitle_md5(String title_md5) {
        this.title_md5 = title_md5;
    }

    public String getLinkurl() {
        return linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getStructon_tb() {
        return structon_tb;
    }

    public void setStructon_tb(String structon_tb) {
        this.structon_tb = structon_tb;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Date getSubmit_date() {
        return submit_date;
    }

    public void setSubmit_date(Date submit_date) {
        this.submit_date = submit_date;
    }

    public Integer getTopflag() {
        return topflag;
    }

    public void setTopflag(Integer topflag) {
        this.topflag = topflag;
    }

    public Integer getRecommendflag() {
        return recommendflag;
    }

    public void setRecommendflag(Integer recommendflag) {
        this.recommendflag = recommendflag;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Integer getClicktimes() {
        return clicktimes;
    }

    public void setClicktimes(Integer clicktimes) {
        this.clicktimes = clicktimes;
    }

    public Integer getPass() {
        return pass;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }
}

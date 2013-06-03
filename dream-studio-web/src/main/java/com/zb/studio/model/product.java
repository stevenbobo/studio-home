package com.zb.studio.model;

import com.ZLHW.base.HTable.HIntTable;
import com.ZLHW.base.table.TableDeclare;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-5-27
 * Time: 下午9:29
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="T_Product")
@TableDeclare(comment = "图片内容", tableName = "Product")
public class Product extends HIntTable {
    private Integer type_id;
    private Integer type_roue_id;
    private Integer user_id;
    private String tag;
    private String bedeck;
    private String title;
    private String title_md5;
    private String linkurl;
    private String summary;
    private String structon_tb;
    private String thumbnail;
    private String submit_date;
    private String topflag;
    private String recommendflag;
    private String stars;
    private Integer clicktimes;
    private Integer pass;

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Integer getType_roue_id() {
        return type_roue_id;
    }

    public void setType_roue_id(Integer type_roue_id) {
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

    public String getBedeck() {
        return bedeck;
    }

    public void setBedeck(String bedeck) {
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

    public String getSubmit_date() {
        return submit_date;
    }

    public void setSubmit_date(String submit_date) {
        this.submit_date = submit_date;
    }

    public String getTopflag() {
        return topflag;
    }

    public void setTopflag(String topflag) {
        this.topflag = topflag;
    }

    public String getRecommendflag() {
        return recommendflag;
    }

    public void setRecommendflag(String recommendflag) {
        this.recommendflag = recommendflag;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
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

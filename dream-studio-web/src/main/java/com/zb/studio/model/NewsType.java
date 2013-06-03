package com.zb.studio.model;

import com.ZLHW.base.HTable.HIntTable;
import com.ZLHW.base.table.TableDeclare;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-5-27
 * Time: 下午9:28
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="T_NEWSTYPE")
@TableDeclare(comment = "新闻分类", tableName = "NewsType")
public class NewsType extends HIntTable {
    private String type_id;
    private Integer type_parentid;
    private String type_roue_id;
    private String type_title;
    private String type_link;// 跳转链接
    private Integer type_sort;
    private Integer type_pass;
    private Integer type_read_grade;
    private Integer type_write_grade;

    public String getType_id() {
        return type_id;
    }

    public void setType_id(String type_id) {
        this.type_id = type_id;
    }

    public Integer getType_parentid() {
        return type_parentid;
    }

    public void setType_parentid(Integer type_parentid) {
        this.type_parentid = type_parentid;
    }

    public String getType_roue_id() {
        return type_roue_id;
    }

    public void setType_roue_id(String type_roue_id) {
        this.type_roue_id = type_roue_id;
    }

    public String getType_title() {
        return type_title;
    }

    public void setType_title(String type_title) {
        this.type_title = type_title;
    }

    public String getType_link() {
        return type_link;
    }

    public void setType_link(String type_link) {
        this.type_link = type_link;
    }

    public Integer getType_sort() {
        return type_sort;
    }

    public void setType_sort(Integer type_sort) {
        this.type_sort = type_sort;
    }

    public Integer getType_pass() {
        return type_pass;
    }

    public void setType_pass(Integer type_pass) {
        this.type_pass = type_pass;
    }

    public Integer getType_read_grade() {
        return type_read_grade;
    }

    public void setType_read_grade(Integer type_read_grade) {
        this.type_read_grade = type_read_grade;
    }

    public Integer getType_write_grade() {
        return type_write_grade;
    }

    public void setType_write_grade(Integer type_write_grade) {
        this.type_write_grade = type_write_grade;
    }
}

package com.zb.studio.model;

import com.ZLHW.base.HTable.HIntTable;
import com.ZLHW.base.table.TableDeclare;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-5-26
 * Time: 下午10:21
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="T_STUDIO")
@TableDeclare(comment = "画室表", tableName = "studio")
public class DrawStudio extends HIntTable {

    private String name;

    private String address;

    private String simpleinfo;

    private Integer score;

    private String scope;

    private String qq;
    private String phone;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSimpleinfo() {
        return simpleinfo;
    }

    public void setSimpleinfo(String simpleinfo) {
        this.simpleinfo = simpleinfo;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

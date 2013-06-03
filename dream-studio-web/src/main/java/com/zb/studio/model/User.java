package com.zb.studio.model;

import com.ZLHW.base.HTable.HIntTable;
import com.ZLHW.base.table.TableDeclare;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-5-26
 * Time: 下午10:35
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="T_User")
@TableDeclare(comment = "用户信息", tableName = "User")
public class User extends HIntTable {
    @Column(length=40)
    private String account; //账号
    @Column(length=50)
    private String name; //姓名
    @Column(length=40)
    private String password; //密码
    private Integer nextClientNum=1;//下一个客户号

    private String userGroups; //用户组
    private Byte state;//1:正常上班2:离职
    @Temporal(TemporalType.TIMESTAMP)
    private Date addDate; //添加日期
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastlogin; //上次登录时间
    @Column(length=60)
    private String email; //电子邮件
    @Column(length=60)
    private String phoneNum;//电话号码

    private String	user_id;// 用户id
    private String nick_name;// 昵称
    private String user_type;// 用户类型(0=普通会员，1=商家)
    private String user_group;// 用户所属权限组
    private String user_grade;//等级，星级
    private String province;// 省
    private String city;//市
    private String area;//区
    private String se;//性别
    private String birthday;// 年龄，根据生日来推算
    private String signature;//个性签名
    private String thumbnail;// 会员头像
    private String integrity_grade;// 诚信等级(5个0，第1位=身份认证，第2位=手机认证，第3位=视频认证，值0=未认证，1=已认证)
    private String education_type;//学历类型
    private String marriage_type;//婚姻类型
    private String total_credit;//累计信用
    private String good_evaluate;//好评率
    private String url_short;// 推广链接
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastlog;// 最后登录时间
    @Temporal(TemporalType.TIMESTAMP)
    private Date submit_date;//注册时间
    private String recommendflag;//有头像排前
    private String clicktimes;//人气
    private String pass;// 审核状态
    private String is_check;// 需要审核
    private String	friend_num;// 好友数量
    private String friend_fans;// 粉丝数量

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getNextClientNum() {
        return nextClientNum;
    }

    public void setNextClientNum(Integer nextClientNum) {
        this.nextClientNum = nextClientNum;
    }

    public String getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(String userGroups) {
        this.userGroups = userGroups;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}

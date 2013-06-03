package com.zb.studio.model;

import com.ZLHW.base.HTable.HIntTable;
import com.ZLHW.base.table.TableDeclare;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-5-26
 * Time: 下午10:26
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="T_PIC")
@TableDeclare(comment = "图片内容", tableName = "pic")
public class Pic extends HIntTable {
}

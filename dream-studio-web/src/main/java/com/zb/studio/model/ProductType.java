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
@Table(name="T_ProductType")
@TableDeclare(comment = "图片分类", tableName = "ProductType")
public class ProductType extends HIntTable {
    private Integer type_parentid;
    private String type_roue_id;
    private String type_titl;
    private String type_link;//跳转链接
    private String type_sort;
    private String type_pass;
    private String type_read_grade;
    private String type_write_grade;
}

package com.company.project.model;

import javax.persistence.*;

public class Goods {
    /**
     * ID
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 编号
     */
    @Column(name = "GOODS_CODE")
    private String goodsCode;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 类型
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 库存
     */
    @Column(name = "NUM")
    private Integer num;

    /**
     * 主图
     */
    @Column(name = "PICTURE")
    private String picture;

    /**
     * 介绍
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 上下架
     */
    @Column(name = "STATE")
    private Integer state;

    /**
     * 品牌
     */
    @Column(name = "BRAND")
    private String brand;

    /**
     * deleted
     */
    @Column(name = "DELETED")
    private Integer deleted;

    /**
     * 基本参数
     */
    @Column(name = "PARAM")
    private String param;

    /**
     * 单位
     */
    @Column(name = "UNIT")
    private String unit;

    /**
     * 获取ID
     *
     * @return ID_ - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取编号
     *
     * @return GOODS_CODE - 编号
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * 设置编号
     *
     * @param goodsCode 编号
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    /**
     * 获取名称
     *
     * @return NAME - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取类型
     *
     * @return TYPE - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取库存
     *
     * @return NUM - 库存
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置库存
     *
     * @param num 库存
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取主图
     *
     * @return PICTURE - 主图
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置主图
     *
     * @param picture 主图
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * 获取介绍
     *
     * @return REMARK - 介绍
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置介绍
     *
     * @param remark 介绍
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取上下架
     *
     * @return STATE - 上下架
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置上下架
     *
     * @param state 上下架
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取品牌
     *
     * @return BRAND - 品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置品牌
     *
     * @param brand 品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取deleted
     *
     * @return DELETED - deleted
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置deleted
     *
     * @param deleted deleted
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取基本参数
     *
     * @return PARAM - 基本参数
     */
    public String getParam() {
        return param;
    }

    /**
     * 设置基本参数
     *
     * @param param 基本参数
     */
    public void setParam(String param) {
        this.param = param;
    }

    /**
     * 获取单位
     *
     * @return UNIT - 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置单位
     *
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
}
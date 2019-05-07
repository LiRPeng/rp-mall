package com.company.project.model;

import javax.persistence.*;

@Table(name = "goods_sku")
public class GoodsSku {
    /**
     * id
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 编号
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 商品ID
     */
    @Column(name = "GOODS_ID")
    private String goodsId;

    /**
     * 商品属性
     */
    @Column(name = "GOODS_ATTR")
    private String goodsAttr;

    /**
     * 零售价格
     */
    @Column(name = "PRICE")
    private Long price;

    /**
     * 采购价格
     */
    @Column(name = "PU_PRICE")
    private Long puPrice;

    /**
     * 积分价格
     */
    @Column(name = "INTEGRAL")
    private Long integral;

    /**
     * 库存
     */
    @Column(name = "STOCK")
    private Integer stock;

    /**
     * 代理返佣
     */
    @Column(name = "BROK")
    private Long brok;

    /**
     * 销量
     */
    @Column(name = "AMOUNT")
    private Integer amount;

    /**
     * 图片
     */
    @Column(name = "GOOD_IMG")
    private String goodImg;

    /**
     * 获取id
     *
     * @return ID_ - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取编号
     *
     * @return CODE - 编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编号
     *
     * @param code 编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取商品ID
     *
     * @return GOODS_ID - 商品ID
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品ID
     *
     * @param goodsId 商品ID
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取商品属性
     *
     * @return GOODS_ATTR - 商品属性
     */
    public String getGoodsAttr() {
        return goodsAttr;
    }

    /**
     * 设置商品属性
     *
     * @param goodsAttr 商品属性
     */
    public void setGoodsAttr(String goodsAttr) {
        this.goodsAttr = goodsAttr;
    }

    /**
     * 获取零售价格
     *
     * @return PRICE - 零售价格
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置零售价格
     *
     * @param price 零售价格
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取采购价格
     *
     * @return PU_PRICE - 采购价格
     */
    public Long getPuPrice() {
        return puPrice;
    }

    /**
     * 设置采购价格
     *
     * @param puPrice 采购价格
     */
    public void setPuPrice(Long puPrice) {
        this.puPrice = puPrice;
    }

    /**
     * 获取积分价格
     *
     * @return INTEGRAL - 积分价格
     */
    public Long getIntegral() {
        return integral;
    }

    /**
     * 设置积分价格
     *
     * @param integral 积分价格
     */
    public void setIntegral(Long integral) {
        this.integral = integral;
    }

    /**
     * 获取库存
     *
     * @return STOCK - 库存
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * 设置库存
     *
     * @param stock 库存
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * 获取代理返佣
     *
     * @return BROK - 代理返佣
     */
    public Long getBrok() {
        return brok;
    }

    /**
     * 设置代理返佣
     *
     * @param brok 代理返佣
     */
    public void setBrok(Long brok) {
        this.brok = brok;
    }

    /**
     * 获取销量
     *
     * @return AMOUNT - 销量
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * 设置销量
     *
     * @param amount 销量
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * 获取图片
     *
     * @return GOOD_IMG - 图片
     */
    public String getGoodImg() {
        return goodImg;
    }

    /**
     * 设置图片
     *
     * @param goodImg 图片
     */
    public void setGoodImg(String goodImg) {
        this.goodImg = goodImg;
    }
}
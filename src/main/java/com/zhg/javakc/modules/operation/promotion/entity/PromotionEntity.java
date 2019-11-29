package com.zhg.javakc.modules.operation.promotion.entity;

import com.zhg.javakc.base.entity.BaseEntity;

public class PromotionEntity extends BaseEntity<PromotionEntity> {
    private String goodsId;
    private String goodsName;
    private int unit;
    private int referencePrice;
    private int downPrice;
    private int salesPrice;
    private double discount;
    private int fixedPrice;
    private int fullNumber;
    private int sendNumber;
    private String sendGoods;
    private int fullMoney;
    private int sendMoney;
    private int promotionOffer;
    private String eventNo;
    private int eventType;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(int referencePrice) {
        this.referencePrice = referencePrice;
    }

    public int getDownPrice() {
        return downPrice;
    }

    public void setDownPrice(int downPrice) {
        this.downPrice = downPrice;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(int fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public int getFullNumber() {
        return fullNumber;
    }

    public void setFullNumber(int fullNumber) {
        this.fullNumber = fullNumber;
    }

    public int getSendNumber() {
        return sendNumber;
    }

    public void setSendNumber(int sendNumber) {
        this.sendNumber = sendNumber;
    }

    public String getSendGoods() {
        return sendGoods;
    }

    public void setSendGoods(String sendGoods) {
        this.sendGoods = sendGoods;
    }

    public int getFullMoney() {
        return fullMoney;
    }

    public void setFullMoney(int fullMoney) {
        this.fullMoney = fullMoney;
    }

    public int getSendMoney() {
        return sendMoney;
    }

    public void setSendMoney(int sendMoney) {
        this.sendMoney = sendMoney;
    }

    public int getPromotionOffer() {
        return promotionOffer;
    }

    public void setPromotionOffer(int promotionOffer) {
        this.promotionOffer = promotionOffer;
    }

    public String getEventNo() {
        return eventNo;
    }

    public void setEventNo(String eventNo) {
        this.eventNo = eventNo;
    }

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }
}

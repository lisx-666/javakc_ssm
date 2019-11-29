package com.zhg.javakc.modules.commodity.goods.entity;

import com.zhg.javakc.base.entity.BaseEntity;

public class GoodsEntity extends BaseEntity<GoodsEntity> {

    //'商品id'
    private String gId;
    //'商品名称'
    private String gName;
    //'商品分类'
    private String categoryId;
    //'商品编号'
    private String gNumber;
    //'商品参考价'
    private int gCprice;
    //'商品销售价'
    private int gXprice;
    //'商品成本价'
    private int gChprice;
    //'商品简介'
    private String gComment;
    //'商品库存'
    private int gCount;
    //'商品退换货'
    private int gReturn;
    //'搜索关键词'
    private String gKeys;
    //'商品供应商'
    private String supplierId;
    //'储存条件'
    private String gSave;
    //'商品品牌'
    private String gBrand;
    //'商品产地'
    private String gOrigin;
    //'商品水体'
    private int gWater;
    //'商品净含量'
    private String gWeight;
    ///'保质期'
    private String gLife;
    //'包装'
    private int gPackage;
    //'单位'
    private int gUnit;
    //'商品图片'
    private byte[] gImage;
    //'商品详情'
    private byte[] gDetails;
    //'商品标签'
    private String tagId;
    //'商品状态'
    private String gStatus;

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getgNumber() {
        return gNumber;
    }

    public void setgNumber(String gNumber) {
        this.gNumber = gNumber;
    }

    public int getgCprice() {
        return gCprice;
    }

    public void setgCprice(int gCprice) {
        this.gCprice = gCprice;
    }

    public int getgXprice() {
        return gXprice;
    }

    public void setgXprice(int gXprice) {
        this.gXprice = gXprice;
    }

    public int getgChprice() {
        return gChprice;
    }

    public void setgChprice(int gChprice) {
        this.gChprice = gChprice;
    }

    public String getgComment() {
        return gComment;
    }

    public void setgComment(String gComment) {
        this.gComment = gComment;
    }

    public int getgCount() {
        return gCount;
    }

    public void setgCount(int gCount) {
        this.gCount = gCount;
    }

    public int getgReturn() {
        return gReturn;
    }

    public void setgReturn(int gReturn) {
        this.gReturn = gReturn;
    }

    public String getgKeys() {
        return gKeys;
    }

    public void setgKeys(String gKeys) {
        this.gKeys = gKeys;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getgSave() {
        return gSave;
    }

    public void setgSave(String gSave) {
        this.gSave = gSave;
    }

    public String getgBrand() {
        return gBrand;
    }

    public void setgBrand(String gBrand) {
        this.gBrand = gBrand;
    }

    public String getgOrigin() {
        return gOrigin;
    }

    public void setgOrigin(String gOrigin) {
        this.gOrigin = gOrigin;
    }

    public int getgWater() {
        return gWater;
    }

    public void setgWater(int gWater) {
        this.gWater = gWater;
    }

    public String getgWeight() {
        return gWeight;
    }

    public void setgWeight(String gWeight) {
        this.gWeight = gWeight;
    }

    public String getgLife() {
        return gLife;
    }

    public void setgLife(String gLife) {
        this.gLife = gLife;
    }

    public int getgPackage() {
        return gPackage;
    }

    public void setgPackage(int gPackage) {
        this.gPackage = gPackage;
    }

    public int getgUnit() {
        return gUnit;
    }

    public void setgUnit(int gUnit) {
        this.gUnit = gUnit;
    }

    public byte[] getgImage() {
        return gImage;
    }

    public void setgImage(byte[] gImage) {
        this.gImage = gImage;
    }

    public byte[] getgDetails() {
        return gDetails;
    }

    public void setgDetails(byte[] gDetails) {
        this.gDetails = gDetails;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getgStatus() {
        return gStatus;
    }

    public void setgStatus(String gStatus) {
        this.gStatus = gStatus;
    }
}

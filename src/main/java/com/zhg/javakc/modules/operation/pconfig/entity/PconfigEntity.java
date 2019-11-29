package com.zhg.javakc.modules.operation.pconfig.entity;

import com.zhg.javakc.base.entity.BaseEntity;

import java.util.Date;

public class PconfigEntity extends BaseEntity<PconfigEntity> {

    private String eventNo;
    private int promotionState;
    private int auditState;
    private String eventName;
    private int promotionOffer;
    private Date promotionSdate;
    private Date promotionEdate;
    private int promotionSort;
    private String eventDescribe;
//    private Blob eventImage;
//    private Blob eventDetails;
    private String creater;
    private Date createTime;
    private String nuditor;
    private Date nuditTime;
    private int eventType;

    public String getEventNo() {
        return eventNo;
    }

    public void setEventNo(String eventNo) {
        this.eventNo = eventNo;
    }

    public int getPromotionState() {
        return promotionState;
    }

    public void setPromotionState(int promotionState) {
        this.promotionState = promotionState;
    }

    public int getAuditState() {
        return auditState;
    }

    public void setAuditState(int auditState) {
        this.auditState = auditState;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getPromotionOffer() {
        return promotionOffer;
    }

    public void setPromotionOffer(int promotionOffer) {
        this.promotionOffer = promotionOffer;
    }

    public Date getPromotionSdate() {
        return promotionSdate;
    }

    public void setPromotionSdate(Date promotionSdate) {
        this.promotionSdate = promotionSdate;
    }

    public Date getPromotionEdate() {
        return promotionEdate;
    }

    public void setPromotionEdate(Date promotionEdate) {
        this.promotionEdate = promotionEdate;
    }

    public int getPromotionSort() {
        return promotionSort;
    }

    public void setPromotionSort(int promotionSort) {
        this.promotionSort = promotionSort;
    }

    public String getEventDescribe() {
        return eventDescribe;
    }

    public void setEventDescribe(String eventDescribe) {
        this.eventDescribe = eventDescribe;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNuditor() {
        return nuditor;
    }

    public void setNuditor(String nuditor) {
        this.nuditor = nuditor;
    }

    public Date getNuditTime() {
        return nuditTime;
    }

    public void setNuditTime(Date nuditTime) {
        this.nuditTime = nuditTime;
    }

    public int getEventType() {
        return eventType;
    }

    public void setEventType(int eventType) {
        this.eventType = eventType;
    }
}

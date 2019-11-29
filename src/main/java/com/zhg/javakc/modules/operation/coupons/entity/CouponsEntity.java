package com.zhg.javakc.modules.operation.coupons.entity;

import com.zhg.javakc.base.entity.BaseEntity;

import java.util.Date;

public class CouponsEntity extends BaseEntity<CouponsEntity> {
    /*
    优惠券id
     */
    private String couponsId;
    /*
    优惠券名称
     */
    private String couponsName;
    /*
    优惠券类型
     */
    private int couponsType;
    /*
    面值
     */
    private int couponsValue;
    /*
    发放总量
     */
    private int totalIssues;
    /*
    使用条件
     */
    private String useRule;
    /*
    是否支持促销活动
     */
    private int couponsSupport;
    /*
    有效期（开始）
     */
    private Date couponsSdate;
    /*
    有效期（结束）
     */
    private Date couponsEdate;
    /*
    有效天数
     */
    private int effectDay;
    /*
    使用范围
     */
    private int useRange;

    public String getCouponsId() {
        return couponsId;
    }

    public void setCouponsId(String couponsId) {
        this.couponsId = couponsId;
    }

    public String getCouponsName() {
        return couponsName;
    }

    public void setCouponsName(String couponsName) {
        this.couponsName = couponsName;
    }

    public int getCouponsType() {
        return couponsType;
    }

    public void setCouponsType(int couponsType) {
        this.couponsType = couponsType;
    }

    public int getCouponsValue() {
        return couponsValue;
    }

    public void setCouponsValue(int couponsValue) {
        this.couponsValue = couponsValue;
    }

    public int getTotalIssues() {
        return totalIssues;
    }

    public void setTotalIssues(int totalIssues) {
        this.totalIssues = totalIssues;
    }

    public String getUseRule() {
        return useRule;
    }

    public void setUseRule(String useRule) {
        this.useRule = useRule;
    }

    public int getCouponsSupport() {
        return couponsSupport;
    }

    public void setCouponsSupport(int couponsSupport) {
        this.couponsSupport = couponsSupport;
    }

    public Date getCouponsSdate() {
        return couponsSdate;
    }

    public void setCouponsSdate(Date couponsSdate) {
        this.couponsSdate = couponsSdate;
    }

    public Date getCouponsEdate() {
        return couponsEdate;
    }

    public void setCouponsEdate(Date couponsEdate) {
        this.couponsEdate = couponsEdate;
    }

    public int getEffectDay() {
        return effectDay;
    }

    public void setEffectDay(int effectDay) {
        this.effectDay = effectDay;
    }

    public int getUseRange() {
        return useRange;
    }

    public void setUseRange(int useRange) {
        this.useRange = useRange;
    }
}

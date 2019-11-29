package com.zhg.javakc.modules.warehouse.instorage.entity;

import com.zhg.javakc.base.entity.BaseEntity;

import java.util.Date;

public class InstorageEntity extends BaseEntity<InstorageEntity> {

    private String inhouseId;//入库id
    private String inhouseType;//入库类型
    private int inhouseStatus;//入库状态
    private String inhouseComment;//入库备注
    private String inhouseHandle;//经办人
    private String creater;//创建人
    private Date createTime;//创建时间
    private String auditor;//审核人
    private Date auditTime;//审核时间
    private String purchaseId;//外键采购单id

    public String getInhouseId() {
        return inhouseId;
    }

    public void setInhouseId(String inhouseId) {
        this.inhouseId = inhouseId;
    }

    public String getInhouseType() {
        return inhouseType;
    }

    public void setInhouseType(String inhouseType) {
        this.inhouseType = inhouseType;
    }

    public int getInhouseStatus() {
        return inhouseStatus;
    }

    public void setInhouseStatus(int inhouseStatus) {
        this.inhouseStatus = inhouseStatus;
    }

    public String getInhouseComment() {
        return inhouseComment;
    }

    public void setInhouseComment(String inhouseComment) {
        this.inhouseComment = inhouseComment;
    }

    public String getInhouseHandle() {
        return inhouseHandle;
    }

    public void setInhouseHandle(String inhouseHandle) {
        this.inhouseHandle = inhouseHandle;
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

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }
}

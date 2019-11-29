package com.zhg.javakc.modules.commodity.tag.entity;

import com.zhg.javakc.base.entity.BaseEntity;

public class TagEntity extends BaseEntity<TagEntity> {


    //标签id
    private String tagId;
    //标签名称
    private String tagName;
    //标签描述
    private String tagDescribe;

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagDescribe() {
        return tagDescribe;
    }

    public void setTagDescribe(String tagDescribe) {
        this.tagDescribe = tagDescribe;
    }
}

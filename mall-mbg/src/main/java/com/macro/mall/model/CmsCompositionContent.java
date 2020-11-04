package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

import com.google.protobuf.Timestamp;

import cn.hutool.core.date.DateTime;

public class CmsCompositionContent implements Serializable {
    
    private long id;

    public CmsCompositionContent() {
    }

    public CmsCompositionContent(long id, String title, Integer composition_type, String author, String reviewer, String level, Integer status, Boolean is_free, String describe, DateTime create_time, DateTime update_time, Integer read_count) {
        this.id = id;
        this.title = title;
        this.composition_type = composition_type;
        this.author = author;
        this.reviewer = reviewer;
        this.level = level;
        this.status = status;
        this.is_free = is_free;
        this.describe = describe;
        this.create_time = create_time;
        this.update_time = update_time;
        this.read_count = read_count;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getComposition_type() {
        return this.composition_type;
    }

    public void setComposition_type(Integer composition_type) {
        this.composition_type = composition_type;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReviewer() {
        return this.reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean isIs_free() {
        return this.is_free;
    }

    public Boolean getIs_free() {
        return this.is_free;
    }

    public void setIs_free(Boolean is_free) {
        this.is_free = is_free;
    }

    public String getDescribe() {
        return this.describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public DateTime getCreate_time() {
        return this.create_time;
    }

    public void setCreate_time(DateTime create_time) {
        this.create_time = create_time;
    }

    public DateTime getUpdate_time() {
        return this.update_time;
    }

    public void setUpdate_time(DateTime update_time) {
        this.update_time = update_time;
    }

    public Integer getRead_count() {
        return this.read_count;
    }

    public void setRead_count(Integer read_count) {
        this.read_count = read_count;
    }

    public CmsCompositionContent id(long id) {
        this.id = id;
        return this;
    }

    public CmsCompositionContent title(String title) {
        this.title = title;
        return this;
    }

    public CmsCompositionContent composition_type(Integer composition_type) {
        this.composition_type = composition_type;
        return this;
    }

    public CmsCompositionContent author(String author) {
        this.author = author;
        return this;
    }

    public CmsCompositionContent reviewer(String reviewer) {
        this.reviewer = reviewer;
        return this;
    }

    public CmsCompositionContent level(String level) {
        this.level = level;
        return this;
    }

    public CmsCompositionContent status(Integer status) {
        this.status = status;
        return this;
    }

    public CmsCompositionContent is_free(Boolean is_free) {
        this.is_free = is_free;
        return this;
    }

    public CmsCompositionContent describe(String describe) {
        this.describe = describe;
        return this;
    }

    public CmsCompositionContent create_time(DateTime create_time) {
        this.create_time = create_time;
        return this;
    }

    public CmsCompositionContent update_time(DateTime update_time) {
        this.update_time = update_time;
        return this;
    }

    public CmsCompositionContent read_count(Integer read_count) {
        this.read_count = read_count;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", composition_type='" + getComposition_type() + "'" +
            ", author='" + getAuthor() + "'" +
            ", reviewer='" + getReviewer() + "'" +
            ", level='" + getLevel() + "'" +
            ", status='" + getStatus() + "'" +
            ", is_free='" + isIs_free() + "'" +
            ", describe='" + getDescribe() + "'" +
            ", create_time='" + getCreate_time() + "'" +
            ", update_time='" + getUpdate_time() + "'" +
            ", read_count='" + getRead_count() + "'" +
            "}";
    }
    private String title;
    private Integer composition_type;
    private String author;
    private String reviewer;
    private String level;
    private Integer status;
    private Boolean is_free;
    private String describe;
    private DateTime create_time;
    private DateTime update_time;
    private Integer read_count;
}
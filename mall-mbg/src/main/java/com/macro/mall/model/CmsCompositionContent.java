package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class CmsCompositionContent implements Serializable {
    private Long id;

    private Long compositionId;

    @ApiModelProperty(value = "内容类型：0，作文原文，1，点评，2，感想")
    private Integer contentType;

    private String content;

    @ApiModelProperty(value = "音频地址")
    private String audioPath;

    @ApiModelProperty(value = "音频时常")
    private Integer audioDuration;

    private Timestamp createTime;

    private Integer readCount;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompositionId() {
        return compositionId;
    }

    public void setCompositionId(Long compositionId) {
        this.compositionId = compositionId;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAudioPath() {
        return audioPath;
    }

    public void setAudioPath(String audioPath) {
        this.audioPath = audioPath;
    }

    public Integer getAudioDuration() {
        return audioDuration;
    }

    public void setAudioDuration(Integer audioDuration) {
        this.audioDuration = audioDuration;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp reateTime) {
        this.createTime = createTime;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", compositionId=").append(compositionId);
        sb.append(", contentType=").append(contentType);
        sb.append(", content=").append(content);
        sb.append(", audioPath=").append(audioPath);
        sb.append(", audioDuration=").append(audioDuration);
        sb.append(", createTime=").append(createTime);
        sb.append(", readCount=").append(readCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
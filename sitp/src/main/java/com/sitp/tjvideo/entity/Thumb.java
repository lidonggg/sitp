package com.sitp.tjvideo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * @author Ls J
 * @date 2018/10/9 7:34 PM
 */
@TableName("sitp_thumb")
public class Thumb extends Model<Thumb> {

    private static final long serialVersionUID = 1L;

    @TableId("thumb_id")
    private Long thumbId;

    @TableField("originator_id")
    private Long originatorId;

    @TableField("target_id")
    private Long targetId;

    /**
     * 0--视频点赞
     * 1--评论点赞
     */
    private int type;

    public Long getThumbId() {
        return thumbId;
    }

    public void setThumbId(Long thumbId) {
        this.thumbId = thumbId;
    }

    public Long getOriginatorId() {
        return originatorId;
    }

    public void setOriginatorId(Long originatorId) {
        this.originatorId = originatorId;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Thumb{" +
                "thumbId=" + thumbId +
                ", originatorId=" + originatorId +
                ", targetId=" + targetId +
                ", type=" + type +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return this.thumbId;
    }
}

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
@TableName("sitp_comment")
public class Comment extends Model<Comment> {

    private static final long serialVersionUID = 1L;

    @TableId("comment_id")
    private Long commentId;

    /**
     * 视频或者评论的id
     */
    @TableField("target_id")
    private Long targetId;

    /**
     * 0--视频评论
     * 1--评论回复
     */
    private int type;

    /**
     * 发起人id
     */
    @TableField("originator_id")
    private Long originatorId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 点赞人数
     */
    @TableField("thumbs_num")
    private int thumbsNum;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
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

    public Long getOriginatorId() {
        return originatorId;
    }

    public void setOriginatorId(Long originatorId) {
        this.originatorId = originatorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getThumbsNum() {
        return thumbsNum;
    }

    public void setThumbsNum(int thumbsNum) {
        this.thumbsNum = thumbsNum;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", targetId=" + targetId +
                ", type=" + type +
                ", originatorId=" + originatorId +
                ", content='" + content + '\'' +
                ", thumbsNum=" + thumbsNum +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return this.commentId;
    }
}

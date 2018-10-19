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
@TableName("sitp_video")
public class Video extends Model<Video> {

    private static final long serialVersionUID = 1L;

    @TableId("video_id")
    private Long videoId;

    @TableField("user_id")
    private Long userId;

    private String url;

    @TableField("thumbs_num")
    private int thumbsNum;

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getThumbsNum() {
        return thumbsNum;
    }

    public void setThumbsNum(int thumbsNum) {
        this.thumbsNum = thumbsNum;
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoId=" + videoId +
                ", userId=" + userId +
                ", url='" + url + '\'' +
                ", thumbsNum=" + thumbsNum +
                '}';
    }

    @Override
    protected Serializable pkVal() {
        return this.videoId;
    }
}

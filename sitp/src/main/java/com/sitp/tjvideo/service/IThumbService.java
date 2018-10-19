package com.sitp.tjvideo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sitp.tjvideo.entity.Thumb;

/**
 * @author Ls J
 * @date 2018/10/9 7:37 PM
 */
public interface IThumbService extends IService<Thumb> {

    /**
     * 点赞
     * @param userId
     * @param targetId
     * @param type
     */
    void doThumbUp(Long userId,Long targetId,int type);
}

package com.sitp.tjvideo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sitp.tjvideo.entity.Thumb;
import com.sitp.tjvideo.mapper.ThumbMapper;
import com.sitp.tjvideo.service.IThumbService;
import org.springframework.stereotype.Service;

/**
 * @author Ls J
 * @date 2018/10/9 7:37 PM
 */
@Service("thumbService")
public class ThumbServiceImpl extends ServiceImpl<ThumbMapper, Thumb> implements IThumbService {
    @Override
    public void doThumbUp(Long userId,Long targetId, int type) {
        Thumb thumb = new Thumb();
        thumb.setOriginatorId(userId);
        thumb.setTargetId(targetId);
        thumb.setType(type);
        if(0 == type){

        }else{

        }
    }
}

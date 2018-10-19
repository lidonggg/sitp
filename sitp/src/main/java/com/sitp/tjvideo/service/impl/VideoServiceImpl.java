package com.sitp.tjvideo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sitp.tjvideo.entity.Video;
import com.sitp.tjvideo.mapper.VideoMapper;
import com.sitp.tjvideo.service.IVideoService;
import org.springframework.stereotype.Service;

/**
 * @author Ls J
 * @date 2018/10/9 7:36 PM
 */
@Service("videoService")
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements IVideoService {
}

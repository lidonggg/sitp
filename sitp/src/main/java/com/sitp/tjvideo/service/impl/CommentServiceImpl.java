package com.sitp.tjvideo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sitp.tjvideo.entity.Comment;
import com.sitp.tjvideo.mapper.CommentMapper;
import com.sitp.tjvideo.service.ICommentService;
import org.springframework.stereotype.Service;

/**
 * @author Ls J
 * @date 2018/10/9 7:37 PM
 */
@Service("commentService")
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {
}

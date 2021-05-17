package com.cxp.service.impl;

import com.cxp.entity.Blog;
import com.cxp.mapper.BlogMapper;
import com.cxp.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cxp
 * @since 2021-05-17
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}

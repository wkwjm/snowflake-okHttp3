package com.wjm.snowflake.okhttp3.shardingsphere.service.impl;


import com.wjm.snowflake.okhttp3.shardingsphere.mapper.TbOrderItemMapper;
import com.wjm.snowflake.okhttp3.shardingsphere.service.api.TbOrderItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbOrderItemServiceImpl implements TbOrderItemService {

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

}

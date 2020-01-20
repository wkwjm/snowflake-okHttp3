package com.wjm.snowflake.okhttp3.shardingsphere.service.impl;


import com.wjm.snowflake.okhttp3.shardingsphere.mapper.TbOrderMapper;
import com.wjm.snowflake.okhttp3.shardingsphere.service.api.TbOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TbOrderServiceImpl implements TbOrderService {

    @Resource
    private TbOrderMapper tbOrderMapper;

}

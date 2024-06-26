package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.entity.YujingEntity;
import com.utils.PageUtils;

import java.util.Map;

/**
 * 狱警 服务类
 */
public interface YujingService extends IService<YujingEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);

}
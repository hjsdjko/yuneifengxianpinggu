package com.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dao.GonggaoDao;
import com.entity.GonggaoEntity;
import com.entity.view.GonggaoView;
import com.service.GonggaoService;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * 公告 服务实现类
 */
@Service("gonggaoService")
@Transactional
public class GonggaoServiceImpl extends ServiceImpl<GonggaoDao, GonggaoEntity> implements GonggaoService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        Page<GonggaoView> page =new Query<GonggaoView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}

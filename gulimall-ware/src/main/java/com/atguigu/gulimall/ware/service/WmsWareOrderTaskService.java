package com.atguigu.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.ware.entity.WmsWareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author wangyi
 * @email 540691869@qq.com
 * @date 2024-12-24 22:59:57
 */
public interface WmsWareOrderTaskService extends IService<WmsWareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


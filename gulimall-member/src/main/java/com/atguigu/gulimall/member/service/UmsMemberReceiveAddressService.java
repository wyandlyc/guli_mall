package com.atguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.UmsMemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author wangyi
 * @email 540691869@qq.com
 * @date 2024-12-24 22:57:12
 */
public interface UmsMemberReceiveAddressService extends IService<UmsMemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

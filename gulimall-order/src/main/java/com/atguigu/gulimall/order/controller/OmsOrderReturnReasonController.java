package com.atguigu.gulimall.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.order.entity.OmsOrderReturnReasonEntity;
import com.atguigu.gulimall.order.service.OmsOrderReturnReasonService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 退货原因
 *
 * @author wangyi
 * @email 540691869@qq.com
 * @date 2024-12-24 23:01:24
 */
@RestController
@RequestMapping("order/omsorderreturnreason")
public class OmsOrderReturnReasonController {
    @Autowired
    private OmsOrderReturnReasonService omsOrderReturnReasonService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("order:omsorderreturnreason:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = omsOrderReturnReasonService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("order:omsorderreturnreason:info")
    public R info(@PathVariable("id") Long id){
		OmsOrderReturnReasonEntity omsOrderReturnReason = omsOrderReturnReasonService.getById(id);

        return R.ok().put("omsOrderReturnReason", omsOrderReturnReason);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("order:omsorderreturnreason:save")
    public R save(@RequestBody OmsOrderReturnReasonEntity omsOrderReturnReason){
		omsOrderReturnReasonService.save(omsOrderReturnReason);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("order:omsorderreturnreason:update")
    public R update(@RequestBody OmsOrderReturnReasonEntity omsOrderReturnReason){
		omsOrderReturnReasonService.updateById(omsOrderReturnReason);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("order:omsorderreturnreason:delete")
    public R delete(@RequestBody Long[] ids){
		omsOrderReturnReasonService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

package com.atguigu.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.gulimall.ware.entity.WmsPurchaseDetailEntity;
import com.atguigu.gulimall.ware.service.WmsPurchaseDetailService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * 
 *
 * @author wangyi
 * @email 540691869@qq.com
 * @date 2024-12-24 22:59:58
 */
@RestController
@RequestMapping("ware/wmspurchasedetail")
public class WmsPurchaseDetailController {
    @Autowired
    private WmsPurchaseDetailService wmsPurchaseDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ware:wmspurchasedetail:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wmsPurchaseDetailService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("ware:wmspurchasedetail:info")
    public R info(@PathVariable("id") Long id){
		WmsPurchaseDetailEntity wmsPurchaseDetail = wmsPurchaseDetailService.getById(id);

        return R.ok().put("wmsPurchaseDetail", wmsPurchaseDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ware:wmspurchasedetail:save")
    public R save(@RequestBody WmsPurchaseDetailEntity wmsPurchaseDetail){
		wmsPurchaseDetailService.save(wmsPurchaseDetail);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ware:wmspurchasedetail:update")
    public R update(@RequestBody WmsPurchaseDetailEntity wmsPurchaseDetail){
		wmsPurchaseDetailService.updateById(wmsPurchaseDetail);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ware:wmspurchasedetail:delete")
    public R delete(@RequestBody Long[] ids){
		wmsPurchaseDetailService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

package com.zhg.javakc.modules.commodity.goods.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.commodity.goods.entity.GoodsEntity;
import com.zhg.javakc.modules.commodity.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("commodity/goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;


    @RequestMapping("queryGoods")
    public ModelAndView queryGoods(GoodsEntity goodsEntity, HttpServletRequest request, HttpServletResponse response){

        ModelAndView modelAndView = new ModelAndView("commodity/goods/list");
        Page<GoodsEntity> page = goodsService.queryGoods(goodsEntity, new Page<GoodsEntity>(request, response));
        modelAndView.addObject( "page", page);
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(GoodsEntity goodsEntity){
        goodsEntity.setgId(CommonUtil.uuid());
        goodsService.save(goodsEntity);
        return "redirect:queryGoods.do";
    }

    @RequestMapping("/view/{ids}")
    public String view(@PathVariable String ids, ModelMap modelMap){
        GoodsEntity goodsEntity = goodsService.get(ids);
        modelMap.put("goodsEntity",goodsEntity);
        return "commodity/goods/update";
    }
    @RequestMapping("/update")
    public String update(GoodsEntity goodsEntity){
        goodsService.update(goodsEntity);
        return "redirect:queryGoods.do";
    }

    //全部删除
    @RequestMapping("/delete")
    public String alldelete(String[] ids){
        goodsService.delete(ids);
        return "redirect:queryGoods.do";
    }

    //单条删除
    @RequestMapping("/delete/{ids}")
    public String delete(@PathVariable String[] ids){
        goodsService.delete(ids);
        return "redirect:/commodity/goods/queryGoods.do";
    }

    @RequestMapping("/detail/{ids}")
    public String detail(@PathVariable String ids, ModelMap modelMap){
        GoodsEntity goodsEntity = goodsService.get(ids);
        modelMap.put("goodsEntity",goodsEntity);
        return "commodity/goods/detail";
    }















}

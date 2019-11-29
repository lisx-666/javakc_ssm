package com.zhg.javakc.modules.operation.promotion.controller;

import com.zhg.javakc.base.page.Page;

import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.operation.promotion.entity.PromotionEntity;
import com.zhg.javakc.modules.operation.promotion.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("promotion")
public class PromotionController{
    @Autowired
    PromotionService promotionService;

    @RequestMapping("/queryPromotion")
    public ModelAndView queryPromotion(PromotionEntity promotionEntity, HttpServletRequest request, HttpServletResponse response){

        ModelAndView modelAndView = new ModelAndView("operation/promotion/list");
        Page<PromotionEntity> page = promotionService.queryPromotion(promotionEntity, new Page<PromotionEntity>(request, response));
        modelAndView.addObject("page", page);
        return modelAndView;
    }


    @RequestMapping("/save")
    public String save(PromotionEntity promotionEntity){
        promotionEntity.setGoodsId(CommonUtil.uuid());
        promotionService.save(promotionEntity);
        return "redirect:queryPromotion.do";
    }

    @RequestMapping("/view")
    public String view(String ids, ModelMap modelMap){
        PromotionEntity promotionEntity = promotionService.get(ids);
        modelMap.put("promotionEntity",promotionEntity);
        return "operation/promotion/update";
    }
    @RequestMapping("/update")
    public String update(PromotionEntity promotionEntity){
        promotionService.update(promotionEntity);
        return "redirect:queryPromotion.do";
    }

    @RequestMapping("/delete")
    public String delete(String[] ids){
        promotionService.delete(ids);
        return "redirect:queryPromotion.do";
    }

}

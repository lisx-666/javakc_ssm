package com.zhg.javakc.modules.operation.coupons.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.operation.coupons.entity.CouponsEntity;
import com.zhg.javakc.modules.operation.coupons.service.CouponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/coupons")
public class CouponsController {
    @Autowired
    CouponsService couponsService;

    @RequestMapping("/queryCoupons")
    public ModelAndView queryCoupons(CouponsEntity couponsEntity, HttpServletRequest request, HttpServletResponse response){

        ModelAndView modelAndView = new ModelAndView("opration/coupons/list");
        Page<CouponsEntity> page = couponsService.queryCoupons(couponsEntity, new Page<CouponsEntity>(request, response));
        modelAndView.addObject("page", page);
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(CouponsEntity couponsEntity){
        couponsEntity.setCouponsId(CommonUtil.uuid());
        couponsService.save(couponsEntity);
        return "redirect:queryCoupons.do";
    }

    @RequestMapping("/view")
    public String view(String ids, ModelMap modelMap){
        CouponsEntity couponsEntity = couponsService.get(ids);
        modelMap.put("couponsEntity",couponsEntity);
        return "opration/coupons/update";
    }
    @RequestMapping("/update")
    public String update(CouponsEntity couponsEntity){
        couponsService.update(couponsEntity);
        return "redirect:queryCoupons.do";
    }

    @RequestMapping("/delete")
    public String delete(String[] ids){
        couponsService.delete(ids);
        return "redirect:queryCoupons.do";
    }
}

package com.zhg.javakc.modules.warehouse.instorage.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.warehouse.instorage.entity.InstorageEntity;
import com.zhg.javakc.modules.warehouse.instorage.service.InstorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/inhouse")
public class InstorageController{

    @Autowired
    private InstorageService instorageService;

    @RequestMapping("/query")
    public ModelAndView queryTest(InstorageEntity instorageEntity, HttpServletRequest request, HttpServletResponse response){

        ModelAndView modelAndView = new ModelAndView("warehouse/instorage/list");
        Page<InstorageEntity> page = instorageService.queryTest(instorageEntity, new Page<InstorageEntity>(request, response));
        modelAndView.addObject("page", page);
        return modelAndView;
    }

    @RequestMapping("/save")
    public String save(InstorageEntity instorageEntity){
        instorageEntity.setInhouseId(CommonUtil.uuid());
        instorageService.save(instorageEntity);
        return "redirect:query.do";
    }

    @RequestMapping("/view/{ids}")
    public String view(@PathVariable String ids, ModelMap modelMap){
        InstorageEntity instorageEntity = instorageService.get(ids);
        modelMap.put("instorageEntity",instorageEntity);
        return "warehouse/instorage/inhouse";
    }
    @RequestMapping("/update")
    public String update(InstorageEntity instorageEntity){
        instorageService.update(instorageEntity);
        return "redirect:query.do";
    }

    @RequestMapping("/delete")
    public String delete(String[] ids){
        instorageService.delete(ids);
        return "redirect:query.do";
    }

}

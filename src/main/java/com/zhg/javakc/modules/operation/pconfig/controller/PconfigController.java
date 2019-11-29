package com.zhg.javakc.modules.operation.pconfig.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.operation.pconfig.entity.PconfigEntity;
import com.zhg.javakc.modules.operation.pconfig.service.PconfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/pconfig")
public class PconfigController {
    @Autowired
    PconfigService pconfigService;

    @RequestMapping("/queryPconfig")
    public ModelAndView queryPconfig(PconfigEntity pconfigEntity, HttpServletRequest request, HttpServletResponse response){

        ModelAndView modelAndView = new ModelAndView("opration/pconfig/list");
        Page<PconfigEntity> page = pconfigService.queryPconfig(pconfigEntity, new Page<PconfigEntity>(request, response));
        modelAndView.addObject("page", page);
        return modelAndView;
    }


    @RequestMapping("/save")
    public String save(PconfigEntity pconfigEntity){
        pconfigEntity.setEventNo(CommonUtil.uuid());
        pconfigService.save(pconfigEntity);
        return "redirect:queryPconfig.do";
    }

    @RequestMapping("/view")
    public String view(String ids, ModelMap modelMap){
        PconfigEntity pconfigEntity = pconfigService.get(ids);
        modelMap.put("pconfigEntity",pconfigEntity);
        return "opration/pconfig/update";
    }
    @RequestMapping("/update")
    public String update(PconfigEntity pconfigEntity){
        pconfigService.update(pconfigEntity);
        return "redirect:queryPconfig.do";
    }

    @RequestMapping("/del/{ids}")
    public String del(@PathVariable String[] ids){
        pconfigService.delete(ids);
        return "redirect:opration/pconfig/queryPconfig.do";
    }

    @RequestMapping("detail/{ids}")
    public String detail(@PathVariable String ids, ModelMap modelMap){
        PconfigEntity pconfigEntity = pconfigService.get(ids);
        modelMap.put("pconfigEntity",pconfigEntity);
        return "opration/pconfig/detail";
    }

    @RequestMapping("/delete")
    public String delete(String[] ids){
        pconfigService.delete(ids);
        return "redirect:queryPconfig.do";
    }


}

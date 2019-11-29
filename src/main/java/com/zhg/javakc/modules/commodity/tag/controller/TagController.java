package com.zhg.javakc.modules.commodity.tag.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.commodity.tag.entity.TagEntity;
import com.zhg.javakc.modules.commodity.tag.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("commodity/tag")
public class TagController {

    @Autowired
    TagService tagService;


    @RequestMapping("queryTag")
    public ModelAndView queryTag(TagEntity tagEntity, HttpServletRequest request, HttpServletResponse response){

        ModelAndView modelAndView = new ModelAndView("commodity/tag/list");
        Page<TagEntity> page = tagService.queryTag(tagEntity, new Page<TagEntity>(request, response));
        modelAndView.addObject( "page", page);
        return modelAndView;
    }


    @RequestMapping("/save")
    public String save(TagEntity tagEntity){
        tagEntity.setTagId(CommonUtil.uuid());
        tagService.save(tagEntity);
        return "redirect:queryTag.do";
    }

    @RequestMapping("/view/{ids}")
    public String view(@PathVariable String ids, ModelMap modelMap){
        TagEntity tagEntity = tagService.get(ids);
        modelMap.put("tagEntity",tagEntity);
        return "commodity/tag/update";
    }
    @RequestMapping("/update")
    public String update(TagEntity tagEntity){
        tagService.update(tagEntity);
        return "redirect:queryTag.do";
    }

    //全部删除
    @RequestMapping("/delete")
    public String alldelete(String[] ids){
        tagService.delete(ids);
        return "redirect:queryTag.do";
    }

    //单条删除
    @RequestMapping("/delete/{ids}")
    public String delete(@PathVariable String[] ids){
        tagService.delete(ids);
        return "redirect:/commodity/tag/queryTag.do";
    }

    @RequestMapping("/detail/{ids}")
    public String detail(@PathVariable String ids, ModelMap modelMap){
        TagEntity tagEntity = tagService.get(ids);
        modelMap.put("tagEntity",tagEntity);
        return "commodity/tag/detail";
    }

}

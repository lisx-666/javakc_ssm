package com.zhg.javakc.modules.commodity.tag.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.commodity.tag.dao.TagDao;
import com.zhg.javakc.modules.commodity.tag.entity.TagEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService extends BaseService<TagDao, TagEntity> {

    @Autowired
    TagDao tagDao;

    public Page<TagEntity> queryTag(TagEntity tagEntity, Page<TagEntity> page){

        //设置分页参数，才会被mybatis分页插件识别，拦截SQL，然后在其SQL的前后加入分页SQL语句。
        tagEntity.setPage(page);
        // 根据分页与查询条件进行测试数据的查询
        List<TagEntity> tagList = tagDao.findList(tagEntity);
        // 将查询数据设置到分页类的LIST集合当中，一起返回
        page.setList(tagList);

        return page;
    }
}

package com.zhg.javakc.modules.warehouse.instorage.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.warehouse.instorage.dao.InstorageDao;
import com.zhg.javakc.modules.warehouse.instorage.entity.InstorageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstorageService extends BaseService<InstorageDao, InstorageEntity> {

    @Autowired
    private InstorageDao instorageDao;

    public Page<InstorageEntity> queryTest(InstorageEntity instorageEntity, Page<InstorageEntity> page) {

        //设置分页参数，才会被mybatis分页插件识别，拦截SQL，然后在其SQL的前后加入分页SQL语句。
        instorageEntity.setPage(page);
        // 根据分页与查询条件进行测试数据的查询
        List<InstorageEntity> instorageList =  instorageDao.findList(instorageEntity);
        // 将查询数据设置到分页类的LIST集合当中，一起返回
        page.setList(instorageList);

        return page;

    }

}

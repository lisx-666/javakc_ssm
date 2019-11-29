package com.zhg.javakc.modules.operation.pconfig.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.operation.pconfig.dao.PconfigDao;
import com.zhg.javakc.modules.operation.pconfig.entity.PconfigEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PconfigService extends BaseService<PconfigDao, PconfigEntity> {
    @Autowired
    PconfigDao pconfigDao;
    public Page<PconfigEntity> queryPconfig(PconfigEntity pconfigEntity, Page<PconfigEntity> page) {

        //设置分页参数，才会被mybatis分页插件识别，拦截SQL，然后在其SQL的前后加入分页SQL语句。
        pconfigEntity.setPage(page);
        // 根据分页与查询条件进行测试数据的查询
        List<PconfigEntity> pconfigList =  pconfigDao.findList(pconfigEntity);
        // 将查询数据设置到分页类的LIST集合当中，一起返回
        page.setList(pconfigList);

        return page;

    }
}

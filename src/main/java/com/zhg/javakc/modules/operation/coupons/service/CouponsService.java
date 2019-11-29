package com.zhg.javakc.modules.operation.coupons.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.operation.coupons.dao.CouponsDao;
import com.zhg.javakc.modules.operation.coupons.entity.CouponsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponsService extends BaseService<CouponsDao, CouponsEntity> {
    @Autowired
    CouponsDao couponsDao;


    public Page<CouponsEntity> queryCoupons(CouponsEntity couponsEntity, Page<CouponsEntity> page) {

        //设置分页参数，才会被mybatis分页插件识别，拦截SQL，然后在其SQL的前后加入分页SQL语句。
        couponsEntity.setPage(page);
        // 根据分页与查询条件进行测试数据的查询
        List<CouponsEntity> testList =  couponsDao.findList(couponsEntity);
        // 将查询数据设置到分页类的LIST集合当中，一起返回
        page.setList(testList);

        return page;

    }
}

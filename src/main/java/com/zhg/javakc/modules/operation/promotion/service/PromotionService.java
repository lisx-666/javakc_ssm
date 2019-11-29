package com.zhg.javakc.modules.operation.promotion.service;

import com.zhg.javakc.base.dao.BaseDao;
import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.operation.promotion.dao.PromotionDao;
import com.zhg.javakc.modules.operation.promotion.entity.PromotionEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService extends BaseService<PromotionDao,PromotionEntity> {
    @Autowired
    PromotionDao promotionDao;
    public Page<PromotionEntity> queryPromotion(PromotionEntity promotionEntity, Page<PromotionEntity> page) {

        //设置分页参数，才会被mybatis分页插件识别，拦截SQL，然后在其SQL的前后加入分页SQL语句。
        promotionEntity.setPage(page);
        // 根据分页与查询条件进行测试数据的查询
        List<PromotionEntity> promotionList =  promotionDao.findList(promotionEntity);
        // 将查询数据设置到分页类的LIST集合当中，一起返回
        page.setList(promotionList);

        return page;

    }
}

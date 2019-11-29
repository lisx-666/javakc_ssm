package com.zhg.javakc.modules.commodity.goods.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.commodity.goods.dao.GoodsDao;
import com.zhg.javakc.modules.commodity.goods.entity.GoodsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService extends BaseService<GoodsDao, GoodsEntity> {

    @Autowired
    GoodsDao goodsDao;

    public Page<GoodsEntity> queryGoods(GoodsEntity goodsEntity, Page<GoodsEntity> page){

        //设置分页参数，才会被mybatis分页插件识别，拦截SQL，然后在其SQL的前后加入分页SQL语句。
        goodsEntity.setPage(page);
        // 根据分页与查询条件进行测试数据的查询
        List<GoodsEntity> goodsList = goodsDao.findList(goodsEntity);
        // 将查询数据设置到分页类的LIST集合当中，一起返回
        page.setList(goodsList);

        return page;
    }

}

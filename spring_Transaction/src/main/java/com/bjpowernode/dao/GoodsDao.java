package com.bjpowernode.dao;

import com.bjpowernode.domain.Goods;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Horizon~muu
 * @Date: 2020/10/11/17:01
 * @Description:
 */
public interface GoodsDao {
    //更新库存
    int updateGoods(Goods goods);
    //查询商品信息
    Goods selectGoods(Integer id);
}

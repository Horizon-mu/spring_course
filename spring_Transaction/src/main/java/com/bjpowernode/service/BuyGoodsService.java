package com.bjpowernode.service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Horizon~muu
 * @Date: 2020/10/11/17:23
 * @Description:
 */
public interface BuyGoodsService {
    //购买商品的方法，goodsId是购买商品的编号，nums是购买的数量
    void buy(Integer goodsId,Integer nums);
}

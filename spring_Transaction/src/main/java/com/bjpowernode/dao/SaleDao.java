package com.bjpowernode.dao;

import com.bjpowernode.domain.Sale;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Horizon~muu
 * @Date: 2020/10/11/17:00
 * @Description:
 */
public interface SaleDao {
    //增加销售记录
    int insertSale(Sale sale);
}

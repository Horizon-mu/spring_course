package com.bjpowernode.service.impl;

import com.bjpowernode.dao.GoodsDao;
import com.bjpowernode.dao.SaleDao;
import com.bjpowernode.domain.Goods;
import com.bjpowernode.domain.Sale;
import com.bjpowernode.excep.NotEnoughException;
import com.bjpowernode.service.BuyGoodsService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Horizon~muu
 * @Date: 2020/10/11/17:27
 * @Description:
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {
    private GoodsDao goodsDao;
    private SaleDao saleDao;

    @Override
    /**
     *
     * rollbackFor:表示发生指定的异常一定回滚
     * 处理逻辑是：
     *  spring框架会首先检查方法抛出异常是否在rollbackFor的属性值中
     *  如果异常在rollback列表中，不管是什么类型的异常，一定回滚
     *  如果不在列表中，spring会判断异常是不是RuntimeException，如果是，一定回滚
     */
    /*@Transactional(
            propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            rollbackFor = {
                    NullPointerException.class,
                    NotEnoughException.class
            }
    )*/
    //使用的是事务控制的默认值，默认的传播行为是REQUIRED，默认的隔离级别是DEFAULT
    //默认抛出运行时异常，回滚事务。
    @Transactional
    public void buy(Integer goodsId, Integer nums) {

        System.out.println("******buy方法的开始******");
        //记录销售的信息，向销售表（sale）添加记录
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        //更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null){
            throw new NotEnoughException("编号：" + goodsId + "商品不存在");
        }else if (goods.getAmount() < nums){
            //商品库存不足
            throw new NotEnoughException("编号：" + goodsId + "商品库存不足");
        }
        //修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("******buy方法的完成******");
    }

    public GoodsDao getGoodsDao() {
        return goodsDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    public SaleDao getSaleDao() {
        return saleDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }
}

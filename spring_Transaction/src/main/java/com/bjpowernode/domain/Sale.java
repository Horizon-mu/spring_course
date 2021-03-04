package com.bjpowernode.domain;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Horizon~muu
 * @Date: 2020/10/11/16:55
 * @Description:
 */
public class Sale {
    private Integer id;
    private Integer gid;
    private Integer nums;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Sale() {
    }

    public Sale(Integer id, Integer gid, Integer nums) {
        this.id = id;
        this.gid = gid;
        this.nums = nums;
    }
}

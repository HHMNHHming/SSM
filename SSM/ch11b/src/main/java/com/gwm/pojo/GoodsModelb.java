package com.gwm.pojo;

import java.util.Date;

public class GoodsModelb
{
    private String goodsName;
    private Double goodsPrice;
    private Integer goodsNumber;

    private Date goodsDate;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Integer goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Date getGoodsDate(){
        return goodsDate;
    }
    public void setGoodsDate(Date goodsDate){
        this.goodsDate=goodsDate;
    }
}

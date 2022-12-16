package com.gwm.converter;

import com.gwm.pojo.GoodsModel;
import org.springframework.core.convert.converter.Converter;

public class GoodsConverter implements Converter<String, GoodsModel> {

    @Override
    public GoodsModel convert(String s) {
        GoodsModel gm = new GoodsModel();
        String stringValues[] = s.split(",");
        if(stringValues!=null
        &&stringValues.length==3){
            gm.setGoodsName(stringValues[0]);
            gm.setGoodsPrice(Double.valueOf(stringValues[1]));
            gm.setGoodsNumber(Integer.valueOf(stringValues[2]));
            return gm;
        }
        else{
            try {
                throw new IllegalAccessException(String.format("类型转换失败",s));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

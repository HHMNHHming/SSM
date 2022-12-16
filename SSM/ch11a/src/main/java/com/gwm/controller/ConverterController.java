package com.gwm.controller;

import com.gwm.pojo.GoodsModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;

@Controller
@RequestMapping("/my")
public class ConverterController {
    /**
     *前端传过来的goods转化为goodsModel类型，在springmvc-servlet.xml文件中配置转化。
     */
    @RequestMapping("/converter")
    public String converter(@RequestParam("goods")GoodsModel gm, Model model){
        model.addAttribute("goods",gm);
        return "showGoods";
    }
}

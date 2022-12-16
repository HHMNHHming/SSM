package com.gwm.controller;

import com.gwm.pojo.GoodsModelb;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/my")
public class FormatterController {
    @RequestMapping("/formatter")
    public String formatter(GoodsModelb gm, Model model){
        model.addAttribute("goods",gm);
        return "showGoods";
    }

}

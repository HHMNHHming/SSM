package com.gwm.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Component("annotationUser")
public class AnnotationUser {
    @Value("xiaoli")
    private String name;

    /*
        //暂时不清楚复合类型的使用哪个注解 就先不写了吧
        @Value("唱歌"+"跳舞")
        private List<String> hobbyList;*/
    public String getName() {
        return name;
    }
}


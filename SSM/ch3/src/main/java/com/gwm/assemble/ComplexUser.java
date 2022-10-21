package com.gwm.assemble;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComplexUser {
    private String name;
    private List<String> hobbyList;
    private Map<String,String> residenceMap;
    private Set<String> aliasSet;
    /**
     * 要完成complexUser的构造方法注入，需要在applicationContext调用下面有参数的构造方法。
     */
    public ComplexUser(String name, List<String> hobbyList, Map<String,String> residenceMap, Set<String> aliasSet){
        this.name = name;
        this.hobbyList = hobbyList;
        this.residenceMap = residenceMap;
        this.aliasSet = aliasSet;
    }

    /**
     * 要完成complexUser的setter方法注入，需要在applicationContext调用下面无参的构造方法。
     */
    public ComplexUser(){
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public void setResidenceMap(Map<String, String> residenceMap) {
        this.residenceMap = residenceMap;
    }

    public void setAliasSet(Set<String> aliasSet) {
        this.aliasSet = aliasSet;
    }


    @Override
    public String toString() {
        return "ComplexUser{" +
                "name='" + name + '\'' +
                ", hobbyList=" + hobbyList +
                ", residenceMap=" + residenceMap +
                ", aliasSet=" + aliasSet +
                '}';
    }
}

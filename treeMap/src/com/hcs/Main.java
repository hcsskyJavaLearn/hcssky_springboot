package com.hcs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    //面试题
    public static void main(String[] args) {
        String str = "52张三丰12刘德华21赵武41铭铭47赵子龙";
        Pattern compile = Pattern.compile("[\\\\u4e00-\\\\u9fa5]+|\\\\d+");
        Matcher matcher = compile.matcher(str);
        ArrayList list= new ArrayList();
        TreeMap<Integer,String> map = new TreeMap<Integer,String>();
        while (matcher.find()){
            list.add(matcher.group());
        }
        for(int i=0;i<list.size();i++){
            String key0 = (String) list.get(i);
            Integer key = Integer.parseInt(key0);
            String value = (String) list.get(++i);
            map.put(key,value);
        }

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            String value  = map.get(key);
            System.out.println("key:"+key+"value:"+value);
        }
    }
}

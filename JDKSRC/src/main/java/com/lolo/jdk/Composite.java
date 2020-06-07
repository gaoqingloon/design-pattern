package com.lolo.jdk;

import java.util.HashMap;
import java.util.Map;

public class Composite {
    public static void main(String[] args) {
        /*
         * 1. Map就是一个抽象的构建(类似我们的Component)
         * 2. HashMap是一个中间的构建(Composite)，实现/继承了相关方法put, putAll
         * 3. Node是HashMap的静态内部类，类似Leaf叶子节点, 这里就没有put, putAll
         */
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "东游记"); //直接存放叶子节点(Node)

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "西游记");
        map.put(2, "红楼梦"); //..
        hashMap.putAll(map);
        System.out.println(hashMap);
    }
}

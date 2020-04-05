package com.reference;
/**
 * 公司名称
 * <p>
 * 本源代码由《interview》及其作者共同所有，未经版权持有者的事先书面授权，
 * 不得使用、复制、修改、合并、发布、分发和/或销售本源代码的副本。
 *
 * @copyright Copyright (c) 2020-2020+3. （company）all rights reserved.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 说明
 *  @author maikec
 *  @date 2020/4/5
 */
public class CollectMain {
    public static void main(String[] args) {
        final Map<Object, Object> objectObjectHashMap = new HashMap<>();
        String s = String.valueOf(100);
        objectObjectHashMap.put("obj",s);
        s = "20";

        int i = 10;
        objectObjectHashMap.put("i", i);
        i = 1000;

        Integer integer = Integer.valueOf(100);
        objectObjectHashMap.put("inte",integer);
        integer = Integer.valueOf(1);

        final Set<Object> set = new HashSet<>();
        objectObjectHashMap.put("set", set);

        set.add("maikec");
        set.add("chen");

        System.out.println(objectObjectHashMap.toString());
    }
}

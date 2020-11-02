package com.bgs.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: MapDemo01
 * @Description: TODO
 * @Author: Kang Jianhang
 * @Date: 2020/10/9 10:13
 * @Version: v1.0
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("迪丽热巴", "女");
        map.put("古力娜扎", "女");
        //
        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}

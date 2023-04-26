package org.example.coreTech.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author felix
 * @date 2023/3/28 15:20
 */
public class map {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name","lihua");
        map.put("age","18");
        map.put("gender","nan");

        //1.普遍使用
        for(String key : map.keySet()){
            System.out.println(key+map.get(key));
        }

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> it = iterator.next();
            System.out.println(it.getKey()+it.getValue());
        }

        //2。容量大推荐
        for (Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println(entry.getKey()+entry.getValue());
        }

        //只能获取到value
        for(String value : map.values()){
            System.out.println(value);
        }
    }
}

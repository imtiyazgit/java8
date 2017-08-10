package com.imtiyaz.strings;

import java.util.*;

/**
 * Created by imtiyaz on 8/9/17.
 */
public class FindMaxOccurrencesOfWord {
    public static void main(String[] args) {
        String input = "Hi cat is mat and cat mat the cat mat";

        String[] arr = input.split(" ");
        HashMap<String, Integer> map = new LinkedHashMap();

        for (String str:arr) {
            map.put(str, map.get(str) != null ? map.get(str)+1 : 1);
        }

        int max = 0;
        Map.Entry<String,Integer> result=null;
        List<Map.Entry<String, Integer>> entries = new ArrayList(map.entrySet());
        for(Map.Entry<String, Integer> entry:entries) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry;
            }
        }

        System.out.println(result);
    }
}

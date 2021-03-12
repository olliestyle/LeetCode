package ru.baib;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapRev {

    public Map<Integer, Set<String>> reverse(Map<String, Set<Integer>> map) {
        Map<Integer, Set<String>> toReturn = new HashMap<>();
        for (Map.Entry<String, Set<Integer>> entry: map.entrySet()) {
            for(Integer val: entry.getValue()) {
                if(toReturn.containsKey(val)) {
                    toReturn.get(val).add(entry.getKey());
                } else {
                    Set<String> set = new HashSet();
                    set.add(entry.getKey());
                    toReturn.put(val, set);
                }
            }
        }
        return toReturn;
    }
    public static void main(String[] args) {
        Map<String, Set<Integer>> map = new HashMap<>();
        map.put("a", Set.of(1, 2, 3));
        map.put("b", Set.of(1, 3, 4));
        map.put("c", Set.of(2, 5, 4));
        MapRev mapRev = new MapRev();
        System.out.println(mapRev.reverse(map).toString());

    }

}


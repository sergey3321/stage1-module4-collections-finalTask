package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            int keyLength = entry.getKey().length();

            if (result.containsKey(keyLength)) {
                result.get(keyLength).add(entry.getKey());
            } else {
                Set<String> set = new HashSet<>();
                set.add(entry.getKey());
                result.put(keyLength, set);
            }
        }

        return result;
    }
}


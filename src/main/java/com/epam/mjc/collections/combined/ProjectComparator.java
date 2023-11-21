package com.epam.mjc.collections.combined;

import java.util.Comparator;

class ProjectComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 != len2) {
            return Integer.compare(len2, len1);
        } else {
            return s2.compareTo(s1);
        }
    }
}

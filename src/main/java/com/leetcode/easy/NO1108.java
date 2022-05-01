package com.leetcode.easy;

public class NO1108 {
    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer(address);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '.'){
                sb.insert(i - 1, '[');
                sb.insert(i + 1, ']');
                i += 2;
            }
        }
        return sb.toString();
    }
}

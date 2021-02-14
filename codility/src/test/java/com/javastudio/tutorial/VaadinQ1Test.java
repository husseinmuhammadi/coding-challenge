package com.javastudio.tutorial;

import org.junit.jupiter.api.Test;

class VaadinQ1Test {
    @Test
    void findDuplicateLetter() {
        System.out.println(solution("hello"));
    }

    public String solution(String S) {
        // write your code in Java SE 8
        int [] count = new int[26];

        for (char c:S.toCharArray()){
            count[(int)c - (int)'a']++;
            if (count[(int)c - (int)'a']>1)
                return c+"";
        }
        return "";
    }
}

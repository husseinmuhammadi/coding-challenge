package com.javastudio.tutorial;

import org.junit.jupiter.api.Test;

class VaadinQ2Test {
    @Test
    void insertNumberFiveInOrderToGetMaxNumber() {
        int N = 56744;
        System.out.println(N);
        System.out.println(solution(N));
    }

    public int solution(int N) {
        // write your code in Java SE 8

        int k = 5;
        if (N < 0)
            k = -5;

        int[] A = new int[10];
        int count = 0;

        do {
            A[count++] = N % 10;
            N = N / 10;
        } while (N != 0);

        int max = 0;
        boolean b = true;
        for (int i = count - 1; i >= 0; i--) {
            if (A[i] < k && b) {
                max = max * 10 + k;
                b = false;
            }
            max = max * 10 + A[i];
        }
        if (b)
            max = max * 10 + k;
        return max;
    }
}

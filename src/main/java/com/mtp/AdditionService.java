package com.mtp;

/**
 * @author jlamby
 *
 */
public class AdditionService {

    public int add(int a, int b) {
        return sum(a,b);
    }

    int sum(int... integers) {
        int sum = 0;

        for (int i : integers) {
            sum += i;
        }

        return sum;
    }
}

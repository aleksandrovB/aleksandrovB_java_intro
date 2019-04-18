package com.clouway;

public class GreatestCommonDivisor {
    /**
     * Gets Greatest Common Divisor of two int numbers
     * @param n1 first number used by GDC
     * @param n2 second number used by GDC
     * @return GCD of n1 and n2
     */
    public int getGCD(int n1, int n2) {
        int result = 1;
        if (n1 == n2) {
            return n1;
        }
        if (n2 > n1) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        while (result > 0) {
            result = n1 % n2;
            n1 = n2;
            n2 = result;
        }
        return n1;
    }
}

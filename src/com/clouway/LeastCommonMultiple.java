package com.clouway;

public class LeastCommonMultiple {
    /**
     * Gets Least Common Multiple of two integer numbers using GDC
     * @param n1 first number used by LMC
     * @param n2 second number used by LMC
     * @return LMC of n1 and n2
     */
    public int getLCM(int n1, int n2)
    {
        if(n1!=0 && n2!=0){
            return (n1*n2)/new GreatestCommonDivisor().getGCD(n1,n2);
        } else{
            return 0;
        }
    }
}

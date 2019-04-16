package com.clouway;

import java.util.Random;

public class RandomStringGenerator {
    public RandomStringGenerator() {
    }

    /**
     * Generates String with random lowercase letters and custom length
     * @param len length of final string
     * @return string of random chars
     */
    public String getRandomString(int len){
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < len ; i++) {
            int rand = new Random().nextInt(122-97)+97;
            result.append((char) rand);
        }

        return result.toString();
    }
}

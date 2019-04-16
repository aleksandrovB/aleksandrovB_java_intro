package com.clouway;

public class ArrayRevertor {
    public ArrayRevertor() {
    }

    /**
     * Reverts array using temporary integer
     * @param array array being reverted
     * @return reverted array
     */
    public int[] revert(int[] array){
        int temp;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        return array;
    }
}

package test.sort;

import sort.B3_Quick;

import java.util.Arrays;

public class B3_Quick_Test {

    public static void main(String[] args) {
        Integer[] a ={6,1,2,7,9,3,4,5,8};
        B3_Quick.sort(a);

        System.out.println(Arrays.toString(a));
    }
}

package test.Sort;



import Sort.A3_Insertion;

import java.util.Arrays;

/**
 * @FileName: A3_Insertion_Test
 * @Author: 林鈺淇(19050)
 * @Date: 2022/11/21 上午 10:35
 * @Description:
 */
public class A3_Insertion_Test {
    public static void main(String[] args) {

        Integer[] a={4,3,2,10,12,1,5,6};

        A3_Insertion.sort(a);

        System.out.println(Arrays.toString(a));
    }

}

package src.test;

import A1_Bubble.Bubble;

import java.sql.Array;
import java.util.Arrays;

/**
 * @FileName: A1_Bubble_Test
 * @Author: 林鈺淇(19050)
 * @Date: 2022/11/15 上午 10:53
 * @Description:
 */
public class A1_Bubble_Test {
    public static void main(String[] args) {

        Integer[] arr={4,5,6,3,2,1,};

        Bubble.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}

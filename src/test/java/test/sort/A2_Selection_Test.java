package test.sort;

import sort.A2_Selection;

import java.util.Arrays;

/**
 * @FileName: A2_Selection_Test
 * @Author: 林鈺淇(19050)
 * @Date: 2022/11/15 上午 11:12
 * @Description:
 */
public class A2_Selection_Test {
    public static void main(String[] args) {

        Integer[] a = {4,6,8,7,9,2,10,1};

        A2_Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

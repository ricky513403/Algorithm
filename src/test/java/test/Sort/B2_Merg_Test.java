package test.Sort;

import Sort.B2_Merge;

import java.util.Arrays;

/**
 * @FileName: B2_Merg_Test
 * @Author: RickyLin
 * @Date: 2023/1/16 下午 04:01
 * @Description:
 */
public class B2_Merg_Test {

    public static void main(String[] args) {
        Integer[] a = {8,4,5,7,1,3,6,2};
        B2_Merge.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

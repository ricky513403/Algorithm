package test;

import B2_Merge.Merge;

import java.util.ArrayList;
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
        Merge.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

package test.Sort;

import Sort.B1_Shell;

import java.util.Arrays;

/**
 * @FileName: B1_Shell_Test
 * @Author: 林鈺淇(19050)
 * @Date: 2022/12/5 上午 11:34
 * @Description:
 */
public class B1_Shell_Test {

    public static void main(String[] args) {

        Integer[] a={9,1,2,5,7,4,8,6,3,5};
        B1_Shell.sort(a);

        System.out.println(Arrays.toString(a));

    }
}

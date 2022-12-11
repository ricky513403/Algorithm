package test.Compare;


import A3_Insertion.Insertion;
import B1_Shell.Shell;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class sortCompare {
    //調用不同方法完成測試
    public static void main(String[] args) throws Exception {

        //1.創建ArrayList集合 保存讀取出來的整數
        ArrayList<Integer> list = new ArrayList<Integer>();
        //2.創建讀取流BufferedReader,讀取數據，並存儲到ArrayList中;
        BufferedReader reader=new BufferedReader
                (new InputStreamReader(sortCompare.class.getClassLoader().getResourceAsStream("reverse_arr.txt")));
        String line = null;
        while((line=reader.readLine())!=null){
            //line 是字符串 把line轉換成Integer 存儲到集合中
            int i = Integer.parseInt(line);
            list.add(i);
        }

        reader.close();
        //3.把ArrayList集合轉換成數組
        Integer[] a = new Integer[list.size()];
        list.toArray(a);
        //4.調用測試代碼完成測試
        testInsertion(a);
        testShell(a);
    }
    //Shell效率
    public static void testShell(Integer[] a){
        //1.獲取執行之前的時間
        long start = System.currentTimeMillis();
        //2.執行算法代碼
        Shell.sort(a);
        //3.獲取執行之後的時間
        long end = System.currentTimeMillis();
        //4.算出程序執行的時間並輸出
        System.out.println("ShellSort執行時間為"+(end-start)+"毫秒");
    }

    //Shell效率
    public static void testInsertion(Integer[] a){
        //1.獲取執行之前的時間
        long start = System.currentTimeMillis();
        //2.執行算法代碼
        Insertion.sort(a);
        //3.獲取執行之後的時間
        long end = System.currentTimeMillis();
        //4.算出程序執行的時間並輸出
        System.out.println("InsertionSort執行時間為"+(end-start)+"毫秒");
    }


}

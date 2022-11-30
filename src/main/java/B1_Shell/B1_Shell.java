package B1_Shell;

/**
 * @FileName: B1_Shell
 * @Author: 林鈺淇(19050)
 * @Date: 2022/11/24 下午 05:34
 * @Description: 希爾排序
 */
public class B1_Shell {

    public static void sort(Comparable[] a){
        //1.根據陣列a的長度，確定增長量h的初始值:
        int h=1;
        while(h<a.length/2){
            h=2*h+1;
        }
        //2.進行希爾排序
        while(h>=1){
            //進行排序
            //1.
            
            //減小h的值
            h=h/2;
        }
    }

    //比較v元素是否大於w元素
    public static boolean greater(Comparable v,Comparable w){

        return v.compareTo(w)>0;
    }

    //陣列元素i和j交換位置
    private static void exch(Comparable[] a,int i,int j){

        Comparable temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}

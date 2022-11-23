package A1_Bubble;

/**
 * @FileName: Bubble
 * @Author: 林鈺淇(19050)
 * @Date: 2022/11/15 上午 10:43
 * @Description:
 */
public class Bubble {
    //對陣列a中的元素進行排序
    public static void sort(Comparable[] a){

        for(int i=a.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                //比較索引j和索引j+1的值
                if(greater(a[j],a[j+1])){
                    exch(a,j,j+1);
                }
            }
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

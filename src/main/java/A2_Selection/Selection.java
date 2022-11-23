package A2_Selection;

/**
 * @FileName: Selection
 * @Author: 林鈺淇(19050)
 * @Date: 2022/11/15 上午 11:04
 * @Description:
 */
public class Selection {

    public static void sort(Comparable[] a){
        for(int i=0;i<=a.length-2;i++){
            //定義一個變量 紀錄最小元素所在的索引 默認為參與選擇排序的第一個元素位置
            int minIndex=i;
            for(int j=i+1;j<a.length;j++){
                //需要比較最小索引minIndex處的值和j索引處的值
                if(greater(a[minIndex],a[j])){
                    minIndex=j;
                }
            }
            //交換最小元素所在的位置 及i的值
            exch(a,i,minIndex);

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



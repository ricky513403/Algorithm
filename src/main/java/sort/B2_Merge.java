package sort;

public class B2_Merge {
    //輔助陣列
    private static Comparable[] assist;
    //比較大小
    private static boolean less(Comparable v,Comparable w){
        return  v.compareTo(w)<0;
    }
    //交換位子
    private static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i]=a[j];
        a[j]=t;
    }

    //對陣列a中的元素進行排序
    public static void sort(Comparable[] a){
        //1.初始化輔助陣列assist;
        assist = new Comparable[a.length];
        //2.定義一個lo變量 和hi變量 分別記錄陣列中最小和最大的索引
        int lo=0;
        int hi=a.length-1;
        //3.調用sort重載方法完成陣列a中，從索引lo到索引hi的元素的排序
        sort(a,lo,hi);
    }

    /**
    對陣列a中從lo到hi的元素進行排序
     */
    private static void sort(Comparable[] a,int lo,int hi){
        //做安全性校驗
        if(hi<=lo){
            return;
        }
        //對lo到hi之間的數據進行分組
        int mid = lo+(hi-lo)/2; //5,9 mid=7

        //分別對每一組數據進行排序
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        //再把兩個組中的數據進行歸併
        merge(a,lo,mid,hi);
    }
    /**
    對陣列中，從lo到mid為一組，從mid+1到hi為一組 進行歸併排序
     */
    private static void merge(Comparable[] a,int lo,int mid,int hi){
        //定義三個 指針
        int i = lo;
        int p1 = lo;
        int p2 = mid+1;
        //遍歷，移動p1指針和p2指針，比較對應索引處的值，找出小的那個，放到輔助陣列的第一個
        while(p1<=mid && p2<=hi){
            //比較對應索引處的值
            if(less(a[p1],a[p2])){
                assist[i++] = a[p1++];
            }else{
                assist[i++]= a[p2++];
            }
        }
        //遍歷，如果p1的指針沒有走完，那麼順序移動p1指針，百把對應的元素放到輔助陣列的對應索引處
        while(p1<=mid){
            assist[i++]=a[p1++];
        }
        //遍歷，如果p2的指針沒有走完，那麼順序移動p2指針，百把對應的元素放到輔助陣列的對應索引處
        while(p2<=hi){
            assist[i++]=a[p2++];
        }
        //把輔助陣列中的元素複製到初始陣列中
        for (int index=lo;index<=hi;index++){
            a[index]=assist[index];
        }
    }
}

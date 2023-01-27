package sort;

public class B3_Quick {

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
    //對陣列內的元素進行排序
    public static void sort(Comparable[] a){
        int lo = 0;
        int hi = a.length-1;
        sort(a,lo,hi);
    }
    //對陣列a中從索引lo到索引hi之間的元素進行排序
    private static void sort(Comparable[] a,int lo , int hi){
        //安全性校驗
        if(hi<=lo){
            return;
        }

        //需要對陣列中lo索引到hi索引處的元素進行分組(左子組右子組)
        int partition = partition(a, lo, hi);//返回的是分組的分界值所在的索引，分界值位置變換後的索引
        //讓左子組有序
        sort(a,lo,partition-1);
        //讓右子組有序
        sort(a,partition+1,hi);
    }
    //對陣列a中 從索引lo到索引hi之間的元素進行分組  並返回分組界限對應的索引
    public static int partition(Comparable[] a,int lo,int hi){
        //確定分界值
        Comparable key = a[lo];
        //定義兩個指針 分別指向待切分元素的最小索引處和最大索引處的下一個位置
        int left = lo;
        int right = hi+1;

        //切分
        while(true){
            //先從右往左掃描 移動right指針 找打一個比分界值小的元素，停止
            while(less(key,a[--right])){
                if(right==lo){
                    break;
                }
            }
            //再從左往右掃描 移動left指針 找到一個比分界值大的元素 停止
            while(less(a[++left],key)){
                if(left==hi){
                    break;
                }
            }
            //判斷left>=right 如果是，證明元素掃描完畢 結束循環 如果不是則交換元素
            if(left>=right){
                break;
            }else {
                exch(a,left,right);
            }
        }
        //交換分界值
        exch(a,lo,right);
        return right;
    }

}

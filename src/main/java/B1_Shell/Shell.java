package B1_Shell;

public class Shell {

    public static void sort(Comparable[] a){
        //1.根據陣列a的長度 確定增長量的初始值
        int h=1;
        while(h<a.length/2){
            h=2*h+1;
        }

        //2.希爾排序   //定義一個變量 紀錄最小元素所在的索引 默認為參與選擇排序的第一個元素位置
        while(h>=1){
            //排序
            //2.1.找到待插入的元素


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

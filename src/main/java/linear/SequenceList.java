package linear;

import java.util.Iterator;
public class SequenceList<T> implements Iterable<T> {

    //存儲元素的陣列
    private T[] eles;
    //紀錄當前順序表中的元素個數
    private int N;
    //建構器
    public SequenceList(int capacity){
        //初始化陣列
        this.eles=(T[])new Object[capacity];
        //初始化長度
        this.N=0;
    }

    //將一個線性表設為空表
    public void clear(){
        this.N=0;
    }

    //判斷是否為空表
    public boolean isEmpty(){
        return N==0;
    }
    //獲取長度
    public int length(){
        return N;
    }
    //獲取指定位置的元素
    public T get(int i){
        return eles[i];
    }

    //向線性表中添加元素t
    public void insert(T t){
        if(N==eles.length){
            resize(2* eles.length);
        }
        eles[N++]=t;
    }

    //在i元素處插入元素t
    public void insert(int i ,T t){
        if(N==eles.length){
            resize(2* eles.length);
        }
        //先把i索引處的元素及其後面的元素依次向後移動一位
        for(int index = N;index>i;index--){
            eles[index]=eles[index-1];
        }
        //再把t元素放到i索引處
        eles[i] = t;
        //元素個數+1
        N++;
    }

    //刪除指定位置i處的元素 並返回該元素
    public T remove(int i){
        //紀錄索引i處的值
        T current =  eles[i];
        //索引i後面元素依次向前移動一位即可
        for(int index =i;index<N-1;index++){
            eles[index]=eles[index+1];
        }
        //元素個數-1
        N--;

        if(N<eles.length/4){
            resize(eles.length/2);
        }
        return current;
    }

    //查找t元素第一次出現的位置
    public int indexOf(T t){
        for (int i = 0; i < N; i++) {
            if(eles[i].equals(t)){
                return i;
            }
        }
        return -1;
    }
    //根據參數newSize，重置eles的大小
    public void resize(int newSize){
        //定義一個陣列 指向原陣列
        T[] temp=eles;
        //創建新陣列
        eles = (T[])new Object[newSize];
        //把原陣列的數據複製到新陣列即可
        for(int i=0;i<N;i++){
            eles[i] = temp[i];
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{

        private int cusor;
        public SIterator(){
            this.cusor=0;

        }

        public boolean hasNext() {
            return cusor<N;
        }

        public Object next() {
            return eles[cusor++];
        }
    }
}



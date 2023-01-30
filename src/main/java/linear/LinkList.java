package linear;

import java.util.Iterator;

public class LinkList<T> implements Iterable<T>{
    //記錄頭節點
    private Node head;
    //記錄個數
    private int N;

    //節點類
    private class Node {
        //數據
        T item;
        //下一個節點
        Node next;

        public Node(T item,Node next){
            this.item=item;
            this.next=next;
        }
    }

    public LinkList(){
        //初始化頭節點
        this.head = new Node(null,null);
        //初始化元素個數
        this.N=0;
    }
    //清空鏈表
    public void clear(){
        head.next=null;
        this.N=0;
    }

    //獲取鏈表的長度
    public int length(){
        return N;
    }

    //判斷鏈表是否為空
    public boolean isEmpty(){
        return N==0;
    }

    //獲取指定位置i處的元素
    public T get(int i){
        //通過循環 從頭節點開始往後找，依次找i次，就可以找到對應的元素
        Node n = head.next;
        for(int index=0;index<i;index++){
            n=n.next;
        }
        return n.item;
    }

    //向鏈表中添加元素t
    public void insert(T t){
        //找到當前最後一個節點
        Node n = head;
        while (n.next!=null){
            n=n.next;
        }
        //創建新節點，保存元素t
        Node newNode = new Node(t,null);
        //讓當前最後一個節點指向新節點
        n.next=newNode;
        //元素的個數+1
        N++;
    }

    //向指定位置i處，添加元素t
    public void insert(int i,T t){
        //找到i位子前的一個節點
        Node pre = head;
        for(int index = 0;index<=i-1;index++){
            pre=pre.next;
        }
        //找到i位子的節點
        Node cur=pre.next;
        //創建新的節點並且新的節點指向原來i位置的節點
        Node newNode = new Node(t, cur);
        //原來i位置的前一個節點指向新節點即可
        pre.next = newNode;

        N++;
    }
    //刪除指定的位置的元素 並返回元素
    public T remove (int i){
        //找到i位子的前個節點
        Node pre =head;
        for(int index = 0;index<=i-1;i++){
            pre=pre.next;
        }
        //找到i位子的節點
        Node curr = pre.next;
        //找到i位子的下一個節點
        Node nextNode = curr.next;
        //前一個節點指向下一個節點
        pre.next=nextNode;
        //元素個數-1
        N--;
        return curr.item;
    }
    //找尋t第一次出現的位子
    public int index(T t){
        //從頭節點開始 依序找到每一個節點，取出item和t比較 香彤則返回
        Node n = head;
        for(int i =0;n.next!=null;i++){
            n=n.next;
            if(n.item.equals(t)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }

    private class LIterator implements Iterator{
        private Node n;
        public LIterator(){
            this.n=head;
        }
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }
    }

}

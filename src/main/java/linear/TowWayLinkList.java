package linear;

import java.util.Iterator;

public class TowWayLinkList<T> implements Iterable<T> {
    //首節點
    private Node head;
    //最後一個節點
    private Node last;

    //鏈表的長度
    private int N;


    //節點類
    private class Node{
        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }

        //存储数据
        public T item;
        //指向上一个结点
        public Node pre;
        //指向下一个结点
        public Node next;
    }

    public TowWayLinkList(){
        //初始化頭尾節點
        this.head = new Node(null,null,null);
        this.last=null;
        //初始化元素個數
        this.N = 0;
    }
    //空置线性表
    public void clear(){
        this.head.next=null;
        this.last=null;
        this.N=0;
    }
    //判断线性表是否为空，是返回true，否返回false
    public boolean isEmpty(){
        return N==0;
    }
    //获取线性表中元素的个数
    public int length(){
        return N;
    }
    //获取第一个元素
    public T getFirst(){
        if(isEmpty()){
            return null;
        }
        return head.next.item;
    }
    //獲取最後的元素
    public T getLast(){
        if(isEmpty()){
            return null;
        }
        return last.item;
    }

    //往线性表中添加一个元素
    public void insert(T t){
        //如果練表為空
        if(isEmpty()){
            //創建新節點
            Node newNode = new Node(t,head,null);
            //讓新的節點稱為尾節點
            last=newNode;
            //讓頭節點指向尾節點
            head.next=last;
        }
        else {
            //創建新節點
            Node oldLast=last;
            Node newNode=new Node(t,oldLast,null);
            //讓當前的尾節點指向新節點
            oldLast.next = newNode;
            //讓新節點成為尾節點
            last=newNode;
        }
        //元素個數+1
        N++;
    }

    //指定位置插入
    public void insert(int i,T t){
        //找到i位置的前一個節點
        Node pre = head;
        for(int index=0;index<=i-1;index++){
           pre=pre.next;
        }
        //找到i位置節點
        Node curr = pre.next;
        //創建新節點
        Node newNode = new Node(t,pre,curr);
        //讓i位置的前一個節點 的 下一個節點變為新節點
        pre.next=newNode;
        //讓i位置的前一個節點 變為新節點
        curr.pre=newNode;
        //元素個數+1
        N++;
    }
    //獲取指定位置
    public T get(int i){
        Node n=head.next;
        for(int index=0;index<i;index++){
            n=n.next;
        }
        return n.item;
    }

    //返回线性表中首次出现的指定的数据元素的位序号，若不存在，则返回-1。
    public int indexOf(T t){
        Node n = head;
        for(int i=0;n.next!=null;i++){
            n=n.next;
            if(n.next.equals(t)){
                return i;
            }
        }
        return -1;
    }

    //刪除並返回
    public T remove(int i){
        //找到i位置的前一個節點
        Node pre = head;
        for(int index=0;index<=i-1;index++){
            pre=pre.next;
        }
        //找到i位置的節點
        Node curr=pre.next;
        //找到i位置的下一個節點
        Node nextNode=curr.next;
        //讓i位置的前一個節點的下一個節點變為i位置的下一個節點
        pre.next=nextNode;
        //讓i位置的下一個節點的上一個節點 變為i位置的前一個節點
        nextNode.pre=pre;
        N--;
        return curr.item;
    }


    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }

    private class TIterator implements Iterator{
        private Node n;
        public TIterator(){
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

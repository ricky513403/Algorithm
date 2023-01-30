package linear;

public class TowWayLinkList<T> {
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
        return false;
    }
    //获取线性表中元素的个数
    public int length(){
        return 0;
    }
    //读取并返回线性表中的第i个元素的值
    public T get(int i){
        return null;
    }
    //往线性表中添加一个元素
    public void insert(T t){

    }
    //在线性表的第i个元素之前插入一个值为t的数据元素
    public void insert(int i,T t){

    }
    //删除并返回线性表中第i个数据元素。
    public T remove(int i){
        return null;
    }
    //返回线性表中首次出现的指定的数据元素的位序号，若不存在，则返回-1。
    public int indexOf(T t){
        return 0;
    }
    //获取第一个元素
    public T getFirst(){
        return null;
    }
    //获取最后一个元素
    public T getLast(){
        return null;
    }
}

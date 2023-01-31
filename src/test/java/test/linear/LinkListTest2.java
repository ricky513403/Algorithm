package test.linear;

import linear.LinkList;

public class LinkListTest2 {

    public static void main(String[] args) {
        //創建單向鏈表表物件
        LinkList<String> s1 =new LinkList<String>();
        //測試插入
        s1.insert("Yao");
        s1.insert("Kobe");
        s1.insert("TMac");
        s1.insert(1,"Lebron");

        for(String s : s1){
            System.out.println(s);
        }
        System.out.println("-----------");
        s1.reverse();
        for(String s : s1){
            System.out.println(s);
        }
    }
}

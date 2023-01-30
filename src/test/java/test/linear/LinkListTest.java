package test.linear;

import linear.LinkList;

public class LinkListTest {

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
        //測試獲取
        String getResult=s1.get(1);
        System.out.println("1索引處值為"+getResult);
        //測試刪除
        String removeResult = s1.remove(0);
        System.out.println("刪除的元素是"+removeResult);
        //測試清空
        s1.clear();
        System.out.println("清空後的線性表中的個數為"+s1.length());
    }
}

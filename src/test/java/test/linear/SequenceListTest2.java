package test.linear;

import linear.SequenceList;

public class SequenceListTest2 {

    public static void main(String[] args) {
        //創建順序表物件
        SequenceList<String> s1 = new SequenceList<>(2);
        //測試插入
        s1.insert("Yao");
        s1.insert("Kobe");
        s1.insert("TMac");

    }
}

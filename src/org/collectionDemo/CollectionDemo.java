package org.collectionDemo;

import java.util.ArrayList;
import java.util.List;


public class CollectionDemo {
    public static void main(String[] args) {
        List list;
        List list1;
        list = new ArrayList();
        list1 = new ArrayList();
        ListDemo listDemo = new ListDemo();
        listDemo.multiplyList(list, list1);
        listDemo.getCountOddNumber(list);
        listDemo.deleteEvenNumber(list);


    }
}


